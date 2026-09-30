package kotlin.io;

import java.io.File;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.C2355e;
import pf.InterfaceC2358h;

/* loaded from: classes2.dex */
public final class h implements InterfaceC2358h {
    public final /* synthetic */ int alpha = 0;
    public final Object bravo;
    public final Object charlie;

    public h(File start) {
        i iVar = i.alpha;
        Intrinsics.echo(start, "start");
        this.bravo = start;
        this.charlie = iVar;
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new f(this);
            case 1:
                return new N.d(this);
            default:
                return new C2355e(this);
        }
    }

    public h(InterfaceC2358h sequence, Function1 predicate) {
        Intrinsics.echo(sequence, "sequence");
        Intrinsics.echo(predicate, "predicate");
        this.bravo = sequence;
        this.charlie = predicate;
    }

    public h(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.echo(getInitialValue, "getInitialValue");
        Intrinsics.echo(getNextValue, "getNextValue");
        this.bravo = getInitialValue;
        this.charlie = getNextValue;
    }
}
