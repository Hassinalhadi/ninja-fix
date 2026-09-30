package v7;

import bd.AbstractC0754g;
import com.bumptech.glide.load.engine.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import s7.AbstractC2835b;
import s7.InterfaceC2836c;
import s7.f;

/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3174b implements InterfaceC2836c {
    public h alpha;

    @Override // s7.InterfaceC2836c
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        h hVar = this.alpha;
        return AbstractC0754g.alpha(((f) hVar.red).alpha(), ((InterfaceC2836c) ((f) hVar.red).alpha).alpha(bArr, bArr2));
    }

    @Override // s7.InterfaceC2836c
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        h hVar = this.alpha;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = hVar.juliet(copyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((InterfaceC2836c) ((f) it.next()).alpha).bravo(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    C3175c.alpha.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                }
            }
        }
        Iterator it2 = hVar.juliet(AbstractC2835b.alpha).iterator();
        while (it2.hasNext()) {
            try {
                return ((InterfaceC2836c) ((f) it2.next()).alpha).bravo(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
