package Stream_1;
import java.util.stream.*;

interface Drawable{
	
	public void draw();
}



public abstract class JavaStreamExample implements Drawable{

	public static void main(String[] args) {
		
		int width=10;
		
		/*Drawable d=new Drawable() {
		
		
		public void draw() {
			System.out.println("Drawing "+width);
		}
			
		};*/
		
		Drawable d2=()->{System.out.println("Drawing " +width);
		};
		
		d2.draw();
	}

	

}
