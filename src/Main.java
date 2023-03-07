public class Main {
    public static void main(String[] args) {

        int ticketPrice = 5000; // стоимость билета
        int rubleToMilli = 20; // количество рублей для получения одной милли

        int milli = ticketPrice / rubleToMilli;


        System.out.println("Вам будет начислено " + milli + " милль.");
    }
}