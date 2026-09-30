package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s0.InterfaceC2558s;

/* loaded from: classes3.dex */
public final class q extends T.r implements InterfaceC2558s {
    public s alpha;

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.alpha, ((q) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.InterfaceC2558s
    public final void jade(s0.an anVar) {
        ArrayList arrayList = this.alpha.hotel;
        if (arrayList.size() <= 0) {
            anVar.charlie();
        } else {
            ao.ad.cyan(arrayList.get(0));
            throw null;
        }
    }

    @Override // T.r
    public final void onAttach() {
        this.alpha.getClass();
    }

    @Override // T.r
    public final void onDetach() {
        s sVar = this.alpha;
        sVar.delta();
        sVar.bravo = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.alpha + ')';
    }
}
