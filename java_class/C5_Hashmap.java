package java_class;

import java.util.HashMap;

public class C5_Hashmap {
    public static void main(String[] args) {
        String arr[] = {"ram", "shyam", "ram", "ravi", "shyam"};
        HashMap<String, Integer> h1 = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!h1.containsKey(arr[i])) {
                int c = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        c++;
                    }
                }
                h1.put(arr[i], c);
            }
        } 
        
        System.out.println(h1);
    }
}

