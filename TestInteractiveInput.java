package Projekti;
import java.awt.*;
public class TestInteractiveInput {

	public static void main(String[] args) {
		

				InteractiveInput k=new InteractiveInput();
				k.getTittle(k.s);
				k.getLargestValue(k.l,k.i);
				k.getBar1(k.b1, k.h1, k.c1);
				k.getBar2(k.b2, k.h2, k.c2);
				k.getBar3(k.b3, k.h3, k.c3);
				k.getBar4(k.b4, k.h4, k.c4);
				k.getBar5(k.b5, k.h5, k.c5);
				k.getBar6(k.b6, k.h6, k.c6);
				BarGraphWriter g=new BarGraphWriter();
				
				int scale_factor=3;
				g.setTitle(k.s);
				g.setAxes(20, 120, k.l,k.i);
				g.setBar1(k.b1, k.h1*scale_factor, k.c1);
				g.setBar2(k.b2, k.h2*scale_factor, k.c2);
				g.setBar3(k.b3, k.h3*scale_factor, k.c3);
				g.setBar4(k.b4, k.h4*scale_factor, k.c4);
				g.setBar5(k.b5, k.h5*scale_factor, k.c5);
				g.setBar6(k.b6, k.h6*scale_factor, k.c6);
			}

		}


	


