
public class Marksheet {
	public static void main(String[]args) {
		int maths = 52;
		int science = 56;
		int geography = 60;
		int history = 67;
		int computer = 69;
		Marksheet marksheet = new Marksheet(); 
		int totalMarks =marksheet.getMarks(maths, science, geography, history,computer);
		System.out.println("total marks are>>> "+totalMarks);
		Marksheet marksheet1 = new Marksheet();
		float output_Perc=marksheet1.getPerc(totalMarks);
		System.out.println("percentage is>>> "+output_Perc);
	}
	public int getMarks(int a,int b,int c,int d,int e) {
		int totalMarks=(a+b+c+d+e);
		return totalMarks;
	}
	public float getPerc(float x) {
		float percentage = (x/500)*100;
		return percentage;
		
	}

}
