package q6;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class s extends com.google.common.collect.p {
    public final Object purple;
    public boolean red;

    public s(Object obj) {
        super(3);
        this.purple = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.red) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.red) {
            this.red = true;
            return this.purple;
        }
        throw new NoSuchElementException();
    }
}
