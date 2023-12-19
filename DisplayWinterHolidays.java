//КНД-12 Гасанов Рустам
import java.awt.*;

public class DisplayWinterHolidays {

public static void main(String[] args) {
	        DrawingPanel window = new DrawingPanel(800, 600);
	        Graphics g = window.getGraphics();

	        // Колір фону 
	        window.setBackground(Color.cyan);

	        // Метод сніговика
	        drawSnowMan(g, 380, 272);

	        // метод сніжинок
	        drawStar(g, Color.BLUE, 447, 278, 10);
	        drawStar(g, Color.BLUE, 329, 242, 10);
	        drawStar(g, Color.WHITE, 401, 223, 10);
	        drawStar(g, Color.WHITE, 350, 198, 15);
	        drawStar(g, Color.WHITE, 365, 150, 15);
	        drawStar(g, Color.BLUE, 420, 250, 10);
	        drawStar(g, Color.WHITE, 350, 270, 10);
	        g.setColor(Color.BLACK);
	        g.fillRect(0, 410, 900, 300);

	    }

	    public static void drawSnowMan(Graphics frame, int MID, int TOP) {
	        // Біла кість
	        frame.setColor(Color.white);

	        // голова
	        frame.fillOval(MID - 20, TOP, 40, 40);
	        // центр
	        frame.fillOval(MID - 35, TOP + 35, 70, 50);
	        // основа
	        frame.fillOval(MID - 50, TOP + 80, 100, 60);

	        // Чорна кість
	        frame.setColor(Color.black);

	        // Ліве око
	        frame.fillOval(MID - 10, TOP + 10, 5, 5);
	        // Праве око
	        frame.fillOval(MID + 5, TOP + 10, 5, 5);
	        //Ніс
	        frame.fillOval(378, 289, 5, 5);

	        // Посмішка
	        frame.drawArc(MID - 10, TOP + 20, 20, 10, 190, 160);

	        
	        // Ліва рука
	        frame.drawLine(MID - 25, TOP + 60, MID - 50, TOP + 40);
	        // Права рука
	        frame.drawLine(MID + 25, TOP + 60, MID + 55, TOP + 60);

	        // Капелюх
	        frame.drawLine(MID - 20, TOP + 5, MID + 20, TOP + 5);
	        frame.fillRect(MID - 15, TOP - 20, 30, 25);
	    }

	public static void drawStar(Graphics gr, Color c, int x, int y, int size) {
	        int endX;
	        int endY;

	        if (size <= 2)
	            return;

	        gr.setColor(c);
	        // Шість ліній по (x,y)
	        for (int i = 0; i < 6; i++) {
	            endX = x + (int) (size * Math.cos((2 * Math.PI / 6) * i));
	            endY = y - (int) (size * Math.sin((2 * Math.PI / 6) * i));
	            gr.drawLine(x, y, endX, endY);
	            drawStar(gr, c, endX, endY, size / 3);
	        }
	    }
}
	

