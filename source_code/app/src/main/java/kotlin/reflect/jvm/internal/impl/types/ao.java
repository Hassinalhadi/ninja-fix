package kotlin.reflect.jvm.internal.impl.types;

import gf.C1790e;
import gf.C1791f;
import gf.InterfaceC1787b;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import of.C2259n;

/* loaded from: classes2.dex */
public class ao {
    public final boolean alpha;
    public final boolean bravo;
    public final InterfaceC1787b charlie;
    public final C1790e delta;
    public final C1791f echo;
    public int foxtrot;
    public ArrayDeque golf;
    public C2259n hotel;

    public ao(boolean z2, boolean z10, InterfaceC1787b typeSystemContext, C1790e kotlinTypePreparator, C1791f kotlinTypeRefiner) {
        Intrinsics.echo(typeSystemContext, "typeSystemContext");
        Intrinsics.echo(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = typeSystemContext;
        this.delta = kotlinTypePreparator;
        this.echo = kotlinTypeRefiner;
    }

    public final void alpha() {
        ArrayDeque arrayDeque = this.golf;
        Intrinsics.checkNotNull(arrayDeque);
        arrayDeque.clear();
        C2259n c2259n = this.hotel;
        Intrinsics.checkNotNull(c2259n);
        c2259n.clear();
    }

    public final void bravo() {
        if (this.golf == null) {
            this.golf = new ArrayDeque(4);
        }
        if (this.hotel == null) {
            this.hotel = new C2259n();
        }
    }

    public final B charlie(p000if.c type) {
        Intrinsics.echo(type, "type");
        return this.delta.alpha(type);
    }

    public final y delta(p000if.c type) {
        Intrinsics.echo(type, "type");
        this.echo.getClass();
        return (y) type;
    }
}
