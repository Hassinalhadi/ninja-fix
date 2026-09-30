package t0;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ac extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ad purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(ad adVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = adVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                ad adVar = this.purple;
                return Boolean.valueOf(adVar.delta.getParent().requestSendAccessibilityEvent(adVar.delta, (AccessibilityEvent) obj));
            default:
                C2933p0 c2933p0 = (C2933p0) obj;
                ad adVar2 = this.purple;
                adVar2.getClass();
                if (c2933p0.purple.contains(c2933p0)) {
                    adVar2.delta.getSnapshotObserver().alpha(c2933p0, adVar2.ivory, new qa.j(5, c2933p0, adVar2));
                }
                return Unit.INSTANCE;
        }
    }
}
