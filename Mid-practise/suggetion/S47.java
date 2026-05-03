import java.util.Scanner;
public class S47 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] sellaryArr = new int[10];
        
        System.out.println("Enter 10 employes sellary");
        for(int i = 0; i < 10; i++){
            sellaryArr[i] = scan.nextInt();
        }

        double highestBasicSellary = 0.0;
        double totalSellaries = 0.0;
        double averageSellary = 0.0;
        int numberCount = 0;

        for(int i = 0; i < sellaryArr.length; i++){
            totalSellaries = totalSellaries + sellaryArr[i];
            if(sellaryArr[i] > highestBasicSellary){
                highestBasicSellary = sellaryArr[i];
            }
        }

        averageSellary = (totalSellaries / sellaryArr.length);

        for(int i = 0; i < sellaryArr.length; i++){
            if(sellaryArr[i] < averageSellary){
                numberCount++;
            }
        }

        int countTracker  = 0; 
        for(int i = 0; i < sellaryArr.length; i++){
            
            double incomeTax = ((sellaryArr[i] * 3) / 100);
            double newSellary = (sellaryArr[i] - incomeTax);
            System.out.print(newSellary + " ");

            countTracker++;
            if(countTracker == 5){
                System.out.println("\n");
                countTracker = 0;
            }
        }


        System.out.println("highestBasicSellary: "+ highestBasicSellary);
        //System.out.println("totalSellaries: "+ totalSellaries);
        //System.out.println("averageSellary: "+ averageSellary);
        System.out.println("numberCount: "+ numberCount);
        
        scan.close();
    }
}
