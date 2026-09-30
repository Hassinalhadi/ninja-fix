package Dd;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import s6.J6;

/* loaded from: classes2.dex */
public final class m extends f {
    public final List purple;
    public final l red;
    public Object silver;
    public final Nd.c[] teal;
    public int white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object initial, Object context, List blocks) {
        super(context);
        Intrinsics.echo(initial, "initial");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(blocks, "blocks");
        this.purple = blocks;
        this.red = new l(this);
        this.silver = initial;
        this.teal = new Nd.c[blocks.size()];
        this.white = -1;
    }

    @Override // Dd.f
    public final Object alpha(Object obj, Pd.c cVar) {
        this.yellow = 0;
        if (this.purple.size() == 0) {
            return obj;
        }
        Intrinsics.echo(obj, "<set-?>");
        this.silver = obj;
        if (this.white < 0) {
            return delta(cVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // Dd.f
    public final Object bravo() {
        return this.silver;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.red.getContext();
    }

    @Override // Dd.f
    public final Object delta(Nd.c frame) {
        Object obj;
        if (this.yellow == this.purple.size()) {
            obj = this.silver;
        } else {
            Nd.c delta = J6.delta(frame);
            int i4 = this.white + 1;
            this.white = i4;
            Nd.c[] cVarArr = this.teal;
            cVarArr[i4] = delta;
            if (foxtrot(true)) {
                int i5 = this.white;
                if (i5 >= 0) {
                    this.white = i5 - 1;
                    cVarArr[i5] = null;
                    obj = this.silver;
                } else {
                    throw new IllegalStateException("No more continuations to resume");
                }
            } else {
                obj = Od.a.alpha;
            }
        }
        if (obj == Od.a.alpha) {
            Intrinsics.echo(frame, "frame");
        }
        return obj;
    }

    @Override // Dd.f
    public final Object echo(Nd.c cVar, Object obj) {
        Intrinsics.echo(obj, "<set-?>");
        this.silver = obj;
        return delta(cVar);
    }

    public final boolean foxtrot(boolean z2) {
        Xd.m interceptor;
        Object subject;
        l continuation;
        do {
            int i4 = this.yellow;
            List list = this.purple;
            if (i4 == list.size()) {
                if (z2) {
                    return true;
                }
                Result.Companion companion = Result.INSTANCE;
                golf(Result.m206constructorimpl(this.silver));
                return false;
            }
            this.yellow = i4 + 1;
            interceptor = (Xd.m) list.get(i4);
            try {
                subject = this.silver;
                continuation = this.red;
                Intrinsics.echo(interceptor, "interceptor");
                Intrinsics.echo(subject, "subject");
                Intrinsics.echo(continuation, "continuation");
                x.echo(3, interceptor);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                golf(Result.m206constructorimpl(ResultKt.createFailure(th)));
                return false;
            }
        } while (interceptor.invoke(this, subject, continuation) != Od.a.alpha);
        return false;
    }

    public final void golf(Object obj) {
        int i4 = this.white;
        if (i4 >= 0) {
            Nd.c[] cVarArr = this.teal;
            Nd.c continuation = cVarArr[i4];
            Intrinsics.checkNotNull(continuation);
            int i5 = this.white;
            this.white = i5 - 1;
            cVarArr[i5] = null;
            Result.Companion companion = Result.INSTANCE;
            if (!(obj instanceof kotlin.k)) {
                continuation.resumeWith(obj);
                return;
            }
            Throwable exception = Result.m207exceptionOrNullimpl(obj);
            Intrinsics.checkNotNull(exception);
            Intrinsics.echo(exception, "exception");
            Intrinsics.echo(continuation, "continuation");
            try {
                exception.getCause();
            } catch (Throwable unused) {
            }
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(exception)));
            return;
        }
        throw new IllegalStateException("No more continuations to resume");
    }
}
