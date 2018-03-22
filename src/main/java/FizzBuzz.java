public class FizzBuzz {


    public String convert(String inputNumber) {

        int aNumber = Integer.parseInt(inputNumber);

        if ((aNumber % (3*5) == 0)) {
            return "fizzbuzz";
        } else if (aNumber % 3 == 0) {
            return "fizz";
        } else if (aNumber % 5 == 0) {
            return "buzz";
        } else {
            return inputNumber;
        }

    }
}
