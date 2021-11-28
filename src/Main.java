public class Main {
    public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int priceTicket = 10_000;
            int countMiles = service.calculate(priceTicket);
            System.out.println(countMiles);
    }
    }
