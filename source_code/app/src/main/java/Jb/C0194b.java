package Jb;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.UserInfo;
import d.C1543m;
import i.C1860i;
import i.C1874w;
import i.InterfaceC1854c;
import i.InterfaceC1869r;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2616b5;
import s6.B7;

/* renamed from: Jb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0194b implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1640a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1641b;
    public final /* synthetic */ C1874w purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ Function1 silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ C0194b(T.s sVar, C1874w c1874w, androidx.compose.foundation.layout.M m4, InterfaceC0541g interfaceC0541g, T.i iVar, C1543m c1543m, boolean z2, Function1 function1, int i4) {
        this.teal = sVar;
        this.purple = c1874w;
        this.white = m4;
        this.yellow = interfaceC0541g;
        this.f1640a = iVar;
        this.f1641b = c1543m;
        this.red = z2;
        this.silver = function1;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
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
                    FillElement fillElement = androidx.compose.foundation.layout.V.charlie;
                    float f5 = 4;
                    androidx.compose.foundation.layout.M delta = AbstractC0538d.delta(0.0f, 0.0f, 0.0f, f5, 7);
                    C0540f golf = AbstractC0542h.golf(f5);
                    final androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) this.teal;
                    boolean golf2 = c0585q.golf(axVar);
                    final Context context = (Context) this.yellow;
                    boolean india = golf2 | c0585q.india(context);
                    final C0208p c0208p = (C0208p) this.f1640a;
                    boolean india2 = india | c0585q.india(c0208p);
                    final boolean z10 = this.red;
                    boolean hotel = india2 | c0585q.hotel(z10);
                    final List list = (List) this.f1641b;
                    boolean india3 = hotel | c0585q.india(list);
                    final Function1 function1 = this.silver;
                    boolean golf3 = india3 | c0585q.golf(function1);
                    Object jade = c0585q.jade();
                    if (golf3 || jade == C0580l.alpha) {
                        final androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) this.white;
                        Function1 function12 = new Function1() { // from class: Jb.e
                            /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
                            
                                if (r0 != false) goto L25;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
                            
                                if (r0 != false) goto L40;
                             */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj3) {
                                boolean z11;
                                boolean z12;
                                boolean z13;
                                boolean z14;
                                boolean z15;
                                InterfaceC1869r LazyColumn = (InterfaceC1869r) obj3;
                                Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                                androidx.compose.runtime.ax axVar3 = axVar;
                                boolean booleanValue = ((Boolean) axVar3.getValue()).booleanValue();
                                Context context2 = context;
                                if (!booleanValue) {
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, null, new P.d(new Cb.d(5, context2), -919484127, true), 3);
                                }
                                androidx.compose.runtime.ax axVar4 = axVar2;
                                UserInfo userInfo = (UserInfo) axVar4.getValue();
                                boolean z16 = false;
                                if (userInfo != null) {
                                    z11 = Intrinsics.areEqual(userInfo.getOutsideWorkingArea(), Boolean.TRUE);
                                } else {
                                    z11 = false;
                                }
                                final C0208p c0208p2 = c0208p;
                                if (z11) {
                                    final int i4 = 0;
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, null, new P.d(new Xd.m() { // from class: Jb.f
                                        @Override // Xd.m
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            boolean z17;
                                            boolean z18;
                                            int i5 = i4;
                                            InterfaceC1854c item = (InterfaceC1854c) obj4;
                                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj5;
                                            int intValue2 = ((Integer) obj6).intValue();
                                            switch (i5) {
                                                case 0:
                                                    Intrinsics.echo(item, "$this$item");
                                                    if ((intValue2 & 17) != 16) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                                                    if (c0585q2.magenta(intValue2 & 1, z17)) {
                                                        T.p pVar = T.p.alpha;
                                                        AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, 12), c0585q2);
                                                        C0208p c0208p3 = c0208p2;
                                                        boolean india4 = c0585q2.india(c0208p3);
                                                        Object jade2 = c0585q2.jade();
                                                        if (india4 || jade2 == C0580l.alpha) {
                                                            jade2 = new C0200h(c0208p3, 1);
                                                            c0585q2.f(jade2);
                                                        }
                                                        B7.bravo((Function0) jade2, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 8, 0.0f, 2), null, null, null, false, c0585q2, 48);
                                                    } else {
                                                        c0585q2.ochre();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    Intrinsics.echo(item, "$this$item");
                                                    if ((intValue2 & 17) != 16) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                                                    if (c0585q3.magenta(intValue2 & 1, z18)) {
                                                        T.p pVar2 = T.p.alpha;
                                                        AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, 12), c0585q3);
                                                        C0208p c0208p4 = c0208p2;
                                                        boolean india5 = c0585q3.india(c0208p4);
                                                        Object jade3 = c0585q3.jade();
                                                        if (india5 || jade3 == C0580l.alpha) {
                                                            jade3 = new C0200h(c0208p4, 0);
                                                            c0585q3.f(jade3);
                                                        }
                                                        Sb.d.hotel((Function0) jade3, androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 0L, c0585q3, 48);
                                                    } else {
                                                        c0585q3.ochre();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }, 377465482, true), 3);
                                }
                                UserInfo userInfo2 = (UserInfo) axVar4.getValue();
                                if (userInfo2 != null) {
                                    z12 = Intrinsics.areEqual(userInfo2.getShowHeatMap(), Boolean.TRUE);
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    final int i5 = 1;
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, null, new P.d(new Xd.m() { // from class: Jb.f
                                        @Override // Xd.m
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            boolean z17;
                                            boolean z18;
                                            int i52 = i5;
                                            InterfaceC1854c item = (InterfaceC1854c) obj4;
                                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj5;
                                            int intValue2 = ((Integer) obj6).intValue();
                                            switch (i52) {
                                                case 0:
                                                    Intrinsics.echo(item, "$this$item");
                                                    if ((intValue2 & 17) != 16) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                                                    if (c0585q2.magenta(intValue2 & 1, z17)) {
                                                        T.p pVar = T.p.alpha;
                                                        AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, 12), c0585q2);
                                                        C0208p c0208p3 = c0208p2;
                                                        boolean india4 = c0585q2.india(c0208p3);
                                                        Object jade2 = c0585q2.jade();
                                                        if (india4 || jade2 == C0580l.alpha) {
                                                            jade2 = new C0200h(c0208p3, 1);
                                                            c0585q2.f(jade2);
                                                        }
                                                        B7.bravo((Function0) jade2, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 8, 0.0f, 2), null, null, null, false, c0585q2, 48);
                                                    } else {
                                                        c0585q2.ochre();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    Intrinsics.echo(item, "$this$item");
                                                    if ((intValue2 & 17) != 16) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                                                    if (c0585q3.magenta(intValue2 & 1, z18)) {
                                                        T.p pVar2 = T.p.alpha;
                                                        AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, 12), c0585q3);
                                                        C0208p c0208p4 = c0208p2;
                                                        boolean india5 = c0585q3.india(c0208p4);
                                                        Object jade3 = c0585q3.jade();
                                                        if (india5 || jade3 == C0580l.alpha) {
                                                            jade3 = new C0200h(c0208p4, 0);
                                                            c0585q3.f(jade3);
                                                        }
                                                        Sb.d.hotel((Function0) jade3, androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 0L, c0585q3, 48);
                                                    } else {
                                                        c0585q3.ochre();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }, -1266483287, true), 3);
                                }
                                if (((Boolean) axVar3.getValue()).booleanValue()) {
                                    UserInfo userInfo3 = (UserInfo) axVar4.getValue();
                                    if (userInfo3 != null) {
                                        z15 = Intrinsics.areEqual(userInfo3.getOutsideWorkingArea(), Boolean.TRUE);
                                    } else {
                                        z15 = false;
                                    }
                                }
                                com.google.android.material.datepicker.j.bravo(LazyColumn, null, AbstractC0210s.alpha, 3);
                                boolean z17 = z10;
                                List list2 = list;
                                if (!z17 && list2.isEmpty()) {
                                    UserInfo userInfo4 = (UserInfo) axVar4.getValue();
                                    if (userInfo4 != null) {
                                        z13 = Intrinsics.areEqual(userInfo4.getAwaitingOrders(), Boolean.TRUE);
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        UserInfo userInfo5 = (UserInfo) axVar4.getValue();
                                        if (userInfo5 != null) {
                                            z14 = Intrinsics.areEqual(userInfo5.getOutsideWorkingArea(), Boolean.TRUE);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                }
                                z16 = true;
                                if (z16) {
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, null, AbstractC0210s.bravo, 3);
                                }
                                com.google.android.material.datepicker.j.bravo(LazyColumn, null, AbstractC0210s.charlie, 3);
                                com.google.android.material.datepicker.j.bravo(LazyColumn, null, new P.d(new Cb.q(axVar4, 1), 266058437, true), 3);
                                if (!list2.isEmpty()) {
                                    ((C1860i) LazyColumn).quebec(list2.size(), new Cb.l(3, new D0.z(27), list2), new Cb.m(3, list2), new P.d(new C0206n(list2, context2, function1, 0), 802480018, true));
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c0585q.f(function12);
                        jade = function12;
                    }
                    AbstractC2616b5.alpha(fillElement, this.purple, delta, golf, null, null, false, null, (Function1) jade, c0585q, 24966, 488);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(7);
                AbstractC2616b5.bravo((T.s) this.teal, this.purple, (androidx.compose.foundation.layout.M) this.white, (InterfaceC0541g) this.yellow, (T.i) this.f1640a, (C1543m) this.f1641b, this.red, this.silver, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0194b(C1874w c1874w, androidx.compose.runtime.ax axVar, Context context, C0208p c0208p, boolean z2, List list, Function1 function1, androidx.compose.runtime.ax axVar2) {
        this.purple = c1874w;
        this.teal = axVar;
        this.yellow = context;
        this.f1640a = c0208p;
        this.red = z2;
        this.f1641b = list;
        this.silver = function1;
        this.white = axVar2;
    }
}
