
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author busra
 *
 */
@SuppressWarnings("serial")
public class GameFrame extends JFrame implements MouseListener {
	
	ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
	
	public GameFrame(){
		addMouseListener(this);
		gameObjects.add(new GameObject(5,32));
		gameObjects.add(new GameObject(5,87));
		gameObjects.add(new GameObject(5,140));
		gameObjects.add(new GameObject(5,195));
		
		gameObjects.add(new GameObject2(60,32));
		gameObjects.add(new GameObject2(60,87));
		gameObjects.add(new GameObject2(60,140));
		gameObjects.add(new GameObject2(60,195));
		
		
		gameObjects.add(new GameObject2(115,32));
		gameObjects.add(new GameObject2(115,87));
		gameObjects.add(new GameObject2(115,140));
		gameObjects.add(new GameObject2(115,195));
		
		
		gameObjects.add(new GameObject(170,32));
		gameObjects.add(new GameObject(170,87));
		gameObjects.add(new GameObject(170,140));
		gameObjects.add(new GameObject(170,195));
		
		gameObjects.add(new GameObject2(25,52));
		
	}
	
	public void paint(Graphics g){
		for(int i=0; i< gameObjects.size(); i++){
			GameObject o = gameObjects.get(i);
			o.drawYourself(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
