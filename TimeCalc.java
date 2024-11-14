public class TimeCalc {
    public static void main(String[] args) {
        
        int MinuteToAdd = Integer.parseInt(args[1]);
        int InputHours = Integer.parseInt("" + args[0].charAt(0)+args[0].charAt(1));
        int InputMin = Integer.parseInt("" + args[0].charAt(3)+args[0].charAt(4));
        InputMin += InputHours*60 + MinuteToAdd;
        String ZeroM ="";
        String ZeroH = "";

        if (InputMin%60 < 10)
        {
            ZeroM = "0";
        }

        if (((InputMin/60)%24) < 10)
        {
            ZeroH = "0";
        }
        String NewHour = "" + ZeroH + ((InputMin/60)%24) +":" +ZeroM + "" + InputMin%60;

        System.out.println(NewHour);
        



        // System.out.println( " " + InputHours + " " + InputMin + " " + MinuteToAdd);

        // Replace this comment with your code
    }
}
