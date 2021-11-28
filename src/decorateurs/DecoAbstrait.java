package decorateurs;

import composants.Boisson;

public abstract class DecoAbstrait extends Boisson {
    protected Boisson boisson;

    public DecoAbstrait(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract  String getDescription() ;
}
