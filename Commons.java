public interface Commons {

	
	public static final int WINDOW_WIDTH = 825;
	public static final int WINDOW_HEIGHT = 600;
	
	// Calculate exact width and height to allow Player to take up only 0.67% (3300 pixels squared) of the Canvas
	//public static final double PLAYER_WIDTH = (Math.sqrt((3300*(115/94))));
	public static final double PLAYER_WIDTH = 51.93641598;
	public static final double PLAYER_HEIGHT = 63.53923231;
	
	// Calculates position of player
	public static double playerX = 29.03179201;
	public static double playerY = 268.2303838;
	
	//public static final double PLAYER_Y_MOVEMENT = 10.72921535;
	public static final double PLAYER_Y_MOVEMENT = 21.45843071;

	// Calculate exact width and height to allow Enemy3 to take up only 0.67% (3300 pixels squared) of the Canvas
	public static final double ENEMY3_WIDTH = 50.74288881;
	public static final double ENEMY3_HEIGHT = 75.8727004;

	public static final double ENEMY3X = 469.6285556;
	
	
	public static final int MAX_VALUES = 100000;




	

	
	
	
	
	


	public static final int GROUND = 290;
	public static final int BOMB_HEIGHT = 5;
	public static final int ALIEN_HEIGHT = 12;
	public static final int ALIEN_WIDTH = 12;
	public static final int BORDER_RIGHT = 30;
	public static final int BORDER_LEFT = 5;
	public static final int GO_DOWN = 15;
	public static final int NUMBER_OF_ALIENS_TO_DESTROY = 24;
	public static final int CHANCE = 5;
	public static final int DELAY = 17;
}