package java_class;

import java.util.HashSet;

public class C4_Hashset {
    public static void main(String[] args) {
        //hashset--search in constant time
        //hashset with initial capacity 16 and load factor 0.75 
        HashSet<Integer> myHashSet =new HashSet<>(); 
        //set initial capacity and load factor
        HashSet<Integer> myHashSet2=new HashSet<>(5,5.6f);
        //adding 
        myHashSet.add(5);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(6);
        System.out.println(myHashSet);
    }
}
