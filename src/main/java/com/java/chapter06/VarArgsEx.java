package com.java.chapter06;

/**
 * - 기존에는 메서드의 매개변수 개수가 고정적이었으나 JDK1.5부터 동적으로 지정해 줄 수 있으며
 * - 이 기능을 가변인자(variable arguments) 라고 한다
 * - 타입... 변수명 같은 형식으로 선언하며 printf()가 대표적인 예
 * - 가변인자 외에도 매개변수가 더 있다면 가변인자를 제일 마지막에 선언해야 한다
 * - 가변인자가 선언된 메서드를 호출할 때마다 배열이 새로 생성된다
 * - 가변인자를 사용한 메서드는 오버로딩하지 않는 건이 좋다
 */
class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"})); // 배열도 인자가 될 수 있다
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]"); // 인자가 없어도 된다
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }
}
