package me.sit.dev.collections;

import java.util.HashMap;

public class Practice {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        /* 1. Create map that has
                key: String
                value: Integer
           2. Add elements to the map using standard put() method
              Total of 4 elements (Must have atleast 1 element that
              key = John)
           3. Update key "John" to 40
           4. Remove key "John"
           5. Show example of get value by key
           6. Show example of check if map contains key
           7. Show example of check if map contains value
              8. Show example of get size of map
              9. Loop only keys
                10. Loop only values
                11. Loop both keys and values
         */
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 10);
        System.out.println("-> John (no update)");
        System.out.println( "Value of Key `John` " + map.get("John"));
        map.put("Bomb_1",200);
        map.put("Bomb_2",300);
        map.put("Bomb_3",400);
        map.put("Bomb_5",500);
        map.put("Bomb_6",600);
        System.out.println("-> John (updated)");
        map.put("John", 40);
        System.out.println( "Value of Key `John` " + map.get("John"));
        System.out.println("-> Before remove `John`");
        for (var entry : map.entrySet()){
            String entryKey = entry.getKey();
            int entryValue = entry.getValue();
            System.out.println("Key: " + entryKey + " Value: " + entryValue);
        }
        map.remove("John");
        System.out.println("-> After remove `John`");
        for (var entry : map.entrySet()){
            String entryKey = entry.getKey();
            int entryValue = entry.getValue();
            System.out.println("Key: " + entryKey + " Value: " + entryValue);
        }
        System.out.println("-> Example for getting value of key `Bomb_1` : " + map.get("Bomb_1"));
        System.out.println("-> Example for getting value of key `Bomb_2` : " + map.get("Bomb_2"));
        System.out.println("-> Example for getting value of key `Bomb_3` : " + map.get("Bomb_3"));

        if (map.containsKey("Bomb_1")){
            System.out.println("-> Map contains key `Bomb_1`");
        } else {
            System.out.println("-> Map does not contain this key");
        }
        if (map.containsValue(600)){
            System.out.println("Map contains this value, found at key `" + findKey(600, map) + "`");
        } else {
            System.out.println("Map does not contain this value");
        }

        System.out.println("-> Get size: " + map.size());
        System.out.println("-> Loop only keys");
        for (String key : map.keySet()){
            System.out.println("Key: " + key);
        }
        System.out.println("-> Loop only values");
        for (int value : map.values()){
            System.out.println("Value: " + value);
        }
        System.out.println("-> Loop both keys and values");
        for (var entry : map.entrySet()){
            String entryKey = entry.getKey();
            int entryValue = entry.getValue();
            System.out.println("Key: " + entryKey + " Value: " + entryValue);
        }
    }
    public static String findKey(int findKeyByValue, HashMap<String, Integer> map){
        for (String match : map.keySet()) {
            if (map.get(match) == findKeyByValue){
                return match;
            }
        }
        return null;
    }
}
