package package17;

public class UserAnnotationSample {
	@UserAnnotation(number=0)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAnnotationSample sample = new UserAnnotationSample();
		double a = 123.123;
		System.out.println(a);
	}
	
	@UserAnnotation(number=1)
	public void annotationSample1() {
		
	}
	@UserAnnotation(number=2, text="second")
	public void annotationSample2() {
		
	}
	@UserAnnotation(number=3, text="third")
	public void annotationSample3() {
		
	}

}
