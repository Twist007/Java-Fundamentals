import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]firstPoint = input.nextLine().split(" ");
        String[]secondPoint = input.nextLine().split(" ");
        String[]thirdPoint = input.nextLine().split(" ");
        int area = (Integer.parseInt(firstPoint[0])*(Integer.parseInt(secondPoint[1])-Integer.parseInt(thirdPoint[1]))+
                   Integer.parseInt(secondPoint[0])*(Integer.parseInt(thirdPoint[1])-Integer.parseInt(firstPoint[1]))+
                   Integer.parseInt(thirdPoint[0])*(Integer.parseInt(firstPoint[1])-Integer.parseInt(secondPoint[1])))/2;
        System.out.println(area);

    }
}
