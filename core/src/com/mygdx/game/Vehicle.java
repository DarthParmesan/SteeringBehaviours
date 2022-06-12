package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Vehicle extends Entity{



    public void Vehicle() {

    }

    @Override
    public void steeringBehaviour(ShapeRenderer sr) {

    }

    @Override
    public void render(ShapeRenderer sr, SpriteBatch sb) {
        sr.setColor(Color.CYAN);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.circle(_pos.x, _pos.y, r);
        sr.end();

//        sb.begin();
//        sb.draw(_texture, _pos.x, _pos.y);
//        sb.end();
    }
}
