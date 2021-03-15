//
// Synopsis:  java TemperatureConverterFunctional <temperature>
//
//  where:  <temperature>  is either:   a value in Celsius appended with a 'c'
//                                      a value in Fahrenseit
//
//  Examples (from Celsius to Fahrenheit):   java TemperatureConverterFunctional 15c
//           (from Fahrenheit to Celsius):   java TemperatureConverterFunctional -6
//
import java.util.stream.Stream;

public class TemperatureConverterFunctional {

    public static void main(String args[]) {

        if (args.length != 1) {
            System.out.println("Usage: java TemperatureConverterFunctional <a temp value>");
            System.exit(-1);
        }

        Stream<String> stream = Stream.of(args);

        stream.map( d -> (d.endsWith("c") ? ctof(d.substring(0, d.length()-1)) : ftoc(d)) )
                .forEach(System.out::println);
    }

    static double ctof(String input) {
        double in = 0.0;
        try {
            in = Double.parseDouble(input);
        } catch (NumberFormatException ne) {
            System.out.println("the temperature value format is invalid, it must a numeric value");
            System.exit(-2);
        }

        return ((in * 9/5) + 32);
    }

    static double ftoc(String input) {
        double in = 0.0;
        try {
            in = Double.parseDouble(input);
        } catch (NumberFormatException ne) {
            System.out.println("the temperature value format is invalid, it must a numeric value");
            System.exit(-2);
        }

        return ((in - 32) * 5/9);
    }
}
