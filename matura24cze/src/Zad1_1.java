public class Zad1_1 {
    public static void main(String[] args) {
        int[] liczba = zmiana(179);
        int k =5;
        int w = 4;
        int dzielnik= liczba.length;
        System.out.println(dzielnik);
        int reszta =(w*k)%dzielnik;
        System.out.println(liczba[liczba.length-reszta]);

        for(int i =0; i<liczba.length; i++){
            System.out.print(liczba[liczba.length-i-1]);
        }
    }
    public static int[] zmiana(int liczba){
        int k = liczba;
        int size = 0;
        while(k!=0){
            size++;
            k=k/2;
        }
        int[] tablica = new int[size];
        for(int i=0; liczba!=0 ;i++){
            if(liczba%2==1){
                tablica[i]=1;
            }else {
                tablica[i]=0;
            }
            liczba = liczba/2;
        }

        return tablica;
    }
}
