package ss8_cleancode.thuc_hanh.Cylinder;

import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {

    @Test
    public void getVolume() {
        double result = Cylinder.getVolume(3,4);
        assertEquals(131.9, result, 0.1);
    }
}