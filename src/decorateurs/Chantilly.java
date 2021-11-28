package decorateurs;

import composants.Boisson;

public class Chantilly extends DecoAbstrait {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        
        return boisson.getDescription()+" avec chantilly";
    }

    @Override
    public double cout() {
        return 0.7+boisson.cout();
    }
}
