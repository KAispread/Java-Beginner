package package07;

public class ArrayNewFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayNewFor array = new ArrayNewFor();
		int [] arrayNum01 = {1, 2, 3, 4};

		for(int i = 0; i < arrayNum01.length; i++){
			System.out.println("Index" + i + " = " + arrayNum01[i]);
		}
		array.newFor();
	}
	
	public void newFor() {
		int [] oneDim = {1,2,3,4,5,6,7,8,9,10};
		for(int data:oneDim) {
//			System.out.println(data);
		}
	}

}
