package T2022.SummerB.q5;

public class Main {
    public static Status worldStatus(Country[] arr) {
        int c1 = 0, c2 = 0;
        String str = "";
        for (Country country : arr) {
            if (country.getInfected() == 0)
                c1++;
            if (country.getInfected() > country.getDead())
                c2++;
            if (country.getRecovered() > ((country.getInfected() / 2))) {
                str += country.getName();
                str += ", ";
            }
        }
        Status s = new Status(c1, c2, str);
        return s;
    }

    public static void main(String[] args) {
        Country[] countries = new Country[11];
        countries[0] = new Country("Jerusalem", 5367, 2876, 452);
        countries[1] = new Country("Haifa", 3246, 3172, 289);
        countries[2] = new Country("Tel Aviv", 7421, 6850, 876);
        countries[3] = new Country("Eilat", 1289, 1125, 98);
        countries[4] = new Country("Beer Sheba", 2853, 2564, 365);
        countries[5] = new Country("Netanya", 2147, 1875, 236);
        countries[6] = new Country("Ashdod", 3896, 3680, 567);
        countries[7] = new Country("Nazareth", 1812, 198, 240);
        countries[8] = new Country("Tiberias", 994, 134, 180);
        countries[9] = new Country("Herzliya", 1676, 201, 320);
        countries[10] = new Country("Gan Yavne", 0, 0, 40);


        Status n = worldStatus(countries);

        System.out.println("✍️(◔◡◔)✍️(◔◡◔)✍️(◔◡◔)✍️(◔◡◔)✍️(◔◡◔)✍️(◔◡◔)✍️(◔◡◔)✍️(◔◡◔)");
        System.out.println("Number of city's with zero infected people: " + n.getCount1());
        System.out.println("Number of countries where more people recover than die: " + n.getCount2());
        System.out.println("Names of city's with most recovered people: " + n.getNames());
        System.out.print("💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️");
    }
}
