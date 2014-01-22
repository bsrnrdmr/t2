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
		AVLTreeMap myAVL = new AVLTreeMap();
		SplayTreeMap mySplay = new SplayTreeMap();
		
		myAVL.insert(50);
		myAVL.insert(78);
		myAVL.insert(100);
		myAVL.insert(12);
		myAVL.insert(1);
		myAVL.insert(13);
		myAVL.insert(14);
		
		mySplay.insert(50);
		mySplay.insert(78);
		mySplay.insert(100);
		mySplay.insert(12);
		mySplay.insert(1);
		mySplay.insert(13);
		mySplay.insert(14);
		
		
		myAVL.add(2011205129, new Student(2011205129, "BŸßra"));
		myAVL.add(2011205129, new Student(2011205123, "Burak"));
		myAVL.add(2011205129, new Student(2011400129, "Serpil"));
		myAVL.add(2011205129, new Student(2011400242, "Hakan"));
		myAVL.add(2011205129, new Student(2011205147, "Üsmail"));
		
		myAVL.BFT();
	}

}
