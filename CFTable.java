public class CFTable {
    public static void main(String[] args) {
        double faren;



        for (int i = 0; i <= 20; i++){
            faren = (((9.0/5.0) * i) + 32.0);
            System.out.printf("Celsius        Farenheit \n-------------------- \n");
            System.out.println(i + "               " + faren);

        }
    }
}
