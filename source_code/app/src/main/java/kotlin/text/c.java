package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import pf.InterfaceC2358h;

/* loaded from: classes2.dex */
public final class c implements InterfaceC2358h {
    public final CharSequence alpha;
    public final int bravo;
    public final Xd.l charlie;

    public c(CharSequence input, int i4, Xd.l lVar) {
        Intrinsics.echo(input, "input");
        this.alpha = input;
        this.bravo = i4;
        this.charlie = lVar;
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        return new b(this);
    }
}
