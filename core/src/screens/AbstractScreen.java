package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import pl.wawrow.testclicker.TestClicker;

public abstract class AbstractScreen implements Screen{
    protected TestClicker game;
    protected Stage stage;
    private OrthographicCamera camera;
    protected SpriteBatch spriteBatch;



    public AbstractScreen(TestClicker game){
        this.game = game;
        createCamera();
        stage = new Stage(new StretchViewport(TestClicker.WIDTH, TestClicker.HEIGHT, camera));
        spriteBatch = new SpriteBatch();


    }

    private void createCamera() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, TestClicker.WIDTH, TestClicker.HEIGHT);
        camera.update();
    }

    @Override
    public void render(float delta) {
        clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);
    }

    @Override
    public void resume() {
        game.setPaused(false);
    }

    @Override
    public void pause() {
        game.setPaused(true);
    }

    private void clearScreen() {
        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void dispose() {
        game.dispose();

    }
}
