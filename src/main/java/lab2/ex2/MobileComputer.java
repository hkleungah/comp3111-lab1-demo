package lab2.ex2;

public class MobileComputer extends Computer implements Chargeable{
	private int battery;
	public MobileComputer() {
		secret="MobileComputer";
		battery=5;
	}
	public void work() {
		if(battery>0) {
			System.out.println("It is working on my lap");
		}else
			System.out.println("Running out of battery");
	}
public void charge() {
	if(battery<10) 
		battery++;
}
}
