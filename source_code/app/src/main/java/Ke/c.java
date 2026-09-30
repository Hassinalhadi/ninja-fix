package Ke;

import I.aj;
import Oe.p;

/* loaded from: classes2.dex */
public final class c extends aj {
    public final p[] delta;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int i4, p[] pVarArr) {
        super(i4, r1, 1, (byte) 0);
        if (pVarArr != null) {
            int i5 = 1;
            int length = pVarArr.length - 1;
            if (length != 0) {
                for (int i10 = 31; i10 >= 0; i10--) {
                    if (((1 << i10) & length) != 0) {
                        i5 = 1 + i10;
                    }
                }
                throw new IllegalStateException("Empty enum: " + pVarArr.getClass());
            }
            this.delta = pVarArr;
            return;
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
    }

    public final Object echo(int i4) {
        int i5 = (1 << this.charlie) - 1;
        int i10 = this.bravo;
        int i11 = (i4 & (i5 << i10)) >> i10;
        for (p pVar : this.delta) {
            if (pVar.alpha() == i11) {
                return pVar;
            }
        }
        return null;
    }
}
