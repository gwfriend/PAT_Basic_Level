import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * һ���Ϸ������֤������17λ���������ڱ�ź�˳���ż�1λУ������ɡ�У����ļ���������£�
���ȶ�ǰ17λ���ּ�Ȩ��ͣ�Ȩ�ط���Ϊ��{7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2}��Ȼ�󽫼���ĺͶ�11ȡģ��
��ֵZ����������¹�ϵ��ӦZֵ��У����M��ֵ��
Z��0 1 2 3 4 5 6 7 8 9 10
M��1 0 X 9 8 7 6 5 4 3 2
���ڸ���һЩ���֤���룬������֤У�������Ч�ԣ������������ĺ��롣
��������:
�����һ�и���������N��<= 100������������֤����ĸ��������N�У�ÿ�и���1��18λ���֤���롣
�������:
���������˳��ÿ�����1������������֤���롣���ﲢ������ǰ17λ�Ƿ����ֻ���ǰ17λ�Ƿ�ȫΪ���������1λУ�������׼ȷ��������к��붼������
�������All passed����
��������:
4
320124198808240056
12010X198901011234
110108196711301866
37070419881216001X
�������:
12010X198901011234
110108196711301866
37070419881216001X
 * 
 */
public class Test21{

	public static void main(String[] args){
		int[] data ={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		char[] m = {'1','0','X','9','8','7','6','5','4','3','2'};
		int n,g=0,f = 0;
		double sum = 0;
		boolean flag = false;
		Scanner read = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		n = read.nextInt();
		String str1 = read.nextLine();
		for(int i=0;i<n;i++){
			str1 = read.nextLine();
			list.add(str1);	
		}
		for(String str:list){
			char[] da = str.toCharArray();
			//�ж�Ǯ17λ��û�з�����
			for(int j=0;j<17;j++){
				if(da[j]<48||da[j]>57){
					System.out.println(str);
					break;
				}
				if(j==16) flag = true;
			}
			if(flag){
				for(int j=0;j<17;j++){
					sum += ((double)(da[j]-48)*data[j]);
				}
				f  = (int)sum%11;
						if(m[f]!=da[17]) System.out.println(str);
				else{
					g++;
				}
			}
			flag = false; sum  =0;
		}
		if(g==n) System.out.println("All passed");
	}

}



