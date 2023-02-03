package com.alexos.flappybirdclone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class FlappyBird extends ApplicationAdapter {
	SpriteBatch batch;

	Texture background;
	Texture birdWingsUp;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("background.png");
		birdWingsUp = new Texture("bird_wings_up.png");
	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.draw(birdWingsUp, Gdx.graphics.getWidth() / 2
				- birdWingsUp.getWidth() / 2,
				Gdx.graphics.getHeight() / 2
				- birdWingsUp.getHeight() / 2);
		batch.end();
	}

}
