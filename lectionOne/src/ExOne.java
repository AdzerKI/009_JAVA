/*
 * Задана натуральная степень k. Сформировать случайным способом список коэффициентов (от 0 до 100)
 * многочлена многочлен степени k
 * Пример k = 2 => 2*x^2 + 4*x + 5 = 0
 */

public class ExOne {

    public static String exOne(){
        int k = getRandomNumber(2, 10);
            System.out.println("k = " + k);

        String equation = "";

            for (int i = k; i > 0; i--){
            String result ="";

            if (i != 1) {
                result = Integer.toString(getRandomNumber(0, 10));

                if (Integer.parseInt(result) == 0) result = "";
                else if (Integer.parseInt(result) == 1) result = "x^" + i + " + ";
                else result = result + "*x^" + i + " + ";
            } else {
                result = Integer.toString(getRandomNumber(0, 10));

                if (Integer.parseInt(result) == 0) result = equation.substring(0, equation.length() - 3) + " = 0";
                else result = result + " = 0";
            }

            equation = equation + result;
        }

        return equation;
    }

    static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
