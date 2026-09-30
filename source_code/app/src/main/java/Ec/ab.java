package Ec;

import F.G2;
import F.K1;
import F.S2;
import F.T2;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0556w;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC0550p;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import i.C1874w;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;

/* loaded from: classes2.dex */
public final /* synthetic */ class ab implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ ab(C1874w c1874w, Object obj, boolean z2, int i4) {
        this.alpha = i4;
        this.purple = c1874w;
        this.silver = obj;
        this.red = z2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                InterfaceC0550p PullToRefreshBox = (InterfaceC0550p) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    FillElement fillElement = V.charlie;
                    float f5 = Db.f.delta;
                    M m4 = new M(f5, f5, f5, f5);
                    C0540f golf = AbstractC0542h.golf(f5);
                    List list = (List) this.silver;
                    boolean india = c0585q.india(list);
                    boolean z12 = this.red;
                    boolean hotel = india | c0585q.hotel(z12);
                    Object jade = c0585q.jade();
                    if (hotel || jade == C0580l.alpha) {
                        jade = new ad(list, z12, 0);
                        c0585q.f(jade);
                    }
                    AbstractC2616b5.alpha(fillElement, (C1874w) this.purple, m4, golf, null, null, false, null, (Function1) jade, c0585q, 6, 488);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0550p PullToRefreshBox2 = (InterfaceC0550p) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(PullToRefreshBox2, "$this$PullToRefreshBox");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    T.s bravo = androidx.compose.foundation.a.bravo(V.charlie, Jc.o.foxtrot, a0.ao.alpha);
                    float f10 = 16;
                    float f11 = 8;
                    M m5 = new M(f10, f11, f10, f11);
                    C0540f golf2 = AbstractC0542h.golf(f11);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.silver;
                    boolean india2 = c0585q2.india(linkedHashMap);
                    boolean z13 = this.red;
                    boolean hotel2 = india2 | c0585q2.hotel(z13);
                    Object jade2 = c0585q2.jade();
                    if (hotel2 || jade2 == C0580l.alpha) {
                        jade2 = new ad(linkedHashMap, z13, 1);
                        c0585q2.f(jade2);
                    }
                    AbstractC2616b5.alpha(bravo, (C1874w) this.purple, m5, golf2, null, null, false, null, (Function1) jade2, c0585q2, 24966, 488);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0555v ModalBottomSheet = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((intValue3 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    T.p pVar = T.p.alpha;
                    T.s charlie = V.charlie(pVar, 1.0f);
                    float f12 = Db.d.bravo;
                    T.s whiskey = AbstractC0538d.whiskey(AbstractC0538d.uniform(charlie, f12, 0.0f, 2), 0.0f, 0.0f, 0.0f, f12, 7);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q3, 0);
                    int romeo = C0564b.romeo(c0585q3);
                    I mike = c0585q3.mike();
                    T.s charlie2 = T.a.charlie(whiskey, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                    C0564b.blue(C2551k.echo, c0585q3, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo))) {
                        ao.ad.blue(romeo, c0585q3, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie2);
                    C0556w c0556w = C0556w.alpha;
                    String str = (String) this.purple;
                    if (str != null) {
                        c0585q3.purple(1266072819);
                        D0.an anVar = ((S2) c0585q3.kilo(T2.alpha)).golf;
                        H0.v vVar = H0.v.f1408b;
                        float f13 = Db.d.charlie;
                        G2.bravo(str, AbstractC0538d.whiskey(pVar, 0.0f, 0.0f, 0.0f, f13, 7), 0L, 0L, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q3, 196656, 0, 65500);
                        c0585q3 = c0585q3;
                        if (this.red) {
                            c0585q3.purple(1266372217);
                            K1.echo(AbstractC0538d.whiskey(pVar, 0.0f, 0.0f, 0.0f, f13, 7), 0.0f, Db.c.azure, c0585q3, 390, 2);
                        } else {
                            c0585q3.purple(1263996718);
                        }
                        c0585q3.quebec(false);
                    } else {
                        c0585q3.purple(1263996718);
                    }
                    c0585q3.quebec(false);
                    ((P.d) this.silver).invoke(c0556w, c0585q3, 6);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ab(String str, boolean z2, P.d dVar) {
        this.alpha = 2;
        this.purple = str;
        this.red = z2;
        this.silver = dVar;
    }
}
