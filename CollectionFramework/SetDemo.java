import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class SetDemo {

    
    public static void main(String[] args) {
        

        HashSet<String>hashSet=new HashSet<String>();

        hashSet.add("Delhi");
        hashSet.add("Chandigarh");
        hashSet.add("Rajpura");



        System.out.println(hashSet.contains("Delhi"));
        System.out.println(hashSet.contains("New York"));


        HashSet<Integer>mySet=new HashSet<Integer>();

        mySet.add(1);
        mySet.add(20);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.add(5);
        mySet.add(7);
        mySet.add(100);

        // for(Integer key:mySet)
        // System.out.println(key);


        LinkedHashSet<Integer>myLinkedHashSet=new LinkedHashSet<Integer>();
        myLinkedHashSet.add(1);
        myLinkedHashSet.add(20);
        myLinkedHashSet.add(3);
        myLinkedHashSet.add(4);
        myLinkedHashSet.add(5);
        myLinkedHashSet.add(5);
        myLinkedHashSet.add(7);
        myLinkedHashSet.add(100);

        // for(Integer key:myLinkedHashSet)
        // System.out.println(key);


        TreeSet<Integer>myTreeSet=new TreeSet<Integer>();
        myTreeSet.add(1);
        myTreeSet.add(20);
        myTreeSet.add(3);
        myTreeSet.add(4);
        myTreeSet.add(5);
        myTreeSet.add(5);
        myTreeSet.add(7);
        myTreeSet.add(100);

        for(Integer key:myTreeSet)
        System.out.println(key);


        

    }
}
