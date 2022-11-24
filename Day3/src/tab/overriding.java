package tab;

public class overriding {
	public void detail(int a1, int a2) {
		int c= a1+a2;
		System.out.println(c);
	}
	class riding2 extends overriding{
		public void detail(int a1, int a2) {
			int d=a1+a2;
			System.out.println(d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding r =new overriding();
		r.detail(10,20);
	}

}
