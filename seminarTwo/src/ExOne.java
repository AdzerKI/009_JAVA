public class ExOne {
    /*
    Дано четное число N (>0) и символы c1 и c2.
    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    Ответ: c1c2c1…c2 (всего N символов)
    */

    static String solution(int n, char c1, char c2){
        String result = "";

        if (n % 2 != 0 || n <= 0){
            result = "Неверный ввод";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1);
            sb.append(c2);
        }

        result = sb.toString();

        return result;
    }
}
