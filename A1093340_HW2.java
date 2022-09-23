import java.util.*;

public class A1093340_HW2{

    public static void main (String[] args){

        var hDictionary = new HashMap<>();
        boolean isOK;

        Scanner input = new Scanner(System.in);

        hDictionary.put(1, "January");
        hDictionary.put(2, "February");
        hDictionary.put(3, "March");
        hDictionary.put(4, "April");
        hDictionary.put(5, "May");
        hDictionary.put(6, "June");
        hDictionary.put(7, "July");
        hDictionary.put(8, "August");
        hDictionary.put(9, "September");
        hDictionary.put(10, "October");
        hDictionary.put(11, "November");
        hDictionary.put(12, "December");

        do {
            isOK = true;

            System.out.printf("Input number between 1~12? ");
            int key = input.nextInt();
    
            if (key >= 1 && key <=12){
                System.out.println("The " + key + " in month is " + hDictionary.get(key));
            }else{
                System.out.println("Invalid Range!");
                isOK = false;
            }

        }while (isOK == false);
       
    }

}