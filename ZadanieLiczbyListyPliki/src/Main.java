//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // program ma przeanalizować liczby w pliku
    // sprawdza jaka jest największa liczba
    // sprawdza liczby parzyste i je SUMUJE
    // sprawdza ILOŚĆ liczb ujemnych
    // wypisuje wszytko co zostało sprawdzone

    File plik = new File("src/liczby.txt");
    int suma = 0;
    ArrayList<String> dane = new ArrayList<>();

    try {
        Scanner odczyt = new Scanner(plik);
        while (odczyt.hasNextLine()) {
            dane.add(odczyt.nextLine());
        }
        odczyt.close();
    } catch (FileNotFoundException e) {
        System.out.println("błąd: " + e.getMessage());
    }

    int max = Integer.parseInt(dane.getFirst());
    int ujemne = 0;

    for (String element : dane) {
        int liczba = Integer.parseInt(element);

        if (liczba % 2 == 0) {
            suma += liczba;
        }
        if (liczba < 0) {
            ujemne++;
        }

        if (liczba > max) {
            max = liczba;
        }
    }
    try {
        FileWriter wplik = new FileWriter("src/odpowiedz.txt");
        PrintWriter zapis = new PrintWriter(wplik);
        zapis.println("Zadanie 1");
        zapis.println("Największa liczba w pliku liczby.txt to: " + max);
        zapis.println("Suma liczb parzystych to: " + suma);
        zapis.println("W pliku jest " + ujemne + " liczb ujemnych");
        zapis.close();
    } catch (IOException e) {
        System.out.println("błąd utworzenia pliku: " + e.getMessage());
    }
}
