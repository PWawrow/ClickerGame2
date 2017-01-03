package pl.wawrow.testclicker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.wawrow.testclicker.TestClicker;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = TestClicker.GAME_NAME;
		config.height = TestClicker.WIDTH;
		config.width = TestClicker.HEIGHT;
		config.resizable = false;

		new LwjglApplication(new TestClicker(), config);
	}
}
