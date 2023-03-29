package Projekti;

import java.awt.*;
public class DistanceFromSun {


	public static void main(String[] args) {
		
		
				BarGraphWriter d=new BarGraphWriter();
				d.setTitle("Distance of SS planets from Sun");
				d.setAxes(20, 120, "10", 100);
				int scale_factor=1;
				d.setBar1("Merc", 4*scale_factor, Color.red);
				d.setBar2("Ven",7*scale_factor,Color.yellow);
				d.setBar3("Erth", 10*scale_factor, Color.pink);
				d.setBar4("Mars", 15*scale_factor, Color.black);
				d.setBar5("Jpt", 52*scale_factor, Color.gray);
				d.setBar6("Satr",95*scale_factor,Color.blue);

			}

		}
	


