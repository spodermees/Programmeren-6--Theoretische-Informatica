# Practicum 2

## Opdracht 1

Het totale aantal verbindingslijntjes tussen n punten kan worden berekend door het aantal unieke paren te bepalen. Het aantal manieren om twee punten te kiezen uit n punten is gegeven door de combinatie:

$$\binom{n}{2} = \frac{n(n-1)}{2}$$

### Recursieve benadering:
- Als je n punten hebt, voeg je één nieuw punt toe aan n-1 punten. Dit nieuwe punt verbindt met elk van de bestaande n-1 punten.
- Het aantal nieuwe verbindingslijntjes is gelijk aan n-1.
- De recursieve relatie wordt dan:

$$a_n = a_{n-1} + (n-1)$$,

met de basisvoorwaarde:
$$a_2 = 1, \quad \text{omdat er tussen 2 punten slechts 1 verbindingslijntje is.}$$

## Opdracht 2

```
int faculteit(int n) {
    int resultaat = 1; // Startwaarde
    for (int i = 1; i <= n; i++) {
        resultaat *= i; // Vermenigvuldig met het huidige getal
    }
    return resultaat;
}
```
### Uitleg
Startwaarde: De variabele resultaat begint bij 1, aangezien de faculteit van 0 (en de basis van vermenigvuldiging) gelijk is aan 1.

Lus: Een for-lus wordt gebruikt om door alle getallen van 1 tot n te itereren. Elk getal wordt vermenigvuldigd met resultaat.

Teruggave: Aan het einde van de lus bevat resultaat de faculteit van n.

Met deze iteratieve aanpak wordt het stapelgeheugen niet belast door recursieve oproepen, wat het efficiënter maakt voor grote waarden van n.

## Opdracht 3


## Opdracht 7

### a
```
    public static double formule(double n){
        double antwoord = 0;

        for(double j = 1; j <= n; j++) antwoord += 1/(j*(j+1));
        System.out.println("Voor n = "+ n + " is de uitkomst: "+ antwoord);
        return antwoord;
    }
```
### b
Resultaten:

```
Voor n = 5.0 is de uitkomst: 0.8333333333333334
Voor n = 34.0 is de uitkomst: 0.9714285714285712
Voor n = 69.0 is de uitkomst: 0.9857142857142854
Voor n = 100.0 is de uitkomst: 0.9900990099009898
```

### c
Je kan de formule $1\over j(j + 1)$ kan worden omgeschreven naar $ 1 \over j$ - $ 1 \over j + 1$ wat kan worden herschreven tot $ \sum_{j=1}^{n} = 1 - {1\over n + 1}$ . Dus kan de functie worden herschreven tot een enkele regel:
```
public static double korter(double n){

        double antwoord = 1 - 1.0f / (n + 1);
        System.out.println("Een regel: " + antwoord);
        return antwoord;
    }
```

### d
Bewijs:

herschrijven van $ 1 \over j(j+1)$ na splitsen van breuken wordt het $1 \over j$ - $1 \over j + 1$.

Het wordt totaal:\
$\sum_{j=1}^n =$ $ 1\over j$ - $ 1 \over j+1$\
Verhef de opeenvolgende termen:\
