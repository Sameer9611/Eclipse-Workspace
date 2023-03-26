
public class Marksheet {
	public static void main(String[] args) {
		Marksheet marksheet = new Marksheet();
		int output=marksheet.getMarks();// this what i was talking about
		System.out.println(output);//prints 111
		
	}
	public int getMarks() {
		int maths =55;
		int science =56;
		int totalMarks=maths+science;
		return totalMarks;
	}

}
