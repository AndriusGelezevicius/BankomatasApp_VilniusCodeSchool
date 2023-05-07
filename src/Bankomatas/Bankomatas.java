package Bankomatas;

import java.util.Scanner;

public class Bankomatas {
    Scanner operacijosPasirinkimas = new Scanner(System.in);
    private int likutisBankomate = 500;

    void baikDarba() {
        System.out.println("Darbas baigtas");
    }

    void isgryninkPinigus() {
        System.out.println("Įveskite norimą išgryninti pinigų sumą: ");

        Scanner isgrynintiNorimaPiniguSuma = new Scanner(System.in);
        int ivestaPiniguSuma = isgrynintiNorimaPiniguSuma.nextInt();

        int likutisBanke;
        if(likutisBankomate >= 0 && ivestaPiniguSuma <= likutisBankomate){
            likutisBanke = likutisBankomate - ivestaPiniguSuma;

            System.out.println("Iš bankomato išgryninta: " + ivestaPiniguSuma);
            System.out.println("Bankomate liko: " + likutisBanke);
            likutisBankomate = likutisBanke;
            pasirinkVeiksma();

        }else{
            System.out.println("Bankomate tiek pinigu nera");
            pasirinkVeiksma(); 
        }
    }

    public void pasirinkVeiksma() {
        System.out.println("Kokią operaciją norite atlikti: 1 - išgryninti pinigus, 2 - baigti darbą.");
        int pasirinkimas = operacijosPasirinkimas.nextInt();

        switch (pasirinkimas){
            case 1:
                isgryninkPinigus();
                break;
            case 2:
                baikDarba();
                break;
            default:
                System.out.println("Tokios operacijos nėra!");
                break;
        }
    }

    //:TODO nesuprantu kaip veikia. NEVEIKIA
    public void pradekDarba() {
        Naudotojas naudotojas = new Naudotojas();
        if (naudotojas.tikrinkPin() < 3) {
            pasirinkVeiksma();
        } else {
            System.out.println("Saskaita uzblokuota");
            baikDarba();
        }
    }
}
