package com.hackhalo2.ld.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hackhalo2.ld.Dare33;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 30;
		config.backgroundFPS = 30;
		config.title = "Misunderstanding";
		new LwjglApplication(new Dare33(), config);
	}
}
