public class MainA3 {
    public static void main(String[] args) {
        CrackerPacker matt = new CrackerPacker("Matt", 2000, 100, 1.55);
        System.out.println(matt.getName());
        System.out.println(matt.getNumberOfBoxes());
        System.out.println(matt.getWage());
        System.out.println("£" + matt.finalWage());

    }
}
