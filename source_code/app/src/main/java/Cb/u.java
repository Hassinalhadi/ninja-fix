package Cb;

import androidx.compose.runtime.ax;
import com.checkout.components.rememberme.H1;
import i.C1860i;
import j.C1923f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ax purple;

    public /* synthetic */ u(ax axVar, int i4) {
        this.alpha = i4;
        this.purple = axVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.setValue("");
                return Unit.INSTANCE;
            case 1:
                return (E.g) this.purple.getValue();
            case 2:
                this.purple.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                this.purple.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 5:
                this.purple.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 6:
                this.purple.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 7:
                this.purple.setValue(null);
                return Unit.INSTANCE;
            case 8:
                List list = (List) this.purple.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((Y1.l) obj).purple.alpha, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 9:
                return H1.a(this.purple);
            case 10:
                return H1.b(this.purple);
            case 11:
                return (androidx.compose.foundation.lazy.layout.w) ((Function0) this.purple.getValue()).invoke();
            case 12:
                this.purple.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 13:
                this.purple.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 14:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                this.purple.setValue(null);
                return Unit.INSTANCE;
            case 16:
                this.purple.setValue(null);
                return Unit.INSTANCE;
            case 17:
                this.purple.setValue(null);
                return Unit.INSTANCE;
            case 18:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 19:
                this.purple.setValue(null);
                return Unit.INSTANCE;
            case 20:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 21:
                this.purple.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 22:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 23:
                this.purple.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 24:
                return new C1860i((Function1) this.purple.getValue());
            case 25:
                return new C1923f((Function1) this.purple.getValue());
            case 26:
                this.purple.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 27:
                this.purple.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 28:
                ax axVar = this.purple;
                if (axVar != null) {
                    return (List) axVar.getValue();
                }
                return null;
            default:
                Boolean bool = (Boolean) this.purple.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
