/**
 * This class demonstrates different types of exceptions and provides methods to throw and handle them.
 */
package org.example.week11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    /**
     * Throws a NullPointerException intentionally.
     *
     * @throws NullPointerException if the String object is null
     */
    public void nullPointerEx() throws NullPointerException {
        String s = null;
        s.length();
    }

    /**
     * Throws an ArrayIndexOutOfBoundsException intentionally.
     *
     * @throws ArrayIndexOutOfBoundsException if an attempt is made to access an index outside the bounds of an array
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {

        String[] arrayString = new String[10];
        arrayString[11] = "";
    }

    /**
     * Throws an ArithmeticException intentionally.
     *
     * @throws ArithmeticException if an attempt is made to divide by zero
     */
    public void arithmeticEx() throws ArithmeticException {
        int test = 100 / 0;
    }

    /**
     * Throws a FileNotFoundException intentionally.
     *
     * @throws FileNotFoundException if the specified file is not found
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader file = new FileReader("text.txt");
    }

    /**
     * Throws an IOException intentionally.
     *
     * @throws IOException if an I/O error occurs
     */
    public void ioEx() throws IOException {
        FileReader file = new FileReader("text.txt");
    }

    /**
     * Tests the occurrence of a NullPointerException and returns the result.
     *
     * @return a message indicating whether the test passed without errors or if a NullPointerException occurred
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null pointer";
        }
    }

    /**
     * Tests the occurrence of an ArrayIndexOutOfBoundsException and returns the result.
     *
     * @return a message indicating whether the test passed without errors or if an ArrayIndexOutOfBoundsException occurred
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * Tests the occurrence of an ArithmeticException and returns the result.
     *
     * @return a message indicating whether the test passed without errors or if an ArithmeticException occurred
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * Tests the occurrence of a FileNotFoundException and returns the result.
     *
     * @return a message indicating whether the test passed without errors or if a FileNotFoundException occurred
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * Tests the occurrence of an IOException and returns the result.
     *
     * @return a message indicating whether the test passed without errors or if an IOException occurred
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (Exception e) {
            return "Lỗi IO";
        }
    }
}
