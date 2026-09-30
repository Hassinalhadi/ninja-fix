package Gb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pa.AbstractC2297c;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ T.s silver;
    public final /* synthetic */ int teal;

    public /* synthetic */ z(String str, Function0 function0, T.s sVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = str;
        this.red = function0;
        this.silver = sVar;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                a.delta(C0564b.cyan(this.teal | 1), this.silver, interfaceC0581m, this.purple, this.red);
                return Unit.INSTANCE;
            case 1:
                a.charlie(C0564b.cyan(this.teal | 1), this.silver, interfaceC0581m, this.purple, this.red);
                return Unit.INSTANCE;
            default:
                AbstractC2297c.bravo(C0564b.cyan(this.teal | 1), this.silver, interfaceC0581m, this.purple, this.red);
                return Unit.INSTANCE;
        }
    }
}
