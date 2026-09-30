package io.ktor.utils.io;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;
import s6.AbstractC2743p6;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class d implements e {
    public final C3207k bravo;
    public final Throwable charlie;

    public d(C3207k c3207k) {
        this.bravo = c3207k;
        String property = System.getProperty("io.ktor.development");
        if (property != null && Boolean.parseBoolean(property)) {
            int hashCode = c3207k.hashCode();
            AbstractC2743p6.alpha(16);
            String num = Integer.toString(hashCode, 16);
            Intrinsics.delta(num, "toString(...)");
            Throwable th = new Throwable("ReadTask 0x".concat(num));
            AbstractC2689j6.echo(th);
            this.charlie = th;
        }
    }

    @Override // io.ktor.utils.io.e
    public final void alpha(Throwable th) {
        Object obj;
        Nd.c delta = delta();
        if (th != null) {
            Result.Companion companion = Result.INSTANCE;
            obj = Result.m206constructorimpl(ResultKt.createFailure(th));
        } else {
            g.alpha.getClass();
            obj = b.charlie;
        }
        ((C3207k) delta).resumeWith(obj);
    }

    @Override // io.ktor.utils.io.e
    public final void bravo() {
        Nd.c delta = delta();
        g.alpha.getClass();
        ((C3207k) delta).resumeWith(b.charlie);
    }

    @Override // io.ktor.utils.io.e
    public final Throwable charlie() {
        return this.charlie;
    }

    public final Nd.c delta() {
        return this.bravo;
    }
}
