import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Test2 {
	
	/*
	 * ����һϵ�����������밴Ҫ������ֽ��з��࣬���������5�����֣�
	 * 
		A1 = �ܱ�5����������������ż���ĺͣ�
		
		A2 = ����5������1�����ְ�����˳����н�����ͣ�������n1-n2+n3-n4...��
		
		A3 = ��5������2�����ֵĸ�����
		
		A4 = ��5������3�����ֵ�ƽ��������ȷ��С�����1λ��
		
		A5 = ��5������4��������������֡�
	 * 
	 * ��������:
		ÿ���������1������������ÿ�����������ȸ���һ��������1000��������N��������N��������1000�Ĵ�����������������ּ��Կո�ָ���
		
		
		�������:
		�Ը�����N��������������ĿҪ�����A1~A5����һ����˳����������ּ��Կո�ָ�������ĩ�����ж���ո�
		
		������ĳһ�����ֲ����ڣ�������Ӧλ�������N����
	 */

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int n,N = 5;
		int[] sum = new int[5];
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		int[] arr = new int[n];
		 DecimalFormat df = new DecimalFormat ("#.0");
		ArrayList<Integer>[] list = new ArrayList[5];
		for(int i=0;i<5;i++){
			list[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<n;i++){
			arr[i] = read.nextInt();
			if(arr[i]%5==0) list[0].add(arr[i]);
			if(arr[i]%5==1) list[1].add(arr[i]);
			if(arr[i]%5==2) list[2].add(arr[i]);
			if(arr[i]%5==3) list[3].add(arr[i]);
			if(arr[i]%5==4) list[4].add(arr[i]);
		}
		int j=0;
		for(int i=0;i<5;i++){
			for(int d:list[i]){
				if(d%2==0&&i==0) sum[i] += d;
				if(i==1){
					if(j%2==0) sum[i] += d;
					else sum[i] -= d;
					j++;
				}
				if(i==2){
					sum[i] = list[i].size();
				}
				if(i==3){
					sum[i] += d;
				}
				if(i==4){
					//sum[i] = d;
					if(d>sum[i]) sum[i] = d;
				}
			}
		}
	Double sum3 = (double)sum[3]/list[3].size();
	j=0;
		for(int d:list[0]){
			if(d%2==0) j++;
		}
		if(j==0) System.out.print("N ");
		else  System.out.print(sum[0]+" ");
		for(int i=1;i<4;i++){
			if(list[i].size()==0) System.out.print("N ");
			else{
				if(i==3) System.out.print(df.format(sum3)+" ");
				else System.out.print(sum[i]+" ");
			}
			
		
		}
		if(list[4].size()!=0)
		System.out.println(sum[4]);
		else  System.out.println("N");
	}
}
