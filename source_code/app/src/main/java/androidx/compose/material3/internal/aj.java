package androidx.compose.material3.internal;

import androidx.compose.runtime.ax;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o9.ViewOnTouchListenerC2201a;
import t6.M2;

/* loaded from: classes3.dex */
public final class aj extends Lambda implements Function1 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ float purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(float f5, ax axVar) {
        super(1);
        this.purple = f5;
        this.red = axVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                long j5 = ((Z.e) obj).alpha;
                float delta = Z.e.delta(j5);
                float f5 = this.purple;
                float f10 = delta * f5;
                float bravo = Z.e.bravo(j5) * f5;
                ax axVar = (ax) this.red;
                if (Z.e.delta(((Z.e) axVar.getValue()).alpha) != f10 || Z.e.bravo(((Z.e) axVar.getValue()).alpha) != bravo) {
                    axVar.setValue(new Z.e(M2.alpha(f10, bravo)));
                }
                return Unit.INSTANCE;
            default:
                float f11 = this.purple;
                ViewOnTouchListenerC2201a viewOnTouchListenerC2201a = (ViewOnTouchListenerC2201a) this.red;
                if (f11 != 0.0f) {
                    viewOnTouchListenerC2201a.teal.invoke();
                }
                viewOnTouchListenerC2201a.silver.animate().setUpdateListener(null);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ViewOnTouchListenerC2201a viewOnTouchListenerC2201a, float f5) {
        super(1);
        this.red = viewOnTouchListenerC2201a;
        this.purple = f5;
    }
}
