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
            direction = "W";
            return toString();
        }
        return move();
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
