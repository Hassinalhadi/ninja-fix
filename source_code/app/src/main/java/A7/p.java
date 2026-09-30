package A7;

import bd.AbstractC0754g;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import y7.InterfaceC3401a;

/* loaded from: classes2.dex */
public final class p implements s7.e {
    public final InterfaceC3401a alpha;
    public final int bravo;

    public p(InterfaceC3401a interfaceC3401a, int i4) {
        this.alpha = interfaceC3401a;
        this.bravo = i4;
        if (i4 >= 10) {
            interfaceC3401a.delta(i4, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // s7.e
    public final void alpha(byte[] bArr, byte[] bArr2) {
        if (AbstractC0754g.bravo(bravo(bArr2), bArr)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // s7.e
    public final byte[] bravo(byte[] bArr) {
        return this.alpha.delta(this.bravo, bArr);
    }
}
