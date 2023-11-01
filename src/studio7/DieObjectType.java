package studio7;

public class DieObjectType {
	
	public static int rollDie(int n) {
		int rollNumber;
		rollNumber = (int)((Math.random()*n)+1);
		return rollNumber;
	}
	public static void main(String[] args){
		System.out.println(rollDie(6));
	}
}