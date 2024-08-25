package dummy;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForLoop fl = new ForLoop();
		fl.countApples();
	}

	
	
	public void countApples() {
		//basic
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		//count 10++
		for (int i = 1; i <= 100; i+=10) {
			System.out.print(i);
		}
		
		System.out.println();
		//basic break
		for (int i = 1; i <= 10; i++) {
			if(i==5) {break;}
			
			System.out.print(i);
		}
			
		System.out.println();
		//basic continue
		for (int i = 1; i <= 10; i++) {
			if(i==5) {continue;}
			
			System.out.print(i);

	}
	
	
	
}
	}
