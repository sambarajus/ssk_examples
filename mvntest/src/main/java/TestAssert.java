
public class TestAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "shravan";
		assert name.equals("Shravan") : "Not Lowercase";
		name = name.toUpperCase();
		System.out.println(name);
	}

}
