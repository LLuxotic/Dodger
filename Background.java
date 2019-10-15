
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Background extends GraphicsProgram implements Commons {

	private static final long serialVersionUID = 1L;
	GImage bg;
		
	public Background() {
		initUI();
	}

	public GImage initUI() {
		bg = new GImage("background.gif", 0, 0);
		bg.setSize(Commons.WINDOW_WIDTH, Commons.WINDOW_HEIGHT);	
		return bg;
	}


}
