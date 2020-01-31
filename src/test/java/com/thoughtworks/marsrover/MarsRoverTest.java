package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_be_able_to_init_MarsRover() {
        MarsRover marsRover = new MarsRover(10, 20, "N");
        assertEquals("(10, 20) N", marsRover.toString());
    }

    @Test
    public void should_be_able_to_move_when_direction_is_N() {
        MarsRover marsRover = new MarsRover(10, 20, "N");
        assertEquals("(10, 21) N", marsRover.receiveCommand("M"));
    }

    @Test
    public void should_be_able_to_move_when_direction_is_S() {
        MarsRover marsRover = new MarsRover(10, 20, "S");
        assertEquals("(10, 19) S", marsRover.receiveCommand("M"));
    }

    @Test
    public void should_be_able_to_move_when_direction_is_W() {
        MarsRover marsRover = new MarsRover(10, 20, "W");
        assertEquals("(9, 20) W", marsRover.receiveCommand("M"));
    }

    @Test
    public void should_be_able_to_move_when_direction_is_E() {
        MarsRover marsRover = new MarsRover(10, 20, "E");
        assertEquals("(11, 20) E", marsRover.receiveCommand("M"));
    }

    @Test
    public void should_be_able_to_receive_move_command() {
        MarsRover marsRover = new MarsRover(10, 20, "E");
        assertEquals("(11, 20) E", marsRover.receiveCommand("M"));
    }

    @Test
    public void should_be_able_to_receive_turn_left_command_when_mars_rover_is_facing_N() {
        MarsRover marsRover = new MarsRover(10, 20, "N");
        assertEquals("(10, 20) W", marsRover.receiveCommand("L"));
    }

    @Test
    public void should_be_able_to_receive_turn_left_command_when_mars_rover_is_facing_S() {
        MarsRover marsRover = new MarsRover(10, 20, "S");
        assertEquals("(10, 20) E", marsRover.receiveCommand("L"));
    }

    @Test
    public void should_be_able_to_receive_turn_left_command_when_mars_rover_is_facing_E() {
        MarsRover marsRover = new MarsRover(10, 20, "E");
        assertEquals("(10, 20) N", marsRover.receiveCommand("L"));
    }

    @Test
    public void should_be_able_to_receive_turn_left_command_when_mars_rover_is_facing_W() {
        MarsRover marsRover = new MarsRover(10, 20, "W");
        assertEquals("(10, 20) S", marsRover.receiveCommand("L"));
    }

    @Test
    public void should_be_able_to_receive_turn_right_command_when_mars_rover_is_facing_N() {
        MarsRover marsRover = new MarsRover(10, 20, "N");
        assertEquals("(10, 20) E", marsRover.receiveCommand("R"));
    }
}
