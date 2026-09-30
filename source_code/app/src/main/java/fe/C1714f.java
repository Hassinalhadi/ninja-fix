package fe;

import java.util.NoSuchElementException;
import kotlin.collections.x;

/* renamed from: fe.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1714f extends x {
    public final int alpha;
    public final int purple;
    public boolean red;
    public int silver;

    public C1714f(int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = i5;
        boolean z2 = false;
        if (i10 <= 0 ? i4 >= i5 : i4 <= i5) {
            z2 = true;
        }
        this.red = z2;
        this.silver = z2 ? i4 : i5;
    }

    @Override // kotlin.collections.x
    public final int alpha() {
        int i4 = this.silver;
        if (i4 == this.purple) {
            if (this.red) {
                this.red = false;
                return i4;
            }
            throw new NoSuchElementException();
        }
        this.silver = this.alpha + i4;
        return i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.red;
    }
}
