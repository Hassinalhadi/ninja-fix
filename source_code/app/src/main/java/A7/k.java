package A7;

import bd.AbstractC0754g;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import s7.InterfaceC2834a;

/* loaded from: classes2.dex */
public final class k implements InterfaceC2834a {
    public final n alpha;
    public final s7.e bravo;
    public final int charlie;

    public k(n nVar, s7.e eVar, int i4) {
        this.alpha = nVar;
        this.bravo = eVar;
        this.charlie = i4;
    }

    @Override // s7.InterfaceC2834a
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        byte[] alpha = this.alpha.alpha(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC0754g.alpha(alpha, this.bravo.bravo(AbstractC0754g.alpha(bArr2, alpha, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // s7.InterfaceC2834a
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i4 = this.charlie;
        if (length >= i4) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i4);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i4, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.bravo.alpha(copyOfRange2, AbstractC0754g.alpha(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.alpha.bravo(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
