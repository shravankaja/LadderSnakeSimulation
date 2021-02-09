
public class SnakeAndLadder {
	public static void main(String Args[])
	{
		System.out.println("Welcome to Snake and Ladder Simulation");
		int positionPlayer1=0;
		int counterPlayer1=0;
		
		
		while (positionPlayer1 != 100)
		{
			int dicePlayer1=(int)(Math.random()*6+1);
			counterPlayer1++;
			int option=(int)(Math.random()*3+1);
			System.out.println("Rolled dice Player 1:"+dicePlayer1);
			System.out.println("Option Player 1: "+option);
			if (option==1)
			{
					
					continue;
			}
			else if (option==2)
			{
				int temppositionPlayer1=positionPlayer1;
				temppositionPlayer1-=dicePlayer1;
				if(temppositionPlayer1<0)
				{
					continue;
				}
				else
				{
					positionPlayer1-=dicePlayer1;
					System.out.println("Positon of Player1 :"+positionPlayer1);
				}
	
	
			
			}
			else if (option==3)
			{
				int temp1positionPlayer1=positionPlayer1;
				temp1positionPlayer1+=dicePlayer1;
				
				positionPlayer1+=dicePlayer1;
				System.out.println("Positon of Player1 :"+positionPlayer1);
				dicePlayer1=(int)(Math.random()*6+1);
				counterPlayer1++;
		
				
		
		
		
		}
		
		
	}
}

}