import java.util.Scanner;
/*
 * ��Ŀ����
	�ַ���APPAPT�а������������ʡ�PAT�������е�һ��PAT�ǵ�2λ(P),��4λ(A),��6λ(T)���ڶ���PAT�ǵ�3λ(P),��4λ(A),��6λ(T)��
	�ָ����ַ�������һ�������γɶ��ٸ�PAT��
	��������:
	����ֻ��һ�У�����һ���ַ��������Ȳ�����105��ֻ����P��A��T������ĸ��
	�������:
	��һ������������ַ����а������ٸ�PAT�����ڽ�����ܱȽϴ�ֻ�����1000000007ȡ�����Ľ����
	��������:
	APPAPT
	�������:
	2
 * 
 */
public class Test30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String orgStr = "";
        while (in.hasNext()) {
            orgStr = in.nextLine();
        }
        char[] arr = orgStr.toCharArray();
        int pNum = 0;
        int paNum = 0;
        int patNum = 0;
        for(char val : arr){
            if((""+val).equals("P")){
                pNum++;
            }else if((""+val).equals("A")){
                paNum +=pNum;
                paNum = paNum%1000000007;
            }else {
                patNum +=paNum;
                patNum = patNum%1000000007;
            }
        }
        System.out.println(patNum);
    }
}