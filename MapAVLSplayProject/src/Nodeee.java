
public class Nodeee {
	int value;
	Nodeee rightChild;
	Nodeee leftChild;
	Nodeee parent;
	Nodeee grandParent;
	private int height;
	
	
	public Nodeee(int val){
		value=val;
		rightChild=null;
		leftChild=null;
		height=0;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public  int getHeight() {
		return height;
	}
	public void setHeight(int height) {	
		this.height = height;
	}
	public Nodeee getrightChild() {	
		return rightChild;
	}
	public void setrightChild(Nodeee rightChild) {
		this.rightChild = rightChild;
	}
	public Nodeee getleftChild() {
		return leftChild;
	}
	public void setleftChild(Nodeee leftChild) {
		this.leftChild = leftChild;
	}
}
