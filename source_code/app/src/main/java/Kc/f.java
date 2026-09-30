package Kc;

import com.app.network.network.models.ActiveSuspension;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SuspensionViewModel purple;

    public /* synthetic */ f(SuspensionViewModel suspensionViewModel, int i4) {
        this.alpha = i4;
        this.purple = suspensionViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.alpha) {
            case 0:
                ActiveSuspension activeSuspension = (ActiveSuspension) obj;
                N n5 = this.purple.bravo;
                if (activeSuspension != null) {
                    str = activeSuspension.getType();
                } else {
                    str = null;
                }
                if (str == null || StringsKt.gray(str)) {
                    activeSuspension = null;
                }
                n5.india(activeSuspension);
                return Unit.INSTANCE;
            default:
                this.purple.bravo.india(null);
                return Unit.INSTANCE;
        }
    }
}
