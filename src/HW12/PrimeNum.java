package HW12;

public class PrimeNum {
	String prime(int num) {
		if(num%2==0) {
			return "Not Prime";
		}else {
			return "Prime";
		}
		
	}
	public static void main(String[] args) {
		PrimeNum number=new PrimeNum();
		String input=number.prime(105);
		System.out.println(input);
	}
}
