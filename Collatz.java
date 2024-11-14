// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int Num = Integer.parseInt(args[0]);
		char CV = args[1].charAt(0);
		int Count = Integer.parseInt(args[0]);
		int Try;
		int Ans;
		int EqI;
		String Pelet;

		for (int i=1; i<=Count; i++)
		{
			Pelet ="" + i;
			Try = 1;
			Ans = 0;
			EqI = i;
			while (Ans != 1)
			{
				if (EqI%2==0 && EqI != 1)
				{
					EqI = EqI/2;
				} else
				{
					EqI = (EqI * 3) + 1;
				}
				Ans = EqI;
				Pelet = Pelet + " " + EqI;
				Try += 1;
			}
			Pelet = Pelet + "(" + Try + ")";
			if (CV == 'v') {
				System.out.println(Pelet);
			} 
			
		}

		System.out.println("Every one of the first " + Count + " hailstone sequences reached 1.");

	    // Replace this comment with your code
	}
}
