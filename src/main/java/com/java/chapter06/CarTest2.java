package com.java.chapter06;

/**
 * - 같은 클래스의 맴버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출할 수 있다
 * - 생성자의 이름으로 클래스이름 대신 this를 사용한다
 * - 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다
 */
class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4); // Car(String color, string gearType, int door) 호출
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        // this.xxx: 인스턴스 변수, xxx: 생성자의 매개변수로 정의된 지역변수
        // this: 참조변수, 인스턴스 자신을 가리킨다(인스턴스의 주소), 인스턴스 맴버만 사용가능
        // 생성자를 포함한 모든 인스턴스 메서드에는 자신이 관련된 인스턴스를 가리치는 참조변수 this가 포함되어있다
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
