package com.java.chapter07;

class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }

        if (fe instanceof Car) {
            System.out.println("This is a Car instance");
        }

        if (fe instanceof Object) {
            System.out.println("This is an Object instance");
        }

        System.out.println(fe.getClass().getName()); // 클래스의 이름 출력
        /*
        This is a FireEngine instance.
        This is a Car instance
        This is an Object instance
        com.java.chapter07.FireEngine
        */
    }
}

class Car {}
class FireEngine extends Car {}