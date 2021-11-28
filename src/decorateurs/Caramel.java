package decorateurs;

import composants.Boisson;

public class Caramel extends DecoAbstrait {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {

        return boisson.getDescription()+" au Caramel";
    }

    @Override
    public double cout() {
        return 1.8+boisson.cout();
    }
}
