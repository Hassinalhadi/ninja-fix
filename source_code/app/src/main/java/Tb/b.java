package Tb;

import D0.an;
import H0.v;
import P.e;
import Q0.g;
import T.p;
import Xd.l;
import Xd.m;
import Y.s;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0552s;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import db.C1602b;
import i.InterfaceC1854c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import q0.ap;
import s0.C2549i;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t0.InterfaceC2937r0;
import t6.AbstractC3087z;
import t6.R3;
import z.ak;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ b(int i4, String str, boolean z2, InterfaceC2937r0 interfaceC2937r0, s sVar, int i5) {
        this.alpha = i5;
        this.purple = i4;
        this.red = str;
        this.silver = z2;
        this.teal = interfaceC2937r0;
        this.white = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    @Override // Xd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        Character ch;
        String str;
        int i4;
        long j5;
        boolean golf;
        Object jade;
        int i5;
        int i10;
        boolean z10;
        String str2;
        p pVar = p.alpha;
        int i11 = this.purple;
        boolean z11 = this.silver;
        Object obj4 = this.teal;
        Object obj5 = this.white;
        int i12 = 1;
        switch (this.alpha) {
            case 0:
                boolean z12 = false;
                l it = (l) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(it, "it");
                if ((intValue & 17) != 16) {
                    z12 = true;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z12)) {
                    AbstractC0538d.alpha(V.charlie(pVar, 1.0f), null, false, e.echo(1299322769, new b(this.purple, this.red, this.silver, (InterfaceC2937r0) obj4, (s) obj5, 1), c0585q), c0585q, 3078, 6);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                C0552s BoxWithConstraints = (C0552s) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((intValue2 & 6) == 0) {
                    if (((C0585q) interfaceC0581m2).golf(BoxWithConstraints)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue2 |= i10;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z2)) {
                    float f5 = 12;
                    int i13 = i11 - 1;
                    g gVar = new g((BoxWithConstraints.charlie() - (i13 * f5)) / i11);
                    g gVar2 = new g(44);
                    g gVar3 = new g(80);
                    if (gVar2.compareTo(gVar3) <= 0) {
                        if (gVar.compareTo(gVar2) < 0) {
                            gVar = gVar2;
                        } else if (gVar.compareTo(gVar3) > 0) {
                            gVar = gVar3;
                        }
                        T.s charlie = V.charlie(pVar, 1.0f);
                        C0537c c0537c = AbstractC0542h.alpha;
                        S alpha = Q.alpha(AbstractC0542h.hotel(f5, T.d.f2063g), T.d.f2061d, c0585q2, 54);
                        g gVar4 = gVar;
                        long j6 = c0585q2.magenta;
                        int i14 = (int) (j6 ^ (j6 >>> 32));
                        I mike = c0585q2.mike();
                        T.s charlie2 = T.a.charlie(charlie, c0585q2);
                        InterfaceC2552l.maroon.getClass();
                        Function0 function0 = C2551k.bravo;
                        c0585q2.white();
                        if (c0585q2.lime) {
                            c0585q2.lima(function0);
                        } else {
                            c0585q2.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
                        C0564b.blue(C2551k.echo, c0585q2, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i14))) {
                            ad.blue(i14, c0585q2, i14, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q2, charlie2);
                        c0585q2.purple(662506017);
                        int i15 = 0;
                        while (i15 < i11) {
                            String str3 = this.red;
                            Intrinsics.echo(str3, "<this>");
                            if (i15 >= 0 && i15 < str3.length()) {
                                ch = Character.valueOf(str3.charAt(i15));
                            } else {
                                ch = null;
                            }
                            if (ch != null) {
                                str = ch.toString();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            String str4 = str;
                            if (z11) {
                                int length = str3.length();
                                if (length > i13) {
                                    length = i13;
                                }
                                if (i15 == length) {
                                    i4 = i12;
                                    T.s bravo = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.oscar(V.echo(pVar, 48), gVar4.alpha), AbstractC2094g.bravo(4)), C0366t.echo, ao.alpha);
                                    float f10 = i12;
                                    if (i4 == 0) {
                                        j5 = 4280427302L;
                                    } else {
                                        j5 = 4292270557L;
                                    }
                                    T.s charlie3 = R3.charlie(bravo, f10, ao.delta(j5), AbstractC2094g.bravo(10));
                                    Object obj6 = (InterfaceC2937r0) obj4;
                                    golf = c0585q2.golf(obj6);
                                    jade = c0585q2.jade();
                                    if (!golf || jade == C0580l.alpha) {
                                        jade = new Ac.g(22, (s) obj5, obj6);
                                        c0585q2.f(jade);
                                    }
                                    T.s echo = androidx.compose.foundation.a.echo(14, charlie3, null, (Function0) jade, z11);
                                    ap delta = AbstractC0547m.delta(T.d.teal, false);
                                    int i16 = i13;
                                    long j7 = c0585q2.magenta;
                                    i5 = (int) (j7 ^ (j7 >>> 32));
                                    I mike2 = c0585q2.mike();
                                    T.s charlie4 = T.a.charlie(echo, c0585q2);
                                    InterfaceC2552l.maroon.getClass();
                                    Function0 function02 = C2551k.bravo;
                                    c0585q2.white();
                                    if (!c0585q2.lime) {
                                        c0585q2.lima(function02);
                                    } else {
                                        c0585q2.i();
                                    }
                                    C0564b.blue(C2551k.foxtrot, c0585q2, delta);
                                    C0564b.blue(C2551k.echo, c0585q2, mike2);
                                    C2549i c2549i2 = C2551k.golf;
                                    if (!c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i5))) {
                                        ad.blue(i5, c0585q2, i5, c2549i2);
                                    }
                                    C0564b.blue(C2551k.delta, c0585q2, charlie4);
                                    if (str4.length() <= 0) {
                                        c0585q2.purple(-1714282584);
                                        ak.bravo(str4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4279308561L), AbstractC2636d7.charlie(18), v.teal, null, null, 0L, 0, 0L, 0, 16777208), c0585q2, 0, 0, 65534);
                                        c0585q2.quebec(false);
                                    } else {
                                        c0585q2.purple(-1713841113);
                                        ak.bravo("— —", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4290362819L), AbstractC2636d7.charlie(14), v.purple, null, null, 0L, 0, 0L, 0, 16777208), c0585q2, 6, 0, 65534);
                                        c0585q2.quebec(false);
                                    }
                                    c0585q2.quebec(true);
                                    i15++;
                                    i12 = 1;
                                    i13 = i16;
                                }
                            }
                            i4 = 0;
                            T.s bravo2 = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.oscar(V.echo(pVar, 48), gVar4.alpha), AbstractC2094g.bravo(4)), C0366t.echo, ao.alpha);
                            float f102 = i12;
                            if (i4 == 0) {
                            }
                            T.s charlie32 = R3.charlie(bravo2, f102, ao.delta(j5), AbstractC2094g.bravo(10));
                            Object obj62 = (InterfaceC2937r0) obj4;
                            golf = c0585q2.golf(obj62);
                            jade = c0585q2.jade();
                            if (!golf) {
                            }
                            jade = new Ac.g(22, (s) obj5, obj62);
                            c0585q2.f(jade);
                            T.s echo2 = androidx.compose.foundation.a.echo(14, charlie32, null, (Function0) jade, z11);
                            ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                            int i162 = i13;
                            long j72 = c0585q2.magenta;
                            i5 = (int) (j72 ^ (j72 >>> 32));
                            I mike22 = c0585q2.mike();
                            T.s charlie42 = T.a.charlie(echo2, c0585q2);
                            InterfaceC2552l.maroon.getClass();
                            Function0 function022 = C2551k.bravo;
                            c0585q2.white();
                            if (!c0585q2.lime) {
                            }
                            C0564b.blue(C2551k.foxtrot, c0585q2, delta2);
                            C0564b.blue(C2551k.echo, c0585q2, mike22);
                            C2549i c2549i22 = C2551k.golf;
                            if (!c0585q2.lime) {
                            }
                            ad.blue(i5, c0585q2, i5, c2549i22);
                            C0564b.blue(C2551k.delta, c0585q2, charlie42);
                            if (str4.length() <= 0) {
                            }
                            c0585q2.quebec(true);
                            i15++;
                            i12 = 1;
                            i13 = i162;
                        }
                        c0585q2.quebec(false);
                        c0585q2.quebec(i12);
                    } else {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + gVar3 + " is less than minimum " + gVar2 + '.');
                    }
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC1854c item = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(item, "$this$item");
                if ((intValue3 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z10)) {
                    String str5 = this.red;
                    Intrinsics.checkNotNull(str5);
                    if (z11) {
                        str2 = (((List) obj5).size() + 1) + ExpiryDateConstantsKt.EXPIRY_DATE_SEPARATOR + i11;
                    } else {
                        str2 = null;
                    }
                    db.l.delta(str5, (C1602b) obj4, str2, null, c0585q3, 0);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(String str, C1602b c1602b, boolean z2, List list, int i4) {
        this.alpha = 2;
        this.red = str;
        this.teal = c1602b;
        this.silver = z2;
        this.white = list;
        this.purple = i4;
    }
}
