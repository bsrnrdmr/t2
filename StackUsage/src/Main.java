
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
		
		Queue<String> qe=new LinkedList<String>();

        qe.add("b");
        qe.add("a");
        qe.add("c");
        
		words.push("ali");
		words.push("veli");
		words.push("deli");
		
		
		System.out.println(qe);
		System.out.println(words);
	}

}
