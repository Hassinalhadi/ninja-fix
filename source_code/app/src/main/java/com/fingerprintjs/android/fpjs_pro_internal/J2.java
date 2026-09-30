package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.AbstractC1283y2;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class J2 {
    public final cj alpha;

    public J2(cj cjVar) {
        this.alpha = cjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final N14263A23323 alpha(byte[] bArr, G2 g2) {
        N14263A23323 settopp6481;
        String str;
        AbstractC1283y2 abstractC1283y2;
        Boolean bool;
        Long l10;
        Integer num;
        Integer num2;
        Boolean bool2;
        Long l11;
        Integer num3;
        Integer num4;
        Boolean bool3;
        Boolean bool4;
        Long l12;
        Integer num5;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        boolean z2;
        long j5;
        int i4;
        int i5;
        boolean z10;
        long j6;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        long j7;
        int i12;
        boolean z13;
        boolean z14;
        try {
            settopp6481 = new component8(this.alpha.component9(bArr));
        } catch (Throwable th) {
            settopp6481 = new setTopP6481(th);
        }
        if (settopp6481 instanceof component8) {
            try {
                JSONObject jSONObject = new JSONObject(new String((byte[]) ((component8) settopp6481).component9, kotlin.text.a.alpha));
                String juliet = I0.juliet(P28427.R1.echo.vD14832N6715(), jSONObject);
                AbstractC1283y2.Companion companion = AbstractC1283y2.INSTANCE;
                if (juliet != null) {
                    str = juliet.toLowerCase(Locale.ROOT);
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, P28427.Q0.echo.vD14832N6715())) {
                    abstractC1283y2 = AbstractC1283y2.a.bravo;
                } else {
                    abstractC1283y2 = new AbstractC1283y2(null);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(P28427.I1.echo.vD14832N6715());
                if (optJSONObject != null) {
                    bool = I0.mike(P28427.e6.echo.vD14832N6715(), optJSONObject);
                } else {
                    bool = null;
                }
                if (optJSONObject != null) {
                    l10 = I0.bravo(P28427.A5.echo.vD14832N6715(), optJSONObject);
                } else {
                    l10 = null;
                }
                if (optJSONObject != null) {
                    num = I0.delta(P28427.X5.echo.vD14832N6715(), optJSONObject);
                } else {
                    num = null;
                }
                if (optJSONObject != null) {
                    num2 = I0.delta(P28427.T5.echo.vD14832N6715(), optJSONObject);
                } else {
                    num2 = null;
                }
                if (optJSONObject != null) {
                    bool2 = I0.mike(P28427.C1060i0.echo.vD14832N6715(), optJSONObject);
                } else {
                    bool2 = null;
                }
                if (optJSONObject != null) {
                    l11 = I0.bravo(P28427.C1053h0.echo.vD14832N6715(), optJSONObject);
                } else {
                    l11 = null;
                }
                if (optJSONObject != null) {
                    num3 = I0.delta(P28427.C1088m0.echo.vD14832N6715(), optJSONObject);
                } else {
                    num3 = null;
                }
                if (optJSONObject != null) {
                    num4 = I0.delta(P28427.C1074k0.echo.vD14832N6715(), optJSONObject);
                } else {
                    num4 = null;
                }
                if (optJSONObject != null) {
                    bool3 = I0.mike(P28427.C1047g1.echo.vD14832N6715(), optJSONObject);
                } else {
                    bool3 = null;
                }
                if (optJSONObject != null) {
                    bool4 = I0.mike(P28427.C1012b1.echo.vD14832N6715(), optJSONObject);
                } else {
                    bool4 = null;
                }
                if (optJSONObject != null) {
                    l12 = I0.bravo(P28427.C1040f1.echo.vD14832N6715(), optJSONObject);
                } else {
                    l12 = null;
                }
                if (optJSONObject != null) {
                    num5 = I0.delta(P28427.C1026d1.echo.vD14832N6715(), optJSONObject);
                } else {
                    num5 = null;
                }
                if (optJSONObject != null) {
                    bool5 = I0.mike(P28427.C1166x1.echo.vD14832N6715(), optJSONObject);
                } else {
                    bool5 = null;
                }
                if (optJSONObject != null) {
                    bool6 = bool5;
                    bool7 = I0.mike(P28427.C1138t1.echo.vD14832N6715(), optJSONObject);
                } else {
                    bool6 = bool5;
                    bool7 = null;
                }
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    z2 = g2.alpha;
                }
                boolean z15 = z2;
                if (l10 != null) {
                    j5 = l10.longValue();
                } else {
                    j5 = g2.bravo;
                }
                long j10 = j5;
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = g2.charlie;
                }
                int i13 = i4;
                if (num2 != null) {
                    i5 = num2.intValue();
                } else {
                    i5 = g2.delta;
                }
                int i14 = i5;
                if (bool2 != null) {
                    z10 = bool2.booleanValue();
                } else {
                    z10 = g2.echo;
                }
                boolean z16 = z10;
                if (l11 != null) {
                    j6 = l11.longValue();
                } else {
                    j6 = g2.foxtrot;
                }
                long j11 = j6;
                if (num3 != null) {
                    i10 = num3.intValue();
                } else {
                    i10 = g2.golf;
                }
                int i15 = i10;
                if (num4 != null) {
                    i11 = num4.intValue();
                } else {
                    i11 = g2.hotel;
                }
                int i16 = i11;
                if (bool3 != null) {
                    z11 = bool3.booleanValue();
                } else {
                    z11 = g2.india;
                }
                boolean z17 = z11;
                if (bool4 != null) {
                    z12 = bool4.booleanValue();
                } else {
                    z12 = g2.juliet;
                }
                boolean z18 = z12;
                if (l12 != null) {
                    j7 = l12.longValue();
                } else {
                    j7 = g2.kilo;
                }
                long j12 = j7;
                if (num5 != null) {
                    i12 = num5.intValue();
                } else {
                    i12 = g2.lima;
                }
                int i17 = i12;
                if (bool6 != null) {
                    z13 = bool6.booleanValue();
                } else {
                    z13 = g2.mike;
                }
                boolean z19 = z13;
                if (bool7 != null) {
                    z14 = bool7.booleanValue();
                } else {
                    z14 = g2.november;
                }
                return new component8(new C1199d1(new G2(z15, j10, i13, i14, z16, j11, i15, i16, z17, z18, j12, i17, z19, z14), abstractC1283y2));
            } catch (Throwable th2) {
                return new setTopP6481(th2);
            }
        }
        if (settopp6481 instanceof setTopP6481) {
            return settopp6481;
        }
        throw new NoWhenBranchMatchedException();
    }
}
