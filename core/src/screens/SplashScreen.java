package screens;

import com.badlogic.gdx.graphics.Texture;
import pl.wawrow.testclicker.TestClicker;

/**
 * Created by Wawrów on 2017-01-03.
 */
public class SplashScreen extends AbstractScreen{

    private Texture splashImg;

    public SplashScreen(TestClicker game) {
        super(game);
        init();
    }

    private void init() {
        splashImg = new Texture("badlogic.jpg");

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(splashImg,0, 0);


        spriteBatch.end();
    }
}
