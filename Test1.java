import java.math.BigInteger;
import java.util.Scanner;

public class test1 {
	/*
	 * ��������[-2��31�η�, 2��31�η�]�ڵ�3������A��B��C�����ж�A+B�Ƿ����C��
	 * ��������:
	 *	�����1�и���������T(<=10)���ǲ��������ĸ�����������T�����������ÿ��ռһ�У�˳�����A��B��C���������Կո�ָ���
	 *�������:
��ÿ�������������һ���������Case #X: true�����A+B>C�����������Case #X: false��������X�ǲ��������ı�ţ���1��ʼ����
	 */
	public static void main(String[] args) {
		int n;
		Scanner read = new Scanner(System.in);
		n=read.nextInt();
		String cc = read.nextLine();
		BigInteger a = null;
		BigInteger b = null;
		BigInteger c = null;
		String str,str1[];
		for(int i=1;i<=n;i++){
			str = read.nextLine();
			str1 = str.split(" ");
			a = new BigInteger(str1[0]);
			b = new BigInteger(str1[1]);
			c = new BigInteger(str1[2]);
			int tmp = a.add(b).compareTo(c);
			if(tmp==1)
				System.out.println("Case #"+i+": true");
			else
				System.out.println("Case #"+i+": false");
		}
	}
}
