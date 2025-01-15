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

### Algoritme 1:  $\text{alg a}(n)\$

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

De formule voor $\text{alg a}(n)\$ is:

$\text{alg a}(n) = 2 \cdot \text{alg a}(n-1), \quad \text{met } \text{alg a}(1) = 1.\$


---

### Berekeningen
Laten we  $\text{alg a}(n)\$ berekenen voor  n = 1, 2, 3, 4, 5.

1. $\text{alg a}(1) = 1 \$
2. $\text{alg a}(2) = 2 \cdot \text{alg a}(1) + 2 \cdot \text{alg a}(1) = 2 + 2 = 4 \$
3. $\text{alg a}(3) = 2 \cdot \text{alg a}(2) + 2 \cdot \text{alg a}(2) = 4 + 4 = 8 \$
4. $\text{alg a}(4) = 2 \cdot \text{alg a}(3) + 2 \cdot \text{alg a}(3) = 8 + 8 = 16 \$
5. $\text{alg a}(5) = 2 \cdot \text{alg a}(4) + 2 \cdot \text{alg a}(4) = 16 + 16 = 32 \$

**Resultaat:**  
$\text{alg a}(1, 2, 3, 4, 5) = 1, 4, 8, 16, 32\$


---

### Tijdcomplexiteit
De tijdscomplexiteit van $\text{alg a}(n)\$ wordt bepaald door het feit dat het algoritme zichzelf tweemaal aanroept voor elk niveau van de recursie. Dit leidt tot een exponentiële groei van het aantal aanroepen. 

De recursievergelijking voor de complexiteit is:

$T(n) = 2 \cdot T(n-1).$

Oplossing:

$T(n) = O(2^n).$

Conclusie: 

