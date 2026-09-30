package vd;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.Z4;
import sd.v;
import t6.AbstractC2981d2;

/* loaded from: classes2.dex */
public final class f extends c {
    public final String alpha;
    public final sd.e bravo;
    public final byte[] charlie;

    public f(String text, sd.e contentType) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(contentType, "contentType");
        this.alpha = text;
        this.bravo = contentType;
        Charset alpha = AbstractC2981d2.alpha(contentType);
        this.charlie = Z4.charlie(text, alpha == null ? kotlin.text.a.alpha : alpha);
    }

    @Override // vd.e
    public final Long alpha() {
        return Long.valueOf(this.charlie.length);
    }

    @Override // vd.e
    public final sd.e bravo() {
        return this.bravo;
    }

    @Override // vd.e
    public final v delta() {
        return null;
    }

    @Override // vd.c
    public final byte[] echo() {
        return this.charlie;
    }

    public final String toString() {
        return "TextContent[" + this.bravo + "] \"" + StringsKt.yellow(30, this.alpha) + '\"';
    }
}
