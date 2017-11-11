package su.pxsm;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import su.pxsm.view.GameScreen;

public class MyGame extends Game {
	//SpriteBatch batch;
	//Texture img;
	private Screen gameScreen;
	
	@Override
	public void create () {
		//batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}


}
