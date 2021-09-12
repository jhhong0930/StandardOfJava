package com.java.chapter06;

class Tv {
    // Tv의 속성(맴버변수)
    String color;  // 색상
    boolean power; // 전원상태(on/off)
    int channel;   // 채널

    // Tv의 기능(메서드)
    void power() { // TV를 켜거나 끄는 기능을 하는 메서드
        power = !power;
    }
    void channelUp() { // TV의 채널을 높이는 기능을 하는 메서드
        ++channel;
    }
    void channelDown() { // TV의 채널을 낮추는 기능을 하는 메서드
        --channel;
    }
}

class TvTest {
    public static void main(String[] args) {

        Tv t;              // TV 인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();      // TV 인스턴스 생성
        t.channel = 7;     // TV 인스턴스의 맴버변수 channel에 값 7을 대입
        t.channelDown();   // TV 인스턴스의 메서드 channelDown() 호출
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}

class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }
}

class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 = t1; // t1이 저장하고 있는 값(주소)을 t2에 저장
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }
}

class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        // Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
        for (int i=0; i<tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        for (int i=0; i<tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}