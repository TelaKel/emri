package Projekti;


	import java.awt.*;
	import javax.swing.*;
	
	
	public class InteractiveInput extends JPanel {
		public String s,g,l,b1,b2,b3,b4,b5,b6;
		public int i,h1,h2,h3,h4,h5,h6;
		Color c1=Color.white;
		Color c2=Color.white;
		Color c3=Color.white;
		Color c4=Color.white;
		Color c5=Color.white;
		Color c6=Color.white;
		
		public void getTittle(String s1) {
			s=s1;
			String a=JOptionPane.showInputDialog("Futeni emrin e grafikut ");
			s=String.valueOf(a);
			
		}
		public void getLargestValue(String s1,int i1) {
			l=s1;
			i=i1;
			String a=JOptionPane.showInputDialog("Ju lutem shenoni vleren me te madhe te grafikut");
			l=String.valueOf(a);
			String b=JOptionPane.showInputDialog("Ju lutem shenoni lartesine e grafikut(sipas deshires tuaj)");
			i=Integer.valueOf(b);
		}
		public void getBar1(String a,int h,Color c) {
			b1=a;
			h1=h;
			c1=c;
			
			String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se pare");
			b1=String.valueOf(m);
			String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se pare");
			h1=Integer.valueOf(n);
			if(h1==0) {
				
			}else {
				JColorChooser cl=new JColorChooser();
				c1=cl.showDialog(null, "Ju lutemi shenoni ngjyren e shtylles se pare", Color.green);
			}		
		}
		public void getBar2(String a,int h,Color c) {
			b2=a;
			h2=h;
			c2=c;
			
			String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se dyte");
			b2=String.valueOf(m);
			String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se dyte");
			h2=Integer.valueOf(n);
			if(h2==0) {
				
			}else {
				JColorChooser cl=new JColorChooser();
				c2=cl.showDialog(null, "JU LUTEM ZGJIDHNI NGJYREN E SHTYLLES SE DYTE", Color.green);
			}
		}
		public void getBar3(String a,int h,Color c) {
			b3=a;
			h3=h;
			c3=c;
			
			String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se trete");
			b3=String.valueOf(m);
			String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se trete");
			h3=Integer.valueOf(n);
			if(h3==0) {
				
			}else {
				JColorChooser cl=new JColorChooser();
				c3=cl.showDialog(null, "JU LUTEM ZGJIDHNI NGJYREN E SHTYLLES SE TRETE", Color.green);
			}
		}
		public void getBar4(String a,int h,Color c) {
			b4=a;
			h4=h;
			c4=c;
			
			String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se katert");
			b4=String.valueOf(m);
			String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se katert");
			h4=Integer.valueOf(n);
			if(h4==0) {
				
			}else {
				JColorChooser cl=new JColorChooser();
				c4=cl.showDialog(null, "JU LUTEM ZGJIDHNI NGJYREN E SHTYLLES SE KATERT", Color.green);
			}
		}
		public void getBar5(String a,int h,Color c) {
			b5=a;
			h5=h;
			c5=c;
			
			String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se peste");
			b5=String.valueOf(m);
			String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se peste");
			h5=Integer.valueOf(n);
			if(h5==0) {
				
			}else {
				JColorChooser cl=new JColorChooser();
				c5=cl.showDialog(null, "JU LUTEM ZGJIDHNI NGJYREN E SHTYLLES SE PESTE", Color.green);
			}
		}
		public void getBar6(String a,int h,Color c) {
			b6=a;
			h6=h;
			c6=c;
			
			String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se gjashte");
			b6=String.valueOf(m);
			String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se gjashte");
			h6=Integer.valueOf(n);
			if(h6==0) {
				
			}else {
				JColorChooser cl=new JColorChooser();
				c6=cl.showDialog(null, "JU LUTEM ZGJIDHNI NGJYREN E SHTYLLES SE GJASHTE", Color.green);
			}
		}
	}


