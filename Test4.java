import java.util.Scanner;

public class Test4 {
	
	/*
	 * ��Ŀ����
		����̽����Ħ˹�ӵ�һ����ֵ�������������Լ��ɣ� 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm��������̽��
		
		 ��������ˣ���������ֵ�����ʵ���Ͼ���Լ���ʱ�䡰������ 14:04������Ϊǰ�����ַ����е�1����ͬ�Ĵ�дӢ����ĸ����Сд�����֣���
		
		 ��4����ĸ'D'�����������ģ���2����ͬ���ַ���'E'�����ǵ�5��Ӣ����ĸ������һ����ĵ�14����ͷ������һ���0�㵽23��������0��9��
		
		 �Լ���д��ĸA��N��ʾ�����������ַ�����1����ͬ��Ӣ����ĸ's'�����ڵ�4��λ�ã���0��ʼ�������ϣ������4���ӡ��ָ��������ַ�����
		
		 ���������Ħ˹����õ�Լ���ʱ�䡣
		
		��������:
		������4���зֱ����4���ǿա��������ո��ҳ��Ȳ�����60���ַ�����
		
		
		�������:
		��һ�������Լ���ʱ�䣬��ʽΪ��DAY HH:MM�������С�DAY����ĳ���ڵ�3�ַ���д����MON��ʾ����һ��TUE��ʾ���ڶ���WED��ʾ��������THU��ʾ����
		
		�ģ�FRI��ʾ�����壬SAT��ʾ��������SUN��ʾ�����ա���Ŀ���뱣֤ÿ�����Դ���Ψһ�⡣
		
		��������:
		3485djDkxh4hhGE
		
		2984akDfkkkkggEdsb
		
		s&hgsfdk
		
		d&Hyscvnm
		
		�������:
		THU 14:04
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		String[] str = new String[4];
		String we = null;
		int h=0,s=0;
		Scanner read = new Scanner(System.in);
		for(int i=0;i<4;i++){
			str[i] = read.nextLine();
		}
		int min1 = str[0].length()<str[1].length()?str[0].length():str[1].length();
		int min2 = str[2].length()<str[3].length()?str[2].length():str[3].length();
		for(int i=0,j=0;i<min1;i++){
			if((str[0].charAt(i)>='A' && str[0].charAt(i)<='Z') && (str[1].charAt(i)>='A' && str[1].charAt(i)<='Z')){
				j++;
				if(j==1 && str[0].charAt(i)==str[1].charAt(i)){
					 we = week[(int)str[0].charAt(i)-65];
				}
				if(j!=1 && str[0].charAt(i)==str[1].charAt(i)){
					h = (int)str[0].charAt(i)-64+9;  break;
				}
			}
			if(j!=0 && (str[0].charAt(i)>='0' && str[0].charAt(i)<='9') && (str[1].charAt(i)>='0' && str[1].charAt(i)<='9')){
				if(str[0].charAt(i)==str[1].charAt(i)){
					h = (int)str[0].charAt(i)-48;  break;
				}
			}
		}
		
		
		for(int i=0;i<min2;i++){
			if((str[2].charAt(i)>='a' && str[2].charAt(i)<='z') && (str[3].charAt(i)>='a' && str[3].charAt(i)<='z')){
				if(str[2].charAt(i)==str[3].charAt(i)){
					 s = i; break;
				}
			}
		}
		if(s<10&&h<10)
		System.out.println(we+" 0"+ h+":0"+s);
		else{
			if(h<10)  System.out.println(we+" 0"+ h+":"+s);
			if(s<10) System.out.println(we+" "+ h+":0"+s);
			if(s>=10&&h>=10) System.out.println(we+" "+ h+":"+s);
		}
		
	}
	
}
