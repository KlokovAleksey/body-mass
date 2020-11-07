public class BmiService {
    public double calculate(double bodymass,double height) {
        double indexmass = bodymass / Math.pow(height/100.0,2);
        return indexmass;
    }
}
