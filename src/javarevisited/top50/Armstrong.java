package javarevisited.top50;

public class Armstrong {
    public static void main(String[] args) {
        int input1 = 153;
        int input2 = 154;
        System.out.println(isArmstrong(input1));
        System.out.println(isArmstrong(input2));
    }

    private static boolean isArmstrong(int num) {
        int totalSum = 0;
        int copyNum = num;

        while (num != 0) {
            int reminder = num % 10;
            int cubeOfReminder = reminder * reminder * reminder;
            totalSum = totalSum + cubeOfReminder;
            num = num / 10;
        }

        if (copyNum == totalSum)
            return true;

        return false;
    }
}
