class Laptop {
    String Model;
    int Price;

    public String toString() {
        return Model + " : " + Price;
    }
    public boolean equals(Laptop that){
        return this.Model.equals(that.Model) && this.Price == that.Price;

    }
    // this.Model: the Model field of the current object (laptop).
    //that.Model: the Model field of another object (laptop1).
    
    // next part of code is automatically written by source action called hashCode() and equals() methods
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Model == null) ? 0 : Model.hashCode());
        result = prime * result + Price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (Model == null) {
            if (other.Model != null)
                return false;
        } else if (!Model.equals(other.Model))
            return false;
        if (Price != other.Price)
            return false;
        return true;
    }

    
}

// .toString() = Method inherited from the Object class.
// Used to return a string representation of an object.
// By default, it returns a hash code as a unique identifier.
// It can be overridden to provide meaningful details.

public class toString_Method {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.Model = "dell";
        laptop.Price = 20000;

        Laptop laptop1 = new Laptop();
        laptop1.Model = "dell";
        laptop1.Price = 20000; 

        boolean result = laptop.equals(laptop1);
        System.out.println(result);
        System.out.println(laptop);


    }
}
