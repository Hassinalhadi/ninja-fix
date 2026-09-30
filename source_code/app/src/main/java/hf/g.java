package hf;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ap;
import me.AbstractC2120h;
import me.C2117e;
import pe.InterfaceC2332h;

/* loaded from: classes2.dex */
public final class g implements ap {
    public final h alpha;
    public final String[] bravo;
    public final String charlie;

    public g(h kind, String... formatParams) {
        Intrinsics.echo(kind, "kind");
        Intrinsics.echo(formatParams, "formatParams");
        this.alpha = kind;
        this.bravo = formatParams;
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.charlie = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(kind.alpha, Arrays.copyOf(copyOf, copyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        C2117e c2117e = C2117e.foxtrot;
        return C2117e.foxtrot;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        i.alpha.getClass();
        return i.charlie;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final Collection lima() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return false;
    }

    public final String toString() {
        return this.charlie;
    }
}
