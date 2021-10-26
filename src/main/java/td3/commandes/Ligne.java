package td3.commandes;

import td3.visitable.PrePostVisitable;
import td3.visitable.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {
    private String name;
    private int sum;

    public Ligne(String name) {
        this.name = name;
        this.sum = 0;
    }

    public Ligne(String name, int sum) {
        this(name);
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void accept(PrePostVisitor visitor){
        visitor.preVisit(this);
        visitor.postVisit(this);

    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
