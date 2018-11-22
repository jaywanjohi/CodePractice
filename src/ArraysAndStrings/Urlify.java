package ArraysAndStrings;

public class Urlify {
    public static void main(String[] args) {
        String testString = "Mr John Smith    ";
        char[] content = testString.toCharArray(); //use char array coz java strings are immutable
        System.out.println("New String: "+ replaceSpaces(content, 13));
}

    public static String replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;

        //count number of spaces; triple this number to know how many extra chars will be in final string
        for (i=0; i<trueLength; i++) {
            if(str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0'; //End array
        for (i = trueLength - 1; i >=0; i--) { //edit string in reverse order
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            }
            else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return new String(str);
    }
}
