package b;

import a0.C0366t;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0705u {
    public final Context alpha;
    public final Q0.d bravo;
    public final long charlie;
    public final androidx.compose.foundation.layout.M delta;

    public C0705u(Context context, Q0.d dVar, long j5, androidx.compose.foundation.layout.M m4) {
        this.alpha = context;
        this.bravo = dVar;
        this.charlie = j5;
        this.delta = m4;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (Intrinsics.areEqual(C0705u.class, cls)) {
                Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
                C0705u c0705u = (C0705u) obj;
                if (!Intrinsics.areEqual(this.alpha, c0705u.alpha) || !Intrinsics.areEqual(this.bravo, c0705u.bravo) || !C0366t.charlie(this.charlie, c0705u.charlie) || !Intrinsics.areEqual(this.delta, c0705u.delta)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        int i4 = C0366t.lima;
        return this.delta.hashCode() + ao.ad.whiskey(hashCode, 31, this.charlie);
    }
}
