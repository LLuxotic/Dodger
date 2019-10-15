import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GRect;

public class Bullet extends GCompound {

	static GImage bulletImage;
	static boolean readyToFire, shot = false;
	static double bx, by;


	public Bullet(double x, double y) {
		bulletImage = new GImage("bullet.png", x, y);
		bulletImage.setSize(64, 64);
		add(bulletImage);


	}


	public static void shoot() {
		double x = bulletImage.getLocation().getX();

		if (shot) {
			bulletImage.move(20, 0);
		}
	}

}
