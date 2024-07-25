class HondaCity {
    static long price = 10;

    static double onRoadPrice(String city) {
        switch (city) {
            case "Delhi" -> {
                return price + price * 0.1;
            }
            case "Mumbai" -> {
                return price + price * 0.09;
            }
            default -> {
                return price;
            }
        }
    }
}

public class Static_variable {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();

        System.out.println(HondaCity.onRoadPrice("Delhi")); 
        System.out.println(HondaCity.onRoadPrice("Mumbai")); 
        System.out.println(HondaCity.onRoadPrice("Chennai"));
    }
}
