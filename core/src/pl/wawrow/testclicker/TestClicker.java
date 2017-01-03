package pl.wawrow.testclicker;

import com.badlogic.gdx.Game;
import screens.SplashScreen;

public class TestClicker extends Game {
	public final static String GAME_NAME = "TestClicker";
	public final static int WIDTH = 720;
	public final static int HEIGHT = 480;
	private boolean paused;


	
	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}




	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}


}
