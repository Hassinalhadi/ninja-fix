package coil.compose;

import N2.n;
import N2.w;
import T.f;
import T.r;
import Z.e;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import q0.InterfaceC2392k;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Ls0/F;", "LN2/w;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentPainterElement extends F {
    public final n alpha;
    public final f purple;
    public final InterfaceC2392k red;
    public final float silver;

    public ContentPainterElement(n nVar, f fVar, InterfaceC2392k interfaceC2392k, float f5) {
        this.alpha = nVar;
        this.purple = fVar;
        this.red = interfaceC2392k;
        this.silver = f5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, N2.w] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = this.red;
        rVar.silver = this.silver;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return Intrinsics.areEqual(this.alpha, contentPainterElement.alpha) && Intrinsics.areEqual(this.purple, contentPainterElement.purple) && Intrinsics.areEqual(this.red, contentPainterElement.red) && Float.compare(this.silver, contentPainterElement.silver) == 0 && Intrinsics.areEqual(null, null);
    }

    public final int hashCode() {
        return ad.sierra(this.silver, (this.red.hashCode() + ((this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = Constants.KEY_CONTENT;
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "painter");
        oVar.bravo(this.purple, "alignment");
        oVar.bravo(this.red, "contentScale");
        oVar.bravo(Float.valueOf(this.silver), "alpha");
        oVar.bravo(null, "colorFilter");
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.alpha + ", alignment=" + this.purple + ", contentScale=" + this.red + ", alpha=" + this.silver + ", colorFilter=null)";
    }

    @Override // s0.F
    public final void update(r rVar) {
        w wVar = (w) rVar;
        long mo1getIntrinsicSizeNHjbRc = wVar.alpha.mo1getIntrinsicSizeNHjbRc();
        n nVar = this.alpha;
        boolean alpha = e.alpha(mo1getIntrinsicSizeNHjbRc, nVar.mo1getIntrinsicSizeNHjbRc());
        wVar.alpha = nVar;
        wVar.purple = this.purple;
        wVar.red = this.red;
        wVar.silver = this.silver;
        if (!alpha) {
            AbstractC2555o.golf(wVar).blue();
        }
        AbstractC2557q.india(wVar);
    }
}
