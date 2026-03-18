package classes;

public class PriceCalculation {

    public double getPrice(Ticket t){
        Long duration = t.getDuration();
        return duration * 60;
    }
}
