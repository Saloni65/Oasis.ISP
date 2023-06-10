//Game Code 


import java.util.Scanner;

class Game
	{
    public static Scanner sc = new Scanner(System.in);
    public static void fnGame(int number, int attemptLimit)
	{
        int count=0, at = attemptLimit;
        while(count!=attemptLimit){
            System.out.println("Enter the Number Between 1-100: ");
            int temp = sc.nextInt();
            count++;
            if(temp==number)
		{
                System.out.println("Hurrah number matched => The number was: "+number);
                
                System.out.println("Attempt Taken - "+count);
                System.out.println("Attempt Remain: "+ --at);
                System.out.println("Your score is =>>"+at);
                return;
            }
            else if(temp>number)
		{
                System.out.println("Entered number is bigger");
                System.out.println("Attempt Remain: "+ --at);
            }
            else
		{
                System.out.println("Entered number is smaller");
                System.out.println("Attempt Remain: "+ --at);
            }
        }
        System.out.println("**********You Failed Boomer have another go**********");
        System.out.println("The actual number was => "+number);

    }
    public static void main(String[] args) 
	{
        int number = (int) (Math.random()*100);
        int choice;
        System.out.println("******************WELCOME TO THE GAME******************");
        System.out.println("Choose deficulty level\n1.Easy \n2.Medium \n3.Hard");
        
        choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("You have 20 Limits");
            fnGame(number, 20);
            break;
            case 2:
            System.out.println("You have only 6 Limits");
            fnGame(number, 6);
            break;
            case 3:
            System.out.println("You have only 3 Limits");
            fnGame(number, 3);
        }

    }
}
