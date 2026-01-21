package In.co.rays.basic;

public class secandlargestNo {
public static void main(String[]args) {
	int[] a= {5,10,151,20,25,30,35,};
	int largestNo =0;
	for (int i:a) {
		if (i>largestNo) {
			largestNo=i;
		}
	
	System.out.println("largestNo is:" + largestNo);
	
	}


System.out.println("----------");
int secondlargestNo=0;
for (int i:a) {
	if(i<largestNo && i>secondlargestNo) {
		secondlargestNo=i;
	}
	System.out.println("second largest:" +secondlargestNo);
}
}

}