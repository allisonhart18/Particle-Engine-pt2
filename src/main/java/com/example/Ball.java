/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: Ball Class - ball that bounces up and down :)
 *
 */






 package com.example;
 import processing.core.*;
 
 
 
 
 
 
 public class Ball {
     PApplet main; // the main class - provides funcionality of processing
 
 
     int ballColor;  
     float x, y; // loaction of ball
     float yVel =1; // how fast ball moves
     float xVel = 1; // how fast moves on x
     float xDirect = 1; // direction ball goes in on x axis
     float radius; //size
     float yDirect = 1; //which direction the ball goes - +1 = go down, -1 = go up
    
 
 
 
 
 Ball(float locX, float locY, float bRadius, PApplet bmain, int c)
 {
     x = locX;
     y = locY;
     radius = bRadius;
     ballColor = c;
 
 
     main = bmain;
 }
 
 
 void draw()
 {
     main.fill(ballColor);
     main.ellipse(x,y,radius, radius);
     move();
 }
 
 
 void move()
 {
 // y motion
 y+= yVel*yDirect;
 
 
 if(y + radius /2 > main.height)
 {
 yDirect =-1;
 y= main.height - radius /2;
 }
 
 
 if(y - radius /2 < 0)
 {
 yDirect = 1;
 y = radius /2;
 
 
 }
 
 
 // x motion
 x+= xVel*xDirect;
 
 
 if(x + radius /2 > main.width)
 {
 xDirect =-1;
 }
 
 
 if(x - radius /2 < 0)
 {
 xDirect = 1;
 x = radius /2;
 }
 
 
 }
 
 
 void faster()
 {
 
 
 yVel+=1; //+=4 makes it go really fast
 xVel +=1; // makes ball go fast on
 
 
 }
 
 
 
 
 
 
 
 
 void released()
 {
 
 
 
 
 }
 
 
 void kPressed()
 {
 
 
 
 
 
 
 }
 
 
 }
 