package com.thoughtworks.marsrover;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") " + direction;
    }

    public String move() {
        if (direction.equals("N"))
            this.y++;
        if (direction.equals("S"))
            this.y--;
        if (direction.equals("W"))
            this.x--;
        return toString();
    }
}
