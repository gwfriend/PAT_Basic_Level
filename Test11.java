import java.util.Scanner;
import java.util.TreeSet;
 
public class Test11 {
 
    public static void insertionSort(char[] array){
        char tmp;
        for(int i=1;i<array.length;i++){
            tmp = array[i];  //����ǰλ�õ�����tmp
            int j = i;
            for(;j>0&&array[j-1]>tmp;j--){
                /*
                 * �����ƣ��ڳ���ߵ�λ��,
                 * array[j-1]>tmp:���ں����������У�С�ں��ǽ�������
                 */
                array[j] = array[j-1];
            }
            //����ǰλ�õ������뵽���ʵ�λ��
            array[j] = tmp;
        }
    }
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str;
        int sum = 0,j=0;
        Scanner read = new Scanner(System.in);
        str = read.nextLine();
        TreeSet<Character> set = new TreeSet<Character>();
        char[] data = new char[str.length()+1];
//      data = str.toCharArray();
//      data[data.length] = 'a';
        for(int i=0;i<str.length();i++)
            data[i] = str.charAt(i);
        data[str.length()] = 'a';
        Test11.insertionSort(data);
        for(int i=0;i<data.length-1;i++){
            set.add(data[i]);
        }
         
            for(char c:set){
                for(int i=j;i<=data.length;i++){
                    if(c==data[i]) {
                        sum++; j++;
                    }
                    else  {
                        System.out.println(c+":"+sum);
                        sum=0;
                        break;
                    }
                }      
            }
         
    }
 
}