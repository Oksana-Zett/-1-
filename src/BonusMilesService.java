public class BonusMilesService {

    public int calculate(int priceTicket) {
        int amount = 20;
        int bonus = 1;
        int countMiles = priceTicket * bonus / amount;
        return countMiles;
    }
}
