
void main() {
    File plikWyrazy = new File("src/wyrazy.txt");
    ArrayList<String> dane = new ArrayList<>();

    int znaki = 0, wyrazP = 0;

    for (String linia : dane) {
        for (String wyraz : linia.split("\\s+")) {
            if (wyraz.isEmpty()) {
                continue;
            }
            if (wyraz.length() >= 6) {
                znaki++;
            }
            if (wyraz.toLowerCase().startsWith("p")) {
                wyrazP++;
            }
        }
    }

    try {
        FileWriter plik2 = new FileWriter("src/odpowiedzi.txt", true);
        PrintWriter zapis = new PrintWriter(plik2);
        zapis.println("Zadanie 2");
        zapis.println("Liczba wyrazów mających co najmniej 6 znaków to: " + znaki);
        zapis.println("W pliku mamy " + wyrazP + " wyrazów na literę 'p'.");
        zapis.close();
    } catch (IOException e) {
        System.out.println("błąd utworzenia pliku: " + e.getMessage());
    }

}