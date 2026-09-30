package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/j;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoxChildDataElement extends s0.F {
    public final T.k alpha;
    public final boolean purple;
    public final C2932p red;

    public BoxChildDataElement(T.k kVar, boolean z2, C2932p c2932p) {
        this.alpha = kVar;
        this.purple = z2;
        this.red = c2932p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, androidx.compose.foundation.layout.j] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        return rVar;
    }

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this != obj) {
            if (obj instanceof BoxChildDataElement) {
                boxChildDataElement = (BoxChildDataElement) obj;
            } else {
                boxChildDataElement = null;
            }
            if (boxChildDataElement != null && Intrinsics.areEqual(this.alpha, boxChildDataElement.alpha) && this.purple == boxChildDataElement.purple) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.purple) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.red.getClass();
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        C0544j c0544j = (C0544j) rVar;
        c0544j.alpha = this.alpha;
        c0544j.purple = this.purple;
    }
}
