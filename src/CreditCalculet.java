public class CreditCalculet {
    private double personSum;
    private double sumCredit;
    private double personSumYear;

    public double countCredit(CreditData creditData) {
        PersentFirstYear persentFirstYear = new PersentFirstYear();
        if (creditData.getSumD() < 0 || persentFirstYear.getPersentFirstYear(creditData.getSumD(),
                creditData.getMontmonD(), creditData.getPersentD(),
                creditData.getPerson()) > (creditData.getMontmonD() * 12) ||
                (!(creditData.getPerson().equals("business")) && (!creditData.getPerson().equals("human")))) {                                                          // Сумма кредита не отрицательная
            throw new IllegalArgumentException();
        } else if (creditData.getPerson().equals("business")) {
            sumCredit = creditData.getSumD() - creditData.getMontmonD() * 12;
        } else {
            sumCredit = creditData.getSumD();
        }
        while (sumCredit > 0) {
            personSum = personSum + sumCredit * creditData.getPersentD() / 100;
            personSumYear = sumCredit * creditData.getPersentD() / 100;
            sumCredit = sumCredit - creditData.getMontmonD() * 12 + personSumYear;
        }
        return personSum;
    }
}
