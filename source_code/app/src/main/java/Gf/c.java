package Gf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements d, AutoCloseable {
    public final i alpha;
    public final a purple;
    public g red;
    public int silver;
    public boolean teal;
    public long white;

    public c(i iVar) {
        int i4;
        this.alpha = iVar;
        a delta = iVar.delta();
        this.purple = delta;
        g gVar = delta.alpha;
        this.red = gVar;
        if (gVar != null) {
            i4 = gVar.bravo;
        } else {
            i4 = -1;
        }
        this.silver = i4;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.teal = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.bravo) goto L15;
     */
    @Override // Gf.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(a sink, long j5) {
        g gVar;
        Intrinsics.echo(sink, "sink");
        if (!this.teal) {
            if (j5 >= 0) {
                g gVar2 = this.red;
                a aVar = this.purple;
                if (gVar2 != null) {
                    g gVar3 = aVar.alpha;
                    if (gVar2 == gVar3) {
                        int i4 = this.silver;
                        Intrinsics.checkNotNull(gVar3);
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                if (j5 == 0) {
                    return 0L;
                }
                if (!this.alpha.request(this.white + 1)) {
                    return -1L;
                }
                if (this.red == null && (gVar = aVar.alpha) != null) {
                    this.red = gVar;
                    Intrinsics.checkNotNull(gVar);
                    this.silver = gVar.bravo;
                }
                long min = Math.min(j5, aVar.red - this.white);
                long j6 = this.white;
                long j7 = j6 + min;
                k.alpha(aVar.red, j6, j7);
                if (j6 != j7) {
                    long j10 = j7 - j6;
                    sink.red += j10;
                    g gVar4 = aVar.alpha;
                    while (true) {
                        Intrinsics.checkNotNull(gVar4);
                        long j11 = gVar4.charlie - gVar4.bravo;
                        if (j6 < j11) {
                            break;
                        }
                        j6 -= j11;
                        gVar4 = gVar4.foxtrot;
                    }
                    while (j10 > 0) {
                        Intrinsics.checkNotNull(gVar4);
                        g foxtrot = gVar4.foxtrot();
                        int i5 = foxtrot.bravo + ((int) j6);
                        foxtrot.bravo = i5;
                        foxtrot.charlie = Math.min(i5 + ((int) j10), foxtrot.charlie);
                        if (sink.alpha == null) {
                            sink.alpha = foxtrot;
                            sink.purple = foxtrot;
                        } else {
                            g gVar5 = sink.purple;
                            Intrinsics.checkNotNull(gVar5);
                            gVar5.echo(foxtrot);
                            sink.purple = foxtrot;
                        }
                        j10 -= foxtrot.charlie - foxtrot.bravo;
                        gVar4 = gVar4.foxtrot;
                        j6 = 0;
                    }
                }
                this.white += min;
                return min;
            }
            throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount (", j5, ") < 0").toString());
        }
        throw new IllegalStateException("Source is closed.");
    }
}
