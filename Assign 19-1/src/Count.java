import java.util.Scanner;

public class Count {
	static int countAlpha=0;
	static int countVowels=0;
	static int countNum=0;
	public void getCount(String s) {
		for(int i=0;i<s.length();i++) {
			
			if((s.charAt(i)>='A')&&(s.charAt(i)<='Z')) {
				//System.out.println("in vowels");
				countAlpha++;
			}
			if((s.charAt(i)>='a')&&(s.charAt(i)<='z')) {
				countAlpha++;
			}
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				countNum++;
			}
			if((s.charAt(i)>='A')&&(s.charAt(i)<='Z')) {
				countAlpha++;
			}
			if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u') {
				//System.out.println("in vowels");
				countVowels++; //if i take vowels down to any elseif it does not work why????
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a line here:");
		String s = sc.nextLine();//sam here 123
		 new Count().getCount(s);
		 System.out.println("total count of alphabets:"+countAlpha);
		 System.out.println("total count of numbers:"+countNum);
		 System.out.println("total count of vowels:" +countVowels);

	}

}
