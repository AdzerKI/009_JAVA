public class ExTwo {

    /*2. ��������� n! (������������ ����� �� 1 �� n)*/
    static int solution(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
