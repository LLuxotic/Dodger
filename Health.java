import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;

public class Health extends GCompound {
	
	static float health = 100;
	
	GRect bar;
	GRect underbar;
	GLabel healthAmount;
	
	public Health() {
		underbar = new GRect(7, 15, 100 * 1.5, 30);
		underbar.setColor(Color.GRAY);
		underbar.setFilled(true);
		underbar.setVisible(true);
		add(underbar);

		bar = new GRect(7, 15, Main.health * 1.5, 30);
		bar.setColor(Color.GREEN);
		bar.setFilled(true);
		bar.setVisible(true);
		add(bar);
		
		healthAmount = new GLabel(Main.health + " HP", 78.5, 30);
		healthAmount.setFont("Courier");
		add(healthAmount);
		
	}
	
	
	

}
