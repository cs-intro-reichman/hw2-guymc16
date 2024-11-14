// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		double AppPi=0;
		int Input = (Integer.parseInt(args[0]))*2 + 1;

		for ( int i=1; i<Input; i=i+2)
		{
			if ((i-3)%4 ==0)
			{
				AppPi = AppPi - (1.0/i);	
			} else
			{
				AppPi += (1.0/i);
			}
		}

		AppPi = AppPi*4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + AppPi);

	    // Replace this comment with your code
	}
}
