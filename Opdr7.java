public class Opdr7 {
    public static void main(String[] args){
        formule(5);
        korter(5);

        formule(34);
        korter(34);

        formule(69);
        korter(69);

        formule(100);
        korter(100);


    }

    public static double korter(double n){

        double antwoord = 1 - 1.0f / (n + 1);
        System.out.println("Een regel: " + antwoord);
        return antwoord;
    }

    public static double formule(double n){
        double antwoord = 0;

        for(double j = 1; j <= n; j++) antwoord += 1/(j*(j+1));
        System.out.println("Voor n = "+ n + " is de uitkomst: "+ antwoord);
        return antwoord;
    }
}
