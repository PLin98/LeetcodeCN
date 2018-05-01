package zone.lin.leetcodeCN.Y2018.M04.D29;

public class Transform {
	public String transform(int n) {
		String[] group= {"","万","亿","万亿"};
		String sec="";
		String end="";
		int i=0;
		if(n==0)
			return "零";
		
		while(n>0)
		{
			int m=n%10000;//四位为一小节
			sec=section(m);//将一小节转换成汉字
			if(m!=0)
			{
				sec=sec+group[i];//每一小节的权位
			}
			n=n/10000;//去掉后四位
			end=sec+end;
			i++;//每一次小节权位增加
		}
		if(end.charAt(0)=='零') {
			end=end.substring(1);//最终得到的字符串的第一位如果为“零”，就从第一位截取
		}
		return end;
	}
	public String section(int n)
	{
		String[] number= {"零","一","二","三","四","五","六","七","八","九","十"};
		String[] wei= {"","十","百","千"};
		String hz="";
		boolean zero=true;//是否有多个0
		for(int i=0;i<4;i++)
		{
			int m=n%10;
			if(m==0)
			{
				if(zero==false)
				{
					zero=true;
					hz=number[0]+hz;//字符串连接
				}
			}
			else
			{
				zero=false;
				hz=(number[m]+wei[i])+hz;
			}
			n=n/10;
		}
		return hz;
	}
}
