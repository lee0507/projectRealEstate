package projectRealEstate;

import java.util.Scanner;

public class Chap08_P9 extends Thread {
	int n;

	public Chap08_P9(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (int i = 0; i < number; i++) {
			Chap08_P9 runner = new Chap08_P9(i);
			runner.start();
		}
	}

	public void run() {
		synchronized (this) {
			double sum = 0;
			int i = 1;
			System.out.println(this.getName() + " Thread_Start");
			while (true) {
				try {
					sum += (Math.random() * 10);

					if (sum >= 50) {
						System.out.println(this.getName() + " Thread_End");
						System.out.println(i + "s (finished)");
						break;
					}

					System.out.println(this.getName());
					System.out.printf("%.1f\n", sum);
					Thread.sleep(1000);
					i++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
