
public class Multi_Table {
	public static void main(String[] args) {
		Multi_Table multi_table = new Multi_Table();
		multi_table.getMultiTable1(5);
		multi_table.getMultiTable2(6);
	}
	public void getMultiTable1(int a) {
		int b =1;
		System.out.println("Table of "+a);
		while(b<= 10) {
			System.out.println(a+" X "+b+" = "+(a*b));
		b++;
		}
	}
	public void getMultiTable2(int a) {
		System.out.println("Table of "+a);
		for(int i=1;i<=10;i++) {
			System.out.println(a+" X "+i+" = "+(a*i));
		}
	}
}
