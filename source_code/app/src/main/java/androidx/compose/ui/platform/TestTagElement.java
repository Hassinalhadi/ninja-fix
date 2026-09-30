package androidx.compose.ui.platform;

import T.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;
import t0.C2939s0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Ls0/F;", "Lt0/s0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestTagElement extends F {
    public final String alpha;

    public TestTagElement(String str) {
        this.alpha = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.s0, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.alpha, ((TestTagElement) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "testTag";
        c2915g0.charlie.bravo(this.alpha, "tag");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((C2939s0) rVar).alpha = this.alpha;
    }
}
