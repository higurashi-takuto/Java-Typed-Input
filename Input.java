import java.util.Scanner;
import java.util.InputMismatchException;
class Input {
    private static Object read(String context, String type) {
        System.out.println(context);
        for(int count = 0; count < 3; count++) {
            try {
                Scanner scanner = new Scanner(System.in);
                switch(type) {
                    case "String":
                        return scanner.nextLine();
                    case "int":
                        return scanner.nextInt();
                    case "double":
                        return scanner.nextDouble();
                }
            } catch(InputMismatchException e) {
                System.out.println(type + "以外が入力されました。");
            }
        }
        System.out.println("不正な入力が複数回続いたため、プログラムを終了します。");
        System.exit(-1);
        return -1;
    }
    static String readString(String context) {
        String input = (String) read(context, "String");
        return input;
    }
    static int readInt(String context) {
        int input = (int) read(context, "int");
        return input;
    }
    static double readDouble(String context) {
        double input = (double) read(context, "double");
        return input;
    }
}