public class ExOne {

   /* 1. ��������� n-�� ������������ �����(����� ����� �� 1 �� n)*/

    static int solution(int num) {
        // ��������
        int result = 0;

        // ��������� ���������
        for (int i = 1; i <= num; i++) {
            result += i;
        }

        return result;
    }

}
