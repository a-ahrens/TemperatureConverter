public class Conversion {

    public double celciusToFahrenheit(double celciusTemp){
        return (celciusTemp * 9.0 / 5.0) + 32;
    }

    public double fahrenheitToCelcius(double fahrenheitTemp){
        return (fahrenheitTemp - 32) * 5.0 / 9.0;
    }

    public double celciusToKelvin(double celciusTemp){
        return celciusTemp + 237.15;
    }

    public double kelvinToCelsius(double kelvinTemp){
        return kelvinTemp - 273.15;
    }

    public double fahrenheitToKelvin(double fahrenheitTemp){
        double temp = fahrenheitToCelcius(fahrenheitTemp);
        temp += 273.15;
        return temp;
    }

    public double kelvinToFahrenheit(double kelvinTemp){
        double temp = kelvinTemp - 273.15;
        temp = celciusToFahrenheit(temp);
        return temp;
    }



}
