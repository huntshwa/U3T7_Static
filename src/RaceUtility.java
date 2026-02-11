public class RaceUtility {

    public static double milesToKm(double miles) {
        return miles * 1.609;
    }

    public static double kmToMiles(double km) {
        return km / 1.609;
    }

    public static String makeProper(String badString) {
        String newString = "";
        for (int i = 0; i < badString.length(); i++) {
            if (i == 0) newString += badString.substring(i, i + 1).toUpperCase();
            else if (badString.charAt(i - 1) == ' ') {
                newString += Character.toUpperCase(badString.charAt(i));
            }
            else newString += Character.toLowerCase(badString.charAt(i));
        }

        return newString;
    }
}
