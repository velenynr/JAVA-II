import java.security.SecureRandom;

public class A1093340_HSRMachine implements Runnable{

    public final int MAX_TICKET = 4;
    public static int tickets = 10000;
    private String machineName;
    private int totalSold;
    Thread trd;
    SecureRandom randomNumber = new SecureRandom();

    public A1093340_HSRMachine(String machineName){
        this.machineName = machineName;
        totalSold = 0;
        trd = new Thread(this, machineName);
        trd.start();
    }

    public void run(){
        
        while(isAvailable()){
            int purchaseAmount = 1+randomNumber.nextInt(MAX_TICKET);
            if (purchaseAmount<=tickets){
                subTicket(purchaseAmount);
                totalSold+=purchaseAmount;

                System.out.println(purchaseAmount + " ticket(s) sold at " + machineName + ".");
            }
        }

        System.out.println("Total tickets sold at " + machineName + " is " + totalSold + ".");

    }

    public boolean isAvailable(){
        if(tickets>0){
            return true;
        }else{
            return false;
        }
    }

    private synchronized static void subTicket(int purchaseAmount){

        tickets-=purchaseAmount;
        return;

    }
}