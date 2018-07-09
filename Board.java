//------HanChee Logic Part @Ma 20180708-------
public class Board{
	//游戏状态
	private String PlayerA,PlayerB;
	private Boolean P=false;//false~A,true~B
	private int N=0;
	private static int map_B[2]={3,4,5};
	//--------------------------
	private class Stone
	{
		int xpos=-1,ypos=-1;
	}
	private Stone[] s=new Stone[5];
	Board(String a,String b)
	{
		PlayerA=a;
		PlayerB=b;
	}
	private int checkwinner()
	{
		if ((s[0].xpos==s[1].xpos==s[2].xpos!=-1) or(s[0].ypos==s[1].ypos==s[2].ypos!=-1) or (s[0].xpos!=s[1].xpos!=s[2].xpos!=s[0].xpos!=-1))
		{
			return 1;
		}
		else if((s[3].xpos==s[4].xpos==s[5].xpos!=-1) or(s[3].ypos==s[4].ypos==s[5].ypos!=-1) or (s[3].xpos!=s[4].xpos!=s[5].xpos!=s[3].xpos!=-1))
		{
			return 2;
		}
		else()
		{
			return 0;
		}
	}
	public int operate(int x,int y)
	{
		if(x>2 or y>2)
		{
			return 0;
		}
		if(!P)//A手
		{
			s[N].xpos=x;
			s[N].ypos=y;
		}
		else()//B手
		{
			s[map_B[N]].xpos=x;
			s[map_B[N]].ypos=y;
			if(N<3)
			{
			N++;
			}
			else()
			{
			N=0;
			}
		}
		p=!p;
		
		return checkwinner();
	}
	//测试主方法
	public static void main(String ARG)
	{
		
	}
}
