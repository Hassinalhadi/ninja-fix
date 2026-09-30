package androidx.compose.foundation;

import T.r;
import b.C0704t;
import b.h0;
import com.clevertap.android.sdk.Constants;
import d.C1543m;
import d.InterfaceC1532g0;
import d.K;
import f.C1674k;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2556p;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Ls0/F;", "Lb/h0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollingContainerElement extends F {
    public final InterfaceC1532g0 alpha;
    public final K purple;
    public final boolean red;
    public final C1543m silver;
    public final C1674k teal;
    public final boolean white;
    public final C0704t yellow;

    public ScrollingContainerElement(C0704t c0704t, C1543m c1543m, K k6, InterfaceC1532g0 interfaceC1532g0, C1674k c1674k, boolean z2, boolean z10) {
        this.alpha = interfaceC1532g0;
        this.purple = k6;
        this.red = z2;
        this.silver = c1543m;
        this.teal = c1674k;
        this.white = z10;
        this.yellow = c0704t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b.h0, T.r, s0.p] */
    @Override // s0.F
    public final r create() {
        ?? abstractC2556p = new AbstractC2556p();
        abstractC2556p.red = this.alpha;
        abstractC2556p.silver = this.purple;
        abstractC2556p.teal = this.red;
        abstractC2556p.white = this.silver;
        abstractC2556p.yellow = this.teal;
        abstractC2556p.f3300a = this.white;
        abstractC2556p.f3301b = this.yellow;
        return abstractC2556p;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ScrollingContainerElement.class == obj.getClass()) {
                ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
                if (Intrinsics.areEqual(this.alpha, scrollingContainerElement.alpha) && this.purple == scrollingContainerElement.purple && this.red == scrollingContainerElement.red && Intrinsics.areEqual(this.silver, scrollingContainerElement.silver) && Intrinsics.areEqual(this.teal, scrollingContainerElement.teal) && Intrinsics.areEqual(null, null) && this.white == scrollingContainerElement.white && Intrinsics.areEqual(this.yellow, scrollingContainerElement.yellow)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int hashCode = (this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        int i11 = 1237;
        if (this.red) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = (((hashCode + i4) * 31) + 1237) * 31;
        int i13 = 0;
        C1543m c1543m = this.silver;
        if (c1543m != null) {
            i5 = c1543m.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i12 + i5) * 31;
        C1674k c1674k = this.teal;
        if (c1674k != null) {
            i10 = c1674k.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 961;
        if (this.white) {
            i11 = 1231;
        }
        int i16 = (i15 + i11) * 31;
        C0704t c0704t = this.yellow;
        if (c0704t != null) {
            i13 = c0704t.hashCode();
        }
        return i16 + i13;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "scrollingContainer";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "state");
        oVar.bravo(this.purple, Constants.KEY_ORIENTATION);
        oVar.bravo(Boolean.valueOf(this.red), "enabled");
        oVar.bravo(Boolean.FALSE, "reverseScrolling");
        oVar.bravo(this.silver, "flingBehavior");
        oVar.bravo(this.teal, "interactionSource");
        oVar.bravo(null, "bringIntoViewSpec");
        oVar.bravo(Boolean.valueOf(this.white), "useLocalOverscrollFactory");
        oVar.bravo(this.yellow, "overscrollEffect");
    }

    @Override // s0.F
    public final void update(r rVar) {
        K k6 = this.purple;
        boolean z2 = this.red;
        C1674k c1674k = this.teal;
        ((h0) rVar).g(this.yellow, this.silver, k6, this.alpha, c1674k, this.white, z2);
    }
}
