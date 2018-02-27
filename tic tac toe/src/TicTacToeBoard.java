import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {
	int titleFontSize = 36;
	boolean turn = true; 
	ArrayList<DrawnX> xList = new ArrayList<DrawnX>();
	ArrayList<DrawnO> OList = new ArrayList<DrawnO>();
	public TicTacToeBoard() {
		setSize(632,722);
		setBackground(Color.white);
		GrantsMouse j = new GrantsMouse();
		addMouseListener(j);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, titleFontSize ));
		//DrawnX textX = new DrawnX(100,200);
		//DrawnO textO = new DrawnO(100,200);
		g.drawString("Tic Tac Toe", titleFontSize+200, ((50- titleFontSize) /2 + titleFontSize ));
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Line2D.Double(10, 60, 10, 722-60));
		g2.draw(new Line2D.Double(10, 60, 612, 60));
		g2.draw(new Line2D.Double(10, 722-60, 612, 722-60));
		g2.draw(new Line2D.Double(612, 60, 612, 722-60));
		
		g2.draw(new Line2D.Double(210, 60, 210, 722-60));
		g2.draw(new Line2D.Double(410, 60, 410, 722-60));
		g2.draw(new Line2D.Double(10, 260, 612, 260));
		g2.draw(new Line2D.Double(10, 460, 612, 460));
		
		
		
		for (TicTacToeBoard.DrawnX thisX : xList) {
			g.drawString("X", thisX.xCoord, thisX.yCoord);
		}
		for (TicTacToeBoard.DrawnO thisO : OList) {
			g.drawString("O", thisO.xCoord, thisO.yCoord);
		}

		
		
	}
	class GrantsMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(turn == true) {
			System.out.println(e.getX() +" "+e.getY());
			DrawnX x = new DrawnX(e.getX()-10,e.getY()+10);
			xList.add(x);
			repaint();
			turn = false;
			}
			else {
				System.out.println(e.getX() +" "+e.getY());
				DrawnO o = new DrawnO(e.getX()-10,e.getY()+10);
				OList.add(o);
				repaint();
				turn = true;
				}
			
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class DrawnX{
		int xCoord = 400;
		int yCoord = 200;
		
		public DrawnX(int xCoord,int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
	class DrawnO{
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawnO(int xCoord,int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
}
