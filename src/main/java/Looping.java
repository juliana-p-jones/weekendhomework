import java.util.*;

public class Looping {

    public static void main(String[] args) {
        Set fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        //prints out int 4 because five is a repeat

        System.out.println(fruit); // only prints out the names of four because five is repeat
        //Methods:
        //add - adds element to the tail of the queue
        //peek - used to view the head of the queue without removing it, returns false if queue is empty
        //element - similar to peek() but throws exception if queue is empty
        //remove - removes and returns the head of the queue. throws exception is queue is empty
        //poll - similar to remove() but returns null if queue is empty

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);
        System.out.println(fruitCalories.size()); // 4
        System.out.println(fruitCalories.get("lemon")); //17
        System.out.println(fruitCalories.entrySet()); // [banana=105, orange=45, apple=95, lemon=17]
        fruitCalories.remove("orange");
        System.out.println(fruitCalories); // prints without orange
        //methods
        //clear() - remove all key/value pairs from the map
        //containsKey(Object key) - returns true if the map contains an element that has key
        //containsValue(Object value) - returns true if the map contains an element that has value
        //entrySet() - returns a set that contains the entries in a map
        //get(Object key) - returns the value associated with the key
        //isEmpty() - returns true if the map is empty. otherwise, returns false
        //keyset() - returns a set that contains the keys in the map
        //put(object key, object value) - puts an entry in the map overwriting any previous value associated with the key
        //putAll(Map m) - puts all the entries from m into this map
        //putIfAbsent(object key, object value) - puts an entry in the map if the key does not already eist
        //remove(object key) - removes the entry whose key equals key

        List unchangeableList = List.of("apple", "lemon", "banana");
        unchangeableList.add("orange"); // unsupportedoperationexception
        unchangeableList.remove(1); // unsupportedoperationexception
        //setting the collection up this way means its IMMUTABLE

        //===================12b======================


        //listDemo();
        //queueDemo();


        //mapDemo();
        Map fruitCalories2 = new HashMap();
        fruitCalories2.put("apple", 95);
        fruitCalories2.put("lemon", 20);
        fruitCalories2.put("banana", 105);
        fruitCalories2.put("orange", 45);
        fruitCalories2.put("lemon", 17);
        for(var entry : fruitCalories2.entrySet()){
            //System.out.println(entry.getValue());
        }

    }
    //setDemo();
    public static void setDemo(){
        Set fruit2 = new HashSet();
        fruit2.add("apple");
        fruit2.add("lemon");
        fruit2.add("banana");
        fruit2.add("orange");
        fruit2.add("lemon");

        var i = fruit2.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }

}
