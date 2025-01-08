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


## Opdracht 4

## Algoritme 1:  $\text{alg a}(n)\$

```plaintext
1. alg_a(n):resultaat
2. if n > 1 then
3.     return(alg_a(n - 1) + alg_a(n - 1))
4. else return(1)
```

Dit betekent:
- Als \( n = 1 \), geeft het algoritme \( 1 \) terug.
- Als \( n > 1 \), roept het algoritme zichzelf **tweemaal** aan met \( n-1 \) en telt de resultaten op. 

Dit resulteert in een exponentiële groei van het aantal berekeningen.

De formule voor $ \text{alg a}(n) \$ is:

$\text{alg a}(n) = 2 \cdot \text{alg a}(n-1), \quad \text{met } \text{alg a}(1) = 1.$


---

### Berekeningen
Laten we  $\text{alg a}(n)\$ berekenen voor  n = 1, 2, 3, 4, 5.

1. $ \text{alg a}(1) = 1 \$
2. $ \text{alg a}(2) = 2 \cdot \text{alg a}(1) + 2 \cdot \text{alg a}(1) = 2 + 2 = 4 \$
3. $ \text{alg a}(3) = 2 \cdot \text{alg a}(2) + 2 \cdot \text{alg a}(2) = 4 + 4 = 8 \$
4. $ \text{alg a}(4) = 2 \cdot \text{alg a}(3) + 2 \cdot \text{alg a}(3) = 8 + 8 = 16 \$
5. $ \text{alg a}(5) = 2 \cdot \text{alg a}(4) + 2 \cdot \text{alg a}(4) = 16 + 16 = 32 \$

**Resultaat:**  
$\text{alg a}(1, 2, 3, 4, 5) = 1, 4, 8, 16, 32$


---

### Tijdcomplexiteit
De tijdscomplexiteit van $ \text{alg a}(n) \$ wordt bepaald door het feit dat het algoritme zichzelf tweemaal aanroept voor elk niveau van de recursie. Dit leidt tot een exponentiële groei van het aantal aanroepen. 

De recursievergelijking voor de complexiteit is:

$T(n) = 2 \cdot T(n-1).$

Oplossing:

$T(n) = O(2^n).$

##Conclusie: 

De tijdscomplexiteit van $ \text{alg a}(n) \$ is $\( O(2^n) \$.

---

## Algoritme 2: $\text{alg b}(n)\$

```plaintext
1. alg_b(n):resultaat
2. if n > 1 then
3.     return(2 \cdot alg_b(n - 1))
4. else return(1)
```

Dit betekent:
- Als \( n = 1 \), geeft het algoritme \( 1 \) terug.
- Als \( n > 1 \), vermenigvuldigt het algoritme het resultaat van $ \text{alg b}(n-1) \$ met \( 2 \).

De formule voor $ \text{alg b}(n) \$ is:

$\text{alg b}(n) = 2 \cdot \text{alg b}(n-1), \quad \text{met } \text{alg b}(1) = 1.$


---

### Berekeningen
Laten we $ \text{alg b}(n) \$ berekenen voor \( n = 1, 2, 3, 4, 5 \).

1. $ \text{alg b}(1) = 1 \$
2. $ \text{alg b}(2) = 2 \cdot \text{alg b}(1) = 2 \$
3. $ \text{alg b}(3) = 2 \cdot \text{alg b}(2) = 4 \$
4. $ \text{alg b}(4) = 2 \cdot \text{alg b}(3) = 8 \$
5. $ \text{alg b}(5) = 2 \cdot \text{alg b}(4) = 16 \$

**Resultaat:**  

$\text{alg b}(1, 2, 3, 4, 5) = 1, 2, 4, 8, 16$


---

### Tijdcomplexiteit
De tijdscomplexiteit van $ \text{alg b}(n) \$ wordt bepaald door het feit dat het algoritme zichzelf slechts **éénmaal** aanroept per niveau van de recursie. Dit leidt tot een lineaire groei van het aantal aanroepen.

De recursievergelijking voor de complexiteit is:

$T(n) = T(n-1) + O(1).$


Oplossing:

$T(n) = O(n).$

##Conclusie: 
De tijdscomplexiteit van $\text{alg b}(n) \$ is $ O(n) $.

---


