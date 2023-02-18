package baitap.ss10_dsa_danhsach.arraylist;

import baitap.ss10_dsa_danhsach.arraylist.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(0,14);
        myList.add(3,12);
        System.out.println(myList.get(1));
//        myList.add(10,11);
        System.out.println(myList.size());

    }
}
