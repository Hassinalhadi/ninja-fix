package Pa;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ p silver;
    public final /* synthetic */ int teal;

    public /* synthetic */ g(String str, Function0 function0, p pVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = str;
        this.red = function0;
        this.silver = pVar;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                i.bravo(C0564b.cyan(this.teal | 1), this.silver, interfaceC0581m, this.purple, this.red);
                return Unit.INSTANCE;
            default:
                i.golf(C0564b.cyan(this.teal | 1), this.silver, interfaceC0581m, this.purple, this.red);
                return Unit.INSTANCE;
        }
    }
}
