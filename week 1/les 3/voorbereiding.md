### Opgave Product met constructor
```java
class Product{
    private String naam;
    private int prijs;

    public Product(String naam, int prijs){
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam(){
        return this.naam;
    }

    public int getPrijs(){
        return this.prijs;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public void setPrijs(int prijs){
        this.prijs = prijs;
    }
}
```

### Opgave Damsteen deel 1

#### Onderdeel A
```java
class Damsteen{

    private int x, y, kleur, diameter;

    public Damsteen(int x, int y, int kleur, int diameter){
        this.x = x;
        this.y = y;
        this.kleur = kleur;
        this.diameter = diameter;
    }

    public void draw(){
        ellipseMode(CENTER);
        fill(this.kleur);
        ellipse(x, y, diameter, diameter);
    }
}
```
#### Onderdeel B
```java
ArrayList<Damsteen> stenen = new ArrayList<>();

void setup(){
    size(1920, 1080);
    stenen.add(new Damsteen(100, 100, #000000, 30));
    stenen.add(new Damsteen(100, 200, #FFFFFF, 30));
}

void draw(){
    background(#00FF00);
    for(Damsteen s : stenen){
        s.draw();
    }
}

```

### Opgave Student null
In de constructor staat ``naam = naam``. Omdat er twee variablen met de zelfde naam zijn, is het niet eenduidig duidelijk welke variable wordt bedoelt. Er is er een op de stack, en een op de heap. De JVM kiest dan de variable op de STACK. Er wordt twee keer gekozen voor de naam in de stack. Dus er staat naamStack = naamStack. De variable naamHeap wordt niet aangeraakt, is dus niet geinitializeerd en is dus null.
