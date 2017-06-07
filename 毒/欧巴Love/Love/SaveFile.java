package com.iotek.Love;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveFile {
	
	StringBuilder []str={new StringBuilder("这一份给我家小公举的情书。\n"),
									new StringBuilder("瞿超超，这个迷人的小公举，你过去偷偷的进入我的梦中，陪我度过了多少个夜晚，梦中的你总是那么迷人。\n"),
									new StringBuilder("瞿超超，这个粘人的小公举，你问这样粘着你会感到反感？我说瞿超超你在我身旁，在哪里做什么都是幸福。\n"),
									new StringBuilder("瞿超超，这个漂亮的小公举，时不时盯着你迷人的外貌看，你的一颦一笑我想记着，生怕有天突然看不到你。\n"),
									new StringBuilder("瞿超超，这个时间的魔法师，就是你加快了我时间的流逝，和你待在一起它走的略快。\n"),
									new StringBuilder("瞿超超，这个有毒的女孩子，本人已中了你下的剧毒，无解的剧毒哦，你的负责呢\n"),
									new StringBuilder("瞿超超，我想说，下一站是十字路口的话，记得停下脚步在路口等等你身后的我，我想在你身旁一起走下去。me too\n"),
									new StringBuilder("瞿超超，我想说，我很珍惜和你在一起的时光，因为过了一天就少了一天。\n"),
									new StringBuilder("瞿超超，我想说，在这美好的时光里遇见你，是我幸运，更幸运的是和你在一起，你知道吗，有时候我都觉得这是一场梦，很美的梦。\n"),
									new StringBuilder("瞿超超，我想说，你真好，美貌与才华于一身，温柔与霸道并存的女子，只是有点懒呢。\n"),
									new StringBuilder("瞿超超，我想说，原谅我这份有点迟的情书，李志坚欧巴最喜欢你了。\n"),
									new StringBuilder("落笔:李志坚欧巴\n")};
										
	public void save() throws IOException{
		File files=new File("D:\\love qu");
		files.mkdirs();
		PrintWriter pw=new PrintWriter(new FileWriter(new File("D:\\love qu\\loveletter.txt")),true);//不能创建文件夹
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
