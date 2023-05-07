/*
Sukurkite bankomato programą:

Bankomate yra 500 pinigų, naudotojas paleidęs programą yra paprašomas įvesti pin
kodą.

Jei įvestas pin kodas teisingas (teisingas kodas yra “testas”) naudotojas gauna pranešimą, kad sėkmingai prisijungė.

Pin kodo įvedimas tikrinamas 3 kartus. Jeigu 3 kartus įvestas neteisingai, naudotojas gauna pranešimą, kad sąskaita blokuota ir programa sustoja.

Kai naudotojas teisingai įveda pin kodą ("testas"), sistema paklausia ką nori daryti: išgryninti pinigų ar baigti darbą.

Jeigu pasirenkama “išgryninti”, tuomet paprašo įvesti pinigų kiekį, kurį nori išsigryninti. Kiekis negali būti didesnis nei bankomate yra pinigų, jei įveda daugiau, tuomet informuojamas, kad bankomate nėra tiek pinigų ir paprašo įvesti mažesnę sumą.

Įvedus tinkamą sumą, ji yra išgryninama (nuimta pinigų suma minusuojama iš buvusio bankomato likučio) ir parašoma, jog pinigai išgryninti. Tuomet programa vėl klausia ką nori daryti, tol, kol nesibaigia pinigai arba nenusprendžiama baigti darbo.

Pasirinkus baigti darbą, išeinama iš programos.

 */
package Bankomatas;

public class Paleidimas {
    public static void main(String[] args) {
        System.out.println("Sveiki atvykę");
        System.out.println("Įveskite naudotojo PIN kodą:");

        Bankomatas bnkmt = new Bankomatas();
        bnkmt.pradekDarba();
    }
}
