public class CreditCalculet {
    private double personSum;
    public double calculat(double sumData, double montMonData, double persentData, String personData) {
        PersentFirstYear persentFirstYear = new PersentFirstYear();
        if (sumData < 0 || persentFirstYear.getPersentFirstYear(sumData, montMonData, persentData,
                personData) > (montMonData * 12) || (!(personData.equals("business")) &&
                (!personData.equals("human")))) {                                                          // Сумма кредита не отрицательная
            throw new IllegalArgumentException();
        } else if (personData.equals("business")) {
            sumData = sumData - montMonData * 12;
        }
        while (sumData > 0) {
            personSum = personSum + sumData * persentData / 100;
            sumData = sumData - montMonData * 12 + personSum;
        }
        return personSum;
    }
}
