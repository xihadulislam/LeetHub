class Solution {
    public double[] convertTemperature(double celsius) {
//        Kelvin = Celsius + 273.15
//        Fahrenheit = Celsius * 1.80 + 32.00
        
        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;
        
        return new double[]{k, f};
    }
}