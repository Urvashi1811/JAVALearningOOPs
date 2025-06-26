package OOPs.CollectionFramwork_DSA.SET;

import java.util.*;
import java.util.Set;

public class ex2 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        Set<String> lhs = new LinkedHashSet();
        Set<String> tr = new TreeSet();

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Apple");
        hs.add("Watermelon");
        hs.add("null");


        System.out.println(hs);
        System.out.println("------------");
        for(String s: hs){
            System.out.println(s);
        }
        System.out.println("------------");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Apple");
        lhs.add("Watermelon");
        lhs.add("null");

        System.out.println(lhs);
        System.out.println("------------");
        //Iterator
        Iterator iterator = lhs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------");
        tr.add("Apple");
        tr.add("Orange");
        tr.add("Apple");
        tr.add("Watermelon");
        //tr.add("null");
        System.out.println(tr);
        System.out.println("------------");

        Iterator iterator1 = tr.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }

    }
}
