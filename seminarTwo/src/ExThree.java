public class ExThree {
    /*�������� �����, ������� ��������� �� ���� ������ (String) � ���������� �������� �� ������ �����������
    (���������� boolean ��������).
    ��������� - ����� ��� �����, ������� ��������� �������� ����� ������� � ������ ������.*/

    static String solution(String s){
        String revertString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revertString += s.charAt(i);
        }

        String result = "";
        if (s.equals(revertString)){
            result = "������ \"" + s + "\" �������� �����������";
        } else {
            result = "������ \"" + s + "\" �� �������� �����������";
        }

        return result;
    }


}
