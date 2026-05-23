public class Zad2_2 {
    public static int licznik=0;
    public static void main(String[] args) {
        System.out.println(funkcja(255));
        System.out.println(licznik);

    }
    public static int funkcja(int x){
        licznik++;
        if(x==0){
            return 0;
        }else {
            return 2+funkcja(x/2);
        }
    }
}
