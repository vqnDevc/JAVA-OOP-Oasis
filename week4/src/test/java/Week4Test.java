
import org.example.Week4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int a = 1;
        int b = 0;
        int expected = 1;
        int actual = Week4.max2Int(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int2() {
        int a = 100;
        int b = 201;
        int expected = 201;
        int actual = Week4.max2Int(a, b);

        assertEquals(expected,actual);
    }

    @Test
    public void testMax2Int3() {
        int a = 100;
        int b = 100;
        int expected = 100;
        int actual = Week4.max2Int(a, b);

        assertEquals(expected,actual);
    }

    @Test
    public void testMax2Int4() {
        int a = 100;
        int b = -1;
        int expected = 100;
        int actual = Week4.max2Int(a, b);

        assertEquals(expected,actual);
    }

    @Test
    public void testMax2Int5() {
        int a = -14;
        int b = 0;
        int expected = 0;
        int actual = Week4.max2Int(a, b);

        assertEquals(expected,actual);
    }

    @Test
    public void testMinArray1() {
        int[] arr = {2};
        int expected = 2;
        int actual = Week4.minArray(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray2() {
        int[] arr = {2, 4, 6, 8, -5, 10};
        int expected = -5;
        int actual = Week4.minArray(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray3() {
        int[] arr = {1, 2, 3, 5, 8, 13};
        int expected = 1;
        int actual = Week4.minArray(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray4() {
        int[] arr = {-2, -4, -1, 5, -10, -7, 9};
        int expected = -10;
        int actual = Week4.minArray(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray5() {
        int[] arr = {};
        int expected = -1;
        int actual = Week4.minArray(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBMI1() {
        double weight = 60;
        double height = 1.71;
        String expected = "Bình Thường";
        String actual = Week4.calculateBMI(weight,height);
    }

    @Test
    public void testCalculateBMI2() {
        double weight = 45;
        double height = 1.61;
        String expected = "Thiếu cân";
        String actual = Week4.calculateBMI(weight,height);
    }

    @Test
    public void testCalculateBMI3() {
        double weight = 72;
        double height = 1.71;
        String expected = "Thừa cân";
        String actual = Week4.calculateBMI(weight,height);
    }

    @Test
    public void testCalculateBMI4() {
        double weight = 80;
        double height = 1.71;
        String expected = "Béo phì";
        String actual = Week4.calculateBMI(weight,height);
    }

    @Test
    public void testCalculateBMI5() {
        double weight = 90;
        double height = 1.71;
        String expected = "Béo phì";
        String actual = Week4.calculateBMI(weight,height);
    }
} 