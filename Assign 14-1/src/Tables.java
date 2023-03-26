
public class Tables {
	
	public void getTable(){
		for(int i=2;i<=20;i++) {
			System.out.println("Table of "+i+"\n");
			for(int x=1 ;x<=10;x++) {
			System.out.println(i+"X"+x+"="+i*x);
			}
			System.out.println("--------------------------------");
			
		}
	}
	public static void main(String[] args) {
		new Tables().getTable();
	}
		
}
	

