package androidx.compose.foundation.relocation;

import T.r;
import k.C1990b;
import k.C1991c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Ls0/F;", "Lk/c;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BringIntoViewRequesterElement extends F {
    public final C1990b alpha;

    public BringIntoViewRequesterElement(C1990b c1990b) {
        this.alpha = c1990b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.c, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (!Intrinsics.areEqual(this.alpha, ((BringIntoViewRequesterElement) obj).alpha)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "bringIntoViewRequester";
        c2915g0.charlie.bravo(this.alpha, "bringIntoViewRequester");
    }

    @Override // s0.F
    public final void update(r rVar) {
        C1991c c1991c = (C1991c) rVar;
        C1990b c1990b = c1991c.alpha;
        if (c1990b != null) {
            c1990b.alpha.lima(c1991c);
        }
        C1990b c1990b2 = this.alpha;
        if (c1990b2 != null) {
            c1990b2.alpha.bravo(c1991c);
        }
        c1991c.alpha = c1990b2;
    }
}
