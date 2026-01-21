package In.co.rays.basic;

public class palindromeN0 {
public static void main(String[]args) {
	int temp=222;
	int n=temp;
	int r=0;
	int reverseNo=0;
	
	while (n>0) {
		r =n%10;
		reverseNo=(reverseNo*10) +r;
		n=n/10;
	}
	
	System.out.println(reverseNo);
	if(temp==reverseNo) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}
