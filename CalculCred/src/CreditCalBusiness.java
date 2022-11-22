public class CreditCalBusiness {
    public double persenSum;
    CreditData creditData = new CreditData();
    double sumBusCal = creditData.sumD;
    double persentBus = ((creditData.getSumD() - (creditData.getMontmonD() * 12)) * (creditData.getPersentD() / 100) / 12);

    public double bildCalculet(double persenSum) {
        do {
            persenSum = persenSum + ((creditData.getSumD() - (creditData.getMontmonD() * 12)) * (creditData.getPersentD() / 100));
            sumBusCal = sumBusCal - ((creditData.getMontmonD() * 12)) + ((sumBusCal - (creditData.getMontmonD() * 12)) * (creditData.getPersentD() / 100));
            System.out.println(sumBusCal);
        } while ((creditData.getSumD() > 0) && (creditData.getSumD() > (creditData.getMontmonD() * 12)));
        return persenSum;
    }
}
