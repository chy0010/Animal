public class Dog extends Animal {
    private int legs;
    private int tail=1;

   public Dog(){
        super();
    }

    public Dog (int legs,String type,String size,double weight){
        super(type,size,weight);
        this.legs=legs;
    }
    public Dog(String type,String size,double weight){
       this(4,type,size,weight);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "legs=" + legs +
                ", tail=" + tail +
                '}';
    }
}
