package g4;

import Db.c;
import F.AbstractC0141o0;
import F.G1;
import F.O;
import F.Q;
import T.d;
import T.p;
import Xd.l;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import ao.ad;
import com.checkout.address.ui.state.ComposableSingletons$StatePickerFieldViewKt;
import com.checkout.components.rememberme.wallet.ComposableSingletons$WalletListItemViewKt;
import com.checkout.components.rememberme.wallet.ComposableSingletons$WalletListViewKt;
import com.checkout.components.ui.view.ComposableSingletons$InputContainerViewKt;
import com.checkout.components.ui.view.ComposableSingletons$InputFieldViewKt;
import com.checkout.components.ui.view.field.PhoneFieldViewKt;
import d.K;
import delivery.samurai.android.R;
import ga.e;
import i.C1874w;
import io.getunleash.android.http.NetworkStatusHelper;
import j.C1919b;
import j.t;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.c0;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2719n0;
import s6.X;
import t6.AbstractC3076w3;
import ub.AbstractC3150c;
import z.s;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1752a implements l {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1752a(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit b2;
        Unit a6;
        Unit _init_$lambda$1;
        Unit PhoneFieldPreview$lambda$7$lambda$6;
        boolean z2;
        boolean z10;
        p pVar = p.alpha;
        boolean z11 = false;
        switch (this.alpha) {
            case 0:
                return ComposableSingletons$StatePickerFieldViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                e.golf((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (!c0585q.magenta(intValue & 1, z11)) {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z11)) {
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_arrow_white_24, c0585q2, 6), null, null, C0366t.echo, c0585q2, 3120, 4);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_baseline_close_24, c0585q3, 6), null, null, C0366t.echo, c0585q3, 3120, 4);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z11)) {
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.edit_2_line, c0585q4, 6), null, V.kilo(pVar, 20), e.alpha, c0585q4, 3504, 0);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z11)) {
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.edit_2_line, c0585q5, 6), null, V.kilo(pVar, 20), e.alpha, c0585q5, 3504, 0);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                return ComposableSingletons$WalletListItemViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 8:
                return ComposableSingletons$WalletListItemViewKt.bravo((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 9:
                b2 = ComposableSingletons$WalletListViewKt.b((InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return b2;
            case 10:
                a6 = ComposableSingletons$WalletListViewKt.a((InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return a6;
            case 11:
                C1874w c1874w = (C1874w) obj2;
                return CollectionsKt.listOf(Integer.valueOf(c1874w.echo.alpha()), Integer.valueOf(c1874w.echo.bravo()));
            case 12:
                _init_$lambda$1 = NetworkStatusHelper._init_$lambda$1(((Long) obj).longValue(), (Function0) obj2);
                return _init_$lambda$1;
            case 13:
                ((Integer) obj2).getClass();
                return new C1919b(1);
            case 14:
                t tVar = (t) obj2;
                return CollectionsKt.listOf(Integer.valueOf(tVar.delta.alpha()), Integer.valueOf(tVar.delta.bravo()));
            case 15:
                return ComposableSingletons$InputContainerViewKt.bravo((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 16:
                return ComposableSingletons$InputContainerViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 17:
                return ComposableSingletons$InputFieldViewKt.bravo((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 18:
                return ComposableSingletons$InputFieldViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 19:
                PhoneFieldPreview$lambda$7$lambda$6 = PhoneFieldViewKt.PhoneFieldPreview$lambda$7$lambda$6(((Integer) obj).intValue(), (String) obj2);
                return PhoneFieldPreview$lambda$7$lambda$6;
            case 20:
                c0 c0Var = (c0) obj2;
                Float valueOf = Float.valueOf(c0Var.alpha());
                if (((K) ((t0) c0Var.foxtrot).getValue()) == K.alpha) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return CollectionsKt.listOf(valueOf, Boolean.valueOf(z2));
            case 21:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (!c0585q6.magenta(intValue6 & 1, z11)) {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z11)) {
                    s.alpha(AbstractC3076w3.charlie(R.drawable.leading_icon, c0585q7, 6), "Search", null, 0L, c0585q7, 48, 12);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue8 & 1, z11)) {
                    AbstractC0141o0.bravo(AbstractC2719n0.echo(), null, V.kilo(pVar, 32), c.delta, c0585q8, 3504, 0);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 24:
                InterfaceC0581m interfaceC0581m9 = (InterfaceC0581m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q9 = (C0585q) interfaceC0581m9;
                if (c0585q9.magenta(intValue9 & 1, z11)) {
                    AbstractC0141o0.bravo(X.bravo(), null, V.kilo(pVar, 32), c.oscar, c0585q9, 3504, 0);
                } else {
                    c0585q9.ochre();
                }
                return Unit.INSTANCE;
            case 25:
                InterfaceC0581m interfaceC0581m10 = (InterfaceC0581m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z11 = true;
                }
                C0585q c0585q10 = (C0585q) interfaceC0581m10;
                if (c0585q10.magenta(intValue10 & 1, z11)) {
                    AbstractC0141o0.bravo(hg.c.alpha(), null, V.kilo(pVar, 32), ((O) c0585q10.kilo(Q.alpha)).alpha, c0585q10, 432, 0);
                } else {
                    c0585q10.ochre();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC3150c.bravo((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC3150c.charlie((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 28:
                InterfaceC0581m interfaceC0581m11 = (InterfaceC0581m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q11 = (C0585q) interfaceC0581m11;
                if (c0585q11.magenta(intValue11 & 1, z10)) {
                    T.s bravo = androidx.compose.foundation.a.bravo(V.charlie, ((O) c0585q11.kilo(Q.alpha)).romeo, ao.alpha);
                    ap delta = AbstractC0547m.delta(d.teal, false);
                    long j5 = c0585q11.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q11.mike();
                    T.s charlie = T.a.charlie(bravo, c0585q11);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q11.white();
                    if (c0585q11.lime) {
                        c0585q11.lima(c2550j);
                    } else {
                        c0585q11.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q11, delta);
                    C0564b.blue(C2551k.echo, c0585q11, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q11.lime || !Intrinsics.areEqual(c0585q11.jade(), Integer.valueOf(i4))) {
                        ad.blue(i4, c0585q11, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q11, charlie);
                    G1.bravo(V.kilo(pVar, 24), 0L, 2, 0L, 0, c0585q11, 390, 26);
                    c0585q11.quebec(true);
                } else {
                    c0585q11.ochre();
                }
                return Unit.INSTANCE;
            default:
                CharSequence s3 = (CharSequence) obj;
                int intValue12 = ((Integer) obj2).intValue();
                Intrinsics.echo(s3, "s");
                return Character.valueOf(s3.charAt(intValue12));
        }
    }
}
