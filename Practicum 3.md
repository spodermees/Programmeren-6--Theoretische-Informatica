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
