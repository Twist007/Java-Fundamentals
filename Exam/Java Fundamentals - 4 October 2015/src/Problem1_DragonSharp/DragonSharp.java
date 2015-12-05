package Problem1_DragonSharp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DragonSharp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        Pattern pattern = Pattern.compile("(.*?)\"(.*?)\";");
        boolean expectsElse = false;

        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String programLogic = matcher.group(1);
                String stringToPrint = matcher.group(2);

                String[] logicArgs = programLogic.split("\\s+");
                if (logicArgs[0].equals("if")) {
                    if (checkCondition(logicArgs[1])) {
                        expectsElse = false;
                        if (logicArgs[2].equals("loop")) {
                            for (int j = 0; j < Integer.parseInt(logicArgs[3]); j++) {
                                output.add(stringToPrint);
                            }
                        } else {
                            output.add(stringToPrint);
                        }
                    } else {
                        expectsElse = true;
                    }
                } else if (expectsElse) {
                    if (logicArgs[1].equals("loop")) {
                        for (int j = 0; j < Integer.parseInt(logicArgs[2]); j++) {
                            output.add(stringToPrint);
                        }
                    } else {
                        output.add(stringToPrint);
                    }
                }

            } else {
                System.out.println("Compile time error @ line " + (i + 1));
                return;
            }
        }
        for (String out : output) {
            System.out.println(out);
        }
    }

    private static boolean checkCondition(String condition) {
        condition = condition.substring(1, condition.length() - 1);
        String[] num = condition.split("[><=]+");
        int leftNum = Integer.parseInt(num[0]);
        int rightNum = Integer.parseInt(num[1]);
        String operator = condition.replaceAll("\\d+", "");

        switch (operator) {
            case "==":
                if (leftNum == rightNum) {
                    return true;
                }
                break;
            case ">":
                if (leftNum > rightNum) {
                    return true;
                }
                break;
            case "<":
                if (leftNum < rightNum) {
                    return true;
                }
                break;
        }
        return false;
    }
}
