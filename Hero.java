import java.awt.Rectangle;
import java.util.ArrayList;

import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.graphics.GRectangle;

public class Hero extends GCompound {

	GImage userPic;

	public Hero() {
		userPic = new GImage("player2.png", Commons.playerX, Commons.playerY);
		userPic.setSize(Commons.PLAYER_WIDTH, Commons.PLAYER_HEIGHT);
		add(userPic);

	}
	
}
 