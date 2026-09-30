package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Q {
    public C0590w alpha;
    public int bravo;
    public C0562a charlie;
    public Xd.l delta;
    public int echo;
    public bv.ag foxtrot;
    public bv.al golf;

    public Q(C0590w c0590w) {
        this.alpha = c0590w;
    }

    public static boolean alpha(ad adVar, bv.al alVar) {
        Intrinsics.charlie(adVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        u0 u0Var = adVar.red;
        if (u0Var == null) {
            u0Var = as.white;
        }
        return !u0Var.alpha(adVar.kilo().foxtrot, alVar.golf(adVar));
    }

    public final boolean bravo() {
        boolean z2;
        if (this.alpha != null) {
            C0562a c0562a = this.charlie;
            if (c0562a != null) {
                z2 = c0562a.alpha();
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final an charlie(Object obj) {
        an sierra;
        C0590w c0590w = this.alpha;
        if (c0590w != null && (sierra = c0590w.sierra(this, obj)) != null) {
            return sierra;
        }
        return an.alpha;
    }

    public final void delta() {
        C0590w c0590w = this.alpha;
        if (c0590w != null) {
            c0590w.f3013h = true;
            c0590w.f3018m.alpha();
        }
        this.alpha = null;
        this.foxtrot = null;
        this.golf = null;
        this.delta = null;
    }

    public final void echo(boolean z2) {
        int i4;
        int i5 = this.bravo;
        if (z2) {
            i4 = i5 | 32;
        } else {
            i4 = i5 & (-33);
        }
        this.bravo = i4;
    }
}
