package com.example;

import processing.core.*;

abstract class Particle {
    PApplet app;
    float x, y;
    float xVel, yVel;
    int color;

    Particle(float x, float y, PApplet app) {
        this.x = x;
        this.y = y;
        this.app = app;
        this.xVel = app.random(-2, 2);
        this.yVel = app.random(-2, 2);
        this.color = app.color(app.random(255), app.random(255), app.random(255));
    }

    // Move particles with velocity and check for edge bouncing
    void move() {
        x += xVel;
        y += yVel;

        if (x < 0 || x > app.width) xVel *= -1;
        if (y < 0 || y > app.height) yVel *= -1;
    }

    // Abstract display method (each subclass will implement its own drawing)
    abstract void display();

    // Mouse press interaction
    abstract void onMousePressed(float mouseX, float mouseY);

    // Key press interaction
    abstract void onKeyPressed(char key);
}
