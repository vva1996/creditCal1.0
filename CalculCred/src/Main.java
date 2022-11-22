import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму взятых в кредит денег ,ежемесячный платеж, процентная ставка, тип клиента через пробел");
        String n = sc.nextLine();                                             // Вводим строку
        String[] cond = n.split(" ", 5);                           // Переводим строку в массив и ограничиваем число задействованных элементов в массиве
        CreditData creditData = new CreditData();
        creditData.setSumD(Double.parseDouble(cond[0]));                           // Переводим элементы массива из типа String в тип double и обозначаем для дальнейших действий с ними
        creditData.setMontmonD(Double.parseDouble(cond[1]));                        // Записывает Информацию в CreditData
        creditData.setPersentD(Double.parseDouble(cond[2]));
        creditData.setPerson(cond[3]);
        CreditCalculator credit = new CreditCalculator();
        if (creditData.sumD < 0)                                                          // Сумма кредита не отрицательная
            throw new IllegalArgumentException();
        else if (!(creditData.getPerson().equals("business")) && !(creditData).getPerson().equals("human")) {   // Определяем тип клиента
            throw new IllegalArgumentException();
        } else
            System.out.println(credit.calculat(creditData.getSumD(), creditData.getMontmonD(), creditData.getPersentD(), creditData.getPerson()));
    }

}



