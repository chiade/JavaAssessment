package Collection;

import java.util.HashMap;

public class HashMapExercises {

    public static void getHashMap() {

        //HashMap - cannot use index to retrieve the elements
        //HashMap is useful when we need to search for a name w ID
        //e.g. P001 is the student ID of Jean Looi (value)
        //e.g. P001 (key) is the student ID of {Jean Looi, jean@gmail, 21, 9123456} - value
        //LinkedHashMap is also a collection and works like HashMap except the element can be accessed in their insertion order

        HashMap<String, String> customers = new HashMap<>();
        customers.put("POO1", "Jean Looi");
        customers.put("POO2", "John Looi");
        customers.put("POO3", "Jenny Looi");
        customers.put("POO4", "Jena Looi");
        System.out.println((customers));

        //e.g. 1111(key), Jean Looi (String)
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1111, "Jean Looi");   //run first - 1111 = Jean
        names.put(2222, "John Looi");
        names.put(3333, "Jenu Looi");
        names.put(4444, "JJ Looi");

        names.put(1111, "Jenni Looi");  //value will be replaced for that key
        //run later - 1111 = Jenni
        names.put(2222, "John Looi");   //no change to the key and value

        System.out.println(names);
        //Sort alpha - Collections.sort();

        System.out.println(names.get(2222));

        //containsKey() method, containsValue() method
        System.out.println(names.containsKey(3333));
        System.out.println(names.containsValue("Jean Looi"));

        for (int key: names.keySet()) {
            System.out.println("Student ID: " + key + "Student Name: " + names.get(key));
        }
        //Exercise 3: HashMap
        HashMap<Integer, String> users = new HashMap<Integer, String>();
        users.put(1, "Camilo");
        users.put(2, "Andres");
        users.put(3, "Laura");
        users.put(4, "Andrea");
        users.put(5, "Kate");
        System.out.println(users);

        int size = users.size();
        System.out.println("total users: " + size);

        String userKey2 = users.get(2);
        System.out.println("user with key 2: " + userKey2);

        users.remove(2);
        System.out.println(users);

        for (int key : users.keySet()){
            System.out.println("key: " + key + " value: " + users.get(key));
        }

        HashMap<Character, String> data = new HashMap<Character, String>();
        data.put('i', "integer");   //run first - 1111 = Jean
        data.put('f', "float");   //run first - 1111 = Jean
        data.put('b', "boolean");   //run first - 1111 = Jean
        data.put('d', "double");   //run first - 1111 = Jean

        for (char key: data.keySet()) {
            System.out.println("key: " + key + "data: " + data.get(key));
        }
        data.remove('f');
        System.out.println(data);




    }
}
