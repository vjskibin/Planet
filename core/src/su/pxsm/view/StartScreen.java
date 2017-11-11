package su.pxsm.view;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by cover on 11.11.2017.
 */

public class StartScreen implements Screen{

    private BitmapFont font;
    private SpriteBatch batch;
    private Game game;

    public StartScreen(Game game)
    {
        this.game = game;
    }

    @Override
    public void show()
    {
        font = new BitmapFont();
        font.setColor(0,0,0,1);
        font.getData().setScale(3);

    }




    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(255,255,255,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch = new SpriteBatch();
        batch.begin();

        font.draw(batch, "Press anywhere to start...", 20, Gdx.graphics.getHeight() - 20);

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

        font.dispose();
        //game.dispose();
    }
}
