package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDrawingWithCircle() {
        //given
        Circle circle = new Circle();

        //when
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        //then
        Assert.assertEquals("This is a circle", result);
    }

    @Test
    public void testDrawingWithTriangle() {
        //given
        Triangle triangle = new Triangle();

        //when
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //then
        Assert.assertEquals("This is a triangle", result);
    }
}
