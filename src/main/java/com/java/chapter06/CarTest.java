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

    Car(Car c) { // 인스턴스의 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
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

// 매개변수가 있는 생성자
class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}

// 생성자에서 다른 생성자 호출하기 - this
class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
// 생성자를 이용한 인스턴스의 복사
class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); // c1의 복사본 c2를 생성

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

        c1.door = 100; // c1의 인스턴스 변수 door의 값 변경
        System.out.println("c1.door=100 수행 후");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
        // 인스턴스 c2는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만
        // 서로 독립적으로 메모리공간에 존재하는 별도의 인스턴스이므로 c1의 값이 변경되어도 영향을 받지않느다
    }
}
