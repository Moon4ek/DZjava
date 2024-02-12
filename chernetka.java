import java.awt.*;

public class chernetka {
	
	    public static final int WINDOW_W = 500;
	    public static final int WINDOW_H = 300;

	    public static final int LEFT_TOP_ANGLE_X = 10;
	    public static final int LEFT_TOP_ANGLE_Y = 10;

	    public static final int RIGHT_TOP_ANGLE_X = WINDOW_W - 10;
	    public static final int RIGHT_TOP_ANGLE_Y = WINDOW_H - 10;

	    public static final int LINE_TOP_X = WINDOW_W /2;
	    public static final int LINE_TOP_Y = WINDOW_H /2;

	    public static final int LINE_BOT_X = WINDOW_W /2;
	    public static final int LINE_BOT_Y = WINDOW_H - 10;

	    public static final int BALL_DIAMETER = 20;
	    public static int ballX = 40;
	    public static int ballY = 40;
	    public static int ballVelocityX = 4;
	    public static int ballVelocityY = -3;

	    public static final int FPS = 1000 / 60;

	    public static void main(String[] args) {
	        DrawingPanel panel = new DrawingPanel(WINDOW_W, WINDOW_H);
	        Graphics2D graphics = panel.getGraphics();

	        for (;true;) {
	            update(graphics);
	            panel.sleep(FPS);
	        }
	    }

	    public static void update(Graphics2D g) {
	        draw(g);
	        checkColision();

	        ballX += ballVelocityX;
	        ballY += ballVelocityY;
	    }

	    public static void draw(Graphics2D g) {
	        g.setColor(Color.WHITE);
	        g.fillRect(0, 0, WINDOW_W, WINDOW_H);


	        g.setColor(Color.RED);
	        g.drawRect(LEFT_TOP_ANGLE_X, LEFT_TOP_ANGLE_Y, WINDOW_W - 20, WINDOW_H - 20);
	        g.drawLine(LINE_TOP_X, LINE_TOP_Y,  LINE_BOT_X, LINE_BOT_Y);

	        g.setColor(Color.BLUE);
	        g.fillOval(ballX, ballY, BALL_DIAMETER, BALL_DIAMETER);
	    }

	    public static void checkColision() {
	        if (ballY <= 10) {
	            ballY = 10;
	            ballVelocityY *= -1;
	        }
	        if (ballX <= 10) {
	            ballX = 10;
	            ballVelocityX *= -1;
	        }
	        if (ballX + BALL_DIAMETER >= RIGHT_TOP_ANGLE_X) {
	            ballX = RIGHT_TOP_ANGLE_X - BALL_DIAMETER;
	            ballVelocityX *= -1;
	        }
	        if (ballY + BALL_DIAMETER >= RIGHT_TOP_ANGLE_Y) {
	            ballY = RIGHT_TOP_ANGLE_Y - BALL_DIAMETER;
	            ballVelocityY *= -1;

	        }
	    }
	}
			      


