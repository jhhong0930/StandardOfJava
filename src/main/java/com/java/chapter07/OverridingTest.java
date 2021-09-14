package com.java.chapter07;

/**
 * - 오버라이딩: 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것
 * - 오버라이딩의 조건: 자손 클래스에서 오버라이딩 하는 메서드는 조상 클래스의 메서드와
 *                   - 이름이 같아야 한다
 *                   - 매개변수가 같아야 한다
 *                   - 반환타입이 같아야 한다
 * - 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다
 * - 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다
 * - 인스턴스 메서드를 static 메서드로 또는 그 반대로 변경할 수 없다
 */
public class OverridingTest {

    class Point {
        int x;
        int y;

        String getLocation() {
            return "x: " + x + ", y: " + y;
        }
    }

    class Point3D extends Point {
        int z;

        String getLoaction() {
            return "x: " + x + ", y: " + y + ", z: " + z; // 오버라이딩
        }
    }

    // 오버로딩 vs 오버라이딩
    // 오버로딩: 기존에 없는 새로운 메서드를 정의하는 것(new)
    // 오버라이딩: 상속받은 메서드의 내용을 변경하는 것(change, modify)

    class Parent {
        void parentMethod() {}
    }

    class Child extends Parent {
        void parentMethod() {} // 오버라이딩
        void parentMethod(int i) {} // 오버로딩

        void childMethod() {}
        void childMetho(int i) {} // 오버로딩
//        void childMethod() {} // 에러, 중복정의
    }

}
