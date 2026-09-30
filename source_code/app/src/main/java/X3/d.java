package X3;

import E3.f;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class d implements f {
    public final Object bravo;

    public d(Object obj) {
        Y3.f.charlie(obj, "Argument must not be null");
        this.bravo = obj;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        messageDigest.update(this.bravo.toString().getBytes(f.alpha));
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.bravo.equals(((d) obj).bravo);
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        return this.bravo.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.bravo + '}';
    }
}
