public class Main {
    public static void main(String[] args) {

        int ticket_price = 5000; // стоимость билета
        int ruble_to_milli = 20; // количество рублей для получения одной милли

        int milli = ticket_price / ruble_to_milli;


        System.out.println("Вам будет начислено " + milli + " милль.");
    }
}