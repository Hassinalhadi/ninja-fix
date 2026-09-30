package Ec;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import bx.InterfaceC0775m;
import bz.F;
import com.app.network.network.models.Shift;
import i.InterfaceC1854c;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t6.V2;

/* loaded from: classes2.dex */
public final class k implements Xd.n {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public k(F f5, Y1.l lVar, R.e eVar, androidx.compose.runtime.ax axVar, D0 d02) {
        this.purple = f5;
        this.red = lVar;
        this.silver = eVar;
        this.teal = axVar;
        this.white = d02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.q, androidx.compose.runtime.m] */
    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        boolean z2;
        int i5;
        int i10;
        Y1.l lVar;
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
                ?? r72 = (C0585q) interfaceC0581m;
                if (r72.magenta(i4 & 1, z2)) {
                    Shift shift = (Shift) ((List) this.purple).get(intValue);
                    r72.purple(-1378497159);
                    Function1 function1 = (Function1) this.silver;
                    boolean golf = r72.golf(function1) | r72.india(shift);
                    Object jade = r72.jade();
                    Object obj5 = C0580l.alpha;
                    if (golf || jade == obj5) {
                        jade = new j(function1, shift, 0);
                        r72.f(jade);
                    }
                    Function0 function0 = (Function0) jade;
                    Xd.l lVar2 = (Xd.l) this.white;
                    boolean golf2 = r72.golf(lVar2) | r72.india(shift);
                    Object jade2 = r72.jade();
                    if (golf2 || jade2 == obj5) {
                        jade2 = new Cb.l(1, lVar2, shift);
                        r72.f(jade2);
                    }
                    Function1 function12 = (Function1) jade2;
                    Function1 function13 = (Function1) this.teal;
                    boolean golf3 = r72.golf(function13) | r72.india(shift);
                    Object jade3 = r72.jade();
                    if (golf3 || jade3 == obj5) {
                        jade3 = new j(function13, shift, 1);
                        r72.f(jade3);
                    }
                    c.alpha(shift, (List) this.red, function0, function12, (Function0) jade3, r72, 0);
                    r72.quebec(false);
                } else {
                    r72.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0775m interfaceC0775m = (InterfaceC0775m) obj;
                Y1.l lVar3 = (Y1.l) obj2;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj3;
                ((Number) obj4).intValue();
                boolean areEqual = Intrinsics.areEqual(((t0) ((F) this.purple).red).getValue(), (Y1.l) this.red);
                if (!((Boolean) ((androidx.compose.runtime.ax) this.teal).getValue()).booleanValue() && !areEqual) {
                    List list = (List) ((D0) this.white).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            lVar = listIterator.previous();
                            if (Intrinsics.areEqual(lVar3, (Y1.l) lVar)) {
                            }
                        } else {
                            lVar = 0;
                        }
                    }
                    lVar3 = lVar;
                }
                C0585q c0585q = (C0585q) interfaceC0581m2;
                if (lVar3 == null) {
                    c0585q.purple(105930796);
                } else {
                    c0585q.purple(-1520603531);
                    V2.alpha(lVar3, (R.e) this.silver, P.e.echo(-1263531443, new P0.b(3, lVar3, interfaceC0775m), c0585q), c0585q, 384);
                }
                c0585q.quebec(false);
                return Unit.INSTANCE;
        }
    }

    public k(List list, List list2, Function1 function1, Xd.l lVar, Function1 function12) {
        this.purple = list;
        this.red = list2;
        this.silver = function1;
        this.white = lVar;
        this.teal = function12;
    }
}
