package Tf;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class am {
    public static final al alpha = new al(new byte[0], 0, 0, false, false);
    public static final int bravo;
    public static final AtomicReference[] charlie;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        bravo = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        charlie = atomicReferenceArr;
    }

    public static final void alpha(al segment) {
        int i4;
        Intrinsics.echo(segment, "segment");
        if (segment.foxtrot == null && segment.golf == null) {
            if (!segment.delta) {
                AtomicReference atomicReference = charlie[(int) (Thread.currentThread().getId() & (bravo - 1))];
                al alVar = alpha;
                al alVar2 = (al) atomicReference.getAndSet(alVar);
                if (alVar2 == alVar) {
                    return;
                }
                if (alVar2 != null) {
                    i4 = alVar2.charlie;
                } else {
                    i4 = 0;
                }
                if (i4 >= 65536) {
                    atomicReference.set(alVar2);
                    return;
                }
                segment.foxtrot = alVar2;
                segment.bravo = 0;
                segment.charlie = i4 + 8192;
                atomicReference.set(segment);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final al bravo() {
        AtomicReference atomicReference = charlie[(int) (Thread.currentThread().getId() & (bravo - 1))];
        al alVar = alpha;
        al alVar2 = (al) atomicReference.getAndSet(alVar);
        if (alVar2 == alVar) {
            return new al();
        }
        if (alVar2 == null) {
            atomicReference.set(null);
            return new al();
        }
        atomicReference.set(alVar2.foxtrot);
        alVar2.foxtrot = null;
        alVar2.charlie = 0;
        return alVar2;
    }
}
