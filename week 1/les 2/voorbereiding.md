### Opgave geheugenmodel volgorde

Globale variable plaatsen
stack frame plaatsen
Locale variable plaatsen
Locale variable een waarde geven
return waarde kopiëren
stack frame verwijderen

### Opgave Pijl in het geheugenmodel

#### Onderdeel A
Een pijl is een verwijzing van de ene plek naar de andere. Als van hok A naar hok B een pijl staat, dan staat er in A een referentie naar B. A heeft dus de zelfde waarde als B.

#### Onderdeel B
In het geheugenmodel gaat bij een variable of array gaat de pijl altijd vanuit de variable of array naar een ander geheugenadres. De pijl heet dan een referentie.

### Opgave Geheugenmodel van doeKeerTwee

#### Onderdeel A
![stack and heep picture 1](https://raw.githubusercontent.com/SijmenHuizenga/OOPD/master/week%201/les%202/stackAndHeap_onderdeelA.png)

#### Onderdeel B
![stack and heep picture 2](https://raw.githubusercontent.com/SijmenHuizenga/OOPD/master/week%201/les%202/stackAndHeap_onderdeelB.png)

#### Onderdeel C
In code van A verandert de globale variable niet omdat de waarde die wrodt doorgegeven aan de functie wordt gekopiëerd. Bij code van B verandert de globale variable wel omdat er aan de functie een verwijzing naar de globale variable wordt meegegeven. De functie gaat dan de globale variable veranderet.
