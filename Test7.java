import java.math.BigInteger;
import java.util.Scanner;

public class Test7 {
	
	/*
	 * ����Ҫ�����A/B������A�ǲ�����1000λ����������B��1λ������������Ҫ�������Q������R��ʹ��A = B * Q + R������

		��������:
		������1�������θ���A��B���м���1�ո�ָ���
		
		
		�������:
		��1�����������Q��R���м���1�ո�ָ���
		
		��������:
		123456789050987654321 7
		
		�������:
		17636684150141093474 3
	 * 
	 */
	
	public static void main(String[] args) {
		int n;
		Scanner read = new Scanner(System.in);
		String cc = read.nextLine();
		BigInteger a = new BigInteger(cc.split(" ")[0]);
		BigInteger b = new BigInteger(cc.split(" ")[1]);
		BigInteger[] c = a.divideAndRemainder(b);
		System.out.println(c[0]+" "+c[1]);
	}
	
}
