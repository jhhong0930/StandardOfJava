package com.java.chapter07;

class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) System.out.println(text);
    }
}

class CaptionTvText {
    public static void main(String[] args) {
        // 자손 클래스의 인스턴스를 생성하면 조상 클래스의 맴버와 자손 클래스의 맴버가 합쳐진 하나의 인스턴스로 생성된다
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World");
    }
}
