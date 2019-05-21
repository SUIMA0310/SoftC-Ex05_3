public class Stat {

    public static float average(int[] values) {

        float sum = 0;
        for(int value : values) {
            sum += value;
        }
        return sum / values.length;

    }

}