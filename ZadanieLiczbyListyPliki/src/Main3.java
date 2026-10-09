void main() {
    File plikWyniki = new File("src/wyniki.txt");
    ArrayList<String> dane = new ArrayList<>();

    try {
        Scanner odczyt = new Scanner(plikWyniki);
        while (odczyt.hasNextLine()) {
            dane.add(odczyt.nextLine());
        }

    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
    int srednia = 0;
    String Imie = "";
    int liczbaWynikow = 0;
    int najwyzszyWynik = 0;
    int suma = 0;

    for (String linia : dane) {
        String[] czesci = linia.split(";");
        String imieOsoby = czesci[0].trim();

        int wynik = Integer.parseInt(czesci[1].trim());
        suma += wynik;
        liczbaWynikow++;

        if (liczbaWynikow > 0) {
            srednia = suma / liczbaWynikow;
        }
        if (wynik > najwyzszyWynik) {
            najwyzszyWynik = wynik;
            Imie = imieOsoby;
        }
    }

    try {
        FileWriter plik3 = new FileWriter("src/odpowiedzi.txt", true);
        PrintWriter zapis = new PrintWriter(plik3);
        zapis.println("Zadanie 2");
        zapis.println("Średnia wyników to: " + srednia);
        zapis.println(Imie + " to osoba z najwyższym wynikiem");
        zapis.close();
    } catch (IOException e) {
        System.out.println("błąd utworzenia pliku: " + e.getMessage());
    }
}