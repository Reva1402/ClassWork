package Activity.One;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;

		System.out.print(naturalNumber(num));

	}

	public static int naturalNumber(int num) {
		int naturalNumber = 1;
		while (naturalNumber < (num)) {
			System.out.println(naturalNumber);
			naturalNumber++;

		}
		return naturalNumber;

	}

}
