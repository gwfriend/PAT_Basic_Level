import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
/*
 * �����ڵ�1�и���������105��������N�����������������N�У�ÿ�и���һλ�����ߵ���Ϣ�ͳɼ����������������ѧУ�ı�ţ���1��ʼ
������ţ�����������ɼ����ٷ��ƣ����м��Կո�ָ���
�������:
��һ���и����ܵ÷���ߵ�ѧУ�ı�š������ܷ֣��м��Կո�ָ�����Ŀ��֤��Ψһ��û�в��С�
��������:
6
3 65
2 80
1 100
2 70
3 40
3 0
�������:
2 150
 * 
 */
public class Test22 {
	int id;
	int grade;
	
	public Test22() {
		super();
	}

	public Test22(int id, int grade) {
		super();
		this.id = id;
		this.grade = grade;
	}

	public static void main(String[] args) {
		int n;
		int id;
		int grade;
		Scanner read = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		List<Test22> list = new ArrayList<Test22>();
		n = read.nextInt();
		int sum = 0;
		Test22[] m = new Test22[n];
		for(int i=0;i<n;i++){
			id = read.nextInt();
			grade = read.nextInt();
			m[i] = new Test22(id,grade);
			set.add(id);
		}
		for(int g:set){
			for(int i=0;i<n;i++){
				if(m[i].id==g) sum+=m[i].grade;
			}
			list.add(new Test22(g,sum));
			sum = 0;
		}
		Test22 wa = new Test22(0,0);
		for(Test22 w:list){
			if(w.grade>wa.grade) wa = w;
		}
		System.out.println(wa.id+" "+wa.grade);

	}

}
