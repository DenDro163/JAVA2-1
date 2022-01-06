
public class Main {
    public static void main(String[] args) {
        //Входные данные
        int ticketCost = 500; // цена билета
                int moneyPerMile = 20; // Кол-во потраченых рублей за билет на одну бесплатную милю
                        // Логика
        int amountFreeMiles = ticketCost / moneyPerMile; //Кол-во бесплатных миль

        System.out.println("У вас бесплатных миль:");
        System.out.println(amountFreeMiles);
    }
}