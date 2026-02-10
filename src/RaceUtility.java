public class RaceUtility {

    public static double milesToKm(double miles) {
        return miles * 1.609;
    }

    public static double kmToMiles(double km) {
        return km / 1.609;
    }

    public static String makeProper(String badString) {
        String newString = "";
        for (int i = 1; i <= badString.length(); i++) {
            if (badString.charAt(i - 1) == ' ') {
                newString += Character.upperCase(badString.charAt(i));
            }
        }
    }
}
