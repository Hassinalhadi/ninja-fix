package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ Function0 silver;
    public final /* synthetic */ int teal;

    public /* synthetic */ v(List list, Function1 function1, Function0 function0, int i4, int i5) {
        this.alpha = i5;
        this.purple = list;
        this.red = function1;
        this.silver = function0;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.intValue();
                w.alpha(this.purple, this.red, this.silver, interfaceC0581m, C0564b.cyan(this.teal | 1));
                return Unit.INSTANCE;
            default:
                num.getClass();
                int cyan = C0564b.cyan(this.teal | 1);
                ax.alpha(this.purple, this.red, this.silver, interfaceC0581m, cyan);
                return Unit.INSTANCE;
        }
    }
}
