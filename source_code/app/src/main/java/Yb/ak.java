package Yb;

import F.G2;
import F.S2;
import F.T2;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.airbnb.lottie.compose.LottieConstants;
import com.app.network.network.models.LanguageMetaData;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TagDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.G5;
import s6.I5;
import s6.S4;

/* loaded from: classes2.dex */
public final /* synthetic */ class ak implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrderTask purple;

    public /* synthetic */ ak(OrderTask orderTask, int i4) {
        this.alpha = i4;
        this.purple = orderTask;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    List<TagDto> tags = this.purple.getTags();
                    if (tags == null) {
                        tags = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : tags) {
                        String value = ((TagDto) obj3).getValue();
                        if (value != null && !StringsKt.gray(value)) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        S4.alpha((TagDto) it.next(), null, c0585q, 0);
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    I5.alpha(6, P.e.echo(136227694, new ak(this.purple, 2), c0585q2), null, c0585q2);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i4 = 2;
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    OrderTask orderTask = this.purple;
                    LanguageMetaData metaData = orderTask.getMetaData();
                    Intrinsics.checkNotNull(metaData);
                    boolean golf = c0585q3.golf(orderTask.getId());
                    Object jade = c0585q3.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (golf || jade == asVar) {
                        jade = C0564b.zulu(Boolean.FALSE);
                        c0585q3.f(jade);
                    }
                    androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
                    if (((Boolean) axVar.getValue()).booleanValue()) {
                        i4 = LottieConstants.IterateForever;
                    }
                    T.p pVar = T.p.alpha;
                    T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                    boolean golf2 = c0585q3.golf(axVar);
                    Object jade2 = c0585q3.jade();
                    if (golf2 || jade2 == asVar) {
                        jade2 = new Cb.u(axVar, 5);
                        c0585q3.f(jade2);
                    }
                    T.s echo = androidx.compose.foundation.a.echo(15, charlie, null, (Function0) jade2, false);
                    Object jade3 = c0585q3.jade();
                    if (jade3 == asVar) {
                        jade3 = new X9.i(14);
                        c0585q3.f(jade3);
                    }
                    T.s bravo = A0.o.bravo(echo, false, (Function1) jade3);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q3, 0);
                    long j5 = c0585q3.magenta;
                    int i5 = (int) (j5 ^ (j5 >>> 32));
                    androidx.compose.runtime.I mike = c0585q3.mike();
                    T.s charlie2 = T.a.charlie(bravo, c0585q3);
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
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q3, i5, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie2);
                    String label = metaData.getLabel();
                    if (label == null) {
                        label = "";
                    }
                    String str = label;
                    D0.an anVar = ((S2) c0585q3.kilo(T2.alpha)).lima;
                    H0.v vVar = H0.v.f1408b;
                    androidx.compose.runtime.E0 e02 = F.Q.alpha;
                    G2.bravo(str, null, ((F.O) c0585q3.kilo(e02)).quebec, 0L, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q3, 196608, 0, 65498);
                    String metaHtml = metaData.getMetaHtml();
                    if (metaHtml != null && !StringsKt.gray(metaHtml)) {
                        c0585q3.purple(629166109);
                        G5.alpha(metaHtml, AbstractC0538d.whiskey(pVar, 0.0f, 4, 0.0f, 0.0f, 13), ((F.O) c0585q3.kilo(e02)).sierra, i4, c0585q3, 48);
                    } else {
                        c0585q3.purple(622071914);
                    }
                    c0585q3.quebec(false);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    List<TagDto> tags2 = this.purple.getTags();
                    if (tags2 == null) {
                        tags2 = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : tags2) {
                        String value2 = ((TagDto) obj4).getValue();
                        if (value2 != null && !StringsKt.gray(value2)) {
                            arrayList2.add(obj4);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        S4.alpha((TagDto) it2.next(), null, c0585q4, 0);
                    }
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
