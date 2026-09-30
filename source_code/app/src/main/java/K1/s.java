package K1;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class s {
    public int alpha = 1;
    public final v bravo;
    public v charlie;
    public v delta;
    public int echo;
    public int foxtrot;

    public s(v vVar) {
        this.bravo = vVar;
        this.charlie = vVar;
    }

    public final void alpha() {
        this.alpha = 1;
        this.charlie = this.bravo;
        this.foxtrot = 0;
    }

    public final boolean bravo() {
        androidx.emoji2.text.flatbuffer.a bravo = this.charlie.bravo.bravo();
        int alpha = bravo.alpha(6);
        if ((alpha != 0 && ((ByteBuffer) bravo.silver).get(alpha + bravo.alpha) != 0) || this.echo == 65039) {
            return true;
        }
        return false;
    }
}
