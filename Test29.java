import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 
 * ��Ŀ����
	С������Щ������һ���Լ�ϲ�����鴮�������ӵ�̯���кܶമ������ɫ���鴮�����ǲ��ϰ��κ�һ����ɢ����������С��Ҫ���æ�ж�һ
	�£�ĳ���������Ƿ������ȫ���Լ���Ҫ�����ӣ�����ǣ���ô�������ж��ٶ�������ӣ�������ǣ���ô������ȱ�˶������ӡ�
	Ϊ���������������[0-9]��[a-z]��[A-Z]��Χ�ڵ��ַ�����ʾ��ɫ�����磬YrR8RrY��С���������鴮����ôppRYYGrrYBR2258��������Ϊ������
	ȫ������Ҫ�����ӣ�������8�Ų���Ҫ�����ӣ�ppRYYGrrYB225��������Ϊû�к�ɫ���ӣ���������һ�ź�ɫ�����ӡ�
	��������:
	ÿ���������1������������ÿ�����������ֱ���2�����Ⱥ����̯�����鴮��С���������鴮��������������1000�����ӡ�
	�������:
	�������������һ���������Yes���Լ��ж��ٶ�������ӣ����������������һ���������No���Լ�ȱ�˶������ӡ������1���ո�ָ���
	��������:
	ppRYYGrrYBR2258
	YrR8RrY
	�������:
	Yes 8
 */
public class Test29 {
	public static void main(String[] args) {
		String str1,str2,str3="";
		Scanner read = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		str1 = read.nextLine();
		str2 = read.nextLine();
		for(int i=0;i<str1.length();i++){
			list.add(str1.charAt(i));
		}
		for(int i=0;i<str2.length();i++){
			for(int j=0;j<list.size();j++){
				if(str2.charAt(i)==list.get(j)){
					str3+=list.get(j);
					list.remove(j);
					break;
				}
			}
		}
		if(str3.equals(str2)){
			System.out.println("Yes "+(str1.length()-str2.length()));
		}else{
			System.out.println("No "+(str2.length()-str3.length()));
		}
	}
}
