import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * �ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡��Լ���������Щ��������Ľ����
	�ֻ���������
	��������:
	������2���зֱ������������Щ�����Լ�Ӧ����������֡����ж�ӦӢ����ĸ�Ļ����Դ�д������ÿ�������ǲ�����10^5���ַ��Ĵ������õ�
	�ַ�������ĸ[a-z, A-Z]������0-9���Լ��»��ߡ�_��������ո񣩡���,������.������-������+���������ϵ���������Ŀ��֤��2����������ִ��ǿա�
	ע�⣺����ϵ��������ˣ���ô��д��Ӣ����ĸ�޷��������
	�������:
	��һ��������ܹ�������Ľ�����֡����û��һ���ַ��ܱ��������������С�
	��������:
	7+IE.
	7_This_is_a_test.
	�������:
	_hs_s_a_tst
 * 
 */
public class Test23 {
	
	public static void main(String[] args) {
		String bad,tmp="";
		String str;
		Scanner read = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		bad = read.nextLine();
		str = read.nextLine();
		for(int i=0;i<bad.length();i++){
			if(bad.charAt(i)>='A'&&bad.charAt(i)<='Z'){
				tmp += (char)(bad.charAt(i)+32);
				tmp += bad.charAt(i);
			}
			else if(bad.charAt(i)=='+'){
				tmp += "QWERTYUIOPLKJHGFDSAZXCVBNM";
				tmp += bad.charAt(i);
			}
			else if(bad.charAt(i)=='_'){
				tmp += " ";
				tmp += bad.charAt(i);
			}
			else{
				tmp += bad.charAt(i);
			}
			
		}

		for(int i=0;i<str.length();i++){
		
			list.add(str.charAt(i));
		}
		for(int i=0;i<list.size();i++){
			if(!tmp.contains(list.get(i)+"")){
				System.out.print(list.get(i));
			}else{
				System.out.print("");
			}
		}
	}
	
}
