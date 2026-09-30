package Nf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Nf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0264w {
    public static final long[] echo = new long[0];
    public final SerialDescriptor alpha;
    public final Pf.n bravo;
    public long charlie;
    public final long[] delta;

    public C0264w(SerialDescriptor descriptor, Pf.n nVar) {
        Intrinsics.echo(descriptor, "descriptor");
        this.alpha = descriptor;
        this.bravo = nVar;
        int romeo = descriptor.romeo();
        if (romeo <= 64) {
            this.charlie = romeo != 64 ? (-1) << romeo : 0L;
            this.delta = echo;
            return;
        }
        this.charlie = 0L;
        int i4 = (romeo - 1) >>> 6;
        long[] jArr = new long[i4];
        if ((romeo & 63) != 0) {
            jArr[i4 - 1] = (-1) << romeo;
        }
        this.delta = jArr;
    }
}
