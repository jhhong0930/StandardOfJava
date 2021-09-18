package com.java.chapter11;

import java.util.Vector;

class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        // 빈 공간을 없앤다(용량과 크기가 같아진다)
        v.trimToSize();
        System.out.println("=== After trimToSize() ===");
        print(v);

        // capacity가 최소 6이 되도록 설정, 만일 기존의 capacity가 6 이상이면 아무일도 일어나지 않는다
        v.ensureCapacity(6);
        System.out.println("=== Atfer ensureCapacity(6) ===");
        print(v);

        // 사이즈를 7로 설정, capacity가 부족하면 기존의 2배로 크기를 증가
        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        // 모든 요소를 삭제, 모든 공간은 null
        v.clear();
        System.out.println("=== After clear() ===");
        print(v);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size: " + v.size());
        System.out.println("capacity: " + v.capacity());
    }
}
