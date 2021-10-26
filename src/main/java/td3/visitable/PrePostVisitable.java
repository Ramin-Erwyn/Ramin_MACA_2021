package td3.visitable;

import td3.visitors.PrePostVisitor;

public interface PrePostVisitable {
    void accept(PrePostVisitor visitor);
}
