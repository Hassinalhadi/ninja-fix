package Ke;

import I.aj;

/* loaded from: classes2.dex */
public final class b extends aj {
    public final Boolean echo(int i4) {
        boolean z2 = true;
        if ((i4 & (1 << this.bravo)) == 0) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
