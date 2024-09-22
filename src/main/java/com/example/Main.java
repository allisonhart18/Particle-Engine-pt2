/*
 * Coder: Allison Hart
 * Date 9/15/2024
 * Description: particle engine part 1 project main class
 * 
 */


 package com.example;

import processing.core.*;
import java.util.ArrayList;

public class Main extends PApplet {

    ArrayList<Particle> particles;

    public static void main(String[] args) {
        PApplet.main("com.example.Main");
    }

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        particles = new ArrayList<>();
        // Add instances of the different sprinkle subclasses
        for (int i = 0; i < 10; i++) {
            particles.add(new SprinkleParticle(random(width), random(height), this));
            particles.add(new SprinkleParticleSquare(random(width), random(height), this));
            particles.add(new AttachedEllipsesSprinkle(random(width), random(height), this));
        }
    }

    public void draw() {
        background(255);
        for (Particle p : particles) {
            p.move();
            p.display();
        }
    }

    public void mousePressed() {
        for (Particle p : particles) {
            p.onMousePressed(mouseX, mouseY);
        }
    }

    public void keyPressed() {
        for (Particle p : particles) {
            p.onKeyPressed(key);
        }
    }
}
