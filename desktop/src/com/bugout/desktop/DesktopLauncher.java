package com.bugout.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bugout.BugOut;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "BugOut";
//		config.width = 272;
//		config.height = 408;
		config.width = 544;
		config.height = 816;
		new LwjglApplication(new BugOut(), config);
	}
}