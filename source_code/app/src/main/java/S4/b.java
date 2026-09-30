package S4;

import A2.ai;
import F.AbstractC0141o0;
import F.G2;
import Q0.n;
import Sb.d;
import Vc.i;
import Wb.ab;
import Xd.l;
import Y1.ag;
import Zb.g;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.lazy.layout.ar;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import b.g0;
import com.checkout.components.card.ui.component.cardnumber.ComposableSingletons$CardNumberViewKt;
import com.checkout.components.card.ui.component.expirydate.ComposableSingletons$ExpiryDateViewKt;
import com.checkout.components.kmp.rememberme.di.KoinModulesKt;
import com.checkout.components.kmp.rememberme.preview.OTPViewPreviewKt;
import com.checkout.components.kmp.rememberme.view.common.ComposableSingletons$ContainerViewKt;
import com.checkout.components.kmp.rememberme.view.dialog.ComposableSingletons$InfoDialogRowViewKt;
import com.checkout.components.kmp.rememberme.view.ui.ComposableSingletons$InfoTextViewKt;
import com.checkout.components.kmp.rememberme.view.ui.ComposableSingletons$SecuredTextViewKt;
import delivery.samurai.android.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import z.s;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean OTPViewPreview$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        switch (this.alpha) {
            case 0:
                OTPViewPreview$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9 = OTPViewPreviewKt.OTPViewPreview$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9(((Integer) obj).intValue(), (String) obj2);
                return Boolean.valueOf(OTPViewPreview$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9);
            case 1:
                ((Integer) obj2).getClass();
                d.foxtrot((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (!c0585q.magenta(intValue & 1, z2)) {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                Sc.a.charlie((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 4:
                return ComposableSingletons$ContainerViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 5:
                return ComposableSingletons$ContainerViewKt.bravo((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 6:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_baseline_close_24, c0585q2, 6), "Close", null, ao.delta(4280756010L), c0585q2, 3120, 4);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                return ComposableSingletons$InfoDialogRowViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 8:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    s.alpha(AbstractC3076w3.charlie(R.drawable.ic_baseline_close_24, c0585q3, 6), null, null, ab.delta, c0585q3, 3120, 4);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                Wf.a.alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 10:
                return ComposableSingletons$InfoTextViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 11:
                return ComposableSingletons$InfoTextViewKt.charlie((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 12:
                return ComposableSingletons$SecuredTextViewKt.bravo((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 13:
                return ComposableSingletons$SecuredTextViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 14:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    s.bravo(AbstractC2056a.alpha(), AbstractC3086y3.bravo(c0585q4, R.string.close), null, ao.delta(4280756010L), c0585q4, 3072, 4);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 15:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z13)) {
                    T.s bravo = androidx.compose.foundation.a.bravo(V.charlie, ao.delta(2566914048L), ao.alpha);
                    ap delta = AbstractC0547m.delta(T.d.teal, false);
                    long j5 = c0585q5.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q5.mike();
                    T.s charlie = T.a.charlie(bravo, c0585q5);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q5.white();
                    if (c0585q5.lime) {
                        c0585q5.lima(c2550j);
                    } else {
                        c0585q5.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q5, delta);
                    C0564b.blue(C2551k.echo, c0585q5, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i4))) {
                        ad.blue(i4, c0585q5, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q5, charlie);
                    Object jade = c0585q5.jade();
                    if (jade == C0580l.alpha) {
                        jade = new i(20);
                        c0585q5.f(jade);
                    }
                    g.alpha((Function0) jade, c0585q5, 6);
                    c0585q5.quebec(true);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 16:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z14)) {
                    T.s bravo2 = androidx.compose.foundation.a.bravo(V.charlie, ao.delta(2566914048L), ao.alpha);
                    ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                    long j6 = c0585q6.magenta;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q6.mike();
                    T.s charlie2 = T.a.charlie(bravo2, c0585q6);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q6.white();
                    if (c0585q6.lime) {
                        c0585q6.lima(c2550j2);
                    } else {
                        c0585q6.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q6, delta2);
                    C0564b.blue(C2551k.echo, c0585q6, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q6.lime || !Intrinsics.areEqual(c0585q6.jade(), Integer.valueOf(i5))) {
                        ad.blue(i5, c0585q6, i5, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q6, charlie2);
                    Object jade2 = c0585q6.jade();
                    if (jade2 == C0580l.alpha) {
                        jade2 = new i(21);
                        c0585q6.f(jade2);
                    }
                    Zb.d.delta((Function0) jade2, c0585q6, 6);
                    c0585q6.quebec(true);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 17:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z15)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q7, R.string.active_order), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q7, 0, 0, 131070);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 18:
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue8 & 1, z16)) {
                    AbstractC0141o0.bravo(ai.charlie(), AbstractC3086y3.bravo(c0585q8, R.string.back_button), null, C0366t.echo, c0585q8, 3072, 4);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 19:
                InterfaceC0581m interfaceC0581m9 = (InterfaceC0581m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                C0585q c0585q9 = (C0585q) interfaceC0581m9;
                if (c0585q9.magenta(intValue9 & 1, z17)) {
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_order_support_icon, c0585q9, 6), AbstractC3086y3.bravo(c0585q9, R.string.action_call_support), null, C0366t.echo, c0585q9, 3072, 4);
                } else {
                    c0585q9.ochre();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                g.bravo((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                g.echo((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 22:
                return ((ag) obj2).golf();
            case 23:
                float intValue10 = ((Integer) obj).intValue() / 2.0f;
                float f5 = -1.0f;
                if (((n) obj2) != n.alpha) {
                    f5 = (-1.0f) * (-1);
                }
                return Integer.valueOf(Math.round((1 + f5) * intValue10));
            case 24:
                Map charlie3 = ((ar) obj2).charlie();
                if (charlie3.isEmpty()) {
                    return null;
                }
                return charlie3;
            case 25:
                return Integer.valueOf(((g0) obj2).foxtrot());
            case 26:
                return ComposableSingletons$CardNumberViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 27:
                return ComposableSingletons$ExpiryDateViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 28:
                return KoinModulesKt.mike((og.a) obj, (kg.a) obj2);
            default:
                return KoinModulesKt.november((og.a) obj, (kg.a) obj2);
        }
    }

    public /* synthetic */ b(int i4, int i5) {
        this.alpha = i5;
    }
}
