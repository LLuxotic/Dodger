import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.util.RandomGenerator;

public class Enemy3 extends GCompound {



	GImage enemyImage;
	RandomGenerator r = RandomGenerator.getInstance();
	int maxY = (int) (Commons.WINDOW_HEIGHT - Commons.ENEMY3_HEIGHT - 5);
	public static int yIndexEnemy;
	int[] yIndexEnemyOld = new int[3];
	int index = 0;

	static double refreshTimer = 1.85;

	public Enemy3() {
		while (true) {
			yIndexEnemy = r.nextInt(5, maxY);
			if (contains(yIndexEnemyOld, yIndexEnemy) == false) {
				break;
			}
		}
		enemyImage = new GImage("Enemy3.png", 830, yIndexEnemy);
		enemyImage.setSize(Commons.ENEMY3_WIDTH, Commons.ENEMY3_HEIGHT);
		add(enemyImage);
		yIndexEnemyOld[index++] = yIndexEnemy;

	}

	public boolean contains(int[] arr, int value) {
		boolean checkUp = false;
		int valueUp = (int) (value + (2 * Commons.ENEMY3_HEIGHT));
		for (int i = value; i < valueUp; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i)
					checkUp = true;
			}
		}
		boolean checkDown = false;
		int valueDown = (int) (value - (2 * Commons.ENEMY3_HEIGHT));
		for (int i = value; i > valueDown; i--) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i)
					checkDown = true;
			}
		}
		if (checkDown && checkUp) {
			return true;
		}
		return false;
	}


	public GObject move() {
			double y = enemyImage.getLocation().getY();
			enemyImage.setLocation(enemyImage.getLocation().getX() - 5, y);
			pause(refreshTimer);
			return enemyImage;
	}


	public void deleteValues() {
		for (int i = 0; i < yIndexEnemyOld.length; i++) {
			yIndexEnemyOld[i] = 0;
		}
	}


}