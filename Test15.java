
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
 * ����һ������K�Լ�һ��������L�����д����L��ÿK����㷴ת�����磺����LΪ1��2��3��4��5��6��KΪ3�������Ӧ��Ϊ
	3��2��1��6��5��4�����KΪ4�������Ӧ��Ϊ4��3��2��1��5��6������󲻵�K��Ԫ�ز���ת��
	��������:
	ÿ���������1������������ÿ������������1�и�����1�����ĵ�ַ������ܸ���������N(<= 105)���Լ�������K(<=N)����Ҫ��ת��
	�������ĸ��������ĵ�ַ��5λ�Ǹ�������NULL��ַ��-1��ʾ��
	��������N�У�ÿ�и�ʽΪ��
	Address Data Next
	����Address�ǽ���ַ��Data�Ǹý�㱣����������ݣ�Next����һ���ĵ�ַ��
	�������:
	��ÿ������������˳�������ת�����������ÿ�����ռһ�У���ʽ��������ͬ��
	��������:
	00100 6 4
	00000 4 99999
	00100 1 12309
	68237 6 -1
	33218 3 00000
	99999 5 68237
	12309 2 33218
	�������:
	00000 4 33218
	33218 3 12309
	12309 2 00100
	00100 1 99999
	99999 5 68237
	68237 6 -1
 * 
 * 
 */
public class Test15 {
	
	String Address;
	Integer Data;
	String Next;
	public Test15() {
		super();
	}
	public Test15(String address, Integer data, String next) {
		super();
		Address = address;
		Data = data;
		Next = next;
	}
	public static int shi(char[] data){
		int sum = 0;
		for(int i=0,j=data.length-1;i<data.length;i++){
			sum += ((int)(data[i]-48)*Math.pow(10,j--));
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return Address + " " + Data + " " + Next;
	}
	public static void main(String[] args) {
		String str;//��Ϊ�����ַ���
		String fadd,address,next,adde;
		Integer N,data;
		Integer k;
		int multiple = 0;
		Test15[] chain = null;
		Test15[] chain1 = null;
		Map<String, Test15> map = new HashMap<String, Test15>();
		Scanner read = new Scanner(System.in);
		str = read.nextLine();
		fadd = str.split(" ")[0];
		adde = fadd;
		N = Test15.shi(str.split(" ")[1].toCharArray());
		k = Test15.shi(str.split(" ")[2].toCharArray());
		chain = new Test15[N];
		chain1 = new Test15[N];
		for(int i=0;i<N;i++){
			str = read.nextLine();
			address = str.split(" ")[0];data = Test15.shi(str.split(" ")[1].toCharArray()); next = str.split(" ")[2];
			chain[i] = new Test15(address,data,next);
			map.put(address, chain[i]);
		}
		//������ŵ�map��ȥ�����������ʽ��
//		int g = 0,s=0,ii=N-1;
//		adde = "-1";
//		while(true){
//			for(int j=0;j<N;j++){
//				if(s==N)  break;
//				if(chain[j].Address.equals(fadd)){
//					chain1[g++] = chain[j];	
//					fadd = chain[j].Next;  s++;
//				}
//				if(s==N)  break;
//				if(chain[j].Next.equals(adde)){
//					chain1[ii--] = chain[j];	
//					adde = chain[j].Address;  s++;
//				}
//			}
//			if(s==N)  break;
//		}
		int g = 0;
		while(!adde.equals("-1")){
			chain1[g] = map.get(adde);
			adde = chain1[g].Next;
			g++;
		}
		multiple = N/k;
		for(int i=1;i<=multiple;i++){
			fadd = chain1[i*k-1].Next;
			for(int j=i*k-1;j>i*k-k;j--){
				chain1[j].Next = chain1[j-1].Address;
				System.out.println(chain1[j]);
			}
			chain1[i*k-k].Next = fadd;
			System.out.println(chain1[i*k-k]);
		}
		for(int i=multiple*k;i<N;i++){
			System.out.println(chain1[i]);
		}
	}

}
