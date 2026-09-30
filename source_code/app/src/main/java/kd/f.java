package kd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends vd.d {
    public final io.ktor.utils.io.t alpha;
    public final sd.e bravo;
    public final Long charlie;
    public final sd.v delta;
    public final sd.m echo;

    public f(vd.e originalContent, io.ktor.utils.io.t channel) {
        Intrinsics.echo(originalContent, "originalContent");
        Intrinsics.echo(channel, "channel");
        this.alpha = channel;
        this.bravo = originalContent.bravo();
        this.charlie = originalContent.alpha();
        this.delta = originalContent.delta();
        this.echo = originalContent.charlie();
    }

    @Override // vd.e
    public final Long alpha() {
        return this.charlie;
    }

    @Override // vd.e
    public final sd.e bravo() {
        return this.bravo;
    }

    @Override // vd.e
    public final sd.m charlie() {
        return this.echo;
    }

    @Override // vd.e
    public final sd.v delta() {
        return this.delta;
    }

    @Override // vd.d
    public final io.ktor.utils.io.t echo() {
        return this.alpha;
    }
}
