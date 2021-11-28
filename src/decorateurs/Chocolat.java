package decorateurs;

import composants.Boisson;

public class Chocolat extends DecoAbstrait {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {

        return boisson.getDescription()+" au chocolat";
    }

    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }
}
