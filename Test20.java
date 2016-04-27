
import java.util.Scanner;
/*
 * ����һ�����������У���������p������������е����ֵ��M����Сֵ��m�����M <= m * p���������������������С�
���ڸ�������p��һЩ���������������ѡ�񾡿��ܶ��������һ���������С�
��������:
�����һ�и�������������N��p������N��<= 105����������������ĸ�����p��<= 109���Ǹ����Ĳ������ڶ��и���N����������ÿ����
������109��
�������:
��һ�������������ѡ����ٸ����������������һ���������С�
��������:
10 8
2 3 20 4 5 1 6 7 8 9
�������:
8
 * 
 */
public class Test20 {
	public static void quickSort(int a[]){
	    qSort(a, 0, a.length - 1);
	}
	public static void qSort(int a[],int low,int high){
	    int pivot = 0;
	    if(low < high){
	        //������һ��Ϊ��
	        pivot = partition(a,low,high);
	        //�Ե�һ���ֽ��еݹ�����
	        qSort(a,low,pivot);
	        //�Եڶ����ֽ��еݹ�����
	        qSort(a,pivot + 1,high);
	    }
	}
	//partition������ʵ��������ֵ�ָ
	public static int partition(int a[],int low,int high){

	    int pivotkey = a[low];   //ѡȡ��һ��Ԫ��Ϊ�����¼
	    while(low < high){
	        //���������¼С�Ľ������Ͷ�
	        while(low < high && a[high] >= pivotkey){
	            high--;
	        }
	        //�����滻�����ǽ����ķ�ʽ����
	        a[low] = a[high];
	        //���������¼��Ľ������߶�
	        while(low < high && a[low] <= pivotkey){
	            low++;
	        }
	        a[high] = a[low];
	    }
	    //��Ŧ����λ�ø�ֵ
	    a[low] = pivotkey;
	    //������Ŧ���ڵ�λ��
	    return low;
	}
	
	public static void main(String[] args) {
		int n,p;
		int[] d = null;
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		p = read.nextInt();
		d = new int[n];
		for(int i=0;i<n;i++){
			//data = read.nextInt();
			//list.add(data);
			d[i] = read.nextInt();
		}
		//Collections.sort(list);
		Test20.quickSort(d);   //

		int max = 1;
		 for(int i=0;i<n;i++)
	        {
	                for(int j=i+max-1;j<n;j++)
	                {
	                        if(d[i]*p<d[j])
	                                break;
	                        if(j-i+1>max)
	                        max =j-i+1;
	                }
	        }
			System.out.println(max);
	}
	
}
