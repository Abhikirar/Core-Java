package In.co.rays.basic;

public class notecounter {
public static void main(String[]args) {
	int money =8860;
	
	int[]notes = {500,200,100,50,10};
	
	for (int note:notes) {
		int count=money/note;
		System.out.println(note+"=" +count);
		money=money%note;
	}
}
	
}
