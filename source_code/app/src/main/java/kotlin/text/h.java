package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h implements Iterator, Yd.a {
    public final CharSequence alpha;
    public int purple;
    public int red;
    public int silver;
    public int teal;

    public h(CharSequence charSequence) {
        this.alpha = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i5 = this.purple;
        if (i5 != 0) {
            if (i5 != 1) {
                return false;
            }
            return true;
        }
        int i10 = 2;
        if (this.teal < 0) {
            this.purple = 2;
            return false;
        }
        CharSequence charSequence = this.alpha;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i11 = this.red; i11 < length2; i11++) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i4 = i11 + 1) >= charSequence.length() || charSequence.charAt(i4) != '\n') {
                    i10 = 1;
                }
                length = i11;
                this.purple = 1;
                this.teal = i10;
                this.silver = length;
                return true;
            }
        }
        i10 = -1;
        this.purple = 1;
        this.teal = i10;
        this.silver = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.purple = 0;
            int i4 = this.silver;
            int i5 = this.red;
            this.red = this.teal + i4;
            return this.alpha.subSequence(i5, i4).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
