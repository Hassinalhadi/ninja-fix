package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.ClientTimeout;
import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import com.fingerprintjs.android.fpjs_pro.InvalidProxyIntegrationHeaders;
import com.fingerprintjs.android.fpjs_pro.UnknownError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setPivotYN16904", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k3 extends Lambda implements Function0<Unit> {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6617c = null;
    public static int silver;
    public static int teal;
    public static int white;
    public static int yellow;
    public final /* synthetic */ N14263A23323 alpha;
    public final /* synthetic */ C1252q2 purple;
    public final /* synthetic */ p3 red;

    static {
        delta();
        white = 0;
        yellow = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(N14263A23323 n14263a23323, C1252q2 c1252q2, p3 p3Var) {
        super(0);
        this.alpha = n14263a23323;
        this.purple = c1252q2;
        this.red = p3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Throwable th;
        String str;
        String str2;
        int i14 = ~i5;
        int i15 = ~(i14 | i11);
        int i16 = ~i10;
        int i17 = ~(i16 | i11);
        int i18 = i15 | i17;
        int i19 = ~i11;
        int i20 = ~(i19 | i5);
        int i21 = (~(i10 | i14)) | i20 | i17;
        int i22 = (~(i19 | i16)) | i20 | (~(i16 | i5));
        int i23 = (606601216 * i4) + (1313472512 * i12) + ((-1647181824) * i13) + (768614067 * i22) + (i21 * 768614067) + ((-1537228134) * i18) + ((-878567756) * i5) + ((1110557339 * i11) - 760807424);
        int papa = AbstractC2327c.papa(i4, 2055044340, ((-954185507) * i12) + i11 + i5 + i13);
        if (AbstractC2327c.quebec(papa, 572063744, (i4 * 1594648204) + (826674179 * i12) + (1290136159 * i13) + (i22 * 621) + (i21 * 621) + (i18 * (-1242)) + (i5 * 1290136780) + (i11 * 1290134917) + 267690129, 607715328, ((-1232666624) * papa) + i23) != 1) {
            k3 k3Var = (k3) objArr[0];
            int i24 = yellow;
            int i25 = i24 & 83;
            int i26 = ((i24 ^ 83) | i25) << 1;
            int i27 = -((~i25) & (i24 | 83));
            int i28 = (i26 & i27) + (i26 | i27);
            int i29 = i28 % 128;
            white = i29;
            if (i28 % 2 == 0) {
                N14263A23323 n14263a23323 = k3Var.alpha;
                C1252q2 c1252q2 = k3Var.purple;
                if (n14263a23323 instanceof setTopP6481) {
                    Error error = (Error) ((setTopP6481) n14263a23323).vD14832N6715;
                    if (error instanceof com.fingerprintjs.android.fpjs_pro.a) {
                        int i30 = ((i29 | 109) << 1) - (i29 ^ 109);
                        yellow = i30 % 128;
                        if (i30 % 2 != 0) {
                            str2 = "ApiKeyExpired";
                        } else {
                            throw null;
                        }
                    } else {
                        if (!(error instanceof com.fingerprintjs.android.fpjs_pro.b)) {
                            if (!(error instanceof com.fingerprintjs.android.fpjs_pro.c)) {
                                if (!(!(error instanceof ClientTimeout))) {
                                    int i31 = i24 + 85;
                                    white = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        int i32 = i24 & 9;
                                        int i33 = -(-((i24 ^ 9) | i32));
                                        white = (((i32 | i33) << 1) - (i32 ^ i33)) % 128;
                                        str2 = "ClientTimeout";
                                    } else {
                                        throw null;
                                    }
                                } else if (error instanceof com.fingerprintjs.android.fpjs_pro.f) {
                                    int i34 = (((i24 & (-82)) | ((~i24) & 81)) - (~((i24 & 81) << 1))) - 1;
                                    int i35 = i34 % 128;
                                    white = i35;
                                    if (i34 % 2 == 0) {
                                        yellow = ao.ad.victor(i35 ^ 117, ~((i35 & 117) << 1), 1, 128);
                                        str2 = "Failed";
                                    } else {
                                        throw null;
                                    }
                                } else if (error instanceof com.fingerprintjs.android.fpjs_pro.i) {
                                    int i36 = i29 & 53;
                                    int i37 = (i29 ^ 53) | i36;
                                    yellow = (((i36 | i37) << 1) - (i36 ^ i37)) % 128;
                                    str2 = "HeaderRestricted";
                                } else if (error instanceof com.fingerprintjs.android.fpjs_pro.j) {
                                    int i38 = i29 | 33;
                                    int i39 = i38 << 1;
                                    int i40 = -(i38 & (~(i29 & 33)));
                                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                                    yellow = i41 % 128;
                                    if (i41 % 2 != 0) {
                                        str2 = "InstallationMethodRestricted";
                                    } else {
                                        throw null;
                                    }
                                } else if (error instanceof com.fingerprintjs.android.fpjs_pro.q) {
                                    int i42 = i29 & 93;
                                    int i43 = (i29 ^ 93) | i42;
                                    int i44 = (i42 & i43) + (i42 | i43);
                                    yellow = i44 % 128;
                                    if (i44 % 2 == 0) {
                                        int i45 = 76 / 0;
                                    }
                                    str2 = "NetworkError";
                                } else if (error instanceof com.fingerprintjs.android.fpjs_pro.r) {
                                    int i46 = (i29 | 21) << 1;
                                    int i47 = -((21 & (~i29)) | (i29 & (-22)));
                                    int i48 = (i46 & i47) + (i47 | i46);
                                    yellow = i48 % 128;
                                    str2 = "NotAvailableForCrawlBots";
                                    if (i48 % 2 == 0) {
                                        int i49 = 79 / 0;
                                    }
                                } else {
                                    byte[] bArr = f6617c;
                                    byte b2 = bArr[26];
                                    byte b4 = b2;
                                    int i50 = 4 - (b2 * 2);
                                    int i51 = 56 - (b4 * 3);
                                    int i52 = (b4 * 3) + 99;
                                    byte[] bArr2 = new byte[i51];
                                    th = null;
                                    int i53 = 0;
                                    if (bArr == null) {
                                        i52 = (i52 + (-i51)) - 6;
                                        i50++;
                                    }
                                    while (true) {
                                        int i54 = i53 + 1;
                                        bArr2[i53] = (byte) i52;
                                        if (i54 == i51) {
                                            break;
                                        }
                                        i53 = i54;
                                        i52 = (i52 + (-bArr[i50])) - 6;
                                        i50++;
                                    }
                                    if (!Class.forName((String) new Object[]{new String(bArr2, 0)}[0]).isInstance(error)) {
                                        if (error instanceof com.fingerprintjs.android.fpjs_pro.s) {
                                            int i55 = white;
                                            int i56 = ((i55 & 113) + (i55 | 113)) % 128;
                                            yellow = i56;
                                            int i57 = ((i56 ^ 25) | (i56 & 25)) << 1;
                                            int i58 = -((25 & (~i56)) | (i56 & (-26)));
                                            white = ((i57 ^ i58) + ((i57 & i58) << 1)) % 128;
                                            str2 = "OriginNotAvailable";
                                        } else if (!(!(error instanceof com.fingerprintjs.android.fpjs_pro.t))) {
                                            int i59 = white;
                                            int i60 = i59 | 9;
                                            int i61 = i60 << 1;
                                            int i62 = -((~(i59 & 9)) & i60);
                                            int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                                            yellow = i63 % 128;
                                            if (i63 % 2 != 0) {
                                                str2 = "PackageNotAuthorized";
                                            } else {
                                                throw null;
                                            }
                                        } else if (error instanceof com.fingerprintjs.android.fpjs_pro.v) {
                                            int i64 = yellow;
                                            int i65 = i64 & 79;
                                            int i66 = (i64 ^ 79) | i65;
                                            int i67 = (((i65 | i66) << 1) - (i66 ^ i65)) % 128;
                                            white = i67;
                                            int i68 = i67 & 29;
                                            int i69 = -(-((i67 ^ 29) | i68));
                                            yellow = ((i68 ^ i69) + ((i68 & i69) << 1)) % 128;
                                            str2 = "RequestCannotBeParsed";
                                        } else if (!(error instanceof com.fingerprintjs.android.fpjs_pro.w)) {
                                            if (error instanceof com.fingerprintjs.android.fpjs_pro.x) {
                                                int i70 = white;
                                                yellow = (((i70 & 110) + (i70 | 110)) - 1) % 128;
                                                str2 = "ResponseCannotBeParsed";
                                            } else if (error instanceof com.fingerprintjs.android.fpjs_pro.y) {
                                                int i71 = yellow;
                                                int i72 = (i71 & (-8)) | ((~i71) & 7);
                                                int i73 = (i71 & 7) << 1;
                                                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                                                white = i74 % 128;
                                                str2 = "SubscriptionNotActive";
                                                if (i74 % 2 != 0) {
                                                    int i75 = 93 / 0;
                                                }
                                            } else if (error instanceof com.fingerprintjs.android.fpjs_pro.aa) {
                                                int i76 = yellow;
                                                int i77 = ((i76 ^ 113) + ((i76 & 113) << 1)) % 128;
                                                white = i77;
                                                yellow = ao.ad.victor((i77 | 33) << 1, ~(-(i77 ^ 33)), 1, 128);
                                                str2 = "TooManyRequest";
                                            } else if (error instanceof UnknownError) {
                                                int i78 = yellow;
                                                int i79 = (i78 & 90) + (i78 | 90);
                                                white = ((i79 ^ (-1)) + (i79 << 1)) % 128;
                                                str2 = "UnknownError";
                                            } else if (!(error instanceof com.fingerprintjs.android.fpjs_pro.ab)) {
                                                if (error instanceof com.fingerprintjs.android.fpjs_pro.ac) {
                                                    int i80 = yellow;
                                                    int i81 = ((i80 & 100) + (i80 | 100)) - 1;
                                                    white = i81 % 128;
                                                    if (i81 % 2 != 0) {
                                                        int i82 = 15 / 0;
                                                    }
                                                    str2 = "WrongRegion";
                                                } else if (error instanceof InvalidProxyIntegrationHeaders) {
                                                    int i83 = (yellow + 81) % 128;
                                                    white = i83;
                                                    int i84 = i83 & 103;
                                                    yellow = ((((i83 ^ 103) | i84) << 1) - ((i83 | 103) & (~i84))) % 128;
                                                    str2 = "InvalidProxyIntegrationHeaders";
                                                } else if (error instanceof com.fingerprintjs.android.fpjs_pro.k) {
                                                    int i85 = yellow;
                                                    white = ((i85 ^ 65) + ((i85 & 65) << 1)) % 128;
                                                    str2 = "InvalidProxyIntegrationSecret";
                                                } else if (error instanceof com.fingerprintjs.android.fpjs_pro.u) {
                                                    int i86 = yellow;
                                                    int i87 = (i86 ^ 95) + ((i86 & 95) << 1);
                                                    white = i87 % 128;
                                                    if (i87 % 2 == 0) {
                                                        int i88 = i86 & 119;
                                                        white = ao.ad.victor(((i86 ^ 119) | i88) << 1, ~(-((i86 | 119) & (~i88))), 1, 128);
                                                        str2 = "ProxyIntegrationSecretEnvironmentMismatch";
                                                    } else {
                                                        throw null;
                                                    }
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                int i89 = white;
                                                int i90 = ((i89 & (-120)) | ((~i89) & 119)) + ((i89 & 119) << 1);
                                                int i91 = i90 % 128;
                                                yellow = i91;
                                                if (i90 % 2 == 0) {
                                                    int i92 = 97 / 0;
                                                }
                                                white = ((i91 & 125) + (i91 | 125)) % 128;
                                                str2 = "UnsupportedVersion";
                                            }
                                        } else {
                                            int i93 = yellow;
                                            int i94 = i93 & 83;
                                            int i95 = ((i93 ^ 83) | i94) << 1;
                                            int i96 = -((i93 | 83) & (~i94));
                                            white = ((i95 ^ i96) + ((i96 & i95) << 1)) % 128;
                                            str2 = "RequestTimeout";
                                        }
                                    } else {
                                        int i97 = white;
                                        int i98 = i97 & 53;
                                        yellow = ao.ad.victor((i97 | 53) & (~i98), ~(-(-(i98 << 1))), 1, 128);
                                        str2 = "NotAvailableWithoutUA";
                                    }
                                }
                            } else {
                                th = null;
                                int i99 = (((i29 & (-46)) | ((~i29) & 45)) - (~((i29 & 45) << 1))) - 1;
                                int i100 = i99 % 128;
                                yellow = i100;
                                if (i99 % 2 != 0) {
                                    int i101 = i100 & 115;
                                    white = (((i100 | 115) & (~i101)) + (i101 << 1)) % 128;
                                    str2 = "ApiKeyRequired";
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            th = null;
                            int i102 = i29 & 63;
                            int i103 = -(-(i29 | 63));
                            int i104 = ((i102 & i103) + (i102 | i103)) % 128;
                            yellow = i104;
                            white = (i104 + 49) % 128;
                            str2 = "ApiKeyNotFound";
                        }
                        c1252q2.bravo = str2;
                        int i105 = yellow;
                        int i106 = i105 & 85;
                        int i107 = (i105 | 85) & (~i106);
                        int i108 = i106 << 1;
                        white = ((i107 & i108) + (i107 | i108)) % 128;
                    }
                    th = null;
                    c1252q2.bravo = str2;
                    int i1052 = yellow;
                    int i1062 = i1052 & 85;
                    int i1072 = (i1052 | 85) & (~i1062);
                    int i1082 = i1062 << 1;
                    white = ((i1072 & i1082) + (i1072 | i1082)) % 128;
                } else {
                    th = null;
                }
                C1252q2 c1252q22 = k3Var.purple;
                N14263A23323 n14263a233232 = k3Var.alpha;
                if (n14263a233232 instanceof component8) {
                    white = (yellow + 123) % 128;
                    str = ((FingerprintJSProResponse) ((component8) n14263a233232).component9).alpha;
                } else if (n14263a233232 instanceof setTopP6481) {
                    int i109 = white;
                    int i110 = i109 & 91;
                    yellow = (i110 + ((i109 ^ 91) | i110)) % 128;
                    str = ((Error) ((setTopP6481) n14263a233232).vD14832N6715).alpha;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                c1252q22.alpha = str;
                if (k3Var.alpha instanceof component8) {
                    int i111 = white;
                    int i112 = i111 & 117;
                    int i113 = (((i111 ^ 117) | i112) << 1) - ((i111 | 117) & (~i112));
                    yellow = i113 % 128;
                    if (i113 % 2 != 0) {
                        C1231l1 c1231l1 = (C1231l1) p3.alpha(new Object[]{k3Var.red}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), 1637967927, -1637967924);
                        synchronized (c1231l1) {
                            c1231l1.alpha.alpha(CollectionsKt.emptyList());
                        }
                    } else {
                        ((C1231l1) p3.alpha(new Object[]{k3Var.red}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), 1637967927, -1637967924)).charlie();
                        throw th;
                    }
                }
                ((C1231l1) p3.alpha(new Object[]{k3Var.red}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), 1637967927, -1637967924)).alpha(k3Var.purple);
                int i114 = white;
                int i115 = i114 & 37;
                int i116 = -(-((i114 ^ 37) | i115));
                int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                yellow = i117 % 128;
                if (i117 % 2 == 0) {
                    int i118 = 9 / 0;
                }
                return th;
            }
            boolean z2 = k3Var.alpha instanceof setTopP6481;
            throw null;
        }
        k3 k3Var2 = (k3) objArr[0];
        int i119 = white;
        int i120 = (i119 | 65) << 1;
        int i121 = -(i119 ^ 65);
        yellow = ((i120 & i121) + (i121 | i120)) % 128;
        alpha(new Object[]{k3Var2}, com.fingerprintjs.android.fpjs_pro.g.alpha(), 1296889207, com.fingerprintjs.android.fpjs_pro.g.alpha(), -1296889207, com.fingerprintjs.android.fpjs_pro.g.alpha(), com.fingerprintjs.android.fpjs_pro.g.alpha());
        Unit unit = Unit.INSTANCE;
        int i122 = white;
        int i123 = (i122 & 49) + (i122 | 49);
        yellow = i123 % 128;
        if (i123 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static int component9() {
        int i4 = silver;
        int i5 = i4 % 7374943;
        silver = i4 + 1;
        if (i5 != 0) {
            return teal;
        }
        int tango = ao.ad.tango(1460360908);
        teal = tango;
        return tango;
    }

    public static void delta() {
        f6617c = new byte[]{99, 108, -85, -94, -18, -4, 57, -62, -9, -11, 1, -4, -19, -4, -8, 3, -11, -12, 4, -15, 63, -57, -19, 4, -20, -3, 0, -1, 48, -62, -16, 0, -15, 14, -23, -8, -3, 59, -38, -39, -11, 45, -59, 15, -14, -9, 5, -7, -16, 1, 8, -24, -17, 6, -13, -12, -5, 25, 14};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return alpha(new Object[]{this}, com.fingerprintjs.android.fpjs_pro.g.alpha(), -1982864750, com.fingerprintjs.android.fpjs_pro.g.alpha(), 1982864751, com.fingerprintjs.android.fpjs_pro.g.alpha(), com.fingerprintjs.android.fpjs_pro.g.alpha());
    }
}
