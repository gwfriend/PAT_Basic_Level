import java.util.Scanner;

public class Test3 {

	
	/*
	 * ��Ŀ����
		��Pi��ʾ��i�����������θ�����������M <= N <= 10000�������PM��PN������������
		
		��������:
		������һ���и���M��N������Կո�ָ���
		
		
		�������:
		�����PM��PN������������ÿ10������ռ1�У�����Կո�ָ�������ĩ�����ж���ո�
		
		��������:
		5 27
		
		�������:
		11 13 17 19 23 29 31 37 41 43
		
		47 53 59 61 67 71 73 79 83 89
		
		97 101 103
	 * 
	 * 
	 * 
	 */
	
	
	
	public static boolean isPrime(long n){
	    for(int i=2;i<=Math.sqrt(n);i++){
	         if(n%i == 0)
	              return false; 
	    }
	    return true; 
	}
	
	
	public static void main(String[] args) {
		
			int n,m,j=0,i=0;
			long s = 1;
			boolean flag = true;
			Scanner read = new Scanner(System.in);
			n = read.nextInt();
			m = read.nextInt();
			int d = m-n+1;
			
			
			i=0;
			while(flag){
				s++;
				boolean b = Test3.isPrime(s);
				if(b) {
					i++;
					if(i-n+1==d) {
						System.out.println(s);
						break;
					}
					if(j!=0)  {
						
						j++;
						if(j%10==0)  {
							System.out.println(s);
						}else
						System.out.print(s+" ");
					}
					if(i==n)  {
						
							System.out.print(s+" ");
							j++;
						
					}
					
				}
				
			}
	}

}
