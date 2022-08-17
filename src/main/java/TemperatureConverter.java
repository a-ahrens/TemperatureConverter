public class TemperatureConverter {

    private Input input = new Input();
    private Conversion conversion = new Conversion();

    private String[] temperatureTypes = new String[]{"F","C","K"};

    public void run(){

        System.out.println("Temperature Converter Software");
        System.out.println();

        String tempType = input.convertType();
        double tempValue = input.temperatureValue();

        if(tempType.equalsIgnoreCase("c")){
            System.out.println("Celsius: " + tempValue + "C");
            System.out.println();

            System.out.println("---Converts to:---");

            System.out.println("Fahrenheit: " + conversion.celciusToFahrenheit(tempValue) + "F");
            System.out.println("Kelvin: " + conversion.celciusToKelvin(tempValue) + "K");

        } else if(tempType.equalsIgnoreCase("f")){
            System.out.println("Fahrenheit: " + tempValue + "F");
            System.out.println();

            System.out.println("---Converts to:---");

            System.out.println("Celsius: " + conversion.fahrenheitToCelcius(tempValue) + "C");
            System.out.println("Kelvin: " + conversion.fahrenheitToKelvin(tempValue) + "K");

        } else if(tempType.equalsIgnoreCase("f")){
            System.out.println("Kelvin: " + tempValue + "K");
            System.out.println();

            System.out.println("---Converts to:---");

            System.out.println("Celsius: " + conversion.kelvinToCelsius(tempValue) + "C");
            System.out.println("Fahrenheit: " + conversion.kelvinToFahrenheit(tempValue) + "F");
        }

    }

}
