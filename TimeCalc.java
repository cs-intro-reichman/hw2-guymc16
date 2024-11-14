public class TimeCalc {
    public static void main(String[] args) {
        
        int MinuteToAdd = Integer.parseInt(args[1]);
        int InputHours = Integer.parseInt("" + args[0].charAt(0)+args[0].charAt(1));
        int InputMin = Integer.parseInt("" + args[0].charAt(3)+args[0].charAt(4));
        InputMin = InputMin + InputHours*60 + MinuteToAdd;
        String Zero ="";

        if (InputMin%10 == 0)
        {
            Zero = "0";
        }
        String NewHour = "" + ((InputMin/60)%24)%24 +":" + InputMin%60 + Zero;

        System.out.println(NewHour);
        



        // System.out.println( " " + InputHours + " " + InputMin + " " + MinuteToAdd);

        // Replace this comment with your code
    }
}
