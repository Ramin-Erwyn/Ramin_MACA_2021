package td3.visitable;

import td3.visitors.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
