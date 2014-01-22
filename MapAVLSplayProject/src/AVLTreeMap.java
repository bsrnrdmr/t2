import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import javax.xml.soap.Node;


public class AVLTreeMap implements StudentMap{
	Nodeee root = null;
	Nodeee position;
	
	TreeMap<Integer,String> myMap = new TreeMap<Integer,String>();
	//inserts a new element to the AVL Tree
	public void insert(int val){
		
		if(root == null){
			root = new Nodeee(val);
		}else{
			
			Nodeee currentNode = root;
			Nodeee parentOfcurrentNode = null;
			//assigns the current node to left or right child if current is full
			while(currentNode != null ){
				
				parentOfcurrentNode = currentNode;
				
				if(currentNode.value<val){
					currentNode = currentNode.rightChild;
					currentNode= new Nodeee(val);
					
					//tree must be balanced
					if(getHeight(currentNode.getrightChild())-getHeight(currentNode.getleftChild()) == 2){
						
						if(val > currentNode.getrightChild().getValue()){
				
							currentNode = singleRotateWithRight(currentNode);
				
						}else{
				
							currentNode = doubleRotateWithRight(currentNode);
						
						}
					}
				}else{
					currentNode = currentNode.leftChild;
					currentNode= new Nodeee(val);
					// tree must be balanced
					if(getHeight(currentNode.getleftChild())-getHeight(currentNode.getrightChild()) == 2){
						
						if(val < currentNode.getleftChild().getValue()){
				
							currentNode = singleRotateWithLeft(currentNode);
				
						}else{
				
							currentNode = doubleRotateWithLeft(currentNode);
						
						}
					}	
				}
			}
			
			/*if(parentOfcurrentNode.value<val){
				parentOfcurrentNode.rightChild = new Nodeee(val);
			}else{
				parentOfcurrentNode.leftChild = new Nodeee(val);
			}*/
				
		}	
	}
	//returns the height of the "position" node
	public static int getHeight (Nodeee position) {

		if (position == null){
			return -1;
		}else{
			return position.getHeight();
		}
	}
	
	public static Nodeee singleRotateWithRight (Nodeee n1) {

		Nodeee n2;
		n2 = n1.getrightChild();
		n1.setrightChild(n2.getleftChild());
		n2.setleftChild(n1);
		
		n1.setHeight(Math.max(getHeight(n1.getleftChild()),getHeight(n1.getrightChild()))+1);
		n2.setHeight(Math.max(getHeight(n2.getrightChild()),n1.getHeight())+1);
		
		return n2;

		}
	public static Nodeee singleRotateWithLeft (Nodeee n2) {

		Nodeee n1;
		n1 = n2.getleftChild();
		n2.setleftChild(n1.getrightChild());
		n1.setrightChild(n2);
		
		n2.setHeight(Math.max(getHeight(n2.getleftChild()),getHeight(n2.getrightChild()))+1);
		n1.setHeight(Math.max(getHeight(n1.getleftChild()),n2.getHeight())+1);
		
		return n1;

		}
	public static Nodeee doubleRotateWithRight (Nodeee n1) {

		n1.setrightChild(singleRotateWithLeft(n1.getrightChild()));

		return singleRotateWithRight(n1);

		}
	public static Nodeee doubleRotateWithLeft (Nodeee n1){
		
		n1.setleftChild(singleRotateWithRight(n1.getleftChild()));
		
		return singleRotateWithLeft(n1);
	}
	
	
	@Override
	public void add(int val, Student s) {
		// TODO Auto-generated method stub
		myMap.put(val, s.toString());
		
	}
	@Override
	public Student get(int val) {
		// TODO Auto-generated method stub
		Student s = new Student(val,myMap.get(val));
		return s;
	}
	@Override
	public void BFT() {
		// TODO Auto-generated method stub
		
		Queue<Nodeee> queue = new LinkedList<Nodeee>();
		 
        queue.add(root);
 
        Nodeee current = null;
 
        while (!queue.isEmpty()) {
            current = queue.poll();
             
            // do the processing on a node
            process(current);
 
            if (current.leftChild != null)
                queue.add(current.leftChild);
            if (current.rightChild != null)
                queue.add(current.rightChild);
        }
        //return;
        System.out.println(queue.toString());
    	
        }
	
	public void process(Nodeee n) {
        Nodeee temp = n.leftChild;
        n.leftChild = n.rightChild;
        n.rightChild = temp;
    }
}
