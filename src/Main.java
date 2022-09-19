import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, sonuc;


        System.out.println("C(n,r)");
        System.out.print("n giriniz : ");
        n = scan.nextInt();
        System.out.print("r giriniz : ");
        r = scan.nextInt();

        sonuc = faktoriyelHesapla(n) / (faktoriyelHesapla(r) * faktoriyelHesapla(n - r));
        System.out.println("C(" + n + "," + r + ") : " + sonuc);

    }

    static int faktoriyelHesapla(int x) {
        int fak = 1;
        for (int i = 1; i <= x; i++) {
            fak *= i;
        }
        return fak;
       /* Scanner inp=new Scanner(System.in);
        System.out.println("Küme eleman sayısını giriniz:");
        int kus=inp.nextInt();
        System.out.println("Kümenin kaç elemanlı kombinasyonu alınacak?");
        int kos= inp.nextInt();

        if(kus>=0&&kos>=0){
            if (kos==0){
                System.out.println(kus+"elemanlı bir kümenin"+kos+"elemanlı kombinasyonu:1");
            }else if(kus==0){
                System.out.println("Bu kümenin kombinasyonu alınamaz!");
            }else if(kus>kos) {
                int l=1;
                for (int i = 1; i <= kus; i++) {
                    l*=i;
                }int b=1;
                for (int k = 1; k <= kos; k++) {
                    b*=k;
                }
                int d=1;
                for (int c = 1; c <= (kus - kos); c++) {
                    d*=c;
                }
                int p=(l / (b * d));
                System.out.println(kus + "elemanlı bir kümenin" + kos + "elemanlı kombinsyonları:" + p);
            }else if(kus==0 || kos==0){
                System.out.println(kus+"elemanlı bir kümenin"+kos+"elemanlı kombinasyonu:1");
            }else if (kus==kos){
                System.out.println(kus+"elemanlı bir kümenin"+kos+"elemanlı kombinasyonu:1");

            }else{
                System.out.println("Bu kümenin kombinasyonu alınamaz!");
            }
        } else {
                System.out.println("Bu kümenin kombinasyonu alınamaz!");
        }*/

    }

}