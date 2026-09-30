package xb;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* renamed from: xb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3319c implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ p red;
    public final /* synthetic */ P.d silver;

    public /* synthetic */ C3319c(String str, p pVar, P.d dVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = str;
        this.red = pVar;
        this.silver = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                int cyan = C0564b.cyan(391);
                AbstractC3318b.echo(this.purple, this.red, this.silver, interfaceC0581m, cyan);
                return Unit.INSTANCE;
            default:
                int cyan2 = C0564b.cyan(391);
                AbstractC3318b.delta(this.purple, this.red, this.silver, interfaceC0581m, cyan2);
                return Unit.INSTANCE;
        }
    }
}
