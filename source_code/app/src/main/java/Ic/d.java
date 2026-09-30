package Ic;

import Jb.af;
import Jb.ag;
import Jb.ah;
import Jb.ai;
import Vc.g;
import Xd.n;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.app.network.network.models.Root;
import com.app.network.network.models.Transaction;
import i.InterfaceC1854c;
import j.C1925h;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class d implements n {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ d(List list, Object obj, int i4) {
        this.alpha = i4;
        this.purple = list;
        this.red = obj;
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
                C1925h c1925h = (C1925h) obj;
                int intValue = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((C0585q) interfaceC0581m).golf(c1925h)) {
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
                    Root root = (Root) this.purple.get(intValue);
                    c0585q.purple(-1254434978);
                    Function1 function1 = (Function1) this.red;
                    boolean golf = c0585q.golf(function1) | c0585q.india(root);
                    Object jade = c0585q.jade();
                    if (golf || jade == C0580l.alpha) {
                        jade = new c(function1, root, 0);
                        c0585q.f(jade);
                    }
                    e.alpha(root, (Function0) jade, c0585q, 0);
                    c0585q.quebec(false);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
                int intValue3 = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((C0585q) interfaceC0581m2).golf(interfaceC1854c)) {
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
                boolean z12 = true;
                if ((i11 & 147) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(i11 & 1, z10)) {
                    ai aiVar = (ai) this.purple.get(intValue3);
                    c0585q2.purple(655265997);
                    if (aiVar instanceof ag) {
                        c0585q2.purple(1406612441);
                        ag agVar = (ag) aiVar;
                        if (intValue3 != 0) {
                            z12 = false;
                        }
                        af.alpha(agVar, z12, c0585q2, 0);
                        c0585q2.quebec(false);
                    } else if (aiVar instanceof ah) {
                        c0585q2.purple(1406615291);
                        ah ahVar = (ah) aiVar;
                        Function1 function12 = (Function1) this.red;
                        boolean golf2 = c0585q2.golf(function12) | c0585q2.golf(aiVar);
                        Object jade2 = c0585q2.jade();
                        if (golf2 || jade2 == C0580l.alpha) {
                            jade2 = new c(function12, (ah) aiVar, 1);
                            c0585q2.f(jade2);
                        }
                        af.bravo(ahVar, (Function0) jade2, c0585q2, 0);
                        c0585q2.quebec(false);
                    } else {
                        throw ad.black(c0585q2, 1406610934, false);
                    }
                    c0585q2.quebec(false);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC1854c interfaceC1854c2 = (InterfaceC1854c) obj;
                int intValue5 = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (((C0585q) interfaceC0581m3).golf(interfaceC1854c2)) {
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
                    Transaction transaction = (Transaction) this.purple.get(intValue5);
                    c0585q3.purple(-1152955591);
                    g.alpha(transaction, (String) this.red, null, c0585q3, 0);
                    c0585q3.quebec(false);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
