
public class Main {

	public static void main(String[] args) {
		System.out.println("Multiples of 3 and 5");
		Main main = new Main();
		System.out.println(main.findMultipleOf(0, 10));
		System.out.println(main.findMultipleOf(0, 1000));
		System.out.println("End of Multiples of 3 and 5");
	}
	
	/**
	 * Problem Description
	 * If we list all the natural numbers below 10 that are 
	 * multiples of 3 or 5, we get 3, 5, 6 and 9.The sum of 
	 * these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	
	public int findMultipleOf(int startRange, int endRange){
		int sum = 0;
		
		for(int i = startRange; i<endRange; i++){
			if((i % 3) == 0){
				sum = sum + i;
			}else if((i % 5) == 0){
				sum = sum + i;
			}
		}
		
		return sum;
	}
}
