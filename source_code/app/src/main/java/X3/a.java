package X3;

import E3.f;
import Y3.l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class a implements f {
    public final int bravo;
    public final f charlie;

    public a(int i4, f fVar) {
        this.bravo = i4;
        this.charlie = fVar;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        this.charlie.alpha(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.bravo).array());
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.bravo == aVar.bravo && this.charlie.equals(aVar.charlie)) {
                return true;
            }
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        return l.hotel(this.bravo, this.charlie);
    }
}
