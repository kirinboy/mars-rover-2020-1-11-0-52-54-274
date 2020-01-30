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
        assertEquals("(10, 21) N", marsRover.move());
    }

    @Test
    public void should_be_able_to_move_when_direction_is_S() {
        MarsRover marsRover = new MarsRover(10, 20, "S");
        assertEquals("(10, 19) S", marsRover.move());
    }

    @Test
    public void should_be_able_to_move_when_direction_is_W() {
        MarsRover marsRover = new MarsRover(10, 20, "W");
        assertEquals("(9, 20) W", marsRover.move());
    }

    @Test
    public void should_be_able_to_move_when_direction_is_E() {
        MarsRover marsRover = new MarsRover(10, 20, "E");
        assertEquals("(11, 20) E", marsRover.move());
    }
}
