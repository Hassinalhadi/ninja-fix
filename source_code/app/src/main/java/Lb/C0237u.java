package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: Lb.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0237u implements Xd.l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ T.p silver;

    public /* synthetic */ C0237u(String str, Function0 function0, T.p pVar, int i4) {
        this.purple = str;
        this.red = function0;
        this.silver = pVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                AbstractC0220c.hotel(C0564b.cyan(1), this.silver, interfaceC0581m, this.purple, this.red);
                return Unit.INSTANCE;
            default:
                a0.alpha(C0564b.cyan(1), this.silver, interfaceC0581m, this.purple, this.red);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0237u(Function0 function0, String str, T.p pVar, int i4) {
        this.red = function0;
        this.purple = str;
        this.silver = pVar;
    }
}
