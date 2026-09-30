package Zb;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ List purple;

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit createTrailingIcon$lambda$32;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.getClass();
                int cyan = C0564b.cyan(1);
                d.golf(this.purple, p.alpha, interfaceC0581m, cyan);
                return Unit.INSTANCE;
            default:
                createTrailingIcon$lambda$32 = InputComponentViewKt.createTrailingIcon$lambda$32(this.purple, interfaceC0581m, num.intValue());
                return createTrailingIcon$lambda$32;
        }
    }

    public /* synthetic */ k(List list) {
        this.purple = list;
    }
}
