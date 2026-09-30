package Af;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class p {

    @NotNull
    private volatile AtomicReferenceArray<Object> array;

    public p(int i4) {
        this.array = new AtomicReferenceArray<>(i4);
    }

    public final int alpha() {
        return this.array.length();
    }

    public final Object bravo(int i4) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i4 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i4);
        }
        return null;
    }

    public final void charlie(int i4, Cf.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i4 < length) {
            atomicReferenceArray.set(i4, aVar);
            return;
        }
        int i5 = i4 + 1;
        int i10 = length * 2;
        if (i5 < i10) {
            i5 = i10;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i5);
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i4, aVar);
        this.array = atomicReferenceArray2;
    }
}
