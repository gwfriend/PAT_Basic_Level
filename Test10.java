import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ��������:
	ÿ���������1������������ÿ�����������ȸ���һ��������1000��������N��ʾ�±������������Լ�������500�������Ϊ��λ����������
	
	D��ʾ�г���������������һ�и���N��������ʾÿ���±��Ŀ�����������Ϊ��λ�������һ�и���N��������ʾÿ���±������ۼۣ�����
	
	ԪΪ��λ�������ּ��Կո�ָ���
	
	
	�������:
	��ÿ�������������һ�������������棬����ԪΪ��λ����ȷ��С�����2λ��
	
	��������:
	3 20
	
	18 15 10
	
	75 72 45
	
	�������:
	94.50
 * 
 */

public class Test10 implements Comparable<Test10>{
	double kind;
	double price;
	double sprice;
	

	public Test10(double kind, double price) {
		super();
		this.kind = kind;
		this.price = price;
		this.sprice = this.price / this.kind;
	}


	public Test10() {
		super();
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		double demand;
		double add,meony,meony1;
		Test10 yb = null;
		List<Test10> list = new ArrayList<Test10>();
		n = read.nextInt();
		demand = read.nextDouble();
		int[] data = new int[n];
		int[] data1 = new int[n];
		for(int i=0;i<n;i++){
			data[i] = read.nextInt();
		}
		for(int i=0;i<n;i++){
			data1[i] = read.nextInt();
			list.add(new Test10(data[i],data1[i]));
		}
		Collections.sort(list);
		add = 0;meony = meony1 = 0;
		for(Test10 m:list){
			meony += m.kind;
			if(meony>demand){
				add += m.sprice*(demand-meony1);
				//����С�������λ�����
				System.out.printf("%.2f\n",add); break;
			}else{
				add = add+m.price;
			}
			meony1 = meony;
		}
		
	}


	@Override
	public int compareTo(Test10 o) {
		// TODO Auto-generated method stub
		return sprice<o.sprice?1:-1;
	}

}
