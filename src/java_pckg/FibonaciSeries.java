package java_pckg;

public class FibonaciSeries {
	public static void main(String[] args) {
		int num = 10;
		int fNum = 0;
		int sNum = 1;
		int nxtNum = fNum + sNum;
		int temp;
		System.out.println(fNum);
		while (num != 0) {
			temp = fNum;
			fNum = sNum;
			sNum = nxtNum;
			System.out.println(nxtNum);

		}

	}

}

//0,1,1,2,3,5,8
