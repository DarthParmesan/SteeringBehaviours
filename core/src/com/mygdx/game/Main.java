package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	private SpriteBatch _sb;
	private ShapeRenderer _sr;

	Vehicle v;

	@Override
	public void create () {

		_sb = new SpriteBatch();
		_sr = new ShapeRenderer();

		v = new Vehicle();
	}

	public void update() {
		v.update(_sr);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		update();

		v.render(_sr, _sb);
		
	}
	
	@Override
	public void dispose () {
		_sb.dispose();
		_sr.dispose();
	}
}
