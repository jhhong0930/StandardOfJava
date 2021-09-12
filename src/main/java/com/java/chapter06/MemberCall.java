package com.java.chapter06;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv; // 에러, 클래스변수는 인스턴스변수를 사용할 수 없다
    static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용할 수 있다
    // 인스턴스 맴버가 존재하는 시점에 클래스 맴버는 항상 존재하지만(메모리에 올라갈 때 자동으로 생성되기 때문에)
    // 클래스 맴버가 존재하는 시점에 인스턴스 맴버가 존재하지 않을 수도 있다

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); // 에러, 클래스 메서드에서 인스턴스 변수를 사용할 수 없다
        MemberCall c = new MemberCall();
        System.out.println(c.iv); // 객체를 생성한 후에 인스턴스 변수를 참조할 수 있다
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 인스턴스 메서드에서는 인스턴스 변수를 바로 사용할 수 있다
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1(); // 에러, 클래스 메서드에서는 인스턴스 메서드를 호출할 수 없다
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 인스턴스를 생성한 후에야 호출할 수 있다
    }

    void instanceMethod2() {
        staticMethod1();   // 인스턴스 메서드에서는 인스턴스 메서드와 클래스 메서드
        instanceMethod1(); // 모두 인스턴스 생성없이 바로 호출이 가능하다
    }
}
