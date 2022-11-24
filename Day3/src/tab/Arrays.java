package tab;

public class Arrays {
	public static void main(String args[]) {
		String a[][]= {{"testing tools","QTP","UTP"},{"A","B","C"}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.println(a[i][j]+" ");
		System.out.println();
		}
	}

}
