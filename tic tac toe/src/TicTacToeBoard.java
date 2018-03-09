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
	int titleFontSize = 48;
	boolean turn = true; 
	ArrayList<DrawnX> xList = new ArrayList<DrawnX>();
	ArrayList<DrawnO> OList = new ArrayList<DrawnO>();
	boolean taken1 = false;
	boolean taken2 = false;
	boolean taken3 = false;
	boolean taken4 = false;
	boolean taken5 = false;
	boolean taken6 = false;
	boolean taken7 = false;
	boolean taken8 = false;
	boolean taken9 = false;
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
				DrawnX x = new DrawnX(10,10);
			System.out.println(e.getX() +" "+e.getY());
			 if(e.getX() >= 10 && e.getX() <= 210 && e.getY()>=60 && e.getY()<=260 && taken1 == false) {
				 x = new DrawnX(100,150);
				 taken1 = true;
			}
			else if(e.getX() >= 210 && e.getX() <= 410 && e.getY()>=60 && e.getY()<=260 && taken2 == false) {
				 x = new DrawnX(300,150);
				 taken2 = true;
			}
			else if(e.getX() >= 410 && e.getX() <= 610 && e.getY()>=60 && e.getY()<=260 && taken3 == false) {
				 x = new DrawnX(500,150);
				 taken3 = true;
			}
			else if(e.getX() >= 10 && e.getX() <= 210 && e.getY()>=260 && e.getY()<=460&& taken4 == false) {
				 x = new DrawnX(100,350);
				 taken4 = true;
			}
			else if(e.getX() >= 210 && e.getX() <= 410 && e.getY()>=260 && e.getY()<=460&& taken5 == false) {
				 x = new DrawnX(300,350);
				 taken5 = true;
			}
			else if(e.getX() >= 410 && e.getX() <= 610 && e.getY()>=260 && e.getY()<=460&& taken6 == false) {
				 x = new DrawnX(500,350);
				 taken6 = true;
			}
			else if(e.getX() >= 10 && e.getX() <= 210 && e.getY()>=460 && e.getY()<=660&& taken7 == false) {
				 x = new DrawnX(100,550);
				 taken7 = true;
			}
			else if(e.getX() >= 210 && e.getX() <= 410 && e.getY()>=460 && e.getY()<=660&& taken8 == false) {
				 x = new DrawnX(300,550);
				 taken8 = true;
			}
			else if(e.getX() >= 410 && e.getX() <= 610 && e.getY()>=460 && e.getY()<=660&& taken9 == false) {
				 x = new DrawnX(500,550);
				 taken9 = true;
			}
			
			xList.add(x);
			repaint();
			turn = false;
			}
			else {
				System.out.println(e.getX() +" "+e.getY());
				DrawnO o = new DrawnO(0,0);
				if(e.getX() >= 10 && e.getX() <= 210 && e.getY()>=60 && e.getY()<=260 && taken1 == false) {
					 o = new DrawnO(100,150);
					 taken1 = true;
				}
				else if(e.getX() >= 210 && e.getX() <= 410 && e.getY()>=60 && e.getY()<=260 && taken2 == false) {
					 o = new DrawnO(300,150);
					 taken2 = true;
				}
				else if(e.getX() >= 410 && e.getX() <= 610 && e.getY()>=60 && e.getY()<=260 && taken3 == false) {
					 o = new DrawnO(500,150);
					 taken3 = true;
				}
				else if(e.getX() >= 10 && e.getX() <= 210 && e.getY()>=260 && e.getY()<=460&& taken4 == false) {
					 o = new DrawnO(100,350);
					 taken4 = true;
				}
				else if(e.getX() >= 210 && e.getX() <= 410 && e.getY()>=260 && e.getY()<=460&& taken5 == false) {
					 o = new DrawnO(300,350);
					 taken5 = true;
				}
				else if(e.getX() >= 410 && e.getX() <= 610 && e.getY()>=260 && e.getY()<=460&& taken6 == false) {
					 o = new DrawnO(500,350);
					 taken6 = true;
				}
				else if(e.getX() >= 10 && e.getX() <= 210 && e.getY()>=460 && e.getY()<=660&& taken7 == false) {
					 o = new DrawnO(100,550);
					 taken7 = true;
				}
				else if(e.getX() >= 210 && e.getX() <= 410 && e.getY()>=460 && e.getY()<=660&& taken8 == false) {
					 o = new DrawnO(300,550);
					 taken8 = true;
				}
				else if(e.getX() >= 410 && e.getX() <= 610 && e.getY()>=460 && e.getY()<=660&& taken9 == false) {
					 o = new DrawnO(500,550);
					 taken9 = true;
				}
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
