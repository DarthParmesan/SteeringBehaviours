package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

import static com.mygdx.game.Globals.SCREEN_HEIGHT;
import static com.mygdx.game.Globals.SCREEN_WIDTH;

public abstract class Entity {


    protected Texture _texture;


    protected Vector2 _pos;
    protected Vector2 _vel;
    protected Vector2 _acc;

    protected int r = 8;
    protected float _maxSpeed = 2f;
    protected float _maxForce = 0.2f;

    public Entity() {

        _texture = new Texture("boid.png");

        _pos = new Vector2(200f, 400f);
        _vel = new Vector2(1f, 0);
        _acc = new Vector2(0f, 0f);
    }

    public abstract void steeringBehaviour(ShapeRenderer sr);
    public abstract void render(ShapeRenderer sr, SpriteBatch sb);

    public void update(ShapeRenderer sr) {
        steeringBehaviour(sr);

        _vel.add(_acc);
        _vel.limit(_maxSpeed);

        clampPosition();

        _pos.add(_vel);
        _acc.set(0, 0);

    }

    public void applyForce(Vector2 force) {
        _acc.add(force);
    }

    public void clampPosition() {

        // x-axis
        if (_pos.x > SCREEN_WIDTH) {
            _pos.x = 0;
        } else if (_pos.x < 0) {
            _pos.x = SCREEN_WIDTH;
        }

        // y-axis
        if (_pos.y > SCREEN_HEIGHT) {
            _pos.y = 0;
        } else if (_pos.y < 0) {
            _pos.y = SCREEN_HEIGHT;
        }

    }
}
