### Opgave print in main
#### Opgave A
Je probeert een niet-statische methode statisch aan te roepen

#### Opgave B
``` java
public class PrintInMain{
    public static void main(String[] args) {
        print("LOL")
    }
    public static void print(String tekst) {
        System.out.println(tekxt);
    }
}
```
``` java
public class PrintInMain{
    public static void main(String[] args) {
        PrintInMain instance = new PrintInMain();
        instance.print("Hallo Wereld!");
    }
    public void print(String tekst) {
        System.out.println(tekxt);
    }
}
```

#### Opgave C
Methode statisch maken want het is een methode die geen eigenschappen van de klasse gebruikt.

### Opgave student uitbreiden
#### Opgave A
Geen Idee
#### Opgave C
``` java
public void setGeslacht(String geslacht){
    if(!geslacht.equals(Student.MAN) || !geslacht.equals(Sstudent.VROUW)){
        throw new IllegalArgumentException("Onbekend Geslacht");
    }
    this.geslacht = geslacht;
}
```

### Enums

``` java
public class Student {
	private String naam;
	private Geslacht geslacht;

	private static int nStudenten = 0;

	public Student(String naam) {
		this.naam = naam;
		nStudenten++;
	}

	public Geslacht getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(Geslacht geslacht) {
		this.geslacht = geslacht;
	}

	public static int getNStudenten() {
		return nStudenten;
	}

	public String toString() {
		return getNaam();
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}

public enum Geslacht{
    MAN, VROUW, ONBEKEND;
}

```
