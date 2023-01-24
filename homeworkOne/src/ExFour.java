public class ExFour {

    /*4. Реализовать простой калькулятор ("введите первое число"... "Введите второе число"...
    "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
     */

    static void solution(int a, int b, String operation){
        int result;

        if(operation.equals("+")){
            result = a + b;
        } else if (operation.equals("-")) {
            result = a - b;
        } else if (operation.equals("/")) {
            result = a / b;
        } else {
            result = a * b;
        }

        System.out.printf("Ответ: %s", result);
    }
}
