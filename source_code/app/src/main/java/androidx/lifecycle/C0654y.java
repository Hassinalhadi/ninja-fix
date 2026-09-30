package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0654y {
    public static aa alpha(ab state) {
        Intrinsics.echo(state, "state");
        int i4 = AbstractC0653x.$EnumSwitchMapping$0[state.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return null;
                }
                return aa.ON_PAUSE;
            }
            return aa.ON_STOP;
        }
        return aa.ON_DESTROY;
    }

    public static aa bravo(ab state) {
        Intrinsics.echo(state, "state");
        int i4 = AbstractC0653x.$EnumSwitchMapping$0[state.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 5) {
                    return null;
                }
                return aa.ON_CREATE;
            }
            return aa.ON_RESUME;
        }
        return aa.ON_START;
    }

    public static aa charlie(ab abVar) {
        int i4 = AbstractC0653x.$EnumSwitchMapping$0[abVar.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return null;
                }
                return aa.ON_RESUME;
            }
            return aa.ON_START;
        }
        return aa.ON_CREATE;
    }
}
