package javaapis.collection.list;

import java.util.ArrayList;

public class NoGenericArrayList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Integer ig = 123;

        list.add(ig);
        list.add(new String("abc"));

        for (int i = 0; i < list.size(); i++) {
            Integer data = (Integer) list.get(i);
            System.out.println(i);
        }

    }
}
