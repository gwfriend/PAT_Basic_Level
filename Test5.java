import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ��������:
	�����1�и���3�����������ֱ�Ϊ��N��<=105����������������L��>=60����Ϊ¼ȡ��ͷ����ߣ����·ֺͲŷ־�������L�Ŀ��������ʸ�
	
	������¼ȡ��H��<100����Ϊ����¼ȡ�ߡ����·ֺͲŷ־������ڴ��ߵı�����Ϊ���ŵ�ȫ���������࿼�����²��ִܷӸߵ������򣻲ŷֲ���
	
	���·ֵ��ߵ�һ�࿼�����ڡ���ʤ�š���Ҳ���ܷ����򣬵����ڵ�һ�࿼��֮�󣻵²ŷ־�����H�����ǵ·ֲ����ڲŷֵĿ������ڡ��ŵ¼�
	
	���������С���ʤ�š��ߣ����ܷ����򣬵����ڵڶ��࿼��֮�������ﵽ�����L�Ŀ���Ҳ���ܷ����򣬵����ڵ����࿼��֮��
	
	
	���N�У�ÿ�и���һλ��������Ϣ��������׼��֤�š��·֡��ŷ֣�����׼��֤��Ϊ8λ�������²ŷ�Ϊ����[0, 100]�ڵ����������ּ��Կո�ָ���
	
	
	�������:
	�����1�����ȸ����ﵽ��ͷ����ߵĿ�������M�����M�У�ÿ�а��������ʽ���һλ��������Ϣ��������������˵���Ĺ���Ӹߵ������򡣵�ĳ�࿼�����ж���
	
	�ܷ���ͬʱ������·ֽ������У����·�Ҳ���У���׼��֤�ŵ����������
 * 
 * 
 */



public class Test5 implements Comparable<Test5>{
	
	 long sid;
	 int dgra;
	 int cgra;
	 int sum;
	 public static int NN;

	static Scanner read = new Scanner(System.in);
	
	
	public Test5() {
		super();
	}


	@Override
	public String toString() {
		return sid + " " + dgra + " " + cgra;
	}


	public Test5(long sid, int dgra, int cgra) {
		super();
		this.sid = sid;
		this.dgra = dgra;
		this.cgra = cgra;
		this.sum = this.dgra+this.cgra;
	}

	
	public static void scanf(Test5[] stu, int n ){
		long sid;
		int dgra;
		int cgra;
		for(int i=0;i<n;i++){
			sid = read.nextLong();
			dgra = read.nextInt();
			cgra = read.nextInt();
			stu[i] = new Test5(sid,dgra,cgra);
		}
	}
	
	public static List<Test5> Distrubute(Test5[] stu,int N,int L,int H){
		List<Test5> list = new ArrayList<Test5>();
		List<Test5> stu1 = new ArrayList<Test5>();
		List<Test5> stu2 = new ArrayList<Test5>();
		List<Test5> stu3 = new ArrayList<Test5>();
		List<Test5> stu4 = new ArrayList<Test5>();
		
		for(int i=0;i<N;i++){
			if(stu[i].cgra>=H&&stu[i].dgra>=H){
				stu1.add(new Test5(stu[i].sid,stu[i].dgra,stu[i].cgra));
				
			}
			if(stu[i].dgra>=H&&stu[i].cgra<H&&stu[i].cgra>=L){
				stu2.add(new Test5(stu[i].sid,stu[i].dgra,stu[i].cgra));
			}
			if(stu[i].dgra<H&&stu[i].dgra>=stu[i].cgra&&stu[i].cgra>=L){
				stu3.add(new Test5(stu[i].sid,stu[i].dgra,stu[i].cgra));
			}
			if(stu[i].dgra<stu[i].cgra&&stu[i].dgra>=L&&stu[i].dgra<H){
				stu4.add(new Test5(stu[i].sid,stu[i].dgra,stu[i].cgra));
			}
			
		}

		Collections.sort(stu1);
		Collections.sort(stu2);
		Collections.sort(stu3);
		Collections.sort(stu4);
		for(int i=0;i<stu1.size();i++){
			list.add(stu1.get(i));
		}
		for(int i=0;i<stu2.size();i++){
			list.add(stu2.get(i));
		}
		for(int i=0;i<stu3.size();i++){
			list.add(stu3.get(i));
		}
		for(int i=0;i<stu4.size();i++){
			list.add(stu4.get(i));
		}
		
		return list;
	}
	

	public static void main(String[] args) {
		int N,L,H;
		N = read.nextInt();
		L = read.nextInt();
		H = read.nextInt();
		
		Test5[] stu = new Test5[N];
		//����
		Test5.scanf(stu,N);
		
		List<Test5> list = Test5.Distrubute(stu, N, L, H);
		System.out.println(list.size());
		for(Test5 m:list){
			System.out.println(m);
		}
		
		
	}
	@Override
	public int compareTo(Test5 o) {
		Test5 p=o;
		  int n= sum<p.sum?1:(sum==p.sum?0:-1);
		  if(n==0)
		  {
		   n=dgra<p.dgra?1:(dgra==p.dgra?0:-1);
		   if(n==0)
			   n=sid>p.sid?1:-1;
		  }
		  return n;
		
	}
	
	
	
	
	
	
}
