package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.Main;

import static com.mygdx.game.Globals.SCREEN_HEIGHT;
import static com.mygdx.game.Globals.SCREEN_WIDTH;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration cfg = new Lwjgl3ApplicationConfiguration();
		cfg.setForegroundFPS(60);
		cfg.setTitle("SteeringBehaviours");
		cfg.setWindowedMode(SCREEN_WIDTH, SCREEN_HEIGHT);
		cfg.setResizable(false);
		new Lwjgl3Application(new Main(), cfg);
	}
}
