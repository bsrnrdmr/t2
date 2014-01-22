
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 */

/**
 * @author busra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> words = new Stack<String>();
		
		Queue<String> queue=new LinkedList<String>();

        queue.add("b");
        queue.add("a");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        
		words.push("ali");
		words.push("veli");
		words.push("deli");
		words.push("neli");
		
		
		System.out.println(queue);
		System.out.println(words);
	}

}
