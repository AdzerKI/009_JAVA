public class ExThree {
    /*Ќапишите метод, который принимает на вход строку (String) и определ€ет €вл€етс€ ли строка палиндромом
    (возвращает boolean значение).
    ѕолиндром - —лово или фраза, которые одинаково читаютс€ слева направо и справа налево.*/

    static String solution(String s){
        String revertString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revertString += s.charAt(i);
        }

        String result = "";
        if (s.equals(revertString)){
            result = "—трока \"" + s + "\" €вл€етс€ палиндромом";
        } else {
            result = "—трока \"" + s + "\" не €вл€етс€ палиндромом";
        }

        return result;
    }


}
