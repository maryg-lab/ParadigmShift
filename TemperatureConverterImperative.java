//
// This program converts temperature from Celsius to Fahrenheit, and Fahrenheit to Celsius
//
// Synopsis:  java TemperatureConverterImperative <mode> <temperature to convert>
//
//   where <mode> is 1 for converting from Celsius to Fahrenheit
//                   2 for converting from Fahrenheit to Celsius
//         <temperature to convert> a numeric temperature value
//
//   output:  temperature value in the desired scale
//
//   F = (C * 9/5) + 32
//   C = (F -32) * 5/9
//
public class TemperatureConverterImperative {

    public static void main(String[] args) {

        if ((args.length != 2) || (!args[0].matches("1|2"))) {
            System.out.println("Usage: java TemperatureConverterImperative <mode> <temp to convert>");
            System.exit(-1);
        }

        double input = 0.0;
        double output = 0.0;
        try {
            input = Double.parseDouble(args[1]);
        } catch (NumberFormatException ne) {
            System.out.println("Your second input argument must be a numeric value!");
            System.exit(-2);
        }

        if ("1".equals(args[0])) {
            output = (input * 9 / 5) + 32;
        } else if ("2".equals(args[0])) {
            output = (input - 32) * 5 / 9;
        } else{
            System.out.println("Unknown mode of conversion!");
            System.exit(-3);
        }

        System.out.println("Converted temperature is: " + output);
    }

}
