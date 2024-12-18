public class opdr9 {
    public static void main(String[] args) {


        System.out.println("Voor 5");
        calc(5);
        korter(5);

        System.out.println("Voor 33");
        calc(33);
        korter(33);

        System.out.println("Voor 7");
        calc(7);
        korter(7);

        System.out.println("Voor 8");
        calc(8);
        korter(8);

        System.out.println("Voor 13");
        calc(13);
        korter(13);

        System.out.println("Voor 4");
        calc(4);
        korter(4);

        
    }

    public static int calc(int n){
        int result = 0;

        for(int i = 1; i<=n; i++){
            result += 2*i - 1;
        }
        System.out.println("Eerste functie antwoord: "+result);
        return result;
    }

    public static int korter(int n){
        System.out.println("Tweede functie antwoord: "+ n*n);
        return n*n;
    }
}
