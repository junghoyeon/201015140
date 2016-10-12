class Person {
    private float weight;
    public void setWeight(float w) {
        this.weight=w;
    }
    private float getWeight() {
        return weight;
    }
 }
 
 
 Person m = new Person();
 m.setWeight((float)60.0);
 System.out.println(m.getWeight());