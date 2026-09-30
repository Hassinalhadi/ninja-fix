package androidx.compose.material3.pulltorefresh;

import G.s;
import G.t;
import G.v;
import Q0.g;
import T.r;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;
import vf.ad;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "Ls0/F;", "LG/t;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PullToRefreshElement extends F {
    public final boolean alpha;
    public final Function0 purple;
    public final v red;
    public final float silver;

    public PullToRefreshElement(boolean z2, Function0 function0, v vVar, float f5) {
        this.alpha = z2;
        this.purple = function0;
        this.red = vVar;
        this.silver = f5;
    }

    @Override // s0.F
    public final r create() {
        return new t(this.alpha, this.purple, this.red, this.silver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.alpha == pullToRefreshElement.alpha && Intrinsics.areEqual(this.purple, pullToRefreshElement.purple) && Intrinsics.areEqual(this.red, pullToRefreshElement.red) && g.alpha(this.silver, pullToRefreshElement.silver);
    }

    public final int hashCode() {
        int i4;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return Float.floatToIntBits(this.silver) + ((this.red.hashCode() + ((((this.purple.hashCode() + (i4 * 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "PullToRefreshModifierNode";
        Boolean valueOf = Boolean.valueOf(this.alpha);
        o oVar = c2915g0.charlie;
        oVar.bravo(valueOf, "isRefreshing");
        oVar.bravo(this.purple, "onRefresh");
        oVar.bravo(Boolean.TRUE, "enabled");
        oVar.bravo(this.red, "state");
        oVar.bravo(new g(this.silver), "threshold");
    }

    public final String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.alpha + ", onRefresh=" + this.purple + ", enabled=true, state=" + this.red + ", threshold=" + ((Object) g.bravo(this.silver)) + ')';
    }

    @Override // s0.F
    public final void update(r rVar) {
        t tVar = (t) rVar;
        tVar.silver = this.purple;
        tVar.teal = true;
        tVar.white = this.red;
        tVar.yellow = this.silver;
        boolean z2 = tVar.red;
        boolean z10 = this.alpha;
        if (z2 != z10) {
            tVar.red = z10;
            ad.zulu(tVar.getCoroutineScope(), null, null, new s(tVar, null), 3);
        }
    }
}
