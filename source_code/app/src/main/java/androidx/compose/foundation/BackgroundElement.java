package androidx.compose.foundation;

import T.r;
import a0.AbstractC0362p;
import a0.C0346af;
import a0.C0366t;
import a0.as;
import ao.ad;
import b.C0707w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import s0.AbstractC2557q;
import s0.F;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Ls0/F;", "Lb/w;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackgroundElement extends F {
    public final long alpha;
    public final AbstractC0362p purple;
    public final float red;
    public final as silver;
    public final C2932p teal;

    public BackgroundElement(long j5, C0346af c0346af, as asVar, C2932p c2932p, int i4) {
        j5 = (i4 & 1) != 0 ? C0366t.kilo : j5;
        c0346af = (i4 & 2) != 0 ? null : c0346af;
        this.alpha = j5;
        this.purple = c0346af;
        this.red = 1.0f;
        this.silver = asVar;
        this.teal = c2932p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, b.w] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = this.red;
        rVar.silver = this.silver;
        rVar.teal = 9205357640488583168L;
        return rVar;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !C0366t.charlie(this.alpha, backgroundElement.alpha) || !Intrinsics.areEqual(this.purple, backgroundElement.purple) || this.red != backgroundElement.red || !Intrinsics.areEqual(this.silver, backgroundElement.silver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5 = C0366t.lima;
        int alpha = p.alpha(this.alpha) * 31;
        AbstractC0362p abstractC0362p = this.purple;
        if (abstractC0362p != null) {
            i4 = abstractC0362p.hashCode();
        } else {
            i4 = 0;
        }
        return this.silver.hashCode() + ad.sierra(this.red, (alpha + i4) * 31, 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.teal.getClass();
    }

    @Override // s0.F
    public final void update(r rVar) {
        C0707w c0707w = (C0707w) rVar;
        c0707w.alpha = this.alpha;
        c0707w.purple = this.purple;
        c0707w.red = this.red;
        c0707w.silver = this.silver;
        AbstractC2557q.india(c0707w);
    }
}
