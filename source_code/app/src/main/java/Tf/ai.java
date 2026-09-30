package Tf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ai implements ap, AutoCloseable {
    public final m alpha;
    public final k purple;
    public al red;
    public int silver;
    public boolean teal;
    public long white;

    public ai(m mVar) {
        int i4;
        this.alpha = mVar;
        k delta = mVar.delta();
        this.purple = delta;
        al alVar = delta.alpha;
        this.red = alVar;
        if (alVar != null) {
            i4 = alVar.bravo;
        } else {
            i4 = -1;
        }
        this.silver = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.teal = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.bravo) goto L15;
     */
    @Override // Tf.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(k sink, long j5) {
        al alVar;
        Intrinsics.echo(sink, "sink");
        if (j5 >= 0) {
            if (!this.teal) {
                al alVar2 = this.red;
                k kVar = this.purple;
                if (alVar2 != null) {
                    al alVar3 = kVar.alpha;
                    if (alVar2 == alVar3) {
                        int i4 = this.silver;
                        Intrinsics.checkNotNull(alVar3);
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                if (j5 == 0) {
                    return 0L;
                }
                if (!this.alpha.request(this.white + 1)) {
                    return -1L;
                }
                if (this.red == null && (alVar = kVar.alpha) != null) {
                    this.red = alVar;
                    Intrinsics.checkNotNull(alVar);
                    this.silver = alVar.bravo;
                }
                long min = Math.min(j5, kVar.purple - this.white);
                this.purple.golf(this.white, sink, min);
                this.white += min;
                return min;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
    }

    @Override // Tf.ap
    public final as timeout() {
        return this.alpha.timeout();
    }
}
