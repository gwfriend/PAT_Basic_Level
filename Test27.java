import java.util.Scanner;

public class Test27 {
	/*
	 * ��Ŀ����
		������ǹ����������ԣ����֪��ħ�����������Լ��Ļ���ϵͳ ���� ���纣����߹����ģ���ʮ�߸�������(Sickle)��һ����¡(Galleon)����
		ʮ�Ÿ�����(Knut)��һ�����ɣ������ס������ڣ���������Ӧ���ļ�ǮP����ʵ����ǮA�����������дһ��������������Ӧ�ñ��ҵ���Ǯ��
		��������:
		������1���зֱ����P��A����ʽΪ��Galleon.Sickle.Knut���������1���ո�ָ�������Galleon��[0, 107]]�����ڵ�������Sickle��[0, 
		17)�����ڵ�������Knut��[0, 29)�����ڵ�������
		�������:
		��һ������������ͬ���ĸ�ʽ�������Ӧ�ñ��ҵ���Ǯ�������û����Ǯ����ô�����Ӧ���Ǹ�����
		��������:
		10.16.27 14.1.28
		�������:
		3.2.1
	 * 
	 */
	public static void main(String[] args) {
		int Galleon1,Galleon2,Galleon;
		int Sickle1,Sickle2,Sickle;
		int Knut1,Knut2,Knut;
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String[] data = str.split(" ");
		str = "";
		Galleon1 = Integer.parseInt(data[0].split("\\.")[0]);
		Sickle1 = Integer.parseInt(data[0].split("\\.")[1]);
		Knut1 = Integer.parseInt(data[0].split("\\.")[2]);
		Galleon2 = Integer.parseInt(data[1].split("\\.")[0]);
		Sickle2 = Integer.parseInt(data[1].split("\\.")[1]);
		Knut2 = Integer.parseInt(data[1].split("\\.")[2]);
		if(Knut2-Knut1>=0){
			Knut = Knut2-Knut1;
		}else{
			if(Sickle2>0){
				Sickle2--;
				Knut = Knut2-Knut1+29;
			}else{
				Galleon2--;Sickle2 = Sickle2+16;
				Knut = Knut2-Knut1+29;
			}
		}
		
		if(Sickle2-Sickle1>=0){
			Sickle = Sickle2-Sickle1;
		}else{
			Galleon2--;Sickle = Sickle2+17-Sickle1;
		}
		Galleon = Galleon2-Galleon1;
		if(Galleon<0){
			
			if(Knut!=0){
				Knut = 29-Knut;
					Sickle = 16-Sickle;
					Galleon++;
			}else {
				if(Sickle!=0){
					Sickle = 17-Sickle;
					Galleon++;
				}
			}
				
			
		}
		str = str+Galleon+"."+Sickle+"."+Knut;
		System.out.println(str);
	}
}
