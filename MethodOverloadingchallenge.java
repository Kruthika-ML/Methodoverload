public class MethodOverloadingchallenge {
    public static void main(String[] args) {
        calcFeetandInches(6,4);
        calcFeetandInches(5,5);
        calcFeetandInches(0,18);
        calcFeetandInches(100);
        calcFeetandInches(-10);
    }

    public static double calcFeetandInches(double feet, double inches) {
        if (feet <= 0 || inches <= 0 || inches >= 12) {
            System.out.println("Invalid input");
            return -1;
        }
        double centimeters = (feet * 12) * 2.14;
        centimeters += inches * 2.54;
        System.out.println("Feet " + feet + " inches " + inches + " centimeters " + centimeters);
        return centimeters;
    }

    public static double calcFeetandInches(double inches){
        if(inches<0){
            return-1;
        }

        double feet = (int)inches /12;
        double remainingInches = (int)inches % 12;
        System.out.println(inches+ " Inches is equal to " +feet+ " feet and remaining inches " +inches);
        return calcFeetandInches(feet,remainingInches);
    }

}


