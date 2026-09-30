package androidx.compose.foundation.layout;

import a0.C0366t;
import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import bz.C0790o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import s.AbstractC2534m;
import s.C2538q;
import t0.AbstractC2901T;
import t0.AbstractC2911e0;
import y.C3344D;
import y.C3352L;

/* loaded from: classes3.dex */
public final class c0 implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ c0(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, n.d0] */
    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        int i5;
        Icon icon;
        int i10 = 18;
        C2538q c2538q = C2538q.alpha;
        int i11 = 4;
        Object obj4 = C0580l.alpha;
        Object obj5 = this.purple;
        boolean z2 = false;
        switch (this.alpha) {
            case 0:
                ((Number) obj3).intValue();
                C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
                c0585q.purple(-1608161351);
                Function1 function1 = (Function1) obj5;
                boolean golf = c0585q.golf(function1);
                Object jade = c0585q.jade();
                if (golf || jade == obj4) {
                    jade = new C0557x(function1);
                    c0585q.f(jade);
                }
                C0557x c0557x = (C0557x) jade;
                c0585q.quebec(false);
                return c0557x;
            case 1:
                ((Number) obj3).intValue();
                C0585q c0585q2 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q2.purple(-1415685722);
                a0 a0Var = (a0) obj5;
                boolean golf2 = c0585q2.golf(a0Var);
                Object jade2 = c0585q2.jade();
                if (golf2 || jade2 == obj4) {
                    jade2 = new ax(a0Var);
                    c0585q2.f(jade2);
                }
                ax axVar = (ax) jade2;
                c0585q2.quebec(false);
                return axVar;
            case 2:
                ((Number) obj3).intValue();
                C0585q c0585q3 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q3.purple(1582736677);
                Q0.d dVar = (Q0.d) c0585q3.kilo(AbstractC2901T.hotel);
                H0.j jVar = (H0.j) c0585q3.kilo(AbstractC2901T.kilo);
                Q0.n nVar = (Q0.n) c0585q3.kilo(AbstractC2901T.november);
                D0.an anVar = (D0.an) obj5;
                boolean golf3 = c0585q3.golf(anVar) | c0585q3.echo(nVar.ordinal());
                Object jade3 = c0585q3.jade();
                if (golf3 || jade3 == obj4) {
                    jade3 = D0.ae.hotel(anVar, nVar);
                    c0585q3.f(jade3);
                }
                D0.an anVar2 = (D0.an) jade3;
                boolean golf4 = c0585q3.golf(jVar) | c0585q3.golf(anVar2);
                Object jade4 = c0585q3.jade();
                if (golf4 || jade4 == obj4) {
                    D0.af afVar = anVar2.alpha;
                    H0.k kVar = afVar.foxtrot;
                    H0.v vVar = afVar.charlie;
                    if (vVar == null) {
                        vVar = H0.v.yellow;
                    }
                    H0.r rVar = afVar.delta;
                    if (rVar != null) {
                        i4 = rVar.alpha;
                    } else {
                        i4 = 0;
                    }
                    H0.s sVar = afVar.echo;
                    if (sVar != null) {
                        i5 = sVar.alpha;
                    } else {
                        i5 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    }
                    jade4 = ((H0.l) jVar).bravo(kVar, vVar, i4, i5);
                    c0585q3.f(jade4);
                }
                D0 d02 = (D0) jade4;
                Object jade5 = c0585q3.jade();
                Object obj6 = jade5;
                if (jade5 == obj4) {
                    Object value = d02.getValue();
                    ?? obj7 = new Object();
                    obj7.alpha = nVar;
                    obj7.bravo = dVar;
                    obj7.charlie = jVar;
                    obj7.delta = anVar;
                    obj7.echo = value;
                    obj7.foxtrot = n.P.bravo(anVar, dVar, jVar);
                    c0585q3.f(obj7);
                    obj6 = obj7;
                }
                n.d0 d0Var = (n.d0) obj6;
                Object value2 = d02.getValue();
                if (nVar != d0Var.alpha || !Intrinsics.areEqual(dVar, d0Var.bravo) || !Intrinsics.areEqual(jVar, d0Var.charlie) || !Intrinsics.areEqual(anVar2, d0Var.delta) || !Intrinsics.areEqual(value2, d0Var.echo)) {
                    d0Var.alpha = nVar;
                    d0Var.bravo = dVar;
                    d0Var.charlie = jVar;
                    d0Var.delta = anVar2;
                    d0Var.echo = value2;
                    d0Var.foxtrot = n.P.bravo(anVar2, dVar, jVar);
                }
                boolean india = c0585q3.india(d0Var);
                Object jade6 = c0585q3.jade();
                if (india || jade6 == obj4) {
                    jade6 = new Cb.d(i10, d0Var);
                    c0585q3.f(jade6);
                }
                T.s bravo = androidx.compose.ui.layout.a.bravo((Xd.m) jade6);
                c0585q3.quebec(false);
                return bravo;
            case 3:
                long j5 = ((C0366t) obj).alpha;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (!((C0585q) interfaceC0581m).foxtrot(j5)) {
                        i11 = 2;
                    }
                    intValue |= i11;
                }
                if ((intValue & 19) != 18) {
                    z2 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m;
                if (c0585q4.magenta(intValue & 1, z2)) {
                    AbstractC2534m.bravo(((q.d) obj5).charlie, j5, c0585q4, (intValue << 3) & 112);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                long j6 = ((C0366t) obj).alpha;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m2;
                if (c0585q5.magenta(intValue2 & 1, z2)) {
                    c2538q.alpha((Drawable) obj5, c0585q5, 48);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                long j7 = ((C0366t) obj).alpha;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m3;
                if (c0585q6.magenta(intValue3 & 1, z2)) {
                    icon = ((RemoteAction) obj5).getIcon();
                    c2538q.bravo(icon, c0585q6, 48);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            default:
                T.s sVar2 = (T.s) obj;
                ((Number) obj3).intValue();
                C0585q c0585q7 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q7.purple(1980580247);
                Q0.d dVar2 = (Q0.d) c0585q7.kilo(AbstractC2901T.hotel);
                Object jade7 = c0585q7.jade();
                if (jade7 == obj4) {
                    jade7 = C0564b.zulu(new Q0.m(0L));
                    c0585q7.f(jade7);
                }
                androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) jade7;
                C3344D c3344d = (C3344D) obj5;
                boolean india2 = c0585q7.india(c3344d);
                Object jade8 = c0585q7.jade();
                if (india2 || jade8 == obj4) {
                    jade8 = new okhttp3.internal.ws.a(12, c3344d, axVar2);
                    c0585q7.f(jade8);
                }
                Function0 function0 = (Function0) jade8;
                boolean golf5 = c0585q7.golf(dVar2);
                Object jade9 = c0585q7.jade();
                if (golf5 || jade9 == obj4) {
                    jade9 = new C3352L(dVar2, axVar2, 0);
                    c0585q7.f(jade9);
                }
                C0790o c0790o = y.al.alpha;
                T.s alpha = T.a.alpha(sVar2, AbstractC2911e0.alpha, new N2.ad(i11, function0, (Function1) jade9));
                c0585q7.quebec(false);
                return alpha;
        }
    }
}
