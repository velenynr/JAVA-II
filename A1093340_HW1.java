import java.util.*;

public class A1093340_HW1{

    public static void main (String[] args){

        TreeSet<Integer> tRandom = new TreeSet<Integer>();
        Random randomNum = new Random();

        int lower = 1;
        int upper = 100;
        int max = 10;
        int number; 
        boolean isAvailable;

        ArrayList <Integer> nRandom = new ArrayList<>();
        TreeSet<Integer> range = new TreeSet<Integer>();

        for (int i = 1; i<= max; i++){
            
            do {
                isAvailable = false;
                
                number = lower+randomNum.nextInt(upper); 
            
                for (int element : nRandom){
                    if (element == number){
                        isAvailable = true;
                        break;
                    }
                }

                if (isAvailable == false){
                    nRandom.add(number);
                    System.out.println("Number " + i + " : " + number);
                }

            }while(isAvailable == true);
            
        }     

        // Collections.sort(nRandom);
        // System.out.println(nRandom);

        for (int element : nRandom){
            tRandom.add(element);
        }

        System.out.println("The total elements in the object : " + tRandom.size());
        System.out.println("Element of the object : " + tRandom);        
        System.out.println("The first element : " + tRandom.first());
        System.out.println("The last element : " + tRandom.last());
        System.out.printf ("Value between 30~70 : ");
        range = (TreeSet<Integer>) tRandom.subSet(30,70);

        System.out.println(range);

    }

}