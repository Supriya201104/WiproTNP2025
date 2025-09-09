import java.util.HashSet;


public class Solution1 {
    HashSet<String> H1 = new HashSet<>();
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        }
        return null;
    }

    public static void main(String[] args) {
        Solution1 obj1 = new Solution1();
        obj1.saveCountryNames("India");
        obj1.saveCountryNames("Australia");

        System.out.println(obj1.getCountry("India"));
        System.out.println(obj1.getCountry("Russia"));
    }
}
