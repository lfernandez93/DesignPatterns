/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.command;

/**
 *
 * @author Luis Fernandez
 */
public class Square {

    private int x;
    private int y;
    private int size;
    private final SquareStatesRepository squareStateRepo = new SquareStatesRepository();

    public int getX() {
        return x;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int by, String to) {
        switch (to) {
            case "right":
                this.setX(this.getX() + by);
                break;
            case "left":
                this.setX(this.getX() - by);
                break;
            case "up":
                this.setY(this.getY() + by);
                break;
            case "down":
                this.setX(this.getY() - by);
                break;
        }
        System.out.println("new position of the square is " + this.getX() + "," + this.getY());
        squareStateRepo.addState(copy(this));
    }
    
    private Square copy(Square square){
        Square sq = new Square();
        sq.setSize(square.getSize());
        sq.setX(square.getX());
        sq.setY(square.getY());
        return sq;
    }
    public void create(int size) {
        this.setSize(size);
        System.out.println("a new square with size " + size + "x" + size + " has been created initial position=" + this.getX() + "," + this.getY());
        squareStateRepo.addState(copy(this));
    }

    public void scale(int by) {
        this.setSize(this.getSize() * 2);
        System.out.println("the square has been scaled by " + by + " new size is " + getSize() + "x" + getSize());
        squareStateRepo.addState(copy(this));
    }

    public void undo() {
        System.out.println("undoing previous state :");
        System.out.println(squareStateRepo.previousOne());
    }

    @Override
    public String toString() {
        return "Square{" + "x=" + x + ", y=" + y + ", size=" + size + "}";
    }

}
