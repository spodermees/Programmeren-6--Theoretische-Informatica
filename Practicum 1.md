# Practicum 1

## Opdracht 1

1. start is i = n -1
   voorwaarde is i < $n^2$
   increment is i++
   T(n) = 1, omdat na 1 lus de i groter is dan n

2. start is i+ n - 1
   voorwaarde is I < $n^2$
   increment is i++
   T(n) = $n^2 - n + 1$, dit komt omdat de T(n) afhankelijk is van de start en eind waardes

3. start is i = n
   voorwaarde is i < n
   increment is i++
   T(n) = 0, de startwaarde voldoet niet aan de voorwaarde

4. start is i = 0
   Voorwaarde is i < n
   Increment is niet bekend
   T(n) = ∞ (zonder correctie), aangezien i niet wordt aangepast kan het oneindig lang doorgaan

5. start is i = 0
   voorwaarde is i < n
   increment is i++
   T(n) = n, de lus stopt als i == n

## Opdracht 2

1. T(n) = $17n^3$ - $13n^2$ + 10n 2000 > constante weg > T(n) = $17n^3$ - $13n^2$ + 10n > grootse stijger > $17n^3$ >  $O(n^3)$

2. T(n) = $3^n$ - 13n > grootste stijger > $3^n$ > $O(2^n)$

3. T(n)= $20\log_2 n$ + $n^2$ > grootste stijger > $n^2$ > $O(n^2)$

## Opdracht 3

Wanneer i = 1, loopt j van 2 tot n. Wanneer i = 2, loopt j van 3 tot n. Dit gaat door totdat i = n - 1, waarbij j precies één iteratie uitvoert.
Dus het totale aantal iteraties is:
(n - 1) + (n - 2) + ... + 1

Oftewel:

$$S = \frac{(n - 1)n}{2}$$

De verwissel operatie, met constante tijd, vindt in de binnenste loop plaats, dus dat is de loop die de totale tijd bepaald.

Dus de complete tijdscomplexiteit is:

$$T(n) = O\biggl(\frac{(n-1)n}{2}\biggr) = O(n^2)$$

## Opdracht 4
