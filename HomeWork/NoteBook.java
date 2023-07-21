

public class NoteBook {
    String name;
    int ram;
    int storageCap;
    String os;
    String color;
    double diagonal;

    public NoteBook (String name, int ram, int storageCap, String os, String color, double diagonal){
        
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }
    
    @Override
    public String toString () {
        return String.format("Название: %s объем оперативной памяти: %d Гб объем накопителя: %d Гб ОС: %s Цвет: %s Диагональ: %.1f",
                    this.name, this.ram, this.storageCap, this.os, this.color, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NoteBook) {
            return this.ram == ((NoteBook) obj).ram && this.storageCap == ((NoteBook) obj).storageCap && this.diagonal == ((NoteBook) obj).diagonal;
        }
        return false;
    }
    public int getRam(){
        return this.ram;
    }
    public int getStorageCap(){
        return this.storageCap;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
}
   