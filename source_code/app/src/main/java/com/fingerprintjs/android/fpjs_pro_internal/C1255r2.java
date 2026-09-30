package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.os.Build;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.Z1;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/CurrentLocationSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/CurrentLocation;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/CurrentLocationResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1255r2 {

    @NotNull
    public static final C1255r2 alpha = new Object();
    public static final String bravo = P28427.C1170x5.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.r2] */
    static {
        if ((1 + 47) % 2 != 0) {
            int i4 = 16 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c4, code lost:
    
        if (r7 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01c9, code lost:
    
        if (r9 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01cb, code lost:
    
        r1 = new com.fingerprintjs.android.fpjs_pro_internal.C1278x1(r5, (java.util.Map) com.fingerprintjs.android.fpjs_pro_internal.M1.alpha(new java.lang.Object[]{new com.fingerprintjs.android.fpjs_pro_internal.M1(com.fingerprintjs.android.fpjs_pro_internal.AbstractC1196c2.alpha(r4), r11, r8)}, com.fingerprintjs.android.fpjs_pro_internal.F2.vD14832N6715(), -1778301862, 1778301862, com.fingerprintjs.android.fpjs_pro_internal.F2.vD14832N6715(), com.fingerprintjs.android.fpjs_pro_internal.F2.vD14832N6715(), com.fingerprintjs.android.fpjs_pro_internal.F2.vD14832N6715()), com.fingerprintjs.android.fpjs_pro_internal.component2.b.d.foxtrot);
        r0 = com.fingerprintjs.android.fpjs_pro_internal.C1255r2.charlie;
        r2 = (r0 ^ 65) + ((r0 & 65) << 1);
        com.fingerprintjs.android.fpjs_pro_internal.C1255r2.delta = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0209, code lost:
    
        if ((r2 % 2) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x020b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x020c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01c7, code lost:
    
        if (r7 != false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        boolean z2;
        Float f5;
        Double d4;
        Float f10;
        String provider;
        int i4;
        boolean hasVerticalAccuracy;
        float verticalAccuracyMeters;
        boolean z10 = n14263a23323 instanceof component8;
        String str = bravo;
        if (z10) {
            int i5 = delta;
            charlie = ((i5 & 71) + (i5 | 71)) % 128;
            J1 j12 = (J1) ((component8) n14263a23323).component9;
            j12.getClass();
            int i10 = J1.golf;
            int i11 = (i10 ^ 119) + ((i10 & 119) << 1);
            int i12 = i11 % 128;
            J1.foxtrot = i12;
            if (i11 % 2 == 0) {
                J1.golf = (((i12 | 7) << 1) - (i12 ^ 7)) % 128;
                List list = (List) J1.alpha(new Object[]{j12}, 1553949276, J1.bravo(), J1.bravo(), -1553949274, J1.bravo(), J1.bravo());
                int i13 = J1.foxtrot;
                int i14 = (i13 ^ 105) + ((i13 & 105) << 1);
                J1.golf = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 73 / 0;
                }
                int i16 = i13 + 111;
                J1.golf = i16 % 128;
                if (i16 % 2 != 0) {
                    if (!((List) J1.alpha(new Object[]{j12}, -1732212312, J1.bravo(), J1.bravo(), 1732212315, J1.bravo(), J1.bravo())).isEmpty()) {
                        int i17 = delta;
                        charlie = ((i17 & 79) + (i17 | 79)) % 128;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C1233m c1233m = j12.echo;
                    Location location = j12.alpha;
                    boolean z11 = j12.bravo;
                    long j5 = j12.delta;
                    if (z11) {
                        int i18 = charlie;
                        int i19 = (i18 & 73) + (i18 | 73);
                        delta = i19 % 128;
                        if (i19 % 2 != 0) {
                            if (z2 && location != null) {
                                double latitude = location.getLatitude();
                                double longitude = location.getLongitude();
                                if (location.hasAccuracy()) {
                                    f5 = Float.valueOf(location.getAccuracy());
                                } else {
                                    f5 = null;
                                }
                                if (location.hasAltitude()) {
                                    d4 = Double.valueOf(location.getAltitude());
                                } else {
                                    d4 = null;
                                }
                                Z1.Companion.alpha = (Z1.Companion.bravo + 3) % 128;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    int i20 = Z1.Companion.alpha;
                                    int i21 = (i20 ^ 29) + ((i20 & 29) << 1);
                                    Z1.Companion.bravo = i21 % 128;
                                    if (i21 % 2 != 0) {
                                        hasVerticalAccuracy = location.hasVerticalAccuracy();
                                        if (hasVerticalAccuracy) {
                                            verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                                            Float valueOf = Float.valueOf(verticalAccuracyMeters);
                                            int i22 = Z1.Companion.alpha;
                                            Z1.Companion.bravo = ((i22 & 77) + (i22 | 77)) % 128;
                                            f10 = valueOf;
                                            boolean lima = I0.lima(location);
                                            provider = location.getProvider();
                                            if (provider != null || (r2 = provider.toLowerCase(Locale.ROOT)) == null) {
                                                String str2 = "";
                                            }
                                            C1282y1 c1282y1 = new C1282y1(str, (Map) Z1.alpha(new Object[]{new Z1(latitude, longitude, f5, d4, f10, lima, str2, location.getTime(), AbstractC1196c2.alpha(list), j5, c1233m)}, G2.alpha(), -136420442, G2.alpha(), G2.alpha(), G2.alpha(), 136420442));
                                            int i23 = charlie;
                                            i4 = ((i23 | 51) << 1) - (i23 ^ 51);
                                            delta = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                return c1282y1;
                                            }
                                            throw null;
                                        }
                                        int i24 = Z1.Companion.bravo + 35;
                                        Z1.Companion.alpha = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            throw null;
                                        }
                                    } else {
                                        location.hasVerticalAccuracy();
                                        throw null;
                                    }
                                } else {
                                    Z1.Companion.bravo = (Z1.Companion.alpha + 83) % 128;
                                }
                                f10 = null;
                                boolean lima2 = I0.lima(location);
                                provider = location.getProvider();
                                if (provider != null) {
                                }
                                String str22 = "";
                                C1282y1 c1282y12 = new C1282y1(str, (Map) Z1.alpha(new Object[]{new Z1(latitude, longitude, f5, d4, f10, lima2, str22, location.getTime(), AbstractC1196c2.alpha(list), j5, c1233m)}, G2.alpha(), -136420442, G2.alpha(), G2.alpha(), G2.alpha(), 136420442));
                                int i232 = charlie;
                                i4 = ((i232 | 51) << 1) - (i232 ^ 51);
                                delta = i4 % 128;
                                if (i4 % 2 == 0) {
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (z11) {
                        int i25 = delta + 9;
                        charlie = i25 % 128;
                        if (i25 % 2 != 0) {
                            int i26 = 74 / 0;
                        }
                    }
                    if (!z11 && z2) {
                        C1278x1 c1278x1 = new C1278x1(str, null, component2.b.C0008b.foxtrot);
                        int i27 = delta + 29;
                        charlie = i27 % 128;
                        if (i27 % 2 == 0) {
                            return c1278x1;
                        }
                        throw null;
                    }
                    if (z11) {
                        int i28 = delta;
                        charlie = ((i28 ^ 45) + ((i28 & 45) << 1)) % 128;
                        if (!z2) {
                            return new C1278x1(str, null, component2.b.c.foxtrot);
                        }
                    }
                    return new C1278x1(str, null, component2.b.a.foxtrot);
                }
                throw null;
            }
            throw null;
        }
        if (n14263a23323 instanceof setTopP6481) {
            return new C1278x1(str, null, component2.b.a.foxtrot);
        }
        throw new NoWhenBranchMatchedException();
    }
}
