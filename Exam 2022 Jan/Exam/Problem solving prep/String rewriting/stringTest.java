public class stringTest {
    public static void main(String[] args) {
        // take an input string and apply the following rules to it:
        // 1. replace monkey and lemon with the letter 'N'
        // 2. replace The word 'the' with the letter 'T'
        // 3. replace TN with 'NP'
        // 4. replace stole with 'V'
        // 5. replace VNP with 'VP'

        String input = "The monkey stole the lemon";
        String test = "The monkey stole the lemon";
        String output = "";
        String[] words = input.split(" ");

        for (String word : words) {
            if (word.equals("monkey")) {
                word = "N";
            } else if (word.equals("lemon")) {
                word = "N";
            } else if (word.equals("the")
                    || word.equals("The")) {
                word = "T";
            } else if (word.equals("TN")) {
                word = "NP";
            } else if (word.equals("stole")) {
                word = "V";
            } else if (word.equals("VNP")) {
                word = "VP";
            }
            output += word
                    + " ";
        }
        System.out.println(output);
        // repeat the rules for the output and add the rule of NPVP->S

        //output.replaceAll(" ", "");
        //System.out.println(output);
        //apply all the rules using replaceAll to the input string
        // and print the output

        test = test.replaceAll("monkey", "N");
        test = test.replaceAll("lemon", "N");
        test = test.replaceAll("the", "T");
        test = test.replaceAll("The", "T");
        test = test.replaceAll("stole", "V");
        test = test.replaceAll(" ", "");
        test = test.replaceAll("TN", "NP");
        test = test.replaceAll("VNP", "VP");
        test = test.replaceAll("NPVP", "S");
        System.out.println(test);

        String test2 = "ABAACAB";
        while (!test2.equals("z")) {
            test2 = test2.replaceAll("AB", "x");
            test2 = test2.replaceAll("xA", "x");
            test2 = test2.replaceAll("xCx", "z");
            System.out.println(test2);
        }
        System.out.println(test2);
    }
}