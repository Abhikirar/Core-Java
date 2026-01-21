package In.co.rays.basic;

public class largestNoInarray {
public static void main(String[]args) {
	int[] a= {5,10,151,20,25,30,35,40};
	int largestNo=0;
	for (int i:a) {
		if(i>largestNo) {
			largestNo=i;
		}
	}
	System.out.println("largestNo is:" +largestNo);
	
}
}
