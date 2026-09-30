package Vc;

import D0.an;
import F.AbstractC0141o0;
import F.G2;
import F.K1;
import H0.v;
import T.s;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.app.network.network.models.Transaction;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2634d5;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.Q2;

/* loaded from: classes2.dex */
public abstract class g {
    public static final long alpha = ao.delta(4280756010L);
    public static final long bravo = ao.delta(4288782762L);
    public static final long charlie = ao.delta(4279673674L);
    public static final long delta = ao.delta(4292617766L);
    public static final long echo = ao.delta(4294898418L);
    public static final long foxtrot = ao.delta(4293983732L);

    /* JADX WARN: Code restructure failed: missing block: B:92:0x03fc, code lost:
    
        if (r2 == null) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(Transaction transaction, String str, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        T.p pVar2;
        float f5;
        boolean z10;
        boolean z11;
        long j5;
        int i10;
        String str2;
        long j6;
        Intrinsics.echo(transaction, "transaction");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1380497634);
        if (c0585q.india(transaction)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5 | 384;
        if ((i11 & 131) != 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            Float amount = transaction.getAmount();
            if (amount != null) {
                f5 = amount.floatValue();
            } else {
                f5 = 0.0f;
            }
            if (f5 > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f5 < 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j7 = delta;
            long j10 = charlie;
            if (z10) {
                j5 = j10;
            } else if (z11) {
                j5 = j7;
            } else {
                j5 = alpha;
            }
            if (z10) {
                j7 = j10;
            } else if (!z11) {
                j7 = bravo;
            }
            String transactionType = transaction.getTransactionType();
            if (transactionType != null && StringsKt.beige(transactionType, "wallet", true)) {
                i10 = R.drawable.ic_wallet_icon;
            } else {
                i10 = R.drawable.ic_cash_on_delivery;
            }
            if (z10) {
                str2 = "+".concat(Q2.bravo(f5));
            } else if (z11) {
                str2 = Q2.bravo(f5);
            } else {
                str2 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            String str3 = str2;
            s charlie2 = V.charlie(pVar3, 1.0f);
            C0537c c0537c = AbstractC0542h.charlie;
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            long j11 = c0585q.magenta;
            int i12 = (int) (j11 ^ (j11 >>> 32));
            I mike = c0585q.mike();
            s charlie3 = T.a.charlie(charlie2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie3);
            float f10 = 12;
            float f11 = 4;
            s tango = AbstractC0538d.tango(V.charlie(pVar3, 1.0f), f11, f10);
            float f12 = 8;
            long j12 = j7;
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(f12), iVar, c0585q, 6);
            long j13 = c0585q.magenta;
            int i13 = (int) (j13 ^ (j13 >>> 32));
            I mike2 = c0585q.mike();
            s charlie4 = T.a.charlie(tango, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            s charlie5 = V.charlie(pVar3, 1.0f);
            T.j jVar = T.d.f2060c;
            S alpha4 = Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            long j14 = c0585q.magenta;
            int i14 = (int) (j14 ^ (j14 >>> 32));
            I mike3 = c0585q.mike();
            s charlie6 = T.a.charlie(charlie5, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(i10, c0585q, 0), null, V.kilo(pVar3, 24), j12, c0585q, 432, 0);
            AbstractC0538d.echo(V.oscar(pVar3, f10), c0585q);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0554u alpha5 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            long j15 = c0585q.magenta;
            int i15 = (int) (j15 ^ (j15 >>> 32));
            I mike4 = c0585q.mike();
            s charlie7 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha5);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q, i15, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie7);
            String transactionTypeTitle = transaction.getTransactionTypeTitle();
            String str4 = "";
            if (transactionTypeTitle == null) {
                transactionTypeTitle = "";
            }
            long charlie8 = AbstractC2636d7.charlie(16);
            H0.n nVar = Db.g.alpha;
            v vVar = v.f1407a;
            long j16 = alpha;
            G2.bravo(transactionTypeTitle, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new an(j16, charlie8, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 3072, 57342);
            C0585q c0585q2 = c0585q;
            String platformName = transaction.getPlatformName();
            if (platformName != null && !StringsKt.gray(platformName)) {
                c0585q2.purple(-144521771);
                String platformName2 = transaction.getPlatformName();
                if (platformName2 == null) {
                    platformName2 = "";
                }
                G2.bravo(platformName2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j16, AbstractC2636d7.charlie(12), v.yellow, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
                c0585q2 = c0585q2;
            } else {
                c0585q2.purple(-148524770);
            }
            c0585q2.quebec(false);
            c0585q2.quebec(true);
            AbstractC0538d.echo(V.oscar(pVar3, f12), c0585q2);
            C0554u alpha6 = AbstractC0553t.alpha(c0537c, T.d.f2064h, c0585q2, 48);
            long j17 = c0585q2.magenta;
            int i16 = (int) (j17 ^ (j17 >>> 32));
            I mike5 = c0585q2.mike();
            s charlie9 = T.a.charlie(pVar3, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha6);
            C0564b.blue(c2549i2, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q2, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie9);
            C0585q c0585q3 = c0585q2;
            c.alpha(str3, new an(j5, AbstractC2636d7.charlie(16), v.f1409c, null, nVar, 0L, 0, 0L, 0, 16777176), null, AbstractC2636d7.charlie(11), 0, 0, c0585q3, 3072, 52);
            try {
                str4 = AbstractC2634d5.bravo(transaction.getCreatedAt());
            } catch (Exception unused) {
            }
            long charlie10 = AbstractC2636d7.charlie(12);
            H0.n nVar2 = Db.g.alpha;
            G2.bravo(str4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(bravo, charlie10, v.yellow, null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q3, 0, 0, 65534);
            c0585q = c0585q3;
            c0585q.quebec(true);
            c0585q.quebec(true);
            String note = transaction.getNote();
            if (note != null) {
                if (StringsKt.gray(note)) {
                    note = null;
                }
            }
            note = transaction.getTransactionNote();
            if (note != null && !StringsKt.gray(note)) {
                c0585q.purple(310104157);
                if (z11) {
                    j6 = echo;
                } else {
                    j6 = foxtrot;
                }
                s whiskey = AbstractC0538d.whiskey(pVar3, 36, 0.0f, 0.0f, 0.0f, 14);
                S alpha7 = Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 0);
                long j18 = c0585q.magenta;
                int i17 = (int) (j18 ^ (j18 >>> 32));
                I mike6 = c0585q.mike();
                s charlie11 = T.a.charlie(whiskey, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j2);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, alpha7);
                C0564b.blue(C2551k.echo, c0585q, mike6);
                C2549i c2549i5 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                    ad.blue(i17, c0585q, i17, c2549i5);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie11);
                an anVar = new an(j5, AbstractC2636d7.charlie(12), v.f1409c, null, nVar2, 0L, 0, 0L, 0, 16777176);
                s tango2 = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(pVar3, j6, AbstractC2094g.bravo(100)), f12, f11);
                pVar3 = pVar3;
                G2.bravo(note, tango2, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q, 0, 0, 65532);
                c0585q = c0585q;
                c0585q.quebec(true);
            } else {
                c0585q.purple(304348728);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            K1.delta(null, 1, Db.c.azure, c0585q, 48, 1);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.n(transaction, str, pVar2, i4, 5);
        }
    }
}
