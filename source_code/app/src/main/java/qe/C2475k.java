package qe;

import java.util.Map;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.an;

/* renamed from: qe.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2475k implements InterfaceC2466b {
    public final AbstractC2120h alpha;
    public final Ne.c bravo;
    public final Map charlie;
    public final Object delta;

    public C2475k(AbstractC2120h abstractC2120h, Ne.c fqName, Map map) {
        Intrinsics.echo(fqName, "fqName");
        this.alpha = abstractC2120h;
        this.bravo = fqName;
        this.charlie = map;
        this.delta = LazyKt.alpha(kotlin.i.alpha, new C2474j(0, this));
    }

    @Override // qe.InterfaceC2466b
    public final Ne.c alpha() {
        return this.bravo;
    }

    @Override // qe.InterfaceC2466b
    public final Map bravo() {
        return this.charlie;
    }

    @Override // qe.InterfaceC2466b
    public final an echo() {
        return an.magenta;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qe.InterfaceC2466b
    public final y getType() {
        Object value = this.delta.getValue();
        Intrinsics.delta(value, "<get-type>(...)");
        return (y) value;
    }
}
