package P0;

import P.d;
import R.e;
import Xd.l;
import Y1.aa;
import a2.C0382g;
import a2.C0388m;
import androidx.compose.foundation.layout.C0552s;
import androidx.compose.foundation.lazy.layout.ar;
import androidx.compose.foundation.lazy.layout.j;
import androidx.compose.foundation.lazy.layout.t;
import androidx.compose.foundation.lazy.layout.u;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import bx.InterfaceC0775m;
import com.clevertap.android.sdk.db.Column;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q.g;
import s.AbstractC2534m;
import t6.V2;
import u.InterfaceC3132f;

/* loaded from: classes3.dex */
public final class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ b(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    a.charlie((String) this.purple, (String) this.red, c0585q, new Object[0]);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.bronze()) {
                        c0585q2.ochre();
                        return Unit.INSTANCE;
                    }
                }
                ((C0388m) this.purple).f2592a.invoke((Y1.l) this.red, interfaceC0581m2, 0);
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q3 = (C0585q) interfaceC0581m3;
                    if (c0585q3.bronze()) {
                        c0585q3.ochre();
                        return Unit.INSTANCE;
                    }
                }
                V2.bravo((e) this.purple, (d) this.red, interfaceC0581m3, 0);
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q4 = (C0585q) interfaceC0581m4;
                    if (c0585q4.bronze()) {
                        c0585q4.ochre();
                        return Unit.INSTANCE;
                    }
                }
                Y1.l lVar = (Y1.l) this.purple;
                aa aaVar = lVar.purple;
                Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                ((C0382g) aaVar).yellow.invoke((InterfaceC0775m) this.red, lVar, interfaceC0581m4, 0);
                return Unit.INSTANCE;
            case 4:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue2 & 1, z10)) {
                    ((d) this.purple).invoke((C0552s) this.red, c0585q5, 0);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue3 & 1, z11)) {
                    u uVar = (u) this.purple;
                    w wVar = (w) uVar.bravo.invoke();
                    t tVar = (t) this.red;
                    int i4 = tVar.charlie;
                    int itemCount = wVar.getItemCount();
                    Object obj3 = tVar.alpha;
                    if ((i4 >= itemCount || !Intrinsics.areEqual(wVar.alpha(i4), obj3)) && (i4 = wVar.charlie(obj3)) != -1) {
                        tVar.charlie = i4;
                    }
                    int i5 = i4;
                    if (i5 != -1) {
                        c0585q6.purple(-1664741271);
                        j.delta(wVar, uVar.alpha, i5, tVar.alpha, c0585q6, 0);
                        c0585q6.quebec(false);
                    } else {
                        c0585q6.purple(-1664505826);
                        c0585q6.quebec(false);
                    }
                    boolean india = c0585q6.india(tVar);
                    Object jade = c0585q6.jade();
                    if (india || jade == C0580l.alpha) {
                        jade = new Ya.c(8, tVar);
                        c0585q6.f(jade);
                    }
                    C0564b.delta(obj3, (Function1) jade, c0585q6);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue4 & 1, z12)) {
                    ((d) this.purple).invoke((ar) this.red, c0585q7, 0);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj;
                int intValue5 = ((Number) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue5 & 1, z13)) {
                    boolean golf = c0585q8.golf((InterfaceC3132f) this.purple);
                    Object jade2 = c0585q8.jade();
                    if (golf || jade2 == C0580l.alpha) {
                        jade2 = C0564b.quebec(new P7.c(0, (InterfaceC3132f) this.purple, InterfaceC3132f.class, Column.DATA, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 15));
                        c0585q8.f(jade2);
                    }
                    AbstractC2534m.alpha((g) this.red, (q.c) ((D0) jade2).getValue(), c0585q8, 0);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
