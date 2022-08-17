import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String convertType(){
        System.out.println("Enter the temperature type you want to convert from");
        System.out.println("(F) Fahrenheit");
        System.out.println("(C) Celsius");
        System.out.println("(K) Kelvin");

        String unitType = scanner.nextLine();
        System.out.println();

        return unitType;
    }

    public double temperatureValue(){
        System.out.println("Enter the temperature value you want to convert");
        double tempValue = Double.parseDouble(scanner.nextLine());
        return tempValue;
    }

}
