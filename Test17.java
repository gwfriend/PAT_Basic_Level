import java.util.Scanner;

public class Test17 {
/*
 * ����Ҫ����д������Ѹ����ķ��Ŵ�ӡ��ɳ©����״���������17����*����Ҫ�����и�ʽ��ӡ



		 *****
		
		  ***
		
		   *
		
		  ***
		
		 *****
		
		 ��ν��ɳ©��״������ָÿ��������������ţ����з������Ķ��룻�������з�������2���������ȴӴ�С˳��ݼ���1���ٴ�С����˳���
		
		 ������β��������ȡ�
		
		
		
		 ��������N�����ţ���һ�����������һ��ɳ©��Ҫ���ӡ����ɳ©���õ������ܶ�ķ��š�
		
		��������:
		������һ�и���1��������N��<=1000����һ�����ţ��м��Կո�ָ���
		
		
		�������:
		���ȴ�ӡ���ɸ���������ɵ�����ɳ©��״�������һ�������ʣ��û�õ��ķ�������
		
		��������:
		19 *
		
		�������:
		*****
		
		 ***
		
		  *
		
		 ***
		
		*****
		
		2
 * 
 */
	public static void main(String[] args) {
		String str;
		char c;
		int n,sum = 0,index=0,index1=0,tmp=0;
		int[] data;
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		str = read.nextLine();
		c = str.toCharArray()[1];
		data = new int[n];
		for(int i=1;i<=n;i++){
			sum += (i*2+1);
		
			if(sum*2+1>n){
				index = i-1;break;
			}
			data[i] = (i*2+1);
			tmp = sum*2+1;
		}
		index1=index;
		sum = 0;
		while(index>=1){
			for(int i=0;i<data[index];i++){
				System.out.print(c);
			}
			System.out.println();
			index--; sum++;
			for(int i=0;i<sum;i++){
				System.out.print(" ");
			}
		}
		System.out.println(c);
		index = 1; sum = (data[index1]-data[index])/2;
		while(index<=index1){
			for(int i=0;i<sum;i++){
				System.out.print(" ");
			}
			sum--;
			for(int i=0;i<data[index];i++){
				System.out.print(c);
			}
			index++;
			System.out.println();
		}
		if(n-tmp!=0)
		System.out.println(n-tmp);
	}
	
}
