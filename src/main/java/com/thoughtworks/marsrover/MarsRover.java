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

    public String receiveCommand(String command) {
        if (command.equals("L")) {
            return turnLeft();
        }
        if (command.equals("R")) {
            direction = "E";
            return toString();
        }
        return move();
    }

    private String turnLeft() {
        if (direction.equals("N"))
            direction = "W";
        else if (direction.equals("S"))
            direction = "E";
        else if (direction.equals("E"))
            direction = "N";
        else if (direction.equals("W"))
            direction = "S";
        return toString();
    }

    private String move() {
        if (direction.equals("N"))
            this.y++;
        if (direction.equals("S"))
            this.y--;
        if (direction.equals("W"))
            this.x--;
        if (direction.equals("E"))
            this.x++;
        return toString();
    }
}
