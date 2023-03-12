public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676;
        int oneMilePrice = 20;
        int bonus = 0;
        if (ticketPrice > 0) {
            bonus = ticketPrice / oneMilePrice;
        }
        System.out.println("Количество бонусных миль за покупку: " + bonus
        );
    }
}