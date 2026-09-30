package androidx.compose.ui.viewinterop;

import T.r;
import kotlin.Metadata;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;", "Ls0/F;", "LT0/s;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusTargetPropertiesElement extends F {
    public static final FocusTargetPropertiesElement alpha = new FocusTargetPropertiesElement();

    private FocusTargetPropertiesElement() {
    }

    @Override // s0.F
    public final r create() {
        return new r();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -659549572;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "FocusTargetProperties";
    }

    @Override // s0.F
    public final /* bridge */ /* synthetic */ void update(r rVar) {
    }
}
