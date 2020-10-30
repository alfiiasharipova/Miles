public class Miles {
    public static void main(String[] args) {
        int ticketPrice = 3999;
        int mile = 1;
        int bonusMoney = 20;
        int bonus = bonusMoney!=0? mile*ticketPrice/bonusMoney:0;
        System.out.println(bonus);
    }
}
