package com.example;

import processing.core.PApplet;

class SprinkleParticleSquare extends Particle {

    SprinkleParticleSquare(float x, float y, PApplet Main) {
        super(x, y, Main);
    }

    void display() {
        main.fill(color);
        main.pushMatrix();
        main.translate(x, y);
        main.rotate(main.radians(45)); // Rotate to give sprinkle-like appearance
        main.rect(0, 0, 20, 8); // Rectangular shape like a sprinkle
        main.popMatrix();
    }

    void onMousePressed(float mouseX, float mouseY) {
        // Change direction towards the mouse on click
        float dx = mouseX - x;
        float dy = mouseY - y;
        xVel += dx / 50;
        yVel += dy / 50;
    }

    void onKeyPressed(char key) {
        if (key == 'g') {
            color = main.color(0, main.random(255), 0); // Change to green color
        }
    }
}
