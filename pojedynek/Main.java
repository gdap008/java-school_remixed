void main() {
    int zycieBossa = 100;
    int zycieGracza = 100;
    int akcjaBossa;
    int iloscStralow = 40;
    boolean MocniejszyBoss = false;
    boolean wygrana = false;
    String akcjaGracza;
    String imieGracza;

    String uiB = "+" + "-".repeat(20) + "+";
    String uiS = "|";
    //System.out.println(uiB + "\n" + uiS + "STARCIE Z BOSSEM\n" + uiB);
    System.out.println("#" + "=".repeat(60) + "#");
    System.out.println("|  |--\\  /-\\  /--  /--      /\\   -+- -+-    /\\    /--  | /   |");
    System.out.println("|  |-<   | |  \\__  \\__     /--\\   |   |    /--\\  |     |<    |");
    System.out.println("|  |__/  \\_/  __/  __/    /    \\  |   |   /    \\  \\__  | \\   |");
    System.out.println("#" + "=".repeat(60) + "#");

    Scanner sc = new Scanner(System.in);
    System.out.println(uiB + "\n" + uiS + "Podaj swoje imie\n" + uiB);
    imieGracza = sc.nextLine();
    if (
            imieGracza.toLowerCase().equals("mario")||
            imieGracza.toLowerCase().equals("han solo")
    ) {
        MocniejszyBoss = true;
        zycieBossa = 150;
    }
    if (imieGracza.toLowerCase().equals("jason bourne")) {
        MocniejszyBoss =true;
        zycieBossa = 200;
        iloscStralow = 20; // ogólnie Autor nie potrafi wygrać z tym warunkiem
    }
    //Rozgrywka
    System.out.println("Walka rozpoczęta!");
    while (true) {
        System.out.println("- Twoje życie: " + zycieGracza);
        System.out.println("- życie bossa: " + zycieBossa);
        System.out.println(imieGracza + ", wybierz Akcje:\n <<  c - Cios,  s - Strzał (" + iloscStralow + "), a - Apteczka  >>");
        akcjaGracza = sc.nextLine();
        switch (akcjaGracza) {
            case "c": {
                zycieBossa = zycieBossa - 5;
                zycieGracza = zycieGracza + 5;
                break;
            }
            case  "s": {
                if (iloscStralow <= 0) {
                    System.out.println("Nie posiadasz pocisków, wykonujesz Cios !!!");
                    zycieBossa = zycieBossa - 5;
                    zycieGracza = zycieGracza + 5;
                } else {
                    zycieBossa = zycieBossa - 20;
                    iloscStralow--;
                }
                break;
            }
            case "a": {
                zycieGracza = zycieGracza + 20;
                break;
            }

        }

        // warunek sprawdzający poprawność wartości
        if (zycieGracza > 100) {
            zycieGracza = 100;
        }

        // Czy Boss został pokonany?
        if (zycieBossa <= 0) {
            System.out.println("+" + "-".repeat(20) + "\n" + "| Brawo " + imieGracza + ", Zwycięstwo!\n" + "+" + "-".repeat(20));
            wygrana = true;
            break;
        }

        // instrukcje wykonywane przez bossa:
        System.out.println("- Twoje życie: " + zycieGracza);
        System.out.println("- życie bossa: " + zycieBossa);
        //boss za pomocą switch losuje liczbe (wybor akcji)
        akcjaBossa = (int)(Math.random() * 3) + 1;
        switch (akcjaBossa) {
            case 1: {
                zycieBossa = zycieBossa + 5;
                zycieGracza = zycieGracza - 5;
                System.out.println("Akcja Bossa: Cios");
                break;
            }
            case 2: {
                zycieGracza = zycieGracza - 20;

                System.out.println("Akcja Bossa: Strzał");
                break;
            }
            case 3: {
                zycieBossa = zycieBossa + 20;
                System.out.println("Akcja Bossa: Apteczka");
                break;
            }

        }

        // Czy gracz został pokonany?
        if (zycieGracza <= 0) {
            System.out.println("+" + "-".repeat(20) + "\n" + "| Przegrana!\n" + "+" + "-".repeat(20));
            break;
        }

        if (!MocniejszyBoss) { // warunek zwykłego
            if (zycieBossa > 100) {
                zycieBossa = 100;
            }
        }else{ // warunek mocniejszego bossa
            if (zycieBossa > 200) {
                zycieBossa = 200;
            }
        }
    }

    System.out.println("Koniec pojedynku");

    if (MocniejszyBoss || wygrana) {
        System.out.println("\nDziękuje za zainteresowanie się moim projektem\n" +
                " Zapraszam do współpracy na platforie GitHub.\n" +
                " Jeśli poszukujesz świezo upieczonych dewoloperów do swojego projektu, Pytaj śmiało!");
        System.out.println("\n eof");
    }

}