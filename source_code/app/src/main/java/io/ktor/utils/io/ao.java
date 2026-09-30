package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ao implements t {
    public final t bravo;
    public final Gf.a charlie;
    public long delta;
    public long echo;

    /* JADX WARN: Type inference failed for: r2v1, types: [Gf.a, java.lang.Object] */
    public ao(t delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.bravo = delegate;
        this.charlie = new Object();
    }

    public final void alpha() {
        bravo();
        this.delta += this.charlie.juliet(this.bravo.golf());
    }

    public final void bravo() {
        long j5 = this.echo;
        long j6 = this.delta;
        long j7 = this.charlie.red;
        this.echo = (j6 - j7) + j5;
        this.delta = j7;
    }

    @Override // io.ktor.utils.io.t
    public final void delta(Throwable th) {
        this.bravo.delta(th);
    }

    @Override // io.ktor.utils.io.t
    public final Throwable echo() {
        return this.bravo.echo();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // io.ktor.utils.io.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(int i4, Pd.c cVar) {
        an anVar;
        Object obj;
        int i5;
        if (cVar instanceof an) {
            anVar = (an) cVar;
            int i10 = anVar.red;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                anVar.red = i10 - RecyclerView.UNDEFINED_DURATION;
                obj = anVar.alpha;
                Od.a aVar = Od.a.alpha;
                i5 = anVar.red;
                if (i5 == 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    alpha();
                    if (this.charlie.red >= i4) {
                        return Boolean.TRUE;
                    }
                    anVar.red = 1;
                    obj = this.bravo.foxtrot(i4, anVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    alpha();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }
        anVar = new an(this, cVar);
        obj = anVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i5 = anVar.red;
        if (i5 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // io.ktor.utils.io.t
    public final Gf.a golf() {
        alpha();
        return this.charlie;
    }

    @Override // io.ktor.utils.io.t
    public final boolean hotel() {
        if (this.charlie.hotel() && this.bravo.hotel()) {
            return true;
        }
        return false;
    }
}
