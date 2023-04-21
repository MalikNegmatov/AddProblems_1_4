public class Main {

    public static void main(String[] args) {

//      Задачи по ссылке https://skyengpublic.notion.site/1-2-070c491064914f4b8608fa55a3424472
//      Решения ниже в методах 1.n.m Здесь тесты и проверка.

// -------------------------------------------------------------------------------
        System.out.println("\nЗадача №1.4.4");
        task1_4_4(3, 5, 30);
        task1_4_4(3, 7, 100);
// -------------------------------------------------------------------------------
        System.out.println("\nЗадача №1.4.5");
        task1_4_5(10);
        System.out.println();
        task1_4_5(20);
        System.out.println();
// -------------------------------------------------------------------------------
   }

    public static void task1_4_4 (int p, int q, int n) { // Задача 4 из раздела 1.4
//  p,q - простые числа  для проверки на кратность чисел в последовательности от 1 до n
        String strOutput;
        for (int i = 1; i <= n; i++) {
            strOutput = i + " ";
            if (i % p == 0) {
                strOutput += "ping ";
            }
            if (i % q == 0) {
                strOutput += "pong ";
            }
            System.out.println(strOutput);
        }
    }
    public static void task1_4_5 (int n) { // задача 5 из раздела 1.4
//  Печать первых n>=2 чисел Фибоначчи
        int f = 0;
        System.out.print(f);
        int f_next = 1;
        System.out.print(" " + f_next);
        for (int i = 3; i <= n; i++) {
            f_next += f ;
            f = f_next - f;
            System.out.print(" " + f_next);
        }
    }
}
