import java.util.TreeMap;
public class Hello{
	
	public static void main(String[] args) {
	TreeMap <Integer, String> myMap = new TreeMap<Integer, String>();
	//Addding data to a tree map
	myMap.put(1, "Sunday");
	myMap.put(2, "Monday");
	myMap.put(3, "Tuesday");
	myMap.put(4, "Wednesday");
	myMap.put(5, "Thursday");
	myMap.put(6, "Friday");
	myMap.put(7, "Saturday");
	/*//Rerieving all keys
	System.out.println("Keys of tree map: " + myMap.keySet());
	//Rerieving all values
	System.out.println("Values of tree map: " + myMap.values());
	//Rerieving the value from key with key number 5
	System.out.println("Key: 5 value: " + myMap.get(5)+ "\n");
	//Rerieving the First key and its value
	System.out.println("First key: " + myMap.firstKey() + " Value: " 
	+ myMap.get(myMap.firstKey()) + "\n");
	//Rerieving the Last key and value
	System.out.println("Last key: " + myMap.lastKey() + " Value: " 
	+ myMap.get(myMap.lastKey()) + "\n");
	//Removing the first key and value
	System.out.println("Removing first data: " 
	+myMap.remove(myMap.firstKey()));
	System.out.println("Now the tree map Keys: " +myMap.keySet());
	System.out.println("Now the tree map contain: " 
	+ myMap.values() + "\n");
	//Removing the last key and value
	System.out.println("Removing last data: " 
	+ myMap.remove(myMap.lastKey()));
	System.out.println("Now the tree map Keys: " + myMap.keySet());
	System.out.println("Now the tree map contain: " + myMap.values());
	*/
	}
}
