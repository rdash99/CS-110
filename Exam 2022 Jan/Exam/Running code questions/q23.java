public class q23 {
    public static void main(String[] args) {
        //How many of the numbers in the array have 29595 as a factor?
        int[] numbers = { 848340675, 957487035, 1109072625, 1023865465, 1222285444, 1426568344, 885269702, 1110818730,
                899806380, 973861845, 1271961978, 1283712720, 1154500950, 889629390, 1138993170, 866545546, 903001490,
                757957545, 892099602, 1109161410, 1062667665, 1053729975, 1102176990, 909283488, 1062634101, 1078796940,
                1070480745, 1039580309 };
        int count = 0;
        for (int i = 0; i
                < numbers.length; i++) {
            if (numbers[i]
                    % 29595
                    == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
