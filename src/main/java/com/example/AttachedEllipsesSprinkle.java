package com.example;

import processing.core.PApplet;

class AttachedEllipsesSprinkle extends Particle {

    AttachedEllipsesSprinkle(float x, float y, PApplet Main) {
        super(x, y, main);
    }

    void display() {
        main.fill(color);
        main.pushMatrix();
        main.translate(x, y);
        main.rotate(app.radians(45)); // Rotate to give sprinkle-like appearance
        
        // Draw two attached ellipses
        main.ellipse(-10, 0, 15, 8); // First ellipse
        app.ellipse(10, 0, 15, 8);  // Second ellipse
        app.popMatrix();
    }

    void onMousePressed(float mouseX, float mouseY) {
        // Reverse direction when mouse pressed
        xVel *= -1;
        yVel *= -1;
    }

    void onKeyPressed(char key) {
        if (key == 'b') {
            color = app.color(0, 0, app.random(255)); // Change to blue color
        }
    }
}

