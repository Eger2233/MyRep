public class ChewingGum extends Food{
 private String taste = null;
 public ChewingGum(String taste)
 {
     super("ChewingGum", 0.);
     this.taste = taste;

 }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + " вкуса '" + taste.toUpperCase() + "'";
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof ChewingGum)) return false; // Шаг 2
            return taste.equals(((ChewingGum)arg0).taste); // Шаг 3
        } else
            return false;
    }
    public void consume() {
        System.out.println(this + " съедено");

    }


    public Double calculateCalories() {
        if(this.taste.equals("Mint"))
            return 250.;
        if(this.taste.equals("Watermelon"))
            return 200.;
        if(this.taste.equals("Cherry")) {
            return 120.;
        }
        else return this.getCalories();
    }
}
