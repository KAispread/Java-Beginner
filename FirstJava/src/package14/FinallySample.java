package package14;

public class FinallySample {

	public static void main(String[] args) {
		FinallySample sample = new FinallySample();
		sample.finallySample();
	}
	
	public void finallySample() {
		int [] intArray = new int[5];
		int a = 3;
		try {
			System.out.println(intArray[5]);
			if (a == 3) {
			   
			}
		} catch(Exception e) {
			System.out.println("Array is "+intArray.length+"");
		} finally {
			System.out.println("Here is finally");
		}
		System.out.println("This code is must run");
	}
}
