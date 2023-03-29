package Projekti;

import java.awt.*;
import javax.swing.*;

public class BarGraphWriter extends JPanel {
	
	 private int x=500;
	 private int y=400;
	 private int x_axes,y_axes,px_height;
	 private int x_width=405;
	 private String s="";

	 Color c1=Color.black;
	 Color c2=Color.black;
	 Color c3=Color.black;
	 Color c4=Color.black;
	 Color c5=Color.black;
	 Color c6=Color.black;
	 
	 
	 private String s1_label="";
	 private String s2_label="";
	 private String s3_label="";
	 private String s4_label="";
	 private String s5_label="";
	 private String s6_label="";
	 
	 private int h1,h2,h3,h4,h5,h6;
	 private JFrame my_frame=new JFrame();
	 
	public BarGraphWriter() {
		my_frame.getContentPane().add(this);
		my_frame.setSize(x,y);
		my_frame.setVisible(true);
		
	}
	public void setTitle(String title) {
		s=title;
		my_frame.setTitle(s);
		this.repaint();
		
	}

	public void setAxes(int x_pos,int y_pos,String top_label,int y_height) {
		x_axes=x_pos;
		y_axes=y_pos;
		s=top_label;
		px_height=y_height;
		this.repaint();
		
	}
	public void setBar1(String label, int height , Color c) {
		s1_label=label;
		h1=height;
		c1=c;
	}
	public void setBar2(String label, int height , Color c) {
		s2_label=label;
		h2=height;
		c2=c;
	}
	public void setBar3(String label, int height , Color c) {
		s3_label=label;
		h3=height;
		c3=c;
	}
	public void setBar4(String label, int height , Color c) {
		s4_label=label;
		h4=height;
		c4=c;
	}
	public void setBar5(String label, int height , Color c) {
		s5_label=label;
		h5=height;
		c5=c;
	}
	public void setBar6(String label, int height , Color c) {
		s6_label=label;
		h6=height;
		c6=c;
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.drawString(s, x_axes, y_axes);
		g.drawString("0",x_axes,y_axes+px_height-10);
		g.drawLine(x_axes+15, y_axes-10, x_axes+15, (y_axes-10)+px_height);
		g.drawLine(x_axes+15,px_height+(y_axes-10),x_axes+x_width,px_height+(y_axes-10));
		//Print first Bar
		g.setColor(c1);
		g.fillRect(x_axes+30, y_axes-10+(px_height-h1), 50,h1);
		g.setColor(Color.black);
		g.drawString(s1_label, x_axes+45, y_axes+10+px_height);
		//Print second Bar
		g.setColor(c2);
		g.fillRect(x_axes+30+50+15, y_axes-10+(px_height-h2), 50,h2);
		g.setColor(Color.black);
		g.drawString(s2_label, x_axes+45+50+15, y_axes+10+px_height);
		//Print third Bar
		g.setColor(c3);
		g.fillRect(x_axes+30+2*50+2*15, y_axes-10+(px_height-h3), 50,h3);
		g.setColor(Color.black);
		g.drawString(s3_label, x_axes+45+2*50+2*15, y_axes+10+px_height);
		//Print fourth Bar
		g.setColor(c4);
		g.fillRect(x_axes+30+3*50+3*15, y_axes-10+(px_height-h4), 50,h4);
		g.setColor(Color.black);
		g.drawString(s4_label, x_axes+45+3*50+3*15, y_axes+10+px_height);
		//Print fifth Bar
		g.setColor(c5);
		g.fillRect(x_axes+30+4*50+4*15, y_axes-10+(px_height-h5), 50,h5);
		g.setColor(Color.black);
		g.drawString(s5_label, x_axes+45+4*50+4*15, y_axes+10+px_height);
		//Print sixth Bar
		g.setColor(c6);
		g.fillRect(x_axes+30+5*50+5*15, y_axes-10+(px_height-h6), 50,h6);
		g.setColor(Color.black);
		g.drawString(s6_label, x_axes+45+5*50+5*15, y_axes+10+px_height);


		
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	