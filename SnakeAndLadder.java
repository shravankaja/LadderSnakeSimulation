
public class SnakeAndLadder {

	public static void main(String Args[]) {
		System.out.println("Welcome to Snake and Ladder Simulation");
		//Uc1
		int positionPlayer1=0;
		int positionPlayer2=0;
		int counterPlayer1=0;
		int counterPlayer2=0;
		//UC2
		
		
		//UC3
		
		while (positionPlayer1 != 100 && positionPlayer2 != 100)
		{
			int dicePlayer1=(int)(Math.random()*6+1);
			counterPlayer1++;
			int option=(int)(Math.random()*3+1);
			System.out.println("Rolled dice Player 1:"+dicePlayer1);
			System.out.println("Option Player 1: "+option);
			
		if (option==1)
		{
			int dicePlayer2=(int)(Math.random()*6+1);
			counterPlayer2++;
			System.out.println("Rolled dice Player 2:"+dicePlayer2);
			int option1=(int)(Math.random()*3+1);
			System.out.println("Option Player 2 : "+option1);
			if(option1==1)
			{
				System.out.println("-----------------------------------------------------------------------------------------------------------------");	
				continue;
			}
			
		}

		else if (option==2)
		{
			int temppositionPlayer1=positionPlayer1;
			temppositionPlayer1-=dicePlayer1;
			if(temppositionPlayer1<0)
			{
				int dicePlayer2=(int)(Math.random()*6+1);
				counterPlayer2++;
				System.out.println("Rolled dice Player2 :"+dicePlayer2);
				int option1=(int)(Math.random()*3+1);
				System.out.println("Option Player2 : "+option1);
				
				if(option1==2)
				{
				int temppositionPlayer2=positionPlayer2;
				temppositionPlayer2-=dicePlayer2;
				if(temppositionPlayer2<0)
				{
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
					continue;
				}
				else
				{
					positionPlayer2-=dicePlayer2;
					System.out.println("Positon of Player2 :"+positionPlayer2);
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
				}
			}
			}
			else
			{
				positionPlayer1-=dicePlayer1;
				System.out.println("Positon of Player1 :"+positionPlayer1);
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
				int dicePlayer2=(int)(Math.random()*6+1);
				counterPlayer2++;
				System.out.println("Rolled dice Player2 :"+dicePlayer2);
				int option1=(int)(Math.random()*3+1);
				System.out.println("Option Player2 : "+option1);
				
				if(option1==2)
				{
				int temppositionPlayer2=positionPlayer2;
				temppositionPlayer2-=dicePlayer2;
				if(temppositionPlayer2<0)
				{
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
					continue;
				}
				else
				{
					positionPlayer2-=dicePlayer2;
					System.out.println("Positon of Player2 :"+positionPlayer2);
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
				}
			}
			}
			
			}
	
		else if (option==3)
		{
			int temp1positionPlayer1=positionPlayer1;
			temp1positionPlayer1+=dicePlayer1;
			if(temp1positionPlayer1>100)
			{
				int dicePlayer2=(int)(Math.random()*6+1);
				counterPlayer2++;
				System.out.println("Rolled dice Player2 :"+dicePlayer2);
				int option1=(int)(Math.random()*3+1);
				System.out.println("Option Player2 : "+option1);
				if(option1==3)
				{
					int temp1positionPlayer2=positionPlayer2;
					temp1positionPlayer2+=dicePlayer2;
					if(temp1positionPlayer2>100)
					{
						System.out.println("-----------------------------------------------------------------------------------------------------------------");
						continue;	
					}
					else 
					{
						positionPlayer2+=dicePlayer2;
						System.out.println("Positon of Player2 :"+positionPlayer2);
						dicePlayer2=(int)(Math.random()*6+1);
						counterPlayer2++;
						System.out.println("Rolled dice Player2:"+dicePlayer2);
						 option1=(int)(Math.random()*3+1);
						System.out.println("Option Player2: "+option1);
						if(option1==3)
						{
							positionPlayer2+=dicePlayer2;
							System.out.println("Positon of Player2 :"+positionPlayer2);
							System.out.println("-----------------------------------------------------------------------------------------------------------------");
							
						}
						
					}
					
							
				}
				
			}
			else 
			{
				positionPlayer1+=dicePlayer1;
				System.out.println("Positon of Player1 :"+positionPlayer1);
				dicePlayer1=(int)(Math.random()*6+1);
				counterPlayer1++;
				System.out.println("Rolled dice Player1:"+dicePlayer1);
				int option1=(int)(Math.random()*3+1);
				System.out.println("Option Player1 : "+option1);
				if(option1==3)
				{
					positionPlayer1+=dicePlayer1;
					System.out.println("Positon of Player1 :"+positionPlayer1);
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
					
				}
				int dicePlayer2=(int)(Math.random()*6+1);
				counterPlayer2++;
				System.out.println("Rolled dice Player2 :"+dicePlayer2);
				 option1=(int)(Math.random()*3+1);
				System.out.println("Option Player2 : "+option1);
				if(option1==3)
				{
					int temp1positionPlayer2=positionPlayer2;
					temp1positionPlayer2+=dicePlayer2;
					if(temp1positionPlayer2>100)
					{
						System.out.println("-----------------------------------------------------------------------------------------------------------------");
						continue;	
					}
					else 
					{
						positionPlayer2+=dicePlayer2;
						System.out.println("Positon of Player2 :"+positionPlayer2);
						dicePlayer2=(int)(Math.random()*6+1);
						counterPlayer2++;
						System.out.println("Rolled dice Player2:"+dicePlayer2);
						 option1=(int)(Math.random()*3+1);
						System.out.println("Option Player2: "+option1);
						if(option1==3)
						{
							positionPlayer2+=dicePlayer2;
							System.out.println("Positon of Player2 :"+positionPlayer2);
							System.out.println("-----------------------------------------------------------------------------------------------------------------");
							
						}
						
					}
					
							
				}
				
				
			}
				
		}
		if(positionPlayer1==100 || positionPlayer2==100)
		{
			break;
		}
		
	}
	
	System.out.println("No of Times Dice Rolled Player1 :"+counterPlayer1+"  Position :"+positionPlayer1);
	System.out.println("No of Times Dice Rolled Player2 :"+counterPlayer2+"  Position :"+positionPlayer2);
	}
}

