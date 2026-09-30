package Jc;

import Ec.ab;
import Ec.ay;
import Ec.z;
import F.G1;
import F.G2;
import H0.v;
import Jb.aw;
import T.s;
import a0.C0366t;
import a0.an;
import a0.ao;
import a0.au;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.app.network.network.models.ActiveSuspension;
import com.app.network.network.models.SuspensionHistoryItem;
import com.checkout.components.insight.common.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import i.AbstractC1876y;
import i.C1874w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;

/* loaded from: classes2.dex */
public abstract class o {
    public static final long alpha = ao.delta(4292617766L);
    public static final long bravo = ao.delta(4294472049L);
    public static final long charlie = ao.delta(4294898418L);
    public static final long delta = ao.delta(4279673674L);
    public static final long echo = ao.delta(4293983732L);
    public static final long foxtrot = ao.delta(4294967295L);
    public static final long golf = ao.delta(4294243573L);
    public static final long hotel = ao.delta(4285624698L);
    public static final long india = ao.delta(4280756010L);
    public static final H0.n juliet = new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));
    public static final List kilo;

    static {
        Locale locale = Locale.ENGLISH;
        kilo = CollectionsKt.listOf(new SimpleDateFormat(Constants.DATE_TIME_PATTERN_ISO_8601, locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(ActiveSuspension suspension, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        String categoryText;
        boolean z10;
        C2549i c2549i;
        C2549i c2549i2;
        T.i iVar;
        C2549i c2549i3;
        C2549i c2549i4;
        C2550j c2550j;
        C2549i c2549i5;
        String str;
        Date kilo2;
        String str2;
        String remainingDurationString;
        Intrinsics.echo(suspension, "suspension");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1874274763);
        if (c0585q.india(suspension)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if ((i11 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "ar")) {
                categoryText = suspension.getCategoryTextAr();
            } else {
                categoryText = suspension.getCategoryText();
            }
            String str3 = categoryText;
            if (!Intrinsics.areEqual(suspension.getType(), "PERMANENT") && (remainingDurationString = suspension.getRemainingDurationString()) != null && !StringsKt.gray(remainingDurationString) && suspension.getPercentage() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            T.p pVar = T.p.alpha;
            float f5 = 16;
            s tango = AbstractC0538d.tango(V.charlie(pVar, 1.0f), f5, 24);
            C0537c c0537c = AbstractC0542h.charlie;
            T.i iVar2 = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar2, c0585q, 0);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C2549i c2549i6 = C2551k.foxtrot;
            C0564b.blue(c2549i6, c0585q, alpha2);
            C2549i c2549i7 = C2551k.echo;
            C0564b.blue(c2549i7, c0585q, mike);
            C2549i c2549i8 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i8);
            }
            C2549i c2549i9 = C2551k.delta;
            C0564b.blue(c2549i9, c0585q, charlie2);
            s charlie3 = V.charlie(pVar, 1.0f);
            float f10 = 1;
            float f11 = 8;
            C2093f bravo2 = AbstractC2094g.bravo(f11);
            long j6 = alpha;
            s bravo3 = androidx.compose.foundation.a.bravo(R3.charlie(charlie3, f10, j6, bravo2), foxtrot, AbstractC2094g.bravo(f11));
            T.j jVar = T.d.f2060c;
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.india(0, jVar), iVar2, c0585q, 54);
            long j7 = c0585q.magenta;
            int i13 = (int) (j7 ^ (j7 >>> 32));
            I mike2 = c0585q.mike();
            s charlie4 = T.a.charlie(bravo3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i6, c0585q, alpha3);
            C0564b.blue(c2549i7, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                c2549i = c2549i8;
                ad.blue(i13, c0585q, i13, c2549i);
            } else {
                c2549i = c2549i8;
            }
            C0564b.blue(c2549i9, c0585q, charlie4);
            s charlie5 = V.charlie(pVar, 1.0f);
            an anVar = ao.alpha;
            float f12 = 12;
            s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(charlie5, charlie, anVar), f5, f12, f5, f12);
            S alpha4 = Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
            long j10 = c0585q.magenta;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            I mike3 = c0585q.mike();
            s charlie6 = T.a.charlie(victor, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i6, c0585q, alpha4);
            C0564b.blue(c2549i7, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i);
            }
            C0564b.blue(c2549i9, c0585q, charlie6);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            float f13 = 4;
            C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(f13), iVar2, c0585q, 6);
            long j11 = c0585q.magenta;
            int i15 = (int) (j11 ^ (j11 >>> 32));
            I mike4 = c0585q.mike();
            s charlie7 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i6, c0585q, alpha5);
            C0564b.blue(c2549i7, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(c2549i9, c0585q, charlie7);
            String bravo4 = AbstractC3086y3.bravo(c0585q, R.string.suspended);
            long charlie8 = AbstractC2636d7.charlie(18);
            v vVar = new v(700);
            H0.n nVar = juliet;
            G2.bravo(bravo4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, charlie8, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            C0585q c0585q2 = c0585q;
            String unblockAt = suspension.getUnblockAt();
            if (unblockAt != null && !StringsKt.gray(unblockAt)) {
                c0585q2.purple(1416282882);
                String bravo5 = AbstractC3086y3.bravo(c0585q2, R.string.account_suspended_until);
                String unblockAt2 = suspension.getUnblockAt();
                Intrinsics.checkNotNull(unblockAt2);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    kilo2 = kilo(unblockAt2);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    str = Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                if (kilo2 != null) {
                    Locale locale = Locale.ENGLISH;
                    str2 = new SimpleDateFormat("d MMM,", locale).format(kilo2) + "\n" + new SimpleDateFormat("h:mm a", locale).format(kilo2);
                    if (str2 == null) {
                    }
                    str = Result.m206constructorimpl(str2);
                    if (!(str instanceof kotlin.k)) {
                        unblockAt2 = str;
                    }
                    G2.bravo(ad.amber(bravo5, " ", unblockAt2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(bravo, AbstractC2636d7.charlie(12), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
                    c0585q2 = c0585q2;
                }
                str2 = unblockAt2;
                str = Result.m206constructorimpl(str2);
                if (!(str instanceof kotlin.k)) {
                }
                G2.bravo(ad.amber(bravo5, " ", unblockAt2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(bravo, AbstractC2636d7.charlie(12), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
                c0585q2 = c0585q2;
            } else {
                c0585q2.purple(1404050685);
            }
            c0585q2.quebec(false);
            c0585q2.quebec(true);
            juliet(suspension.getType(), c0585q2, 0);
            c0585q2.quebec(true);
            s sierra = AbstractC0538d.sierra(V.charlie(pVar, 1.0f), f5);
            int i16 = 6;
            C0554u alpha6 = AbstractC0553t.alpha(AbstractC0542h.india(f5, jVar), iVar2, c0585q2, 6);
            long j12 = c0585q2.magenta;
            int i17 = (int) (j12 ^ (j12 >>> 32));
            I mike5 = c0585q2.mike();
            s charlie9 = T.a.charlie(sierra, c0585q2);
            C2550j c2550j3 = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j3);
            } else {
                c0585q2.i();
            }
            C2549i c2549i10 = C2551k.foxtrot;
            C0564b.blue(c2549i10, c0585q2, alpha6);
            C2549i c2549i11 = C2551k.echo;
            C0564b.blue(c2549i11, c0585q2, mike5);
            C2549i c2549i12 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                ad.blue(i17, c0585q2, i17, c2549i12);
            }
            C2549i c2549i13 = C2551k.delta;
            C0564b.blue(c2549i13, c0585q2, charlie9);
            if (z10) {
                c0585q2.purple(-1795756077);
                s charlie10 = V.charlie(pVar, 1.0f);
                S alpha7 = Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q2, 54);
                long j13 = c0585q2.magenta;
                int i18 = (int) (j13 ^ (j13 >>> 32));
                I mike6 = c0585q2.mike();
                s charlie11 = T.a.charlie(charlie10, c0585q2);
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j3);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(c2549i10, c0585q2, alpha7);
                C0564b.blue(c2549i11, c0585q2, mike6);
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i18))) {
                    ad.blue(i18, c0585q2, i18, c2549i12);
                }
                C0564b.blue(c2549i13, c0585q2, charlie11);
                C0554u alpha8 = AbstractC0553t.alpha(AbstractC0542h.golf(f13), iVar2, c0585q2, 6);
                long j14 = c0585q2.magenta;
                int i19 = (int) (j14 ^ (j14 >>> 32));
                I mike7 = c0585q2.mike();
                s charlie12 = T.a.charlie(pVar, c0585q2);
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j3);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(c2549i10, c0585q2, alpha8);
                C0564b.blue(c2549i11, c0585q2, mike7);
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i19))) {
                    ad.blue(i19, c0585q2, i19, c2549i12);
                }
                C0564b.blue(c2549i13, c0585q2, charlie12);
                C0585q c0585q3 = c0585q2;
                c2550j = c2550j3;
                c2549i3 = c2549i13;
                c2549i4 = c2549i12;
                c2549i5 = c2549i10;
                c2549i2 = c2549i11;
                iVar = iVar2;
                G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.time_remaining_new), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(hotel, AbstractC2636d7.charlie(10), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q3, 0, 0, 65534);
                String remainingDurationString2 = suspension.getRemainingDurationString();
                Intrinsics.checkNotNull(remainingDurationString2);
                G2.bravo(remainingDurationString2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(24), new v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q3, 0, 0, 65534);
                c0585q2 = c0585q3;
                c0585q2.quebec(true);
                Double percentage = suspension.getPercentage();
                Intrinsics.checkNotNull(percentage);
                charlie((float) percentage.doubleValue(), c0585q2, 0);
                c0585q2.quebec(true);
                s bravo6 = androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar, 1.0f), f10), golf, anVar);
                i16 = 6;
                AbstractC0547m.alpha(bravo6, c0585q2, 6);
            } else {
                c2549i2 = c2549i11;
                iVar = iVar2;
                c2549i3 = c2549i13;
                c2549i4 = c2549i12;
                c2550j = c2550j3;
                c2549i5 = c2549i10;
                c0585q2.purple(-1808904231);
            }
            c0585q2.quebec(false);
            C0554u alpha9 = AbstractC0553t.alpha(AbstractC0542h.golf(f13), iVar, c0585q2, i16);
            long j15 = c0585q2.magenta;
            int i20 = (int) (j15 ^ (j15 >>> 32));
            I mike8 = c0585q2.mike();
            s charlie13 = T.a.charlie(pVar, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i5, c0585q2, alpha9);
            C0564b.blue(c2549i2, c0585q2, mike8);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i20))) {
                ad.blue(i20, c0585q2, i20, c2549i4);
            }
            C0564b.blue(c2549i3, c0585q2, charlie13);
            C0585q c0585q4 = c0585q2;
            G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.reason), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(hotel, AbstractC2636d7.charlie(12), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q4, 0, 0, 65534);
            if (str3 == null) {
                str3 = "-";
            }
            G2.bravo(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(india, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q4, 0, 0, 65534);
            c0585q = c0585q4;
            i10 = 1;
            c0585q.quebec(true);
            c0585q.quebec(true);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            i10 = 1;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j(suspension, i4, i10);
        }
    }

    public static final void bravo(ActiveSuspension activeSuspension, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(381983915);
        if (c0585q.india(activeSuspension)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (activeSuspension == null) {
                c0585q.purple(-1980425758);
                delta(0, null, c0585q, AbstractC3086y3.bravo(c0585q, R.string.no_active_suspension));
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1980336633);
                alpha(activeSuspension, c0585q, i10 & 14);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j(activeSuspension, i4, 0);
        }
    }

    public static final void charlie(final float f5, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1572598567);
        if (c0585q.delta(f5)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        boolean z10 = false;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.k kVar = T.d.teal;
            s kilo2 = V.kilo(T.p.alpha, 56);
            ap delta2 = AbstractC0547m.delta(kVar, false);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(kilo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            FillElement fillElement = V.charlie;
            float f10 = 5;
            if ((i10 & 14) == 4) {
                z10 = true;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Function0() { // from class: Jc.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(f5 / 100.0f);
                    }
                };
                c0585q.f(jade);
            }
            G1.alpha((Function0) jade, fillElement, alpha, f10, golf, 1, 0.0f, c0585q, 28080);
            G2.bravo(((int) f5) + "%", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(india, AbstractC2636d7.charlie(12), new v(700), null, juliet, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(f5, i4);
        }
    }

    public static final void delta(int i4, s sVar, InterfaceC0581m interfaceC0581m, String str) {
        int i5;
        boolean z2;
        s sVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2092114858);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5 | 48;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            FillElement fillElement = V.charlie;
            ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(fillElement, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.echo, T.d.f2063g, c0585q, 54);
            long j6 = c0585q.magenta;
            int i12 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            s echo2 = V.echo(V.charlie(pVar, 1.0f), 180);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new aw(2);
                c0585q.f(jade);
            }
            androidx.compose.ui.viewinterop.a.alpha((Function1) jade, echo2, null, c0585q, 54, 4);
            G2.bravo(str, AbstractC0538d.whiskey(pVar, 0.0f, 12, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(hotel, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), null, juliet, 0L, 3, 0L, 0, 16744408), c0585q, (14 & i10) | 48, 0, 65532);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            sVar2 = pVar;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new k(i4, 0, sVar2, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e7, code lost:
    
        if (r17 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void echo(final List list, final boolean z2, final boolean z10, final boolean z11, final Function0 function0, final Function0 function02, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        C1874w c1874w;
        String str;
        String str2;
        Date kilo2;
        String str3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-31360089);
        if ((i4 & 6) == 0) {
            if (c0585q.india(list)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z10)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z11)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(function0)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.india(function02)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        int i16 = i5;
        if ((74899 & i16) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0585q.magenta(i16 & 1, z12)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String createdAt = ((SuspensionHistoryItem) obj).getCreatedAt();
                if (createdAt != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        kilo2 = kilo(createdAt);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        str = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    if (kilo2 != null) {
                        str3 = new SimpleDateFormat("MMM yyyy", Locale.ENGLISH).format(kilo2);
                        if (str3 == null) {
                        }
                        str = Result.m206constructorimpl(str3);
                        if (!(str instanceof kotlin.k)) {
                            createdAt = str;
                        }
                        str2 = createdAt;
                    }
                    str3 = createdAt;
                    str = Result.m206constructorimpl(str3);
                    if (!(str instanceof kotlin.k)) {
                    }
                    str2 = createdAt;
                }
                str2 = "-";
                String str4 = str2;
                Object obj2 = linkedHashMap.get(str4);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(str4, obj2);
                }
                ((List) obj2).add(obj);
            }
            C1874w alpha2 = AbstractC1876y.alpha(c0585q);
            boolean golf2 = c0585q.golf(alpha2);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z16 = z13 | golf2;
            if ((i16 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z17 = z16 | z14;
            if ((458752 & i16) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z18 = z17 | z15;
            Object jade = c0585q.jade();
            if (z18 || jade == C0580l.alpha) {
                c1874w = alpha2;
                n nVar = new n(c1874w, z2, z10, function02, null);
                c0585q.f(nVar);
                jade = nVar;
            } else {
                c1874w = alpha2;
            }
            C0564b.foxtrot((Xd.l) jade, c0585q, c1874w);
            int i17 = i16 >> 9;
            G.l.alpha(z11, function0, V.charlie, null, null, null, P.e.echo(857217281, new ab(c1874w, linkedHashMap, z2, 1), c0585q), c0585q, (i17 & 14) | 1573248 | (i17 & 112));
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Jc.f
                @Override // Xd.l
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    o.echo(list, z2, z10, z11, function0, function02, (InterfaceC0581m) obj3, C0564b.cyan(i4 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void foxtrot(Kc.e eVar, boolean z2, Function0 function0, Function0 function02, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        Function0 function03;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1870907646);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            z10 = z2;
            if (c0585q.hotel(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        } else {
            z10 = z2;
        }
        if ((i4 & 384) == 0) {
            function03 = function0;
            if (c0585q.india(function03)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        } else {
            function03 = function0;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(function02)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q.magenta(i5 & 1, z11)) {
            if (eVar instanceof Kc.c) {
                c0585q.purple(-418813735);
                FillElement fillElement = V.charlie;
                ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                long j5 = c0585q.magenta;
                int i14 = (int) (j5 ^ (j5 >>> 32));
                I mike = c0585q.mike();
                s charlie2 = T.a.charlie(fillElement, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, delta2);
                C0564b.blue(C2551k.echo, c0585q, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                    ad.blue(i14, c0585q, i14, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie2);
                G1.bravo(null, alpha, 0.0f, 0L, 0, c0585q, 48, 29);
                c0585q.quebec(true);
                c0585q.quebec(false);
            } else if (eVar instanceof Kc.a) {
                c0585q.purple(-418597572);
                int i15 = i5 >> 3;
                G.l.alpha(z10, function03, V.charlie, null, null, null, a.alpha, c0585q, (i15 & 14) | 1573248 | (i15 & 112));
                c0585q.quebec(false);
            } else if (eVar instanceof Kc.b) {
                c0585q.purple(-418262307);
                int i16 = i5 >> 3;
                G.l.alpha(z2, function0, V.charlie, null, null, null, P.e.echo(-517145816, new Cb.d(6, eVar), c0585q), c0585q, (i16 & 14) | 1573248 | (i16 & 112));
                c0585q.quebec(false);
            } else if (eVar instanceof Kc.d) {
                c0585q.purple(-417955314);
                Kc.d dVar = (Kc.d) eVar;
                echo(dVar.alpha, dVar.charlie, dVar.bravo, z2, function0, function02, c0585q, (i5 << 6) & 523264);
                c0585q = c0585q;
                c0585q.quebec(false);
            } else {
                throw ad.black(c0585q, 1649056949, false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new z(eVar, z2, function0, function02, i4, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0250, code lost:
    
        if (r4 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024d  */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void golf(SuspensionHistoryItem item, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        String categoryText;
        boolean z10;
        long j5;
        long j6;
        long j7;
        String oscar;
        String str;
        String str2;
        Date kilo2;
        String str3;
        boolean z11;
        T.p pVar;
        ?? r32;
        C0585q c0585q2;
        C0585q c0585q3;
        boolean z12;
        C0585q c0585q4;
        Intrinsics.echo(item, "item");
        C0585q c0585q5 = (C0585q) interfaceC0581m;
        c0585q5.silver(472318106);
        if (c0585q5.india(item)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q5.magenta(i10 & 1, z2)) {
            if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "ar")) {
                categoryText = item.getCategoryTextAr();
            } else {
                categoryText = item.getCategoryText();
            }
            String str4 = categoryText;
            if (!Intrinsics.areEqual(item.getAction(), "UN_SUSPEND") && !Intrinsics.areEqual(item.getAction(), "UNSUSPEND")) {
                z10 = false;
            } else {
                z10 = true;
            }
            long j10 = alpha;
            long j11 = delta;
            if (z10) {
                j5 = j11;
            } else {
                j5 = j10;
            }
            if (z10) {
                j6 = echo;
            } else {
                j6 = charlie;
            }
            if (z10) {
                j7 = j11;
            } else {
                j7 = j10;
            }
            if (z10) {
                oscar = Q0.c.oscar(c0585q5, -1368816610, R.string.unsuspended, c0585q5, false);
            } else {
                oscar = Q0.c.oscar(c0585q5, -1368815140, R.string.suspended, c0585q5, false);
            }
            T.p pVar2 = T.p.alpha;
            float f5 = 1;
            float f10 = 12;
            s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(R3.charlie(V.charlie(pVar2, 1.0f), f5, j5, AbstractC2094g.bravo(f10)), j6, AbstractC2094g.bravo(f10)), 16, 14);
            C0540f golf2 = AbstractC0542h.golf(10);
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(golf2, iVar, c0585q5, 6);
            long j12 = c0585q5.magenta;
            int i11 = (int) (j12 ^ (j12 >>> 32));
            I mike = c0585q5.mike();
            s charlie2 = T.a.charlie(tango, c0585q5);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q5.white();
            if (c0585q5.lime) {
                c0585q5.lima(c2550j);
            } else {
                c0585q5.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q5, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q5, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q5, i11, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q5, charlie2);
            s charlie3 = V.charlie(pVar2, 1.0f);
            S alpha3 = Q.alpha(AbstractC0542h.golf, T.d.f2060c, c0585q5, 54);
            long j13 = j5;
            long j14 = c0585q5.magenta;
            int i12 = (int) (j14 ^ (j14 >>> 32));
            I mike2 = c0585q5.mike();
            s charlie4 = T.a.charlie(charlie3, c0585q5);
            c0585q5.white();
            if (c0585q5.lime) {
                c0585q5.lima(c2550j);
            } else {
                c0585q5.i();
            }
            C0564b.blue(c2549i, c0585q5, alpha3);
            C0564b.blue(c2549i2, c0585q5, mike2);
            if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q5, i12, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q5, charlie4);
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(8), iVar, c0585q5, 6);
            long j15 = c0585q5.magenta;
            int i13 = (int) (j15 ^ (j15 >>> 32));
            I mike3 = c0585q5.mike();
            s charlie5 = T.a.charlie(pVar2, c0585q5);
            c0585q5.white();
            if (c0585q5.lime) {
                c0585q5.lima(c2550j);
            } else {
                c0585q5.i();
            }
            C0564b.blue(c2549i, c0585q5, alpha4);
            C0564b.blue(c2549i2, c0585q5, mike3);
            if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q5, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q5, charlie5);
            long charlie6 = AbstractC2636d7.charlie(17);
            v vVar = new v(700);
            H0.n nVar = juliet;
            G2.bravo(oscar, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j7, charlie6, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q5, 0, 0, 65534);
            String createdAt = item.getCreatedAt();
            if (createdAt != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    kilo2 = kilo(createdAt);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    str = Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                if (kilo2 != null) {
                    str3 = new SimpleDateFormat("d MMM | h:mm a", Locale.ENGLISH).format(kilo2);
                    if (str3 == null) {
                    }
                    str = Result.m206constructorimpl(str3);
                    if (!(str instanceof kotlin.k)) {
                        createdAt = str;
                    }
                    str2 = createdAt;
                }
                str3 = createdAt;
                str = Result.m206constructorimpl(str3);
                if (!(str instanceof kotlin.k)) {
                }
                str2 = createdAt;
            }
            str2 = "-";
            G2.bravo(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j7, AbstractC2636d7.charlie(13), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q5, 0, 0, 65534);
            C0585q c0585q6 = c0585q5;
            c0585q6.quebec(true);
            if (!z10) {
                c0585q6.purple(-2044336811);
                C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(6), T.d.f2064h, c0585q6, 54);
                long j16 = c0585q6.magenta;
                int i14 = (int) (j16 ^ (j16 >>> 32));
                I mike4 = c0585q6.mike();
                s charlie7 = T.a.charlie(pVar2, c0585q6);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q6.white();
                if (c0585q6.lime) {
                    c0585q6.lima(c2550j2);
                } else {
                    c0585q6.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q6, alpha5);
                C0564b.blue(C2551k.echo, c0585q6, mike4);
                C2549i c2549i5 = C2551k.golf;
                if (c0585q6.lime || !Intrinsics.areEqual(c0585q6.jade(), Integer.valueOf(i14))) {
                    ad.blue(i14, c0585q6, i14, c2549i5);
                }
                C0564b.blue(C2551k.delta, c0585q6, charlie7);
                juliet(item.getType(), c0585q6, 0);
                String durationString = item.getDurationString();
                if (durationString == null || StringsKt.gray(durationString)) {
                    z12 = false;
                    pVar = pVar2;
                    c0585q6.purple(1637577459);
                    c0585q4 = c0585q6;
                } else {
                    c0585q6.purple(1656114560);
                    String durationString2 = item.getDurationString();
                    Intrinsics.checkNotNull(durationString2);
                    z12 = false;
                    pVar = pVar2;
                    G2.bravo(durationString2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j7, AbstractC2636d7.charlie(13), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q6, 0, 0, 65534);
                    c0585q4 = c0585q6;
                }
                c0585q4.quebec(z12);
                z11 = true;
                c0585q4.quebec(true);
                r32 = z12;
                c0585q2 = c0585q4;
            } else {
                z11 = true;
                pVar = pVar2;
                r32 = 0;
                c0585q6.purple(-2062603902);
                c0585q2 = c0585q6;
            }
            c0585q2.quebec(r32);
            c0585q2.quebec(z11);
            if (!z10 && str4 != null && !StringsKt.gray(str4)) {
                c0585q2.purple(-787603346);
                T.p pVar3 = pVar;
                AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar3, 1.0f), f5), C0366t.bravo(0.2f, j13), ao.alpha), c0585q2, r32);
                InterfaceC0581m interfaceC0581m2 = c0585q2;
                G2.bravo(str4, AbstractC0538d.whiskey(pVar3, 0.0f, 6, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j7, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), interfaceC0581m2, 48, 0, 65532);
                c0585q3 = interfaceC0581m2;
            } else {
                c0585q2.purple(-806674050);
                c0585q3 = c0585q2;
            }
            c0585q3.quebec(r32);
            c0585q3.quebec(true);
            c0585q = c0585q3;
        } else {
            c0585q5.ochre();
            c0585q = c0585q5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.k(item, i4, 10);
        }
    }

    public static final void hotel(ActiveSuspension activeSuspension, Kc.e historyState, boolean z2, Function0 onRefresh, Function0 onLoadMore, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        Intrinsics.echo(historyState, "historyState");
        Intrinsics.echo(onRefresh, "onRefresh");
        Intrinsics.echo(onLoadMore, "onLoadMore");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1944272515);
        if (c0585q.india(activeSuspension)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (c0585q.golf(historyState)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i14 | i10;
        if (c0585q.hotel(z2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i16 = i15 | i11;
        if (c0585q.india(onRefresh)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i17 = i16 | i12;
        if (c0585q.india(onLoadMore)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i18 = i17 | i13;
        if ((i18 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i18 & 1, z10)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(p.alpha);
                c0585q.f(jade);
            }
            ax axVar = (ax) jade;
            s bravo2 = androidx.compose.foundation.a.bravo(V.charlie, golf, ao.alpha);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i19 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                ad.blue(i19, c0585q, i19, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            p pVar = (p) axVar.getValue();
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new Cb.i(axVar, 17);
                c0585q.f(jade2);
            }
            india(pVar, (Function1) jade2, c0585q, 48);
            int ordinal = ((p) axVar.getValue()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    c0585q.purple(1281105621);
                    foxtrot(historyState, z2, onRefresh, onLoadMore, c0585q, (i18 >> 3) & 8190);
                    c0585q.quebec(false);
                } else {
                    throw ad.black(c0585q, 1281101446, false);
                }
            } else {
                c0585q.purple(1281102977);
                bravo(activeSuspension, c0585q, i18 & 14);
                c0585q.quebec(false);
            }
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new i(activeSuspension, historyState, z2, onRefresh, onLoadMore, i4);
        }
    }

    public static final void india(p pVar, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        long j5;
        v vVar;
        long j6;
        int i10 = 10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1911527589);
        if (c0585q.echo(pVar.ordinal())) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            T.p pVar2 = T.p.alpha;
            s charlie2 = V.charlie(pVar2, 1.0f);
            long j7 = ay.juliet;
            an anVar = ao.alpha;
            s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(charlie2, j7, anVar), 16, 12);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            boolean z11 = true;
            long j10 = c0585q.magenta;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            I mike = c0585q.mike();
            s charlie3 = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie3);
            s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.charlie(pVar2, 1.0f), AbstractC2094g.bravo(10)), ay.kilo, anVar), 4);
            S alpha2 = Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q, 0);
            long j11 = c0585q.magenta;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            I mike2 = c0585q.mike();
            s charlie4 = T.a.charlie(sierra, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            c0585q.purple(-880003130);
            for (Pair pair : CollectionsKt.listOf(new Pair(p.alpha, Integer.valueOf(R.string.active)), new Pair(p.purple, Integer.valueOf(R.string.history)))) {
                p pVar3 = (p) pair.first;
                int intValue = ((Number) pair.second).intValue();
                if (pVar == pVar3) {
                    z10 = z11;
                } else {
                    z10 = false;
                }
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                s alpha3 = AbstractC3087z.alpha(V.echo(new LayoutWeightElement(1.0f, z11), 34), AbstractC2094g.bravo(6));
                if (z10) {
                    j5 = foxtrot;
                } else {
                    j5 = C0366t.juliet;
                }
                s bravo2 = androidx.compose.foundation.a.bravo(alpha3, j5, anVar);
                boolean echo2 = c0585q.echo(pVar3.ordinal());
                Object jade = c0585q.jade();
                if (echo2 || jade == C0580l.alpha) {
                    jade = new Ac.g(i10, function1, pVar3);
                    c0585q.f(jade);
                }
                s echo3 = androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false);
                ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                long j12 = c0585q.magenta;
                int i14 = (int) (j12 ^ (j12 >>> 32));
                I mike3 = c0585q.mike();
                s charlie5 = T.a.charlie(echo3, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j2);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, delta3);
                C0564b.blue(C2551k.echo, c0585q, mike3);
                C2549i c2549i5 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                    ad.blue(i14, c0585q, i14, c2549i5);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie5);
                String bravo3 = AbstractC3086y3.bravo(c0585q, intValue);
                long charlie6 = AbstractC2636d7.charlie(14);
                if (z10) {
                    vVar = new v(700);
                } else {
                    vVar = new v(HttpConstants.HTTP_BLOCKED);
                }
                if (z10) {
                    j6 = india;
                } else {
                    j6 = hotel;
                }
                new D0.an(j6, charlie6, vVar, null, juliet, 0L, 3, 0L, 0, 16744408);
                C0585q c0585q2 = c0585q;
                G2.bravo(bravo3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 0, 0, 65534);
                c0585q = c0585q2;
                c0585q.quebec(true);
                anVar = anVar;
                z11 = true;
            }
            boolean z12 = z11;
            A0.z.papa(c0585q, false, z12, z12);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 9, pVar, function1);
        }
    }

    public static final void juliet(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        String str2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-724175625);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (Intrinsics.areEqual(str, "PERMANENT")) {
                str2 = Q0.c.oscar(c0585q, -148070279, R.string.permanent, c0585q, false);
            } else if (Intrinsics.areEqual(str, "TEMPORARY")) {
                str2 = Q0.c.oscar(c0585q, -148068423, R.string.temporary, c0585q, false);
            } else {
                c0585q.purple(-295103936);
                c0585q.quebec(false);
                if (str == null) {
                    str2 = "-";
                } else {
                    str2 = str;
                }
            }
            float f5 = 100;
            C2093f bravo2 = AbstractC2094g.bravo(f5);
            long j5 = alpha;
            s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(new BorderModifierNodeElement(1, new au(j5), bravo2), foxtrot, AbstractC2094g.bravo(f5)), 8, 3);
            S alpha2 = Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            G2.bravo(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(j5, AbstractC2636d7.charlie(10), new v(HttpConstants.HTTP_INTERNAL_ERROR), null, juliet, 0L, 0, 0L, 0, 16777176), c0585q, 0, 3456, 53246);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.i(str, i4, 4);
        }
    }

    public static final Date kilo(String str) {
        for (SimpleDateFormat simpleDateFormat : kilo) {
            try {
                Result.Companion companion = Result.INSTANCE;
                return simpleDateFormat.parse(str);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th));
            }
        }
        return null;
    }
}
