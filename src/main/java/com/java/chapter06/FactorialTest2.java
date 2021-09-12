package com.java.chapter06;

class FactorialTest2 {
    static long factorial(int n) {
        // 스택오버플로우 에러 방지를 위한 매개변수의 유효성 검사
        if (n <= 0 || n > 20) return -1;
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 21;
        long result = 0;

        for (int i=1; i<=n; i++) {
            result = factorial(i);

            if (result == -1) {
                System.out.printf("유효하지 않은 값입니다. (0<n<2=20):%d%n", n);
            }

            System.out.printf("%2d!=%20d%n", i, result);
        }
    }
}
