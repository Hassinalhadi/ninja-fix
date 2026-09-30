package A7;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class q {
    public static final a alpha = new a(4);

    public static byte[] alpha(int i4) {
        byte[] bArr = new byte[i4];
        ((SecureRandom) alpha.get()).nextBytes(bArr);
        return bArr;
    }
}
