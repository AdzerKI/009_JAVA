public class ExFour {

    /*4. ����������� ������� ����������� ("������� ������ �����"... "������� ������ �����"...
    "������� ��������, ������� ���� ��������� � ����� �������"... "�����: ...")
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

        System.out.printf("�����: %s", result);
    }
}
