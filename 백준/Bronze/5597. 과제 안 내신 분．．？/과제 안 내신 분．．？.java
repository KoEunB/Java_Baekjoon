import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] temp = new int[30];

		for (int i = 0; i < 30; i++) {
			temp[i] = -1;
		}

		for (int j = 0; j < 28; j++) {
			int index = scan.nextInt();
			temp[index - 1] = index;
		}

		for (int i = 0; i < 30; i++) {
			if (temp[i] == -1) {
				System.out.println(i + 1);
			}
		}
	}
}