public class opdr9 {
    public static void main(String[] args) {
        calc(5);
    }

    public static int calc(int n){
        int result = 0;

        for(int i = 1; i<=n; i++){
            System.out.println(i);
            result += 2*i - 1;
            System.out.println(result);
        }
        return result;
    }
}
