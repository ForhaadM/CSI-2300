import java.util.Scanner ;
public class Hello {
    public static void main(String[] args) {
        int choiceString = 2;
        Scanner sc = new Scanner(System.in);
       
        while (choiceString != 0)
        {
            System.out.println("Who has the biggest cock of them all. God or Swiss? Choose 1 for God or 2 for Swiss or press 0 to end program") ;
            choiceString = sc.nextInt();
            if (choiceString == 1 ){
                System.out.println("WRONG FALSE INFORMATION");
            }
    
            if (choiceString == 2 ){
                System.out.println("ACTUALLY FACTUAL INFO GIGA COCK");
            }
            if (choiceString != 1 && choiceString!= 2 && choiceString != 0) {
                System.out.println("There werent other options. Are you fucking STOOPID????");
            }
            if (choiceString == 0){
                break;
            }
        }
        
        System.out.println("You have stopped the program");
        
        
        
    }
    
}
 