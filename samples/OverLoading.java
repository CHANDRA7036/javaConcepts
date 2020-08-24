package samples;

public class OverLoading {

		public void m1(int i, float f) {
			System.out.println("int-float version");

		}

		public void m1(int i, int j) {
			System.out.println("int-int version");

		}

		public void m1(float f, int i) {
			System.out.println("float int version");
		}


		public static void main(String args[]) {
			OverLoading t4 = new OverLoading();

			 t4.m1(10, 10.5f);
			 t4.m1(10.5f, 10);
			 t4.m1(10, 10);
			 //t4.m1(10.5f, 10.5f);

			 t4.m1('a',10.5f);
			 //t4.m1('a',10.5);
			 //t4.m1(15.5f,10L);

	}

}
