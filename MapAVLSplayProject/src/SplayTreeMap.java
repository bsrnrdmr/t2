
public class SplayTreeMap extends AVLTreeMap {
	Nodeee currentNode = root;
	Nodeee parentOfcurrentNode = null;
	
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
					Splay(currentNode);
				}else{
					currentNode = currentNode.leftChild;
					currentNode= new Nodeee(val);
					
					// tree must be balanced
					Splay(currentNode);
				}
			}
			
		}	
	}
	
	private void Splay(Nodeee currentNode) {
         while (currentNode.parent != null) {
             Nodeee Parent = currentNode.parent;
             Nodeee GrandParent = Parent.parent;
             if (GrandParent == null) {
                 if (currentNode == Parent.leftChild)
                     LeftChildBecomesParent(currentNode, Parent);
                 else
                     RightChildBecomesParent(currentNode, Parent);                 
             }else {
                 if (currentNode == Parent.leftChild){
                     if (Parent == GrandParent.leftChild){
                         LeftChildBecomesParent(Parent, GrandParent);
                         LeftChildBecomesParent(currentNode, Parent);
                     }
                     else{
                         LeftChildBecomesParent(currentNode, currentNode.parent);
                         RightChildBecomesParent(currentNode, currentNode.parent);
                     }
                 }else{
                     if (Parent == GrandParent.leftChild){
                         RightChildBecomesParent(currentNode, currentNode.parent);
                         LeftChildBecomesParent(currentNode, currentNode.parent);
                     }else{
                         RightChildBecomesParent(Parent, GrandParent);
                         RightChildBecomesParent(currentNode, Parent);
                     }
                 }
             }
         }
         root = currentNode;
     }
	public void LeftChildBecomesParent(Nodeee child, Nodeee pare) {
       
        if (pare.parent != null){
            if (pare == pare.parent.leftChild)
                pare.parent.leftChild = child;
            else 
                pare.parent.rightChild = child;
        }if (child.rightChild != null)
            child.rightChild.parent = pare;

        child.parent = pare.parent;
        pare.parent = child;
        pare.leftChild = child.rightChild;
        child.rightChild = pare;
    }
	public void RightChildBecomesParent(Nodeee child, Nodeee pare) {
        
        if (pare.parent != null){
            if (pare == pare.parent.leftChild)
            	pare.parent.leftChild = child;
            else
            	pare.parent.rightChild = child;
        }
        if (child.leftChild != null)
            child.leftChild.parent = pare;
        child.parent = pare.parent;
        pare.parent = child;
        pare.rightChild = child.leftChild;
        child.leftChild = pare;
    }
}
 
