package figures;

import java.awt.*;
import java.awt.Color;

public class Rect extends Figure {

	public int x, y, w, h;
	private Color contorno, fundo;

    public Rect (int x, int y, int w, int h, Color contorno, Color fundo) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.contorno = contorno;
	 	this.fundo = fundo;
    }

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(this.contorno);
        g2d.drawRect(this.x, this.y, this.w, this.h);	
        g2d.setColor(this.fundo);
		g2d.fillRect(x+1, y+1, w-1, h-1);
	}
}