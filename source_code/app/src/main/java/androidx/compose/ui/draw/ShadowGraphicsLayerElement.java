package androidx.compose.ui.draw;

import A0.p;
import Q0.g;
import T.r;
import a0.C0361o;
import a0.C0366t;
import a0.as;
import ao.ad;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.F;
import s0.L;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Ls0/F;", "La0/o;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShadowGraphicsLayerElement extends F {
    public final float alpha;
    public final as purple;
    public final boolean red;
    public final long silver;
    public final long teal;

    public ShadowGraphicsLayerElement(float f5, as asVar, boolean z2, long j5, long j6) {
        this.alpha = f5;
        this.purple = asVar;
        this.red = z2;
        this.silver = j5;
        this.teal = j6;
    }

    @Override // s0.F
    public final r create() {
        return new C0361o(new p(22, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return g.alpha(this.alpha, shadowGraphicsLayerElement.alpha) && Intrinsics.areEqual(this.purple, shadowGraphicsLayerElement.purple) && this.red == shadowGraphicsLayerElement.red && C0366t.charlie(this.silver, shadowGraphicsLayerElement.silver) && C0366t.charlie(this.teal, shadowGraphicsLayerElement.teal);
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.purple.hashCode() + (Float.floatToIntBits(this.alpha) * 31)) * 31;
        if (this.red) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (hashCode + i4) * 31;
        int i10 = C0366t.lima;
        return kotlin.p.alpha(this.teal) + ad.whiskey(i5, 31, this.silver);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "shadow";
        g gVar = new g(this.alpha);
        o oVar = c2915g0.charlie;
        oVar.bravo(gVar, "elevation");
        oVar.bravo(this.purple, "shape");
        oVar.bravo(Boolean.valueOf(this.red), "clip");
        oVar.bravo(new C0366t(this.silver), "ambientColor");
        oVar.bravo(new C0366t(this.teal), "spotColor");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb2.append((Object) g.bravo(this.alpha));
        sb2.append(", shape=");
        sb2.append(this.purple);
        sb2.append(", clip=");
        sb2.append(this.red);
        sb2.append(", ambientColor=");
        ad.bronze(this.silver, ", spotColor=", sb2);
        sb2.append((Object) C0366t.india(this.teal));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // s0.F
    public final void update(r rVar) {
        C0361o c0361o = (C0361o) rVar;
        c0361o.alpha = new p(22, this);
        L l10 = AbstractC2555o.echo(c0361o, 2).f13252j;
        if (l10 != null) {
            l10.X(c0361o.alpha, true);
        }
    }
}
