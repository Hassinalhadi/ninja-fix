package s;

import androidx.compose.runtime.ax;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import g.AbstractC1719b;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import q0.z;

/* renamed from: s.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2530i implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ax purple;

    public /* synthetic */ C2530i(ax axVar, int i4) {
        this.alpha = i4;
        this.purple = axVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                z zVar = (z) this.purple.getValue();
                if (zVar != null) {
                    return zVar;
                }
                AbstractC1719b.delta("Required value was null.");
                throw new KotlinNothingValueException();
            case 1:
                z zVar2 = (z) this.purple.getValue();
                if (zVar2 != null) {
                    return zVar2;
                }
                AbstractC1719b.delta("Required value was null.");
                throw new KotlinNothingValueException();
            case 2:
                z zVar3 = (z) this.purple.getValue();
                if (zVar3 != null) {
                    return zVar3;
                }
                AbstractC1719b.delta("Required value was null.");
                throw new KotlinNothingValueException();
            case 3:
                return InputComponentViewKt.bravo(this.purple);
            case 4:
                this.purple.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 5:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
