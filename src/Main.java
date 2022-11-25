import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму взятых в кредит денег ,ежемесячный платеж, процентная ставка," +
                " тип клиента через пробел");
        String array = sc.nextLine();                                             // Вводим строку
        String[] cond = array.split(" ", 5);
        CreditData creditData = new CreditData();
        CreditCalculet creditCalculet = new CreditCalculet();
        creditData.setSumD(Double.parseDouble(cond[0]));                      // Переводим элементы массива из типа String в тип double и обозначаем для дальнейших действий с ними
        creditData.setMontmonD(Double.parseDouble(cond[1]));                  // Записывает Информацию в CreditData
        creditData.setPersentD(Double.parseDouble(cond[2]));
        creditData.setPerson(cond[3]);
        System.out.println(creditCalculet.countCredit(creditData));
    }
}