import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArr = scan.nextLine().split("\\s+");
        int[] arr = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        String line = scan.nextLine();

        while (!line.equals("end")) {
            String[] inputArgs = line.split(" ");
            String command = inputArgs[0];
            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(inputArgs[1]);
                    if (index < 0 || index >= arr.length) {
                        System.out.println("Invalid index");
                        break;
                    }
                    arr = exchange(arr, index);
                    break;
                case "min":
                    System.out.println(getMin(arr, inputArgs[1]));
                    break;
                case "max":
                    System.out.println(getMax(arr, inputArgs[1]));
                    break;
                case "first":
                    System.out.println(getFirst(arr, Integer.parseInt(inputArgs[1]), inputArgs[2]));
                    break;
                case "last":
                    System.out.println(getLast(arr, Integer.parseInt(inputArgs[1]), inputArgs[2]));
                    break;
            }
            line = scan.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] exchange(int[] arr, int index) {
        int[] tempList = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempList[i] = arr[(index + i + 1) % arr.length];//1 2 3 4 5-> exchange 0-> 2 3 4 5 1
        }
        return tempList;
    }

    private static String getMin(int[] arr, String parity) {
        int remainder = parity.equals("odd") ? 1 : 0;
        int max = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current % 2 == remainder && current <= max) {
                max = current;
                index = i;
            }
        }
        return index < 0 ? "No matches" : Integer.toString(index);
    }

    private static String getMax(int[] arr, String parity) {
        int remainder = parity.equals("odd") ? 1 : 0;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current % 2 == remainder && current >= max) {
                max = current;
                index = i;
            }
        }
        return index < 0 ? "No matches" : Integer.toString(index);
    }

    private static String getFirst(int[] arr, int count, String parity) {
        int remainder = parity.equals("odd") ? 1 : 0;
        ArrayList<Integer> tempList = new ArrayList<>();

        if (count > arr.length) {
            return "Invalid count";
        }

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current % 2 == remainder) {
                tempList.add(current);
            }
            if (tempList.size() >= count) {
                break;
            }
        }
        return "[" +
                String.join(", ", tempList.stream()
                        .map(e -> Integer.toString(e))
                        .collect(Collectors.toList())) +
                "]";
    }

    private static String getLast(int[] arr, int count, String parity) {
        int remainder = parity.equals("odd") ? 1 : 0;
        ArrayList<Integer> tempList = new ArrayList<>();

        if (count > arr.length) {
            return "Invalid count";
        }

        for (int i = arr.length-1; i >= 0; i--) {
            int current = arr[i];
            if (current % 2 == remainder) {
                tempList.add(0, current);
            }

            if (tempList.size()>=count){
                break;
            }
        }

        return "[" +
                String.join(", ", tempList.stream()
                        .map(e -> Integer.toString(e))
                        .collect(Collectors.toList())) +
                "]";
    }
}













