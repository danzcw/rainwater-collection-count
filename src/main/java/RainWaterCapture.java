public class RainWaterCapture {


    public RainWaterCapture() {

    }

    public int rainWaterRetained(Integer[] input) {

        int currentHighest = input[0];
        int count = 0;
        int countFromCurrent = 0;

        for(int i = 0; i < input.length; i++) {

            if (i == (input.length - 1) && input[i] <= currentHighest) {
                count = count - ((currentHighest - input[i]) * (countFromCurrent));
                break;
            } if (currentHighest > input[i]) {
                count = count + (currentHighest - input[i]);
                countFromCurrent++;

            } else if (currentHighest <= input[i]) {
                currentHighest = input[i];
                countFromCurrent = 0;
            }
        }

        return count;

    }

}
