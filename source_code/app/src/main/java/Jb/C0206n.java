package Jb;

import F.K1;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.Order;
import i.InterfaceC1854c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.S6;

/* renamed from: Jb.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0206n implements Xd.n {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ List silver;

    public /* synthetic */ C0206n(List list, Context context, Function1 function1, int i4) {
        this.alpha = i4;
        this.silver = list;
        this.purple = context;
        this.red = function1;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        boolean z2;
        int i5;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        switch (this.alpha) {
            case 0:
                InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
                int intValue = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    i4 = i10 | intValue2;
                } else {
                    i4 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((C0585q) interfaceC0581m).echo(intValue)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(i4 & 1, z2)) {
                    Order order = (Order) this.silver.get(intValue);
                    c0585q.purple(-1401169703);
                    Sb.c kilo = Sb.d.kilo(order, (Context) this.purple);
                    Function1 function1 = this.red;
                    boolean golf = c0585q.golf(function1) | c0585q.india(order);
                    Object jade = c0585q.jade();
                    if (golf || jade == C0580l.alpha) {
                        jade = new C0204l(function1, order, 0);
                        c0585q.f(jade);
                    }
                    Sb.d.alpha(kilo, (Function0) jade, AbstractC0538d.uniform(T.p.alpha, 8, 0.0f, 2), c0585q, 384);
                    c0585q.quebec(false);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1854c interfaceC1854c2 = (InterfaceC1854c) obj;
                int intValue3 = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((C0585q) interfaceC0581m2).golf(interfaceC1854c2)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i11 = i13 | intValue4;
                } else {
                    i11 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((C0585q) interfaceC0581m2).echo(intValue3)) {
                        i12 = 32;
                    } else {
                        i12 = 16;
                    }
                    i11 |= i12;
                }
                if ((i11 & 147) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(i11 & 1, z10)) {
                    Order order2 = (Order) ((ArrayList) this.silver).get(intValue3);
                    c0585q2.purple(-586662429);
                    Sb.c kilo2 = Sb.d.kilo(order2, (Context) this.purple);
                    Function1 function12 = this.red;
                    boolean golf2 = c0585q2.golf(function12) | c0585q2.india(order2);
                    Object jade2 = c0585q2.jade();
                    if (golf2 || jade2 == C0580l.alpha) {
                        jade2 = new C0204l(function12, order2, 1);
                        c0585q2.f(jade2);
                    }
                    Sb.d.alpha(kilo2, (Function0) jade2, AbstractC0538d.uniform(T.p.alpha, 8, 0.0f, 2), c0585q2, 384);
                    c0585q2.quebec(false);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC1854c interfaceC1854c3 = (InterfaceC1854c) obj;
                int intValue5 = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (((C0585q) interfaceC0581m3).golf(interfaceC1854c3)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i14 = i16 | intValue6;
                } else {
                    i14 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (((C0585q) interfaceC0581m3).echo(intValue5)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                if ((i14 & 147) != 146) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(i14 & 1, z11)) {
                    ActionType actionType = (ActionType) this.silver.get(intValue5);
                    c0585q3.purple(-1698206103);
                    Function1 function13 = this.red;
                    boolean golf3 = c0585q3.golf(function13) | c0585q3.india(actionType);
                    Object jade3 = c0585q3.jade();
                    if (golf3 || jade3 == C0580l.alpha) {
                        jade3 = new Ic.c(function13, actionType, 2);
                        c0585q3.f(jade3);
                    }
                    S6.alpha(actionType, (Function0) jade3, c0585q3, 0);
                    if (intValue5 < CollectionsKt.ivory((List) this.purple)) {
                        c0585q3.purple(-1698052344);
                        K1.delta(AbstractC0538d.whiskey(T.p.alpha, 56, 0.0f, 0.0f, 0.0f, 14), 1, a0.ao.delta(4294243573L), c0585q3, 438, 0);
                    } else {
                        c0585q3.purple(-1700612882);
                    }
                    c0585q3.quebec(false);
                    c0585q3.quebec(false);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public C0206n(List list, Function1 function1, List list2) {
        this.alpha = 2;
        this.silver = list;
        this.red = function1;
        this.purple = list2;
    }
}
