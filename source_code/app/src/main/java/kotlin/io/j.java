package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements Iterator, Yd.a {
    public String alpha;
    public boolean purple;
    public final /* synthetic */ o red;

    public j(o oVar) {
        this.red = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.alpha == null && !this.purple) {
            String readLine = ((BufferedReader) this.red.bravo).readLine();
            this.alpha = readLine;
            if (readLine == null) {
                this.purple = true;
            }
        }
        if (this.alpha != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.alpha;
            this.alpha = null;
            Intrinsics.checkNotNull(str);
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