De tijdscomplexiteit van $\text{alg a}(n) is ( O(2^n)\$.

---

### Algoritme 2: $\text{alg b}(n)\$

```plaintext
1. alg_b(n):resultaat
2. if n > 1 then
3.     return(2 \cdot alg_b(n - 1))
4. else return(1)
```

Dit betekent:
- Als ( n = 1 ), geeft het algoritme ( 1 ) terug.
- Als ( n > 1 ), vermenigvuldigt het algoritme het resultaat van $\text{alg b}(n-1) \$ met \( 2 \).\$

De formule voor $\text{alg b}(n)\$ is:

$\text{alg b}(n) = 2 \cdot \text{alg b}(n-1), \quad \text{met } \text{alg b}(1) = 1.\$


---

### Berekeningen
Laten we $\text{alg b}(n) \$ berekenen voor \( n = 1, 2, 3, 4, 5 \).\$

1. $\text{alg b}(1) = 1 \$
2. $\text{alg b}(2) = 2 \cdot \text{alg b}(1) = 2 \$
3. $\text{alg b}(3) = 2 \cdot \text{alg b}(2) = 4 \$
4. $\text{alg b}(4) = 2 \cdot \text{alg b}(3) = 8 \$
5. $\text{alg b}(5) = 2 \cdot \text{alg b}(4) = 16 \$

**Resultaat:**  

$\text{alg b}(1, 2, 3, 4, 5) = 1, 2, 4, 8, 16\$


---

### Tijdcomplexiteit
De tijdscomplexiteit van $\text{alg b}(n)\$ wordt bepaald door het feit dat het algoritme zichzelf slechts **éénmaal** aanroept per niveau van de recursie. Dit leidt tot een lineaire groei van het aantal aanroepen.

De recursievergelijking voor de complexiteit is:



## Recursieve benadering voor $\(x^p)\$

### Algoritme

1. **Basisgeval**:
   - Als $\(p = 0\): \(x^p = 1\)\$ (want elke macht met exponent 0 is 1).
   - Als $\(p = 1\): \(x^p = x\) (want \(x^1 = x\)).\$

2. **Recursieve stap**:
   - Voor een even exponent $\((p))\$:
     
     $x^p = (x^{p/2})^2$
     
   - Voor een oneven exponent $\((p))\$:
     
     $x^p = x \cdot x^{p-1}$

3. **Tijdcomplexiteit**:
   - Bij elke recursieve stap wordt $\(p)\$ gehalveerd of verminderd met 1. Hierdoor is de diepte van de recursieboom $\(O(\log p))\$.
   - Elke stap voert een constante hoeveelheid werk uit $\((O(1)))\$.
   - De totale tijdcomplexiteit is:
     $O(\log p)$

---

### Pseudocode

```plaintext
RecPow(x, p):
    if p == 0:                          # Basisgeval 1: macht is 0
        return 1
    if p == 1:                          # Basisgeval 2: macht is 1
        return x
    if p is even:                       # Controleer of p even is
        half = RecPow(x, p / 2)         # Bereken de macht van x^(p/2) recursief
        return half * half              # Combineer de resultaten
    else:                               # Als p oneven is
        return x * RecPow(x, p - 1)     # Verminder de macht met 1 en vermenigvuldig met x
```

---

### Implementatie in C++

```cpp
#include <iostream>
using namespace std;

// Recursieve functie om x^p te berekenen
double recPow(double x, int p) {
    // Basisgevallen
    if (p == 0) {
        return 1; // Elke macht met exponent 0 is 1
    }
    if (p == 1) {
        return x; // x^1 = x
    }

    // Als p even is
    if (p % 2 == 0) {
        double half = recPow(x, p / 2); // Recursieve oproep voor x^(p/2)
        return half * half;            // Combineer de resultaten
    } else {
        // Als p oneven is
        return x * recPow(x, p - 1); // Verminder de exponent met 1 en vermenigvuldig met x
    }
}

int main() {
    // Test de functie
    cout << "2^10 = " << recPow(2, 10) << endl; // Verwacht: 1024
    cout << "5^3 = " << recPow(5, 3) << endl;   // Verwacht: 125
    cout << "7^0 = " << recPow(7, 0) << endl;   // Verwacht: 1
    cout << "3^4 = " << recPow(3, 4) << endl;   // Verwacht: 81

    return 0;
}
```

---

### Output

Bij het uitvoeren van de bovenstaande code krijg je de volgende output:

```
2^10 = 1024
5^3 = 125
7^0 = 1
3^4 = 81
```

---

### Tijdcomplexiteitsanalyse

1. **Halvering bij even $\(p)\$**:
   - Als $\(p)\$ even is, wordt de macht telkens door 2 gedeeld, wat de diepte van de recursie beperkt tot $\(O(\log p))\$.

2. **Constante bewerkingen**:
   - Elke stap kost $\(O(1))\$ voor het uitvoeren van één vermenigvuldiging.

3. **Totale tijdcomplexiteit**:
   
   $O(\log p)$

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
Je kan de formule $1\over j(j + 1)$ kan worden omgeschreven naar $1\over j$ - $1\over j + 1$ wat kan worden herschreven tot $ \sum_{j=1}^{n} = 1 - {1\over n + 1}$ . Dus kan de functie worden herschreven tot een enkele regel:
```
public static double korter(double n){

        double antwoord = 1 - 1.0f / (n + 1);
        System.out.println("Een regel: " + antwoord);
        return antwoord;
    }
```

### d
Bewijs:

Herschrijven van $ 1 \over j(j+1)$ na splitsen van breuken wordt het $1 \over j$ - $1 \over j + 1$.

Het wordt totaal:\
$\sum_{j=1}^n =$ $ 1\over j$ - $ 1 \over j+1$\
Verhef de opeenvolgende termen:\
($ 1\over1$- $ 1\over 2$) + ($ 1\over 2$ - $1\over3$) +  . . . + ($1\over n$- $1\over n + 1$)\
Dit kan worden gereduceert tot:\
$1 -$ $ 1\over n + 1$ 
