import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Test8 implements Comparable<Test8>{

	/*
	 * ���Ӧ�ö����桰���Ӽ�����������Ϸ��
		�ָ������˵Ľ����¼����ͳ��˫����ʤ��ƽ�������������Ҹ���˫���ֱ��ʲô���Ƶ�ʤ����� 
		��������:
		
		�����1�и���������N��<=105������˫������Ĵ��������N�У�ÿ�и���һ�ν������Ϣ�����ס���˫��ͬʱ�����ĵ����ơ�C�������ӡ���J������������B��
		
		����������1����ĸ����׷�����2�������ҷ����м���1���ո�
		
		
		�������:
		
		�����1��2�зֱ�����ס��ҵ�ʤ��ƽ�������������ּ���1���ո�ָ�����3�и���������ĸ���ֱ����ס��һ�ʤ�����������ƣ��м���1���ո�����ⲻΨ
		
		һ�����������ĸ����С�Ľ⡣
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n = read.nextInt();
		List<String> set1 = new ArrayList<String>(); 
		List<String> set2 = new ArrayList<String>(); 
		int a=0,b=0;
		int bb=0,cc=0,jj=0;
		String str = read.nextLine();;
		map.put("C C",0); map.put("C B",-1);  map.put("C J",1);
		map.put("B C",1); map.put("B B",0);  map.put("B J",-1);
		map.put("J C",-1); map.put("J B",1);  map.put("J J",0);
		for(int i=0;i<n;i++){
			str = read.nextLine();
			
			if(map.get(str)==1)  {
				set1.add(str.split(" ")[0]);
				a++;
			}
			if(map.get(str)==-1)  {
				set2.add(str.split(" ")[1]);
				b++;
			}
		}
			System.out.println(a+" "+(n-a-b)+" "+b);
			System.out.println(b+" "+(n-a-b)+" "+a);
			Collections.sort(set1);
			Collections.sort(set2);
			for(String s:set1){
				if(s.equals("B")) bb++;
				if(s.equals("C")) cc++;
				if(s.equals("J")) jj++;
			}
			if(bb>=cc&&bb>=jj)  System.out.print("B ");
			if(cc>bb&&cc>=jj)  System.out.print("C ");
			if(jj>bb&&jj>cc)   System.out.print("J ");
			bb=0;cc=0;jj=0;
			for(String s:set2){
				if(s.equals("B")) bb++;
				if(s.equals("C")) cc++;
				if(s.equals("J")) jj++;
			}
			if(bb>=cc&&bb>=jj)  System.out.println("B");
			if(cc>bb&&cc>=jj)  System.out.println("C");
			if(jj>bb&&jj>cc)   System.out.println("J");
	}

	@Override
	public int compareTo(Test8 o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
