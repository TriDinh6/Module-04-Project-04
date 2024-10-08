
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * sort a link list given by the user 
 * @author Tri Dinh
 * @version 1.0
 */
public class linked_list {

    /**
     * the main function which will ask the user repeatedly what number they want put in the link list
     * and will stop after getting any input that is not a number then print the link list then sort it with the Collections framework
     * then print the sorted link list
     * 
     * @param args store cmd line prompts
     */
    public static void main(String[] args) {

        //setting up the link list and scanner
        LinkedList<Integer> num_list = new LinkedList<>();
        Scanner read_numbers = new Scanner(System.in);

        //ask user for numbers until a non-number is entered
        while(true){
            try {
                System.out.print("enter the numbers you want in the list(to stop, enter anything that is not a number): ");
                int number_input = read_numbers.nextInt();
                num_list.add(number_input);
            } catch (Exception e) {
                break;
            }
            
        }
        
        //sort link list with Collections.sort() ascend 
        System.out.println("before: " + num_list);
        Collections.sort(num_list);
        System.out.println("Sorted: " + num_list);


        read_numbers.close();
        
        
    }

   
    

}
