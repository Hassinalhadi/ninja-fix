package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Nf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0250h extends D {
    public byte[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        byte[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        byte[] bArr = this.alpha;
        if (bArr.length < i4) {
            int length = bArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
