package Tf;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class al {
    public final byte[] alpha;
    public int bravo;
    public int charlie;
    public boolean delta;
    public final boolean echo;
    public al foxtrot;
    public al golf;

    public al() {
        this.alpha = new byte[8192];
        this.echo = true;
        this.delta = false;
    }

    public final al alpha() {
        al alVar = this.foxtrot;
        if (alVar == this) {
            alVar = null;
        }
        al alVar2 = this.golf;
        Intrinsics.checkNotNull(alVar2);
        alVar2.foxtrot = this.foxtrot;
        al alVar3 = this.foxtrot;
        Intrinsics.checkNotNull(alVar3);
        alVar3.golf = this.golf;
        this.foxtrot = null;
        this.golf = null;
        return alVar;
    }

    public final void bravo(al segment) {
        Intrinsics.echo(segment, "segment");
        segment.golf = this;
        segment.foxtrot = this.foxtrot;
        al alVar = this.foxtrot;
        Intrinsics.checkNotNull(alVar);
        alVar.golf = segment;
        this.foxtrot = segment;
    }

    public final al charlie() {
        this.delta = true;
        return new al(this.alpha, this.bravo, this.charlie, true, false);
    }

    public final void delta(al sink, int i4) {
        Intrinsics.echo(sink, "sink");
        if (sink.echo) {
            int i5 = sink.charlie;
            int i10 = i5 + i4;
            byte[] bArr = sink.alpha;
            if (i10 > 8192) {
                if (!sink.delta) {
                    int i11 = sink.bravo;
                    if (i10 - i11 <= 8192) {
                        ArraysKt.xray(0, i11, i5, bArr, bArr);
                        sink.charlie -= sink.bravo;
                        sink.bravo = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i12 = sink.charlie;
            int i13 = this.bravo;
            ArraysKt.xray(i12, i13, i13 + i4, this.alpha, bArr);
            sink.charlie += i4;
            this.bravo += i4;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public al(byte[] data, int i4, int i5, boolean z2, boolean z10) {
        Intrinsics.echo(data, "data");
        this.alpha = data;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = z2;
        this.echo = z10;
    }
}
