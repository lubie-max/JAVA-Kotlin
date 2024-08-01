package Collections_in_JAVA;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer > list = new ArrayList<>();
        List<Integer > list1 = new ArrayList<>();

        list.add(0, 10);
        list.add(20);
        list.add(21);
        list.add(111);
        list.add(24);

        System.out.println("LIST::" + list);
        System.out.println("LIST Size::" + list.size());
        System.out.println("LIST check::" + list.contains(20));
        System.out.println((list.iterator()).toString());


        HashMap <Integer, String> map  = new HashMap<>();

        map.put(11,"Lubna" );
        map.put(112,"Lubna" );
        map.put(114,"Lubna" );

        System.out.println("hash map::" + map);

        Hashtable<Integer , String> lmap = new Hashtable<>();

        lmap.put(12 , "ls");
        lmap.put(13 , "ls332");
        lmap.put(14 , "ls1");

        System.out.println("HashTable:::" + lmap.values() + lmap);







    }
}
