package Uf;

import Tf.ap;
import Tf.x;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends x {
    public final long alpha;
    public final boolean purple;
    public long red;

    public g(ap apVar, long j5, boolean z2) {
        super(apVar);
        this.alpha = j5;
        this.purple = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [Tf.k, java.lang.Object] */
    @Override // Tf.x, Tf.ap
    public final long read(Tf.k sink, long j5) {
        Intrinsics.echo(sink, "sink");
        long j6 = this.red;
        long j7 = this.alpha;
        if (j6 > j7) {
            j5 = 0;
        } else if (this.purple) {
            long j10 = j7 - j6;
            if (j10 == 0) {
                return -1L;
            }
            j5 = Math.min(j5, j10);
        }
        long read = super.read(sink, j5);
        if (read != -1) {
            this.red += read;
        }
        long j11 = this.red;
        if ((j11 < j7 && read == -1) || j11 > j7) {
            if (read > 0 && j11 > j7) {
                long j12 = sink.purple - (j11 - j7);
                ?? obj = new Object();
                obj.f(sink);
                sink.write(obj, j12);
                obj.charlie();
            }
            StringBuilder uniform = Q0.c.uniform("expected ", j7, " bytes but got ");
            uniform.append(this.red);
            throw new IOException(uniform.toString());
        }
        return read;
    }
}
