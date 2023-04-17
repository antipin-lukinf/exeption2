//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно
//        приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Zd1 {
    public static void main(String[] args) {
        inpNumber();

    }

    public static float inpNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число : ");

        boolean isCheck = true;
        while(isCheck){
            try {
                Float number = in.nextFloat();
                System.out.println(number);
                isCheck = false;
            } catch (Exception e){
                System.out.println("Это не дробное число, повторите ввод : ");
                inpNumber();
                break;
            }
        }
        return 0;
    }

}