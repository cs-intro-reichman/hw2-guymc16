public class TimeCalc {
    public static void main(String[] args) {
        
        int MinuteToAdd = Integer.parseInt(args[1]);
        int InputHours = Integer.parseInt("" + args[0].charAt(0)+args[0].charAt(1));
        int InputMin = Integer.parseInt("" + args[0].charAt(3)+args[0].charAt(4));
        InputMin = InputMin + InputHours*60 + MinuteToAdd;
        String ZeroM ="";
        String ZeroH = "";

        if (InputMin%10 == 0)
        {
            ZeroM = "0";
        }

        if (((InputMin/60)%24) == 0)
        {
            ZeroH = "0";
        }
        String NewHour = "" + ZeroH + ((InputMin/60)%24) +":" + InputMin%60 + ZeroM;

        System.out.println(NewHour);
        



        // System.out.println( " " + InputHours + " " + InputMin + " " + MinuteToAdd);

        // Replace this comment with your code
    }
}
