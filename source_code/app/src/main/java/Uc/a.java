package Uc;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import cc.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2806w7;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ p silver;

    public /* synthetic */ a(Function0 function0, p pVar, boolean z2, int i4) {
        this.alpha = 2;
        this.red = function0;
        this.silver = pVar;
        this.purple = z2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                b.alpha(C0564b.cyan(1), this.silver, interfaceC0581m, this.red, this.purple);
                return Unit.INSTANCE;
            case 1:
                g.echo(C0564b.cyan(1), this.silver, interfaceC0581m, this.red, this.purple);
                return Unit.INSTANCE;
            default:
                AbstractC2806w7.alpha(C0564b.cyan(3511), this.silver, interfaceC0581m, this.red, this.purple);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(boolean z2, Function0 function0, p pVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = z2;
        this.red = function0;
        this.silver = pVar;
    }
}
