package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1237n {
    public static final String alpha = P28427.N5.echo.vD14832N6715();
    public static final String bravo = P28427.V4.echo.vD14832N6715();
    public static final String charlie = P28427.C1079k5.echo.vD14832N6715();
    public static final String delta = P28427.V5.echo.vD14832N6715();
    public static final String echo = P28427.I5.echo.vD14832N6715();
    public static final String foxtrot = P28427.C1087m.echo.vD14832N6715();
    public static final String golf = P28427.H1.echo.vD14832N6715();
    public static final String hotel = P28427.C1007a3.echo.vD14832N6715();
    public static final String india = P28427.C1054h1.echo.vD14832N6715();
    public static final String juliet = P28427.az.echo.vD14832N6715();
    public static final String kilo = P28427.Z4.echo.vD14832N6715();
    public static final String lima = P28427.C1.echo.vD14832N6715();
    public static final String mike = P28427.U.echo.vD14832N6715();
    public static final String november = P28427.C1073k.echo.vD14832N6715();
    public static final String oscar = P28427.C1075k1.echo.vD14832N6715();
    public static int papa = 0;
    public static int quebec = 1;

    static {
        if (ao.ad.victor(1, -64, 1, 2) != 0) {
            int i4 = 34 / 0;
        }
    }

    public static final String alpha() {
        int i4 = quebec;
        int i5 = ((i4 & 117) + (i4 | 117)) % 128;
        papa = i5;
        int i10 = (i5 ^ 23) + ((i5 & 23) << 1);
        quebec = i10 % 128;
        if (i10 % 2 != 0) {
            return mike;
        }
        throw null;
    }

    public static /* synthetic */ String bravo(int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~((~i10) | i12);
        int i15 = ~i13;
        int i16 = i14 | (~(i15 | i12));
        int i17 = ~i12;
        int i18 = ~(i17 | i15);
        int i19 = ~(i17 | i10);
        int i20 = (~(i15 | i10)) | i18 | i19;
        int i21 = (~(i13 | i17)) | i19;
        int i22 = (-1788870656) * i11;
        int i23 = ((-406847488) * i4) + ((-201326592) * i5) + i22 + (2146011519 * i21) + (i20 * 2146011519) + ((-2146011519) * i16) + ((-1785926397) * i12) + ((357140864 * i10) - 8388608);
        int papa2 = AbstractC2327c.papa(i4, -2046201414, (1039959776 * i5) + i10 + i12 + i11);
        switch (AbstractC2327c.quebec(papa2, 645267456, (i4 * 406493490) + (i5 * 817356128) + (i11 * 868239597) + (i21 * 659) + (i20 * 659) + (i16 * (-659)) + (i12 * 868238279) + ((i10 * 868240256) - 1765242424), 681705472, (529399808 * papa2) + i23)) {
            case 1:
                int i24 = papa;
                int i25 = (((i24 | 63) << 1) - (i24 ^ 63)) % 128;
                quebec = i25;
                int i26 = (i25 ^ 99) + ((i25 & 99) << 1);
                papa = i26 % 128;
                if (i26 % 2 == 0) {
                    return charlie;
                }
                throw null;
            case 2:
                quebec = (papa + 119) % 128;
                return foxtrot;
            case 3:
                int i27 = papa;
                int i28 = (i27 & 5) + (i27 | 5);
                quebec = i28 % 128;
                if (i28 % 2 != 0) {
                    return juliet;
                }
                throw null;
            case 4:
                int i29 = quebec + 41;
                papa = i29 % 128;
                int i30 = i29 % 2;
                String str = echo;
                if (i30 != 0) {
                    int i31 = 76 / 0;
                }
                return str;
            case 5:
                int i32 = quebec;
                int i33 = ((i32 & 93) + (i32 | 93)) % 128;
                papa = i33;
                quebec = (i33 + 93) % 128;
                return lima;
            case 6:
                int i34 = papa;
                int i35 = ((i34 & 39) + (i34 | 39)) % 128;
                quebec = i35;
                int i36 = i35 + 89;
                papa = i36 % 128;
                if (i36 % 2 == 0) {
                    return delta;
                }
                throw null;
            default:
                yY18494.component9();
                yY18494.component9();
                int i37 = quebec;
                int i38 = ((i37 | 17) << 1) - (i37 ^ 17);
                papa = i38 % 128;
                if (i38 % 2 == 0) {
                    return alpha;
                }
                throw null;
        }
    }

    public static final String charlie() {
        int i4 = quebec;
        int i5 = ((i4 & 71) + (i4 | 71)) % 128;
        papa = i5;
        quebec = ((i5 & 11) + (i5 | 11)) % 128;
        return india;
    }
}
