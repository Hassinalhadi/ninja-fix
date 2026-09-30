package db;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.C7;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ boolean silver;

    public /* synthetic */ t(Function0 function0, T.s sVar, boolean z2, int i4, int i5) {
        this.alpha = i5;
        this.purple = function0;
        this.red = sVar;
        this.silver = z2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                n.foxtrot(C0564b.cyan(1), this.red, interfaceC0581m, this.purple, this.silver);
                return Unit.INSTANCE;
            default:
                C7.charlie(C0564b.cyan(385), this.red, interfaceC0581m, this.purple, this.silver);
                return Unit.INSTANCE;
        }
    }
}
