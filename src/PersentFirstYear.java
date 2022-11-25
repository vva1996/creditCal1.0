public class PersentFirstYear {
    public double getPersentFirstYear(double sumData, double montMonData, double persentData, String personData) {
        double persentFirstYear;
        if (personData.equals("business")) {
            persentFirstYear = ((sumData - (montMonData * 12)) * (persentData / 100));
        } else
            persentFirstYear = (sumData * (persentData) / 100);
        return persentFirstYear;
    }
}

