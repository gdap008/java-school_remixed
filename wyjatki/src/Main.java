//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int liczba1, liczba2;
    int wynik;
    liczba1 = 5;
    liczba2 = 0;
    try {
        wynik = liczba1 / liczba2;
        System.out.println(wynik);
    }catch (ArithmeticException e) {
        System.out.println("Wystąpił błąd dzielenia przez zero");
    }finally {
        System.out.println("koniec obsługi wyjątku");
    }
    System.out.println("inne instrukcje");
    int[] x = new int[]{1, 2, 3, 4};
    try {
        System.out.println(x[4]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }

    File plik = new File("src/dane.txt");
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
    System.out.println("Suma to : " + suma);

    // obliczanie sumy
    int max = Integer.parseInt(dane.getFirst());
    for (String element : dane) {
        int liczba = Integer.parseInt(element);
        suma =+ Integer.parseInt(element);
        if (liczba > max) {
            max = liczba;
        }
    }
    System.out.println(suma);

    try {
        FileWriter wplik = new FileWriter("src/odp.txt", true);
        PrintWriter zapis = new PrintWriter(wplik);
        zapis.println("Kopia dane.txt!!!");
        for (String element : dane) {
            zapis.println(element);
        }
        zapis.close();
    } catch (IOException e) {
        System.out.println("błąd utworzenia pliku: " + e.getMessage());
    }

}
