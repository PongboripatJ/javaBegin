package me.sit.dev.exception;

import java.io.IOException;

public class JavaException {

    public static void main(String[] args) {
        // Exception - รู้ว่าจะเกิดแน่ๆถ้าเรียกใช้
        // RuntimeException - ไม่รู้ว่าจะเกิดมั้ยย

        testB();
//        try {
//            testArrayIndexOutOfBoundsException();
//            testArithmeticException();
//        } catch (ArithmeticException | IndexOutOfBoundsException e) {
//            System.out.println("Exception: " + e.getMessage());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    private static void testB() {
        try {
            throw new TonpeeException("TonpeeException");
        } catch (TonpeeException e) {
            System.out.println("TonpeeException: " + e.getMessage());
        }
    }
    // รู้ตั้งแต่ตอนเขียน
    private static void testForceThrowException() throws IOException {
        throw new IOException("Force throw exception");
    }

    private static void testArrayIndexOutOfBoundsException() {
        // ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        arr[5] = 50;
    }

    private static void testArithmeticException() {
        // ArithmeticException
        int a = 10 / 0;
    }

    private static void testNullPointerException() {
        // NullPointerException
        String str = null;
        System.out.println(str.length());
    }
}
