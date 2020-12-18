import java.util.Scanner;

public class Alpha {
    public static int initialRating = 1500;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int q = 0; q < T; q++) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            int[] arr = new int[N];
            int[] arrP = new int[Q];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < Q; i++) {
                arrP[i] = sc.nextInt();
            }
            for (int i = 0; i < Q; i++) {
                for (int j = 0; j < arrP[i]; j++) {
                    initialRating = initialRating + arr[j];
                }
                if(initialRating <= 0){
                    System.out.println("Newbie");
                }
                else if(initialRating <= 1500){
                    System.out.println("Grey");
                }
                else if(initialRating <= 1700){
                    System.out.println("Green");
                }
                else if(initialRating <= 1900){
                    System.out.println("Blue");
                }
                else if(initialRating <= 2000){
                    System.out.println("Indigo");
                }
                else if(initialRating <= 2500){
                    System.out.println("Purple");
                }
                else{
                    System.out.println("Red");
                }
                initialRating = 1500;
            }
        }
    }
}
