package Cb;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.SuspensionHistoryItem;
import i.InterfaceC1854c;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class n implements Xd.n {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ n(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
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
        boolean z11;
        int i14;
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
                    c cVar = (c) ((List) this.purple).get(intValue);
                    c0585q.purple(1604461025);
                    z.bravo(cVar, null, c0585q, 0);
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
                    SuspensionHistoryItem suspensionHistoryItem = (SuspensionHistoryItem) ((List) this.purple).get(intValue3);
                    c0585q2.purple(607331617);
                    Jc.o.golf(suspensionHistoryItem, c0585q2, 0);
                    c0585q2.quebec(false);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC1854c interfaceC1854c3 = (InterfaceC1854c) obj;
                ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj3;
                int intValue5 = ((Number) obj4).intValue();
                if ((intValue5 & 6) == 0) {
                    if (((C0585q) interfaceC0581m3).golf(interfaceC1854c3)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    intValue5 |= i14;
                }
                if ((intValue5 & 131) != 130) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue5 & 1, z11)) {
                    ((Xd.m) this.purple).invoke(interfaceC1854c3, c0585q3, Integer.valueOf(intValue5 & 14));
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
