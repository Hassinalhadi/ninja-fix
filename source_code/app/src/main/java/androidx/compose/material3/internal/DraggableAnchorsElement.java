package androidx.compose.material3.internal;

import d.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.AbstractC2911e0;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "Ls0/F;", "Landroidx/compose/material3/internal/w;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DraggableAnchorsElement<T> extends F {
    public final t alpha;
    public final Xd.l purple;

    public DraggableAnchorsElement(t tVar, Xd.l lVar) {
        K k6 = K.alpha;
        this.alpha = tVar;
        this.purple = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.internal.w, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = K.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DraggableAnchorsElement) {
            DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
            if (!Intrinsics.areEqual(this.alpha, draggableAnchorsElement.alpha) || this.purple != draggableAnchorsElement.purple) {
                return false;
            }
            K k6 = K.alpha;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return K.alpha.hashCode() + ((this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        C2932p c2932p = AbstractC2911e0.alpha;
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        w wVar = (w) rVar;
        wVar.alpha = this.alpha;
        wVar.purple = this.purple;
        wVar.red = K.alpha;
    }
}
