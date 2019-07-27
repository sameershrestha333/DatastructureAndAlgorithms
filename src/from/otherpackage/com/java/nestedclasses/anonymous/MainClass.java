package from.otherpackage.com.java.nestedclasses.anonymous;

public class MainClass {
	public static void main(String[] args) {
		java.lang.Math math = new java.lang.Math() {
			@Override
			public void arthimatic(int a, int b) {
				System.out.println(a + b);
			}
		};
		math.arthimatic(4, 5);
	}
}