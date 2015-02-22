### Opgave Dambord met stenen (A, B)
```java

final int screenWidth = 900;
final int screenHeight = 900;

Dambord bord;

void setup(){
    size(screenWidth, screenHeight);
    bord = new Dambord();
}

void draw(){
  background(0, 255, 0);
  bord.tekenDamstenen();
}


public class Dambord{

    public Damsteen[] stenen = new Damsteen[4];

    private final int steenRadius = 50;
    private final int donkerKleur = color(0, 0, 0);
    private final int lichtKleur = color(255, 255, 255);

    public Dambord(){
        for(int i = 0; i < stenen.length; i++){
            stenen[i] = new Damsteen(steenRadius+i*steenRadius, steenRadius+i*steenRadius, steenRadius, (i % 2 == 0) ? lichtKleur : donkerKleur);
        }
    }

    public void tekenDamstenen(){
        for(Damsteen steen : stenen){
            steen.draw();
        }
    }

}

public class Damsteen{

    private int x, y, radius, coloor;

    public Damsteen(int x, int y, int radius, int coloor){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.coloor = coloor;
    }

    public void draw(){
        fill(this.coloor);
        ellipseMode(CENTER);
        ellipse(this.x, this.y, this.radius, this.radius);
    }
}


```

### Opgave Student op school

#### A
![diagram](https://raw.githubusercontent.com/SijmenHuizenga/OOPD/master/week%202/les%202/stackAndHeap.jpg)
#### B
Voor elke leerling wordt een aparte school aangemaakt in plaats van dat de zelfde shcool wordt doorgegeven.
Dit had ik ook wel kunnen vertellen zonder diagram te tekenen. Nu is er voor niks een boom omgehakt :cry:

#### C
Nee. Het enigge wat nu gebeurt is dat je er zeker van bent dat alle school objecten naar de zelfde String verwijzen.
