package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class aq implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ Function1 silver;
    public final /* synthetic */ Function0 teal;

    public /* synthetic */ aq(T.p pVar, boolean z2, Function1 function1, Function0 function0, int i4, int i5) {
        this.alpha = i5;
        this.purple = pVar;
        this.red = z2;
        this.silver = function1;
        this.teal = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                Function1 function1 = this.silver;
                Function0 function0 = this.teal;
                AbstractC0220c.whiskey(this.purple, this.red, function1, function0, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1);
                Function1 function12 = this.silver;
                Function0 function02 = this.teal;
                AbstractC0220c.romeo(this.purple, this.red, function12, function02, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }
}
