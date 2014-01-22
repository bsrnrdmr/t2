import java.awt.Graphics;



/**
 * 
 */

/**
 * @author busra
 *
 */
public class GameObject2 extends GameObject implements Mobile{
	
	public GameObject2(int x,int y){
		super(x, y);
	}
	
	@Override
	public void move(int targetX, int targetY) {
		// TODO Auto-generated method stub
		x=targetX;
		y=targetY;
	}
	
	
	public void drawYourself(Graphics g) {
		super.drawYourself(g);
		g.drawOval(x, y, 40, 40);
	}
	
	
}
