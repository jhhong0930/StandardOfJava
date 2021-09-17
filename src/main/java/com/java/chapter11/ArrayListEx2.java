package com.java.chapter11;

import java.util.ArrayList;
import java.util.List;

class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        // ArrayList 생성 시 실제 저장할 개수보다 여유있는 크기로 지정하는 것이 좋다
        // 크기가 자동적으로 늘어나기는 하지만 이 과정에서 처리시간이 많이 소요된다
        List list = new ArrayList(length/LIMIT + 10);

        for (int i=0; i<length; i+=LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            } else {
                list.add(source.substring(i));
            }
        }

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
