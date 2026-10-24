void main() {
    Kosc kostka1= new Kosc();
    System.out.println("Kostka " + Kosc.instancja);
    System.out.println("Liczba oczek: " + kostka1.liczba_oczek);
    System.out.println("słownie: " + kostka1.wartosc_wyrzucona());
    System.out.println("nazswa pliku: " + kostka1.obrazy[kostka1.identyfikator]);

    System.out.println("Podaj liczbe dla drugiej kosci");
    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
    scanner.nextLine();
    Kosc kostka2 = new Kosc(liczba);
    System.out.println("Kostka " + Kosc.instancja);
    System.out.println("Liczba oczek: " + kostka2.liczba_oczek);
    System.out.println("słownie: " + kostka2.wartosc_wyrzucona());
    System.out.println("nazswa pliku: " + kostka2.obrazy[kostka1.identyfikator]);

}
