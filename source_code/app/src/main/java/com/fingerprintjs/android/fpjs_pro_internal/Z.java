package com.fingerprintjs.android.fpjs_pro_internal;

import android.media.MediaDrm;
import android.os.Build;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.collections.ArraysKt;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class Z {
    public static int alpha = 0;
    public static int bravo = 1;

    public static String alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        String lime;
        int i14 = ~i11;
        int i15 = ~i13;
        int i16 = (~(i14 | i15 | i10)) | (~(i11 | i13 | i10));
        int i17 = ~i10;
        int i18 = (~(i15 | i11)) | (~(i15 | i17));
        int i19 = (~(i10 | i13)) | (~(i14 | i17));
        int i20 = 477102080 * i5;
        int i21 = (452984832 * i4) + (1390411776 * i12) + i20 + ((-996813045) * i19) + (1993626090 * i18) + (996813045 * i16) + ((-1516524009) * i13) + (1473915126 * i11) + 752877568;
        int papa = AbstractC2327c.papa(i4, 483938512, ((-564018846) * i12) + i11 + i13 + i5);
        if (AbstractC2327c.quebec(papa, 1868693504, (i4 * 1098359728) + (i12 * 578355822) + (i5 * 1456093799) + (i19 * 877) + (i18 * (-1754)) + (i16 * (-877)) + (i13 * 1456095553) + ((i11 * 1456092922) - 824780772), 2110914560, ((-1135738880) * papa) + i21) != 1) {
            MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
            int i22 = bravo + 83;
            alpha = i22 % 128;
            if (i22 % 2 != 0 || Build.VERSION.SDK_INT >= 28) {
                int i23 = alpha;
                bravo = ((i23 ^ 49) + ((i23 & 49) << 1)) % 128;
                mediaDrm.release();
            } else {
                mediaDrm.release();
                alpha = (bravo + 89) % 128;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(propertyByteArray);
            byte[] digest = messageDigest.digest();
            int i24 = (C1201e.delta + 9) % 128;
            C1201e.charlie = i24;
            int i25 = (i24 & 51) + (i24 | 51);
            C1201e.delta = i25 % 128;
            if (i25 % 2 == 0) {
                lime = ArraysKt.lime(digest, "", 1, C1243o1.alpha, 118);
            } else {
                lime = ArraysKt.lime(digest, "", 0, C1243o1.alpha, 30);
            }
            int i26 = C1201e.charlie;
            int i27 = i26 + 17;
            C1201e.delta = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 47 / 0;
            }
            C1201e.delta = (((i26 | 107) << 1) - (i26 ^ 107)) % 128;
            int i29 = bravo + 19;
            alpha = i29 % 128;
            if (i29 % 2 == 0) {
                return lime;
            }
            throw null;
        }
        int i30 = bravo + 109;
        alpha = i30 % 128;
        int i31 = i30 % 2;
        Object[] objArr2 = new Object[0];
        int alpha2 = C1188a2.alpha();
        int alpha3 = C1188a2.alpha();
        int alpha4 = C1188a2.alpha();
        int alpha5 = C1188a2.alpha();
        if (i31 != 0) {
            int i32 = 26 / 0;
            return alpha(objArr2, alpha5, alpha3, alpha2, 59694023, alpha4, -59694023);
        }
        return alpha(objArr2, alpha5, alpha3, alpha2, 59694023, alpha4, -59694023);
    }
}
