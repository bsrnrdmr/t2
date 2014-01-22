import java.awt.Graphics;

/**
 * 
 */

/**
 * @author busra
 *
 */
public class GameObject {
	protected int x = 0;
	protected int y = 50;
	
	public GameObject(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	
	public void drawYourself(Graphics g){
		g.drawRect(x, y, 50, 50);
	}
}
