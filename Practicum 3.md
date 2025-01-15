## Opdracht 1

 Schrijf een programma dat bepaalt of het vermoeden van Collatz opgaat
voor een gegeven natuurlijk getal n
```cpp
#include <iostream>

// Functie die het aantal stappen bijhoudt om het vermoeden van Collatz te bereiken
int collatzSteps(int n) {
    int steps = 0;  // Teller voor het aantal stappen
    
    // Blijf de Collatz-operaties uitvoeren totdat n 1 wordt
    while (n != 1) {
        if (n % 2 == 0) {
            n = n / 2; // Als n even is, deel het door 2
        } else {
            n = 3 * n + 1; // Als n oneven is, vermenigvuldig het met 3 en tel er 1 bij op
        }
        steps++; // Verhoog de stap teller
    }
    return steps; // Retourneer het aantal stappen
}

int main() {
    int n;
    
    // Vraag de gebruiker om een getal in te voeren
    std::cout << "Voer een natuurlijk getal in: ";
    std::cin >> n;

    // Bereken het aantal stappen en geef het resultaat weer
    int steps = collatzSteps(n);
    std::cout << "Het vermoeden van Collatz gaat op voor " << n << ".\n";
    std::cout << "Het aantal stappen om 1 te bereiken is: " << steps << ".\n";

    return 0;
}
```

 Schrijf een programma dat bepaalt of het vermoeden van Collatz opgaat
voor de getallen 1 t/m 1000

```cpp
#include <iostream>

// Functie die het aantal stappen bijhoudt om het vermoeden van Collatz te bereiken
int collatzSteps(int n) {
    int steps = 0;  // Teller voor het aantal stappen
    
    // Blijf de Collatz-operaties uitvoeren totdat n 1 wordt
    while (n != 1) {
        if (n % 2 == 0) {
            n = n / 2; // Als n even is, deel het door 2
        } else {
            n = 3 * n + 1; // Als n oneven is, vermenigvuldig het met 3 en tel er 1 bij op
        }
        steps++; // Verhoog de stap teller
    }
    return steps; // Retourneer het aantal stappen
}

int main() {
    // Loop voor getallen van 1 tot 1000
    for (int n = 1; n <= 1000; n++) {
        int steps = collatzSteps(n);
        std::cout << "Getal: " << n << " | Aantal stappen om 1 te bereiken: " << steps << std::endl;
    }

    return 0;
}
```
 Bij elk van deze getallen ontstaat een rij van getallen die, volgens het
vermoeden van Collatz, eindigt bij 1.
Als het een vraag is dan ja en anders Waar.

 Welk getal (≤ 1000) levert de langste rij op?
871 

 Hoe lang is die rij?
met 178 stappen

## Opdracht 6 
Een praktisch voorbeeld van het knoopgewogen graaf probleem is: 'het Transportnetwerk van een stad.'

Een stad heeft verschillende knooppunten met belangrijke locaties denct winkelcentra, stations, ziekenhuis, etc. En het gewicht van een knoop kan bijvoorbeeld de populate, de (gemiddelde) reistijd zijn.

### Gedetailleerd voorbeld 

Wijken in de stad:

Knoop A: Wijk "Centrum" heeft een gewicht van 5000 (aantal bewoners).

Knoop B: Wijk "Oost" heeft een gewicht van 3000 (aantal bewoners).

Knoop C: Wijk "Zuid" heeft een gewicht van 2000 (aantal bewoners).

Belang van een winkelcentrum:

Knoop D: Winkelcentrum "City Mall" heeft een gewicht van 10000 (aantal bezoekers per dag).

Knoop E: Winkelcentrum "Mega Plaza" heeft een gewicht van 8000 (aantal bezoekers per dag).

Ziekenhuislocaties:

Knoop F: Ziekenhuis "Stadziekenhuis" heeft een gewicht van 5000 (aantal patiënten per maand).

Knoop G: Ziekenhuis "Zuidkliniek" heeft een gewicht van 4000 (aantal patiënten per maand).

Verbindingen:

De verbindingen tussen de knopen zouden de wegen of openbaar vervoersverbindingen kunnen vertegenwoordigen. Bijvoorbeeld:

Er is een verbinding tussen "Centrum" (A) en "Oost" (B) die bijvoorbeeld 20 minuten duurt.

Er is een verbinding tussen "City Mall" (D) en "Zuid" (C) die 15 minuten duurt.

Gewogen graaf:

Knoop A (Centrum): Gewicht 5000 (populatie)

Knoop B (Oost): Gewicht 3000 (populatie)

Knoop C (Zuid): Gewicht 2000 (populatie)

Knoop D (City Mall): Gewicht 10000 (bezoekers)

Knoop E (Mega Plaza): Gewicht 8000 (bezoekers)

Knoop F (Stadziekenhuis): Gewicht 5000 (patiënten)

Knoop G (Zuidkliniek): Gewicht 4000 (patiënten)

In dit voorbeeld gebruiken we de reistijd tussen de knopen als het gewicht:

Verbinding A -> B (Centrum -> Oost): 10 minuten

Verbinding B -> C (Oost -> Zuid): 15 minuten

Verbinding C -> D (Zuid -> City Mall): 20 minuten

Verbinding D -> E (City Mall -> Mega Plaza): 5 minuten

Verbinding F -> G (Stadziekenhuis -> Zuidkliniek): 25 minuten

##Opdracht 9
Een boom is een graaf die samenhangend(er is een pad tussen elke twee knopen) en acyclisch(er zijn geen cycli) is.

Een boom met n knopen heeft altijd $n - 1$ takken. Dit is een algemen eigenschap van bomen.

stel je voor dat je een boom hebt met n knopen.

Elke keer als je een nieuwe knoop toevoegt aan een boom moet je deze knoop verbinden met een bestaande knoop met 1 tak. Dit betekent dat de boom met n knopen precies $n-1$ takken nodig heeft om alles te verbinden zonder een cyclus te vormen. 
Als je 1 knoop hebt betekent dat je geen tak nodig hebt om hem te verbinden met een andere knoop.
