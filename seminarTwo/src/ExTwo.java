public class ExTwo {
    /*Напишите метод, который сжимает строку.
    Пример: вход aaaabbbcdd.
    Результат: a4b3cd2*/

    static String solution(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
            } else {
                sb.append(s.charAt(i-1));
                if(count != 1){
                    sb.append(count);
                }
                count = 1;
            }
        }

        sb.append(s.charAt(s.length()-1));
        if(count != 1){
            sb.append(count);
        }

        return sb.toString();
    }
}
