package a3;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public abstract class f {
    public static final X2.b alpha = new X2.b();

    public static final boolean alpha(X2.h hVar) {
        int i4 = e.$EnumSwitchMapping$0[hVar.echo.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            return true;
        }
        if (i4 == 3) {
            if (hVar.yankee.alpha != null || !(hVar.victor instanceof Y2.c)) {
                return false;
            }
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
