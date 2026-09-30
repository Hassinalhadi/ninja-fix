package androidx.compose.material;

import T.r;
import kotlin.Metadata;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/MinimumInteractiveModifier;", "Ls0/F;", "Lz/u;", "<init>", "()V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MinimumInteractiveModifier extends F {
    public static final MinimumInteractiveModifier alpha = new MinimumInteractiveModifier();

    private MinimumInteractiveModifier() {
    }

    @Override // s0.F
    public final r create() {
        return new r();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "minimumInteractiveComponentSize";
        c2915g0.charlie.bravo("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // s0.F
    public final /* bridge */ /* synthetic */ void update(r rVar) {
    }
}
