public class ExOne {
    /*
    ���� ������ ����� N (>0) � ������� c1 � c2.
    �������� �����, ������� ������ ������ ����� N, ������� ������� �� ������������ �������� c1 � c2, ������� � c1.
    �����: c1c2c1�c2 (����� N ��������)
    */

    static String solution(int n, char c1, char c2){
        String result = "";

        if (n % 2 != 0 || n <= 0){
            result = "�������� ����";
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
