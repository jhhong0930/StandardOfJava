package com.java.chapter06;

/**
 * - 생성자: 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
 * - 생성자의 이름은 클래스의 이름과 같아야 한다
 * - 생성자는 리턴 값이 없다
 * - 컴파일 시 소스파일(*.java)의 클래스에 생성자가 하나도 정의되어 있지 않은 경우 자동으로 기본 생성자를 추가하여 컴파일 한다
 */
class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); // 에러, 인자를 넣거나 기본 생성자 추가 필요
    }
}
