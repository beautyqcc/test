package com.iotek.Love;

import java.io.File;

import javax.swing.JOptionPane;

public class Hint extends JOptionPane{
	int i=0;
	String str;
	File file=new File("D:\\love letter");
	Enter enter=null;
	public Hint(Enter enter){
		/*if(i==0){
			this.showMessageDialog(null,"�뽫�Ҹ����ͼƬ����D:\\love letter�ļ���,ô�п��Դ���Ŷ");
			i=1;
		}if(i==1){
			while(true){
				str=this.showInputDialog("������������.��ϲ����־��ŷ����.:");
				if(str.equals("��ϲ����־��ŷ����"))
					break;
				else 
					this.showMessageDialog(null, "��Ӵ���е�С������");
			}
		}
		if(found(file)){
			this.showMessageDialog(null, "��־��ŷ���Ѿ���⵽��ܹ�Ŷ");
		}else
			this.showMessageDialog(null, "�ĳ��������أ�û�а�ŷ��˵������,������");*/
		enter.setVisible(false);
		showDialog();
		
	}
	public void showDialog(){
		if(i==0){
			this.showMessageDialog(null,"�뽫�Ҹ����ͼƬ����D:\\love letter�ļ���,ô�п��Դ���Ŷ");
			i=1;
		}if(i==1){
			while(true){
				str=this.showInputDialog("������������.��ϲ����־��ŷ����.:");
				if(str.equals("��ϲ����־��ŷ����"))
					break;
				else 
					this.showMessageDialog(null, "��Ӵ���е�С������,��Ȼ��������㣬�ô���");
			}
		}
		if(found()){
			this.showMessageDialog(null, "��־��ŷ���Ѿ���⵽��ܹ�Ŷ");
			new BackGroud();
		}else
			this.showMessageDialog(null, "�ĳ��������أ�û�а�ŷ��˵������,������");
	}
	public  boolean found(){
		try{
			File[] stu=file.listFiles();
			for(File name:stu)
				System.out.println(name.getName());
			try{
				if(stu[0].getName().equals("quan1.jpg"))
					return true;
				else {
					this.showMessageDialog(null, "û�а��Ҹ����ͼƬ�Ž�ȥ��,������");
					return false;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				this.showMessageDialog(null, "û�а��Ҹ����ͼƬ�Ž�ȥ��,������");
				return false;
			}
		}catch(NullPointerException e){
				this.showMessageDialog(null,"�ĳ�����û��D���´���love letter�ļ�����");
				return false;
			}
	}
}
