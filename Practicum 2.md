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

## Opdracht 5

### Recursieve relatie
Bij de vermenigvuldiging van twee n-bit getallen, splitsen we de getallen x en y elk op in twee helften:

$$x = x_L \cdot 2^{n/2} + x_R, \quad y = y_L \cdot 2^{n/2} + y_R$$,

waar x_L en x_R respectievelijk de bovenste en onderste n/2 bits van x zijn. Hetzelfde geldt voor y_L en y_R.

De vermenigvuldiging $x \cdot y$ kan dan worden uitgedrukt als:

$$x \cdot y = (x_L \cdot 2^{n/2} + x_R) \cdot (y_L \cdot 2^{n/2} + y_R)$$,

wat uitbreidt naar:

$$x \cdot y = (x_L \cdot y_L) \cdot 2^n + ((x_L \cdot y_R) + (x_R \cdot y_L)) \cdot 2^{n/2} + (x_R \cdot y_R)$$.

Dit vereist vier vermenigvuldigingen:
1. $x_L \cdot y_L$,
2. $x_L \cdot y_R$,
3. $x_R \cdot y_L$,
4. $x_R \cdot y_R$.

Daarnaast zijn er schuifoperaties $(2^n$ en $2^{n/2})$ en optellingen, die elk een lagere complexiteit hebben.

De recursieve relatie is dus:

$$T(n) = 4 \cdot T(n/2) + O(n)$$,

waar O(n) de kosten van optellen en schuiven vertegenwoordigt.

### Recursief algoritme
Hier is een recursief algoritme in pseudocode:

```
function multiply(x, y, n):
    if n == 1:
        return x * y  # Basisgeval: vermenigvuldig 1-bit getallen
    
    // Splits x en y in bovenste en onderste helft
    x_L, x_R = split(x, n/2)
    y_L, y_R = split(y, n/2)
    
    // Recursieve vermenigvuldigingen
    P1 = multiply(x_L, y_L, n/2)
    P2 = multiply(x_L, y_R, n/2)
    P3 = multiply(x_R, y_L, n/2)
    P4 = multiply(x_R, y_R, n/2)
    
    // Combineer resultaten
    return P1 * 2^n + (P2 + P3) * 2^(n/2) + P4
```

### Tijdcomplexiteit
De recursieve relatie $T(n) = 4 \cdot T(n/2) + O(n)$ kan worden opgelost met de Master Theorem:
- a = 4 (aantal recursieve oproepen),
- b = 2 (factor waarmee het probleem wordt verkleind),
- f(n) = O(n) (toevoegende complexiteit).


Volgens de Master Theorem is de oplossing van T(n):

$$T(n) = O(n^{\log_2 4}) = O(n^2)$$.

Dus de tijdcomplexiteit van dit algoritme is $O(n^2)$.
