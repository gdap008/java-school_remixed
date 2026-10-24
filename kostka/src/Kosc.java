public class Kosc {
    public  static int instancja = 0;
    public  String[] obrazy = new String[] {
            "kosc0.png",
            "kosc0.png",
            "kosc0.png",
            "kosc0.png",
            "kosc0.png",
            "kosc0.png",
    };
    public int liczba_oczek;
    public  int identyfikator;
    public boolean czy_dostepna;
    public Kosc(int liczba){
        if (liczba >6 && liczba < 1) {
            liczba =0;
        }
        this.liczba_oczek = liczba;
        this.identyfikator = liczba;
        instancja++;
    }

    public  Kosc() {
        // wzór  na górny[g] i dolny[d] zakres
        // Math.random()*(g-d+1)+d
        int liczba = (int)(Math.random()*6)+1;
        this.liczba_oczek = liczba;
        this.identyfikator = liczba;
        instancja++;
    }

    public  void rzut() {
        int liczba = (int)((Math.random()*6)+1);
        this.liczba_oczek = liczba;
        this.identyfikator = liczba;
    }

    public void blokuj() {
        this.czy_dostepna = false;
    }

    public  String wartosc_wyrzucona() {
        switch (this.liczba_oczek) {
            case 0:
                return "brak rzutu";
            case 1:
                return "brak rzutu";
            case 2:
                return "brak rzutu";
            case 3:
                return "brak rzutu";
            case 4:
                return "brak rzutu";
            case 5:
                return "brak rzutu";
            case 6:
                return "brak rzutu";
        }
        return "błąd";
    }
}
