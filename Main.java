import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.graphics.GRectangle;
import acm.program.*;
import acm.util.RandomGenerator;
import acmx.export.java.util.List;
public class Main extends GraphicsProgram implements Runnable {

	private static final long serialVersionUID = 1L;
	public static final int REFRESH = 5;
	public static final int NUM_ENEMIES = 3;


	Background mainBG = new Background();  // Background object
	Hero player = new Hero(); // Main player object
	Enemy3 useToClear = new Enemy3();
	static ArrayList<Enemy3> enemies;

	Health health_bar;

	Bullet bullet;

	GLabel scoreboard;

	Enemy3 e1;

	static int score = 0;
	static int health = 100;

	static boolean isShooting = false;
	boolean intersectionEnemy3ToPlayer;


	public void init() {
		setSize(Commons.WINDOW_WIDTH, Commons.WINDOW_HEIGHT);
		addKeyListeners();
		addMouseMotionListener(this);
		add(mainBG.initUI());
		add(player);
		pause(REFRESH);
		setTitle("Dodger v1.00");






	}
	int m = 0;
	int bulletCount = 0;

	public void run() {

		try {
			while(true) {
				enemies = new ArrayList<Enemy3>(NUM_ENEMIES);
				intersectionEnemy3ToPlayer = false;

				if (scoreboard != null)
					remove(scoreboard);
				scoreboard = new GLabel("Score: " + score++, 0, 500);
				add(scoreboard);

				if (health_bar != null)
					remove(health_bar);
				health_bar = new Health();
				add(health_bar);

				for (int k = 0; k < NUM_ENEMIES; k++) {
					enemies.add(k, new Enemy3());
				} 

				int moveCount = 0;
				while (moveCount < 166) {
					if (Bullet.shot) {
						add(bullet);
						Bullet.shoot();

					}

					for (Enemy3 enemy : enemies) {
						add(enemy.move());
						if (enemy.move().getBounds().intersects(player.getBounds())) {
							remove(enemy.move());
							remove(enemy);
							enemy = null;
							intersectionEnemy3ToPlayer = true;
						}
						if (bullet != null) {
							if (bullet.getBounds().intersects(enemy.getBounds())) {
								remove(enemy.move());
								remove(enemy);
								remove(bullet);
								enemy = null;
								bullet = null;
								score -= 12;

								
							}
						}
					}
					moveCount++;
				}
				if (intersectionEnemy3ToPlayer) {
					health -= 5;
				}
				if (!intersectionEnemy3ToPlayer)
					score += 5;


				m++;
				useToClear.deleteValues();

			}
		} catch (Exception e) {

		}

	}


	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		double x = player.getLocation().getX();
		double y = player.getLocation().getY();
		if (keyCode == 40) {
			player.setLocation(x, y + Commons.PLAYER_Y_MOVEMENT);
			y = player.getLocation().getY();

		}
		if (keyCode == 38) {
			player.setLocation(x, y - Commons.PLAYER_Y_MOVEMENT);
			y = player.getLocation().getY();
		}
		if (keyCode == 32) {
			if (bullet == null) {
				fire();
			} else if (bullet != null) {
				remove(bullet);
				bullet = null;
				fire();

			}
		}
	}


	private void fire() {
		Bullet.by = player.getBounds().getY();
		Bullet.bx = player.getBounds().getX();
		bullet = new Bullet(Bullet.bx, Bullet.by);
		Bullet.shot = true;
	}


	public void keyReleased(KeyEvent e) {


	}

	}


