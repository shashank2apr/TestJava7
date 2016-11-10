package test;

public class TestEffectiveFinal {

	public static void main(String[] args) {

		final String outer = "Outer";

		new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println(outer);
			}
		}).start();

	}

}
