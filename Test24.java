import java.util.Scanner;
 /*
  * ����Ҫ���д���򣬼���2���������ĺ͡�������̡�
	��������:
	������һ���а��ա�a1/b1 a2/b2���ĸ�ʽ��������������ʽ�������������з��Ӻͷ�ĸȫ�����ͷ�Χ�ڵ�����������ֻ���ܳ����ڷ���ǰ����
	ĸ��Ϊ0��
	�������:
	�ֱ���4���а��ա�������1 ����� ������2 = ������ĸ�ʽ˳�����2���������ĺ͡�������̡�ע�������ÿ�������������Ǹ���������
	�����ʽ��k a/b��������k���������֣�a/b�����������֣���Ϊ��������������ţ���������ĸΪ0���������Inf������Ŀ��֤��ȷ�������
	û�г������ͷ�Χ��������
	��������:
	5/3 0/6
	�������:
	1 2/3 + 0 = 1 2/3
	1 2/3 - 0 = 1 2/3
	1 2/3 * 0 = 0
	1 2/3 / 0 = Inf
  * 
  */
public class Test24 {
 
    public static void main(String[] args) {
        // TODO �Զ����ɵķ������
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String[] arr1=str1.split("/");
        String[] arr2=str2.split("/");
        int a1=Integer.parseInt(arr1[0]);
        int b1=Integer.parseInt(arr1[1]);
        int a2=Integer.parseInt(arr2[0]);
        int b2=Integer.parseInt(arr2[1]);
        //System.out.println(a1+" "+b1+" "+a2+" "+b2);
        //
        String num1=myFunc(a1,b1);
        String num2=myFunc(a2,b2);
        String res1=myFunc1(a1,b1,a2,b2,'+');
        String res2=myFunc1(a1,b1,a2,b2,'-');
        String res3=myFunc2(a1,b1,a2,b2,'*');
        String res4=myFunc2(a1,b1,a2,b2,'/');
        System.out.println(num1+" + "+num2+" = "+res1);
        System.out.println(num1+" - "+num2+" = "+res2);
        System.out.println(num1+" * "+num2+" = "+res3);
        System.out.print(num1+" / "+num2+" = "+res4);
    }
    public static int getZuiDaGYS(int a,int b){
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        int res=0;
        if(b!=0){
            if(a%b==0){
                res=b;
            }else{
                for(int i=(int)b/2;i>=2;i--){
                    if(a%i==0&&b%i==0){
                        res=i;
                        break;
                    }
                }
            }
        }
         
        return res;
    }
    public static String myFunc(int a,int b){
        StringBuffer res=new StringBuffer();
         
        if(a<0){
            res.insert(0, "(-)");
        }
        a=Math.abs(a);
        int zdgys=getZuiDaGYS(a,b);
        if(zdgys>0){
            a=a/zdgys;
            b=b/zdgys;
        }
        String str="";
        int i=a/b;
        int j=a%b;
        if(j==0){
             
            str+=i;
        }else if(i>0){
            str+=i+" "+j+"/"+b;
        }else{
            str+=a+"/"+b;
        }
        if(res.length()>0){
            res.insert(2, str);
            str=res.toString();
        }
        return str;
          
    }
    public static String myFunc1(int a1,int b1,int a2,int b2,char c){
        //�ӷ�
        int a3=0;
        int b3=b1*b2;
        if(c=='+'){
            a3=a1*b2+a2*b1;
        }else{
            a3=a1*b2-a2*b1;
        }
        //System.out.println(a3+" "+b3);
        return myFunc(a3,b3);
         
    }
    public static String myFunc2(int a1,int b1,int a2,int b2,char c){
        //�ӷ�
        String res=null;
        if(a2==0){
            if(c=='*'){
                res="0";
            }else{
                res="Inf";
            }
        }else{
            int a3,b3;
            if(c=='*'){
                a3=a1*a2;
                b3=b1*b2;
            }else{
                if(a2>0){
                    a3=a1*b2;
                    b3=b1*a2;
                }else{
                    a3=-1*a1*b2;
                    b3=-1*b1*a2;
                }
                 
            }
            res=myFunc(a3,b3);
        }
        return res;
    }
}
