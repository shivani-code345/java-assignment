class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}
public class assign56TemperatureCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one temperature value.");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);
            checkTemperature(temperature);
        } catch (TooHotException e) {
            System.out.println("Caught TooHotException: " + e.getMessage());
        } catch (TooColdException e) {
            System.out.println("Caught TooColdException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid temperature.");
        }
    }

    public static void checkTemperature(double temperature) throws TooHotException, TooColdException {
        if (temperature > 35) {
            throw new TooHotException("Temperature is too hot: " + temperature + "°C");
        } else if (temperature < 5) {
            throw new TooColdException("Temperature is too cold: " + temperature + "°C");
        } else {
            System.out.println("Normal temperature: " + temperature + "°C");
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        }
    }
}

