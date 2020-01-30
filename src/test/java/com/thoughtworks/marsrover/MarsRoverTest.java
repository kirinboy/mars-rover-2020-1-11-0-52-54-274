package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_be_able_to_init_MarsRover() {
        MarsRover marsRover = new MarsRover(10, 20, "N");
        assertEquals("(10, 20) N", marsRover.toString());
    }
}
