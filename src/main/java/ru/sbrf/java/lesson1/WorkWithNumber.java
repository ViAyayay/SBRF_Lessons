package ru.sbrf.java.lesson1;

public class WorkWithNumber {

    public static byte getSumTwoNumber(byte by, short sh) {
        return (byte) (by + sh);
    }

    public static int getSumTwoNumber(int i, long lo) {
        return (int) (i * lo);
    }

    public static int getMaxNumber(int i, int j) {
        return i > j ? i : j;
    }

    public static boolean isCharA(char ch) {
        return ch == 'A';
    }

    public static boolean isCharNumber(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    public static void printDecBinaryTable() {
        System.out.println("Dec:\tBin:");
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "\t = \t" + Integer.toBinaryString(i));
        }
    }

    public static void prinBinaryOverMaxInt() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int getCharValueNumber(char ch) {
        return ch;
    }

    public static char getCharValueFromNumber(int i) {
        return (char) i;
    }
}
