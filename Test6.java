import java.util.Scanner;

/*
 * ��Ŀ����
		������A�ġ�DA��Ϊ1λ���������֡�����Ϊ��A������DA��ɵ�������PA�����磺����A = 3862767��DA = 6����A�ġ�6���֡�PA��66����ΪA����2��6��
		
		
		
		�ָ���A��DA��B��DB�����д�������PA + PB��
		
		��������:
		������һ�������θ���A��DA��B��DB���м��Կո�ָ�������0 < A, B < 1010��
		
		
		�������:
		��һ�������PA + PB��ֵ��
 * 
 * 
 */


public class Test6 {
	public static void main(String[] args) {
		String A,B,str ;
		char Da,Db;
		int a=0,b=0,suma = 0,sumb = 0;
		Scanner read = new Scanner(System.in);
		str = read.nextLine();
		A = str.split(" ")[0]; Da = str.split(" ")[1].toCharArray()[0];
		B = str.split(" ")[2]; Db = str.split(" ")[3].toCharArray()[0];
		//System.out.println(A+" "+Da+" "+B+" "+Db);
		for(int i = 0;i<A.length();i++){
			if(A.charAt(i)==Da) a++;
		}
		for(int i = 0;i<B.length();i++){
			if(B.charAt(i)==Db) b++;
		}
		for(int i=a-1;i>=0;i--){
			suma += (((int)Da-48)*Math.pow(10, i));
		}
		for(int i=b-1;i>=0;i--){
			sumb += (((int)Db-48)*Math.pow(10, i));
		}
		System.out.println(suma+sumb);
		
	}
}
