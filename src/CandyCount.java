public class CandyCount {
    public static void main(String[] args){

        float money = 12.4f;
        float price = 1.2f;
        int candies = 0;

        if(money > 0 && price>0) {
            while(money-price>0){
                candies++;
                money -= price;
            }
        }

        System.out.println("total candies: " + candies + " money left: " + money);
    }
}
