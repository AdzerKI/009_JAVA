public class ExThree {

    /* 3. ??????? ??? ??????? ????? ?? 1 ?? 1000 (??????? ????? - ??? ????? ??????? ??????? ?????? ?? ????
    ? ?? ??????? ??? ???????. ????? ????? ??????? ?? ??????? ??????????? ???????? % , ???????? 10%3 ????? ????? ???????)*/

    static String solution(int num) {
        // ?????????????? ??????
        String result = "";

        // ?????????? ??? ????????
        for (int i = 2; i <= num; i++) {
            // ???????
            int count = 0;

            // ????????? ??????? ?? ??? ???????
            for (int j = 2; j < i; j++) {
                // ???? ??????? ??? ??????? ?? ??????????? ???????
                if (i % j == 0) {
                    count++;
                }
            }

            // ???? ??????? ????? 0 ?? ?????????? ????? ? ?????????????? ??????
            if (count == 0) {
                result += " " + i;
            }
        }

        return result;
    }
}
