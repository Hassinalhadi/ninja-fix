package androidx.compose.foundation;

import A0.ac;
import Q0.g;
import Q0.i;
import T.r;
import android.view.View;
import ao.ad;
import b.K;
import b.L;
import b.X;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.F;
import t0.C2915g0;
import y.C3352L;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Ls0/F;", "Lb/K;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MagnifierElement extends F {
    public final com.clevertap.android.sdk.variables.b alpha;
    public final C3352L purple;
    public final X red;

    public MagnifierElement(com.clevertap.android.sdk.variables.b bVar, C3352L c3352l, X x4) {
        this.alpha = bVar;
        this.purple = c3352l;
        this.red = x4;
    }

    @Override // s0.F
    public final r create() {
        return new K(this.alpha, this.purple, this.red);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierElement) {
            com.clevertap.android.sdk.variables.b bVar = ((MagnifierElement) obj).alpha;
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (int) 9205357638345293824L;
        return this.red.hashCode() + ((this.purple.hashCode() + ((((Float.floatToIntBits(Float.NaN) + ad.sierra(Float.NaN, (i4 + ((((Float.floatToIntBits(Float.NaN) + (this.alpha.hashCode() * 961)) * 31) + 1231) * 31)) * 31, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "magnifier";
        com.clevertap.android.sdk.variables.b bVar = this.alpha;
        o oVar = c2915g0.charlie;
        oVar.bravo(bVar, "sourceCenter");
        oVar.bravo(null, "magnifierCenter");
        oVar.bravo(Float.valueOf(Float.NaN), "zoom");
        oVar.bravo(new i(9205357640488583168L), "size");
        oVar.bravo(new g(Float.NaN), "cornerRadius");
        oVar.bravo(new g(Float.NaN), "elevation");
        oVar.bravo(Boolean.TRUE, "clippingEnabled");
    }

    @Override // s0.F
    public final void update(r rVar) {
        K k6 = (K) rVar;
        k6.getClass();
        X x4 = k6.red;
        View view = k6.silver;
        Q0.d dVar = k6.teal;
        k6.alpha = this.alpha;
        k6.purple = this.purple;
        X x5 = this.red;
        k6.red = x5;
        View oscar = AbstractC2557q.oscar(k6);
        Q0.d dVar2 = AbstractC2555o.golf(k6).f13298q;
        if (k6.white != null) {
            ac acVar = L.alpha;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !x5.alpha()) || !g.alpha(Float.NaN, Float.NaN) || !g.alpha(Float.NaN, Float.NaN) || !Intrinsics.areEqual(x5, x4) || !Intrinsics.areEqual(oscar, view) || !Intrinsics.areEqual(dVar2, dVar)) {
                k6.c();
            }
        }
        k6.d();
    }
}
