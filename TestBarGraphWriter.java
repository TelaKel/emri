package Projekti;
import java.awt.*;
public class TestBarGraphWriter {

	public static void main(String[] args) {
		
			
				
				BarGraphWriter e=new BarGraphWriter();
				e.setTitle("First 6 months of the year");
				e.setAxes(20, 120, "30", 90);
				int scale_factor=3;
				e.setBar1("Jan", 31*scale_factor, Color.red);
				e.setBar2("Feb", 28*scale_factor,Color.yellow);
				e.setBar3("Mar", 31*scale_factor, Color.pink);
				e.setBar4("Apr", 30*scale_factor, Color.black);
				e.setBar5("May", 31*scale_factor, Color.gray);
				e.setBar6("Jun",30*scale_factor,Color.blue);
				}
				
			}



	


