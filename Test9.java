import java.util.Scanner;

/*
 * 
 * ������һ����λ���ֲ���ȫ��ͬ��4λ����������������Ȱ�4�����ְ��ǵ��������ٰ��ǵݼ�����Ȼ���õ�1�����ּ���2�����֣����õ�

һ���µ����֡�һֱ�ظ������������Ǻܿ��ͣ���С����ֺڶ���֮�Ƶ�6174��������������Ҳ��Kaprekar������



���磬���Ǵ�6767��ʼ�����õ�



7766 - 6677 = 1089

9810 - 0189 = 9621

9621 - 1269 = 8352

8532 - 2358 = 6174

7641 - 1467 = 6174

... ...



�ָ�������4λ�����������д������ʾ����ڶ��Ĺ��̡�

��������:
�������һ��(0, 10000)�����ڵ�������N��


�������:
���N��4λ����ȫ��ȣ�����һ���������N - N = 0000�������򽫼����ÿһ����һ���������ֱ��6174��Ϊ����֣������ʽ��������ע��ÿ�����ְ�4λ����

ʽ�����

��������:
6767

�������:
7766 - 6677 = 1089

9810 - 0189 = 9621

9621 - 1269 = 8352

8532 - 2358 = 6174
 * 
 */

public class Test9 {

	 //min��ֵΪ0��max��ֵΪ���������������ֵ+1
    public static void bucketSort(int[] data, int min, int max) {  
        // ��������  
        int[] tmp = new int[data.length];  
        // buckets���ڼ�¼������Ԫ�ص���Ϣ  
        // buckets���鶨����max-min��Ͱ  
        int[] buckets = new int[max - min];  
        // ����ÿ��Ԫ�������г��ֵĴ���  
        for (int i = 0; i < data.length; i++) {  
            buckets[data[i] - min]++;  
        }  
        // ���㡰���롱��Ͱ�ڵ�Ԫ�������������е�λ��  
        for (int i = 1; i < max - min; i++) {  
            buckets[i] = buckets[i] + buckets[i - 1];  
        }  
        // ��data�е�Ԫ����ȫ���Ƶ�tmp������  
        System.arraycopy(data, 0, tmp, 0, data.length);  
        // ����buckets�����е���Ϣ���������еĸ�Ԫ�ط�����Ӧλ��  
        for (int k = data.length - 1; k >= 0; k--) {  
            data[--buckets[tmp[k] - min]] = tmp[k];  
        }  
    }  
	  public static int shi(int[] data){
		  return data[0]*1000+data[1]*100+data[2]*10+data[3];
	  }
	  
	  public static int[] chai(int data){
		  int[] d = new int[4];
		  for(int i=0,j=3;i<4;i++){
			  d[i] = (int) (data/(Math.pow(10, j)));
			  data = data%(int) (Math.pow(10, j));
			  j--;
		  }
		  return d;
	  }
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] data = new int[4];
		int[] data1 = new int[4];
		String str = read.nextLine();
		for(int i=0;i<str.length();i++){
			data[i] = str.toCharArray()[i]-48;
		}
		int tmp = Test9.shi(data);
		while(tmp!=6174){
			Test9.bucketSort(data,0,10);
			if(data[0]==data[1]&&data[1]==data[2]&&data[2]==data[3]){
				System.out.println(str+" - "+str+" = 0000");
				break;
			}
			for(int i=3,j=0;i>=0;i--){
				data1[i] = data[j++];
			}
			tmp = Test9.shi(data1) - Test9.shi(data);
			if(tmp>=1000)
				System.out.println(""+data1[0]+data1[1]+data1[2]+data1[3]+" - "+data[0]+data[1]+data[2]+data[3]+" = "+tmp);
			if(tmp<1000&&tmp>=100)
				System.out.println(""+data1[0]+data1[1]+data1[2]+data1[3]+" - "+data[0]+data[1]+data[2]+data[3]+" = 0"+tmp);
			if(tmp<100&&tmp>=10)
				System.out.println(""+data1[0]+data1[1]+data1[2]+data1[3]+" - "+data[0]+data[1]+data[2]+data[3]+" = 00"+tmp);
			data = Test9.chai(tmp);
		}
		
	}

}
