package x7;

import bd.AbstractC0754g;
import com.bumptech.glide.load.engine.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import s7.AbstractC2835b;
import s7.e;
import s7.f;
import z7.G;

/* loaded from: classes2.dex */
public final class c implements e {
    public final h alpha;
    public final byte[] bravo = {0};

    public c(h hVar) {
        this.alpha = hVar;
    }

    @Override // s7.e
    public final void alpha(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            h hVar = this.alpha;
            for (f fVar : hVar.juliet(copyOf)) {
                try {
                    boolean equals = fVar.delta.equals(G.LEGACY);
                    Object obj = fVar.alpha;
                    if (equals) {
                        ((e) obj).alpha(copyOfRange, AbstractC0754g.alpha(bArr2, this.bravo));
                    } else {
                        ((e) obj).alpha(copyOfRange, bArr2);
                    }
                    return;
                } catch (GeneralSecurityException e) {
                    d.alpha.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            Iterator it = hVar.juliet(AbstractC2835b.alpha).iterator();
            while (it.hasNext()) {
                try {
                    ((e) ((f) it.next()).alpha).alpha(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // s7.e
    public final byte[] bravo(byte[] bArr) {
        h hVar = this.alpha;
        if (((f) hVar.red).delta.equals(G.LEGACY)) {
            return AbstractC0754g.alpha(((f) hVar.red).alpha(), ((e) ((f) hVar.red).alpha).bravo(AbstractC0754g.alpha(bArr, this.bravo)));
        }
        return AbstractC0754g.alpha(((f) hVar.red).alpha(), ((e) ((f) hVar.red).alpha).bravo(bArr));
    }
}
