### Opgave Damsteen deel 3 (A,B,C,D)
```java

final int screenWidth = 900, screenHeight = 900;
Damsteen[] stenen = new Damsteen[4];

void setup(){
    size(screenWidth, screenHeight);
    for(int i = 0; i < stenen.length; i++){
        stenen[i] = new Damsteen(50+i*50, 50+i*50, 50, (i % 2 == 0) ? color(255, 255, 255) : color(0, 0, 0));
    }
}

void draw(){
  background(0, 255, 0);
    for(Damsteen steen : stenen){
        steen.draw();
    }
}

void mousePressed(){
    for(Damsteen steen : stenen){
        steen.checkSelected(mouseX, mouseY);
    }
}

public class Damsteen{

    private final int selectedWeight = 5;
    private final int selectedColor = color(255, 0, 0);

    private int x, y, radius, coloor;
    private boolean selected;

    public Damsteen(int x, int y, int radius, int coloor){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.coloor = coloor;
    }

    public void draw(){
        fill(this.coloor);
        stroke(selectedColor);
        if(selected)
          strokeWeight(selectedWeight);
        else
          noStroke();
        ellipseMode(CENTER);
        ellipse(this.x, this.y, this.radius, this.radius);
    }

    public void checkSelected(int moseX, int moseY){
        this.selected = dist(this.x, this.y, moseX, moseY) <= radius/2;
    }

    public boolean isSelected(){
        return this.selected;
    }
}


```

### Opgave Slider deel 1 (A, B)

```java

void setup() {
    Slider testSlider = new Slider(123, 321, 456, 654, 852);
    println(testSlider);
}

public class Slider{

    private int x, y, breedte, hoogte, nPosities;

    public Slider(int x, int y, int breedte, int hoogte, int nPosities){
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.nPosities = nPosities;
    }

    public String toString(){
        return "Slider[x="+x+";y="+y+";breedte="+breedte+";hoogte="+hoogte+";nPosities="+nPosities+";]";
    }
}

```
