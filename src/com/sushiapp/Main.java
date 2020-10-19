package com.sushiapp;

import javax.imageio.IIOException;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends JPanel{
    public static void main(String[] args) {

        FabrykaSushi fabrykaSushi = FabrykaSushi.getInstance();
            System.out.println("Zestawy:");

            Sushi[] sushiTab = new Sushi[]{
                    new SushiCalifornia("Zestaw 1: Sushi California", "losos"),
                    new SushiNigiri("Zestaw 2: Sushi Nigiri", "tunczyk", true),
                    new SushiSpecial("Zestaw 3: Sushi Special", 1)
            };

            for (int i = 0; i < sushiTab.length; i++) {
                Sushi sushi = sushiTab[i];
                System.out.println(i + ": " + sushi + ", Cena za zestaw 1: " + sushi.getPrice());
            }

            Scanner scanner = new Scanner(System.in);
            List<ZamowieniePozycja> pozycje = new ArrayList<>();

            while (true) {
                System.out.println("Podaj numer zestawu:");
                int numerZestawu = scanner.nextInt();
                if (numerZestawu == -1) {
                    break;
                }
                System.out.println("Ile sztuk:");
                int ilosc = scanner.nextInt();
                if (ilosc == 0) {
                    continue;
                }
                Sushi zaznaczoneSushi = sushiTab[numerZestawu];
                System.out.println(
                        "Zamówiony zestaw: " + zaznaczoneSushi +
                                ", Ilość: " + ilosc +
                                ", cena: " + (zaznaczoneSushi.getPrice() * ilosc)
                );
                ZamowieniePozycja pozycja = new ZamowieniePozycja();
                pozycja.ilosc = ilosc;
                pozycja.sushi = zaznaczoneSushi;
                pozycje.add(pozycja);

                System.out.println("Czy dodać inny zestaw? Wpisz numer zestawu lub -1 w celu zakończenia zamówienia.");

            }
            zapiszRachunekDoPliku(pozycje);
        }


            public static void zapiszRachunekDoPliku(List<ZamowieniePozycja> pozycje) {
            File file = new File("rachunek101.txt"); // Path
            try {
                if (file.exists()) file.delete();
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter fileWriter = new FileWriter(file)) {
                for (ZamowieniePozycja pozycja : pozycje){
                    fileWriter.write(pozycja.sushi + " ilosc: " + pozycja.ilosc + "\n");
                }
            } catch (IIOException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
