import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
 

/*
 * �ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡��Լ�ʵ�ʱ���������֣������г�

�϶���������Щ����

��������:
������2���зֱ����Ӧ����������֡��Լ�ʵ�ʱ���������֡�ÿ�������ǲ�����80���ַ��Ĵ�������ĸA-Z��������Сд��������0-9��

�Լ��»��ߡ�_��������ո���ɡ���Ŀ��֤2���ַ������ǿա�


�������:
���շ���˳����һ������������ļ�������Ӣ����ĸֻ�����д��ÿ������ֻ���һ�Ρ���Ŀ��֤������1��������

��������:
7_This_is_a_test

_hs_s_a_es

�������:
7TI
 * 
 */
public class Test19 {
 
    public static void main(String[] args){
        List l=new LinkedList();
        Set set=new HashSet();
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
        }
        for(int i=0;i<s1.length();i++){
            if(l.contains(s1.charAt(i)))continue;
            int size1=set.size();
            set.add(Character.toUpperCase(s1.charAt(i)));
            int size2=set.size();
            if(size2==size1)continue;
            System.out.print(Character.toUpperCase(s1.charAt(i)));
        }
 
         
    }
}
