package com.example;

import processing.core.PApplet;

 SprinkleParticle extends Particle {

    SprinkleParticle(float x, float y, PApplet main) {
        super(x, y, main);
    }

    void display() {
        main.fill(color);
        main.pushMatrix();
        main.translate(x, y);
        main.rotate(main.radians(45)); // Rotate the ellipse to give it a sprinkle-like appearance
        main.ellipse(0, 0, 20, 8); // Ellipse with a long, sprinkle-like shape
        main.popMatrix();
    }

    void onMousePressed(float mouseX, float mouseY) {
        // Increase velocity away from mouse
        float dx = x - mouseX;
        float dy = y - mouseY;
        float dist = PApplet.sqrt(dx * dx + dy * dy);
        if (dist != 0) {
            xVel = dx / dist * 5;
            yVel = dy / dist * 5;
        }
    }

    void onKeyPressed(char key) {
        if (key == 'r') {
            color = main.color(main.random(255), 0, 0); // Change to red color
        }
    }
}
