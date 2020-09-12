package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CanVisitAllRooms841Test {

    private CanVisitAllRooms841 can = new CanVisitAllRooms841();

    @Test
    public void canVisitAllRooms() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(new Integer[]{1}));
        rooms.add(Arrays.asList(new Integer[]{2}));
        rooms.add(Arrays.asList(new Integer[]{3}));
        rooms.add(Arrays.asList(new Integer[]{}));
        Assert.assertTrue(can.canVisitAllRooms(rooms));
        rooms.clear();
        rooms.add(Arrays.asList(new Integer[]{1,3}));
        rooms.add(Arrays.asList(new Integer[]{3,0,1}));
        rooms.add(Arrays.asList(new Integer[]{2}));
        rooms.add(Arrays.asList(new Integer[]{0}));
        Assert.assertFalse(can.canVisitAllRooms(rooms));
    }
}