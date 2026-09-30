package com.fingerprintjs.android.fpjs_pro_internal;

import com.clevertap.android.sdk.Constants;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/Z1;", "", "lima", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Z1 {

    /* renamed from: lima, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static int mike = 0;
    public static int november = 1;
    public final double alpha;
    public final double bravo;
    public final Float charlie;
    public final Double delta;
    public final Float echo;
    public final boolean foxtrot;
    public final String golf;
    public final long hotel;
    public final int india;
    public final long juliet;
    public final C1233m kilo;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/Z1$a;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.Z1$a, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static int alpha = 0;
        public static int bravo = 1;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Z1(double d4, double d9, Float f5, Double d10, Float f10, boolean z2, String str, long j5, int i4, long j6, C1233m c1233m) {
        this.alpha = d4;
        this.bravo = d9;
        this.charlie = f5;
        this.delta = d10;
        this.echo = f10;
        this.foxtrot = z2;
        this.golf = str;
        this.hotel = j5;
        this.india = i4;
        this.juliet = j6;
        this.kilo = c1233m;
    }

    public static Serializable alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i14;
        int i15 = ~i5;
        int i16 = ~(i15 | i13);
        int i17 = (~(i15 | i11)) | i16;
        int i18 = ~i13;
        int i19 = ~(i18 | i5);
        int i20 = i16 | i19 | (~(i18 | i11));
        int i21 = (~((~i11) | i18)) | i16 | i19;
        int i22 = ((-410517504) * i4) + (217841664 * i10) + ((-88866816) * i12) + (865627525 * i21) + ((-1731255050) * i20) + ((-1698084721) * i17) + (776760710 * i13) + ((-1820121865) * i5) + 1478230016;
        int papa = AbstractC2327c.papa(i4, 1794320298, ((-369695973) * i10) + i5 + i13 + i12);
        if (AbstractC2327c.quebec(papa, -1691287552, (i4 * (-1296121642)) + ((-1328892763) * i10) + (1872134975 * i12) + (i21 * 699) + (i20 * (-1398)) + (i17 * 2097) + (i13 * 1872135674) + ((i5 * 1872133577) - 2052485254), -1729036288, ((-175177728) * papa) + i22) != 1) {
            Z1 z12 = (Z1) objArr[0];
            november = (mike + 69) % 128;
            Pair pair = new Pair(P28427.N5.echo.vD14832N6715(), z12.alpha + Constants.SEPARATOR_COMMA + z12.bravo);
            Pair pair2 = new Pair(P28427.V0.echo.vD14832N6715(), z12.delta);
            Pair pair3 = new Pair(P28427.C1102o0.echo.vD14832N6715(), z12.charlie);
            Pair pair4 = new Pair(P28427.C1037e5.echo.vD14832N6715(), z12.echo);
            Pair pair5 = new Pair(P28427.C1172y0.echo.vD14832N6715(), Boolean.valueOf(z12.foxtrot));
            Pair pair6 = new Pair(P28427.C1061i1.echo.vD14832N6715(), z12.golf);
            Pair pair7 = new Pair(P28427.C1068j1.echo.vD14832N6715(), Long.valueOf(z12.hotel));
            Pair pair8 = new Pair(P28427.C1180z1.echo.vD14832N6715(), Integer.valueOf(z12.india));
            Pair pair9 = new Pair(P28427.V4.echo.vD14832N6715(), Long.valueOf(z12.juliet));
            String vD14832N6715 = P28427.C1005a1.echo.vD14832N6715();
            C1233m c1233m = z12.kilo;
            Map sierra = kotlin.collections.y.sierra(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(vD14832N6715, Long.valueOf(c1233m.alpha)), new Pair(P28427.C1164x.echo.vD14832N6715(), Long.valueOf(c1233m.bravo)));
            int i23 = mike + 83;
            november = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 7 / 0;
            }
            return (Serializable) sierra;
        }
        Z1 z13 = (Z1) objArr[0];
        long doubleToLongBits = Double.doubleToLongBits(z13.alpha);
        int i25 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        int i26 = i25 * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(z13.bravo);
        int i27 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        int alpha = G2.alpha();
        int i28 = ((i27 * (-183)) - (~(i25 * 5735))) - 1;
        int i29 = ~i27;
        int i30 = ((i26 ^ i29) | (i26 & i29)) * (-368);
        int i31 = (i28 & i30) + (i28 | i30);
        int i32 = ~i26;
        int i33 = (i27 ^ i32) | (i27 & i32);
        int i34 = ~alpha;
        int i35 = (((i33 & i34) | (i33 ^ i34)) * 184) + i31;
        int i36 = ~((i29 & i32) | (i29 ^ i32));
        int i37 = ~((i34 & i27) | (i34 ^ i27));
        int i38 = (i36 & i37) | (i36 ^ i37);
        int i39 = ~(i26 | i27);
        int i40 = ((((i38 & i39) | (i38 ^ i39)) * 184) + i35) * 31;
        Float f5 = z13.charlie;
        if (f5 == null) {
            int i41 = mike;
            november = (((i41 | 49) << 1) - (i41 ^ 49)) % 128;
            hashCode = 0;
        } else {
            hashCode = f5.hashCode();
        }
        int i42 = -(-hashCode);
        int i43 = ((i40 | i42) << 1) - (i40 ^ i42);
        int i44 = i43 * 31;
        Double d4 = z13.delta;
        if (d4 == null) {
            int i45 = november;
            mike = (((i45 | 63) << 1) - (i45 ^ 63)) % 128;
            hashCode2 = 0;
        } else {
            hashCode2 = d4.hashCode();
        }
        int alpha2 = G2.alpha();
        int i46 = (i43 * (-15159)) + (hashCode2 * 491);
        int i47 = ~hashCode2;
        int i48 = ~i44;
        int i49 = (i47 | i48 | (~alpha2)) * (-490);
        int i50 = ((i46 | i49) << 1) - (i46 ^ i49);
        int i51 = ~((hashCode2 & i48) | (i48 ^ hashCode2));
        int i52 = ~((i48 & alpha2) | (i48 ^ alpha2));
        int i53 = -(-(((i52 & i51) | (i51 ^ i52)) * 490));
        int i54 = (i47 * 490) + (i50 & i53) + (i53 | i50);
        int i55 = i54 * 31;
        Float f10 = z13.echo;
        if (f10 == null) {
            int i56 = november + 123;
            mike = i56 % 128;
            if (i56 % 2 != 0) {
                hashCode3 = 1;
            } else {
                hashCode3 = 0;
            }
        } else {
            hashCode3 = f10.hashCode();
            november = (mike + 57) % 128;
        }
        int alpha3 = G2.alpha();
        int i57 = ((hashCode3 * (-433)) - (~(-(-(i54 * (-6696)))))) - 1;
        int i58 = ~hashCode3;
        int i59 = ~alpha3;
        int i60 = ~((i58 ^ i59) | (i58 & i59));
        int i61 = ~i55;
        int i62 = ~((i61 ^ alpha3) | (i61 & alpha3));
        int i63 = (((i60 & i62) | (i60 ^ i62)) * 217) + i57;
        int i64 = ~((i58 ^ i61) | (i58 & i61));
        int i65 = ~((alpha3 & i58) | (i58 ^ alpha3));
        int i66 = (((i65 & i64) | (i64 ^ i65)) * 217) + i63;
        int i67 = ~((i61 & i59) | (i61 ^ i59));
        int i68 = ((i67 & hashCode3) | (hashCode3 ^ i67)) * 217;
        int i69 = ((i66 ^ i68) + ((i68 & i66) << 1)) * 31;
        if (z13.foxtrot) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i70 = -(-i14);
        int i71 = ((i69 & i70) + (i70 | i69)) * 31;
        int i72 = -(-z13.golf.hashCode());
        int i73 = ((i71 ^ i72) + ((i72 & i71) << 1)) * 31;
        long j5 = z13.hotel;
        int i74 = (int) (j5 ^ (j5 >>> 32));
        int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
        int i76 = i75 * 31;
        int alpha4 = G2.alpha();
        int i77 = z13.india;
        int i78 = i77 * 284;
        int i79 = i75 * (-8742);
        int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
        int i81 = ~i77;
        int i82 = ~((i81 ^ i76) | (i81 & i76));
        int i83 = ~((i81 ^ alpha4) | (i81 & alpha4));
        int i84 = ((i82 & i83) | (i82 ^ i83)) * (-283);
        int i85 = (i80 & i84) + (i84 | i80);
        int i86 = ~i76;
        int i87 = -(-((~((i77 & i86) | (i86 ^ i77))) * 283));
        int i88 = ((i85 | i87) << 1) - (i87 ^ i85);
        int i89 = (i86 & i81) | (i81 ^ i86);
        int i90 = -(-((~((i89 & alpha4) | (i89 ^ alpha4))) * 283));
        int i91 = (((i88 | i90) << 1) - (i90 ^ i88)) * 31;
        long j6 = z13.juliet;
        int i92 = -(-((int) (j6 ^ (j6 >>> 32))));
        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
        int i94 = i93 * 31;
        int hashCode4 = z13.kilo.hashCode();
        int alpha5 = G2.alpha();
        int i95 = ~hashCode4;
        int i96 = ((i94 | i95) * (-368)) + (i93 * 5735) + (hashCode4 * (-183));
        int i97 = ~i94;
        int i98 = (hashCode4 ^ i97) | (hashCode4 & i97);
        int i99 = ~alpha5;
        int i100 = (i96 - (~(-(-(((i98 & i99) | (i98 ^ i99)) * 184))))) - 1;
        int i101 = -(-(((~((hashCode4 & i94) | (hashCode4 ^ i94))) | (~((i99 & hashCode4) | (i99 ^ hashCode4))) | (~((i97 & i95) | (i95 ^ i97)))) * 184));
        return Integer.valueOf((i100 & i101) + (i101 | i100));
    }

    public final boolean equals(Object obj) {
        int i4 = (mike + 103) % 128;
        november = i4;
        if (this == obj) {
            mike = ((i4 & 117) + (i4 | 117)) % 128;
            return true;
        }
        if (!(obj instanceof Z1)) {
            mike = (((i4 | 53) << 1) - (i4 ^ 53)) % 128;
            return false;
        }
        Z1 z12 = (Z1) obj;
        if (Double.compare(this.alpha, z12.alpha) != 0) {
            mike = (november + 23) % 128;
            return false;
        }
        if (Double.compare(this.bravo, z12.bravo) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.charlie, z12.charlie)) {
            int i5 = mike;
            int i10 = (i5 ^ 63) + ((i5 & 63) << 1);
            november = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.delta, z12.delta)) {
            int i11 = mike + 57;
            november = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 57 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.echo, z12.echo)) {
            int i13 = mike;
            int i14 = (i13 & 55) + (i13 | 55);
            november = i14 % 128;
            if (i14 % 2 == 0) {
                return true;
            }
            return false;
        }
        if (this.foxtrot != z12.foxtrot) {
            int i15 = november;
            int i16 = ((i15 | 53) << 1) - (i15 ^ 53);
            mike = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 31 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.golf, z12.golf)) {
            mike = (november + 49) % 128;
            return false;
        }
        if (this.hotel != z12.hotel) {
            return false;
        }
        if (this.india != z12.india) {
            int i18 = mike;
            november = ((i18 & 63) + (i18 | 63)) % 128;
            return false;
        }
        if (this.juliet != z12.juliet) {
            int i19 = mike;
            int i20 = ((i19 & 77) + (i19 | 77)) % 128;
            november = i20;
            int i21 = (i20 ^ 19) + ((i20 & 19) << 1);
            mike = i21 % 128;
            if (i21 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!(!Intrinsics.areEqual(this.kilo, z12.kilo))) {
            int i22 = november;
            mike = ((i22 & 9) + (i22 | 9)) % 128;
            return true;
        }
        mike = (november + 21) % 128;
        return false;
    }

    public final int hashCode() {
        return ((Integer) alpha(new Object[]{this}, G2.alpha(), 1761911008, G2.alpha(), G2.alpha(), G2.alpha(), -1761911007)).intValue();
    }

    public final String toString() {
        int i4 = mike;
        int i5 = i4 + 93;
        november = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 86 / 0;
        }
        int i11 = ((i4 | 23) << 1) - (i4 ^ 23);
        november = i11 % 128;
        if (i11 % 2 != 0) {
            return "";
        }
        throw null;
    }
}
