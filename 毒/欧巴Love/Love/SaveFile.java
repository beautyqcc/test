package com.iotek.Love;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveFile {
	
	StringBuilder []str={new StringBuilder("��һ�ݸ��Ҽ�С���ٵ����顣\n"),
									new StringBuilder("�ĳ�����������˵�С���٣����ȥ͵͵�Ľ����ҵ����У����Ҷȹ��˶��ٸ�ҹ�����е���������ô���ˡ�\n"),
									new StringBuilder("�ĳ��������ճ�˵�С���٣���������ճ�����е����У���˵�ĳ������������ԣ���������ʲô�����Ҹ���\n"),
									new StringBuilder("�ĳ��������Ư����С���٣�ʱ��ʱ���������˵���ò�������һ�һЦ������ţ���������ͻȻ�������㡣\n"),
									new StringBuilder("�ĳ��������ʱ���ħ��ʦ��������ӿ�����ʱ������ţ��������һ�����ߵ��Կ졣\n"),
									new StringBuilder("�ĳ���������ж���Ů���ӣ��������������µľ綾���޽�ľ綾Ŷ����ĸ�����\n"),
									new StringBuilder("�ĳ���������˵����һվ��ʮ��·�ڵĻ����ǵ�ͣ�½Ų���·�ڵȵ��������ң�������������һ������ȥ��me too\n"),
									new StringBuilder("�ĳ���������˵���Һ���ϧ������һ���ʱ�⣬��Ϊ����һ�������һ�졣\n"),
									new StringBuilder("�ĳ���������˵���������õ�ʱ���������㣬�������ˣ������˵��Ǻ�����һ����֪������ʱ���Ҷ���������һ���Σ��������Ρ�\n"),
									new StringBuilder("�ĳ���������˵������ã���ò��Ż���һ��������Ե������Ů�ӣ�ֻ���е����ء�\n"),
									new StringBuilder("�ĳ���������˵��ԭ��������е�ٵ����飬��־��ŷ����ϲ�����ˡ�\n"),
									new StringBuilder("���:��־��ŷ��\n")};
										
	public void save() throws IOException{
		File files=new File("D:\\love qu");
		files.mkdirs();
		PrintWriter pw=new PrintWriter(new FileWriter(new File("D:\\love qu\\loveletter.txt")),true);//���ܴ����ļ���
		for(int i=0;i<str.length;i++){
			pw.println(str[i].toString());
		}
	}
	public SaveFile(){
		try {
			save();
			System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
