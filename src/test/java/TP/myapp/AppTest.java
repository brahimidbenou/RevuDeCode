package TP.myapp;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AwesomePasswordCheckerTest {

    @Test
    void testMaskAff() {
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        int[] mask = checker.maskAff("Password123!");
        assertNotNull(mask, "Mask should not be null");
        assertEquals(28, mask.length, "Mask should have a length of 28");
        assertEquals(4, mask[0], "First character should be upper case (4)");
        assertEquals(1, mask[1], "Second character should be lower case (2)");
        assertEquals(5, mask[8], "Ninth character should be a digit (5)");
        assertEquals(5, mask[10], "Eleventh character should be a special character (6)");
    }

    @Test
    void testGetInstanceWithFile() throws IOException {
        File file = new File("src/main/resources/Files/cluster_centers_HAC_aff.csv");
        AwesomePasswordChecker checker = AwesomePasswordChecker.getInstance(file);
        assertNotNull(checker, "Instance should not be null");
    }
     
    @Test
    void testGetInstanceWithoutFile() throws IOException {
        AwesomePasswordChecker checker = AwesomePasswordChecker.getInstance();
        assertNotNull(checker, "Instance should not be null");
    }
    
    @Test
    public void maskAffTest(){
        String a = "PODUB+yt*";
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        int tab[] = checker.maskAff(a);
        assertNotNull(tab);
        assertArrayEquals(new int[] {4, 3, 4, 3, 4, 7, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, tab);
    }

    
    @Test
    public void getDistance () throws IOException{
        String a = "mlopPPo5_ydf+Rio@@";
        double result = AwesomePasswordChecker.getInstance().getDistance(a); 
        assertNotNull(result);
        assertEquals(9.689627902499089, result);
    }

    @Test
    public void MD5HasherTest() {
        String a = "&pasWrood+34%";
        assertNotNull(a);
        //System.out.println(AwesomePasswordChecker.ComputeMD5(a));
    }

    @Test
    void testEuclideanDistance() {
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        int[] a = {1, 2, 3};
        double[] b = {1.0, 2.0, 3.0};
        double distance = checker.euclideanDistance(a, b);
        assertEquals(0.0, distance, 1e-6, "Distance should be zero for identical vectors");
    }

    @Test
    void testComputeMD5() {
        String hash = AwesomePasswordChecker.ComputeMD5("password");
        assertNotNull(hash, "Hash should not be null");
        assertEquals(32, hash.length(), "MD5 hash should have a length of 32");
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", hash, "Incorrect MD5 hash for 'password'");
    }

    @Test
    void testGetDistance() {
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        double distance = checker.getDistance("Password123!");
        assertTrue(distance >= 0, "Distance should be non-negative");
    }
}
