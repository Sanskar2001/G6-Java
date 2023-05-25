import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class MapDemo {
    

    public static void main(String[] args) {
        

        HashMap<String,Integer>hashMap=new HashMap<String,Integer>();

        hashMap.put("Burger", 70);
        hashMap.put("Dosa",120);
        hashMap.put("Pizza",400);
        hashMap.put("Pasta",150);



        System.out.println(hashMap.containsKey("Dosa"));
        System.out.println(hashMap.containsKey("XYZ"));

        System.out.println(hashMap.containsValue(400));
        System.out.println(hashMap.containsValue(1000));


        System.out.println(hashMap.get("Burger"));
        System.out.println(hashMap.get("Dosa"));



        for(Map.Entry<String,Integer>entry:hashMap.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }   


        // LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();

        // linkedHashMap.put(10, "Salesforce");
        // linkedHashMap.put(12,"Visa");
        // linkedHashMap.put(13,"American Express");
        // linkedHashMap.put(40,"Morgan Stanley");
        // linkedHashMap.put(5,"NatWest");
        // linkedHashMap.put(60,"Rakuten");
        // linkedHashMap.put(7,"Uber"); 


        // for(Map.Entry<Integer,String> entry: linkedHashMap.entrySet())
        // {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }


        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();

       treeMap.put(10, "Salesforce");
       treeMap.put(12,"Visa");
       treeMap.put(13,"American Express");
       treeMap.put(40,"Morgan Stanley");
       treeMap.put(5,"NatWest");
       treeMap.put(60,"Rakuten");
       treeMap.put(7,"Uber"); 


        for(Map.Entry<Integer,String> entry: treeMap.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        

    }
}
