package Gf;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {
    public final byte[] alpha;
    public int bravo;
    public int charlie;
    public k delta;
    public boolean echo;
    public g foxtrot;
    public g golf;

    public g() {
        this.alpha = new byte[8192];
        this.echo = true;
        this.delta = null;
    }

    public final int alpha() {
        return this.alpha.length - this.charlie;
    }

    public final int bravo() {
        return this.charlie - this.bravo;
    }

    public final byte charlie(int i4) {
        return this.alpha[this.bravo + i4];
    }

    public final g delta() {
        g gVar = this.foxtrot;
        g gVar2 = this.golf;
        if (gVar2 != null) {
            Intrinsics.checkNotNull(gVar2);
            gVar2.foxtrot = this.foxtrot;
        }
        g gVar3 = this.foxtrot;
        if (gVar3 != null) {
            Intrinsics.checkNotNull(gVar3);
            gVar3.golf = this.golf;
        }
        this.foxtrot = null;
        this.golf = null;
        return gVar;
    }

    public final void echo(g segment) {
        Intrinsics.echo(segment, "segment");
        segment.golf = this;
        segment.foxtrot = this.foxtrot;
        g gVar = this.foxtrot;
        if (gVar != null) {
            Intrinsics.checkNotNull(gVar);
            gVar.golf = segment;
        }
        this.foxtrot = segment;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, Gf.k] */
    public final g foxtrot() {
        k kVar = this.delta;
        k kVar2 = kVar;
        if (kVar == null) {
            g gVar = h.alpha;
            ?? obj = new Object();
            this.delta = obj;
            kVar2 = obj;
        }
        int i4 = this.bravo;
        int i5 = this.charlie;
        f.charlie.incrementAndGet((f) kVar2);
        return new g(this.alpha, i4, i5, kVar2);
    }

    public final void golf(g sink, int i4) {
        Intrinsics.echo(sink, "sink");
        if (sink.echo) {
            if (sink.charlie + i4 > 8192) {
                k kVar = sink.delta;
                if (kVar != null && ((f) kVar).bravo > 0) {
                    throw new IllegalArgumentException();
                }
                int i5 = sink.charlie;
                int i10 = sink.bravo;
                if ((i5 + i4) - i10 <= 8192) {
                    byte[] bArr = sink.alpha;
                    ArraysKt.xray(0, i10, i5, bArr, bArr);
                    sink.charlie -= sink.bravo;
                    sink.bravo = 0;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i11 = sink.charlie;
            int i12 = this.bravo;
            ArraysKt.xray(i11, i12, i12 + i4, this.alpha, sink.alpha);
            sink.charlie += i4;
            this.bravo += i4;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public g(byte[] bArr, int i4, int i5, k kVar) {
        this.alpha = bArr;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = kVar;
        this.echo = false;
    }
}
