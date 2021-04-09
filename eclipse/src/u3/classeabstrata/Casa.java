package u3.classeabstrata;

public class Casa {

    private AnimalDeEstimacao animal;

    public Casa(AnimalDeEstimacao animal) {
        this.animal = animal;
        
        animal.brincar();
        
        animal.serAmigo();
        
        animal.fazerBarulho();
    }

    @Override
    public String toString() {
        return "Casa [animal=" + animal + "]";
    }
    
}
