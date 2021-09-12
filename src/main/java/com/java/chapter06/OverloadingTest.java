package com.java.chapter06;

/**
 * - 오버로딩: 하나의 메서드 이름으로 여러 기능을 구현하는 것
 * - 메서드 이름이 같아야 한다
 * - 파라미터의 개수 또는 타입이 달라야 한다
 * - print 메서드가 좋은 예
 */
class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
        System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i=0; i<a.length; i++) {
            result += a[i];
        }
        return result;
    }
}