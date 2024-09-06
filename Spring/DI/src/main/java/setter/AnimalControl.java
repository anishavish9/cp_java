package setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalControl {

    private Animal animal;
    @Autowired
    @Qualifier("Cat")

    public String getAnimal() {
        return animal.speaks();

    }

    public void setAnimal(Animal animal) {
        this.animal = animal;

    }
}
