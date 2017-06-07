package com.iotek.GetPrize;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
//115.150.204.139
public class UPDDemo1 {
	static String str;
	static DatagramSocket socket=null;
	static DatagramPacket packet=null;
	public static void udsend(){
		// TODO Auto-generated method stub
		
		try {
			
			socket = new DatagramSocket();
			
			
				str=GetPrize.prize[GetPrize.j];
				//获取传过来的str.getBytes().length
				 packet=new DatagramPacket(str.getBytes(),
					str.getBytes().length, InetAddress.getByName(""), 8810);
				socket.send(packet);
				System.out.println(str);
				
			
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
	}
	public static void udpreveive(){
		try {
			byte[] buff=new byte[1024];
			DatagramPacket packet2=new DatagramPacket(buff, buff.length);
			socket.receive(packet2);
			socket.close();
			System.out.println("你想要的奖品是："+new String(buff,0,packet2.getLength()-1));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}


