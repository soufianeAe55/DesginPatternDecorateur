import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;
import decorateurs.Caramel;
import decorateurs.Chocolat;
import decorateurs.Vanille;

public class App {
    public static void main(String[] args) {
        Boisson boisson= new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------");
        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------");
        boisson=new Vanille(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------");
        boisson=new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson=new Vanille(new Chocolat(new Caramel(new Sumatra())));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
