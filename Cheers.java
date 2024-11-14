// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String Name = args[0];
                String Ana = "a ";
                String NewName = "";
                int Show = Integer.parseInt(args[1]);
                String SpecialUpper = "AEFHILMNORSX";
                String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String Lower = "abcdefghijklmnopqrstuvwxyz"; 
                for (int i=0; i<Name.length(); i++)
                {
                        if (Upper.indexOf(Name.charAt(i)) == -1) {
                             NewName = NewName + Upper.charAt(Lower.indexOf(Name.charAt(i)))  ; 
                        } else {
                                NewName = NewName + Name.charAt(i);
                                }
                        
                      
                        
                }
                for (int x=0; x<Name.length(); x++)
                {
                        if (SpecialUpper.indexOf(NewName.charAt(x)) >= 0)
                        {
                             Ana = "an";    
                        }

                        System.out.println("Give me "+ Ana + " " + NewName.charAt(x) + ": " + NewName.charAt(x) +"!" );
                        Ana = "a ";
                }
                
                System.out.println("What does that spell?");
                
                for ( int a=0; a<Show; a++)
                {
                        System.out.println(NewName +"!!!");
                }



                // {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'
                }
        }

