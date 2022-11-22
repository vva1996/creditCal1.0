public class CreditCalculator {
    public double calculat(double sumD, double montmonD, double persentD, String person) {
        double persentHum = (sumD * (persentD / 100) / 12);                               // Считаем сумму процентов для human
       CreditCalBusiness creditCalBusiness = new CreditCalBusiness();
        if (person.equals("business")) {
            if (montmonD > creditCalBusiness.persenSum) {
                System.out.println(creditCalBusiness.persenSum);
            } else
                throw new IllegalArgumentException();

        } else {

            if (!(montmonD > persentHum)) {
                throw new IllegalArgumentException();
            } else {                                          // Проверяем возможность выплаты клиента типа human

            }
        }

        return creditCalBusiness.persenSum;
    }

}

