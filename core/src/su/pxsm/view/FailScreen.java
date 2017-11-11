package su.pxsm.view;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by cover on 11.11.2017.
 */



public class FailScreen implements Screen{
    private int score;
    private Game game;
    private BitmapFont font;
    private BitmapFont result;
    private SpriteBatch batch;

    public FailScreen(Game game, int score)
    {
        this.game = game;
        this.score = score;
    }

    @Override
    public void show() {
        font = new BitmapFont();
        font.setColor(0,0,0,1);
        font.getData().setScale(3);

        result = new BitmapFont();
        result.setColor(0,0,0,1);
        result.getData().setScale(3);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(255,255,255,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch = new SpriteBatch();
        batch.begin();

        font.draw(batch, "Press anywhere to restart...", 20, Gdx.graphics.getHeight() - 20);

        font.draw(batch, "Your score is: " + Integer.toString(score) , 20, Gdx.graphics.getHeight() - 60);

        batch.end();

        if(Gdx.input.isTouched())
        {
            game.setScreen(new GameScreen(game));

        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
        result.dispose();
        //game.dispose();
    }
}
