import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KoscTest {
    @Test
    public void zakresRzutu() {
        Kosc kostka = new Kosc();
        // testowanie metody rzutu;
        kostka.rzut();
        assertTrue(kostka.liczba_oczek >= 1 && kostka.liczba_oczek <= 6);
    }

    @Test
    public void czyZmianaPrzyNiedostepnosci() {
        Kosc kostka = new Kosc();
        // test czy zmian WARTOsci kosci orxy niedostepnej
        int wartosc_przed = kostka.liczba_oczek;
        kostka.blokuj();
        kostka.rzut();
        int wartosc_po = kostka.liczba_oczek;
        assertEquals(wartosc_przed, wartosc_po);
    }
}
