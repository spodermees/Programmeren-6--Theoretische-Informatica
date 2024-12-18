# Practicum 1

## Opdracht 1

1. start is i = n -1
   voorwaarde is i < n
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

### Bubblesort in pseudocode

1. Loop continu door de lijst met elementen
2. Voor elke iteratie, vergelijk elk paar aangrenzende elementen:
   Als $a[j] > a[j+1]$, verwissel deze twee.
3. Stop wanneer er in een iteratie geen verwisselingen meer nodig zijn.

### Tijdsanalyse
- Buitenste lus: Doorloopt de lijst maximaal n - 1 keer.
- Binnenste lus: Voor elke iteratie van de buitenste lus, worden de resterende n - i - 1 paren vergeleken en mogelijk verwisseld (waarbij i het huidige iteratienummer is van de buitenste lus).

Het totale aantal vergelijkingen in het slechtste geval (wanneer de lijst volledig omgekeerd is) is:

$$(n - 1) + (n - 2) + ... + 1 = \frac{n(n-1)}{2}$$

De verwissel operatie is O(1) en wordt uitgevoerd bij elk paar dat niet correct is gesorteerd. In het slechtste geval gebeurt dit ook $O(n^2)$ keer.
De totale tijdscomplexiteit in het slechtste geval is dus:

$$T(n) = O(n^2)$$

### Conclusie

De tijdscomplexiteit van BubbleSort in het slechtste geval $(O(n^2))$ is gelijk aan die van het vorige algoritme. Echter, BubbleSort kan beter presteren in het beste geval, omdat het afhankelijk is van het aantal benodigde verwisselingen.

## Opdracht 5

Het genereren van alle permutaties van n verschillende voorwerpen betekent dat we een lijst van n! verschillende volgordes van deze n voorwerpen produceren. Laten we de tijdscomplexiteit analyseren:

1. Aantal permutaties:
Het aantal permutaties van n elementen is n!, omdat:

$$n! = n\cdot(n-1)\cdot(n-2)\cdot...\cdot 1$$

2. Per permutatie:
Voor elke permutatie worden de n elementen in een bepaalde volgorde gerangschikt. Meestal vereist dit O(n) werk per permutatie (bijvoorbeeld het opslaan van de permutatie, afdrukken, of toevoegen aan een lijst).

3. Totale tijdcomplexiteit:
Omdat er n! permutaties zijn en elk ervan O(n) werk vereist, is de totale tijdscomplexiteit:

$$T(n) = O(n\cdot n!)$$

De faculteit n! groeit extreem snel. Voor grote waarden van n domineert n! de tijdcomplexiteit, en $n\cdot n!$ wordt nauwelijks merkbaar groter dan n!.

### Conclusie

De tijdcomplexiteit van een algoritme om alle permutaties van n verschillende voorwerpen te genereren is:

$$O(n\cdot n!)$$

## Opdracht 6

De matrix moet in driehoeksvorm geschreven worden. Dit geeft voor de eerste rij (n-1) operaties, omdat dit de bovenste driehoekvorm is wordt bij de tweede rij (n-1 * n-1) dus $(n^2)$, derde rij (n-2 * n-2 ), etc. Dit geeft $O(N^2)$ per rij. We hebben n kolommen dus dit is dan $(n * n^2) = O(n^3)$

## Opdracht 7

### Klassieke schrijfwijze

Voor deze evaluatie moeten:

1. Alle machten van x worden berekend $(x^2, x^3, ..., x^n)$
2. Vervolgens worden deze machten vermenigvuldigd met de bijbehorende coëfficiënten $a_i$
3. Tot slot worden alle termen opgeteld.

Dit vereist:

- n vermenigvuldigingen voor $x^i$(waarbij exponentiële vermenigvuldigingen worden uitgevoerd).
- n vermenigvuldigingen van de coëfficiënten met de resultaten van $x^i$.
- n optellingen om de termen samen te voegen.
De totale tijdscomplexiteit wordt hierdoor $O(n^2)$, omdat de berekening van $x^i$ exponentiële vermenigvuldigingen vereist.

### Horner's regel

Met Horner's regel wordt het aantal berekeningen drastisch verminderd, omdat:

1. De macht van x niet expliciet wordt berekend; in plaats daarvan wordt x telkens opnieuw gebruikt in een iteratief proces.
2. Voor een polynoom van graad n worden precies n vermenigvuldigingen en n optellingen uitgevoerd.

De totale tijdscomplexiteit is $O(n)$, omdat elke stap slechts één vermenigvuldiging en één optelling bevat.

### Efficiëntie

Bij de evaluatie van de polynoom is Horner's regel aanzienlijk efficiënter dan de klassieke vorm, omdat:

1. Minder vermenigvuldigingen: De klassieke methode vereist exponentiële berekeningen (zoals $x^n$), terwijl Horner's regel alleen lineaire vermenigvuldigingen gebruikt.
2. Lagere atomische tijd: Omdat vermenigvuldigingen meer tijd kosten dan optellingen, minimaliseert Horner's regel ook het aantal dure vermenigvuldigingen.

### Conclusie

De snelste schrijfwijze voor de evaluatie van een polynoom is de herschreven vorm volgens de regel van Horner. De tijdscomplexiteit van Horner's regel is $O(n)$, terwijl de klassieke methode $O(n^2)$ is. Daarnaast vermindert Horner's regel ook de kosten door minder vermenigvuldigingen uit te voeren.

## Opdracht 8
### Spellen
Schaken kan op het eerste oog makkelijk lijken maar meestal zit er een ingewikkeld vraagstuk achter waarbij veel vooruit gedacht moet worden.

### Rubiks kubus
Het husselen van een rubiks is makkelijk gedaan alleen het oplossen is lastiger en duurt langer.

## Opdracht 9
### a.

```public class opdr9 {
    public static void main(String[] args) {
        calc(5);
    }

    public static int calc(int n){
        int result = 0;

        for(int i = 1; i<=n; i++){
            result += 2*i - 1;
        }
        System.out.println(result);
        return result;
    }
}

```
### b.

```
Voor n is 5 is resultaat: 25
Voor n is 33 is resultaat: 1089
Voor n is 7 is resultaat: 49
Voor n is 8 is resultaat: 64
Voor n is 13 is resultaat: 169
Voor n is 4 is resultaat: 16
```
### c.

```
public static int korter(int n){
        return n*n;
    }
 ```   

 Resultaten:
 ```
Voor 5
Eerste functie antwoord: 25
Tweede functie antwoord: 25
Voor 33
Eerste functie antwoord: 1089
Tweede functie antwoord: 1089

Voor 7
Eerste functie antwoord: 49
Tweede functie antwoord: 49

Voor 8
Eerste functie antwoord: 64
Tweede functie antwoord: 64

Voor 13
Eerste functie antwoord: 169
Tweede functie antwoord: 169

Voor 4
Eerste functie antwoord: 16
Tweede functie antwoord: 16
 ```

### d.

Functie 1:
- De lus loopt precies n keer.
- Binnen de lus wordt een constante bewerking uitgevoerd: vermenigvuldiging, aftrekken en optelling.
- Deze operaties kosten constante tijd O(1).

Herhalingsfrequentie:
De code binnen de lus herhaalt zich n keer.

Complexiteit:
De tijdcomplexiteit is O(n). 

Functie 2:
- Dit is slechts één vermenigvuldiging, wat een constante tijd kost.

Herhalingsfrequentie:
Er is geen herhaling; de bewerking wordt slechts één keer uitgevoerd.

Complexiteit:
De tijdcomplexiteit is O(1) (constante tijd).