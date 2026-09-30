package Nd;

import Xd.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2832z6;

/* loaded from: classes2.dex */
public abstract class a implements f {

    @NotNull
    private final g key;

    public a(g key) {
        Intrinsics.echo(key, "key");
        this.key = key;
    }

    @Override // Nd.h
    public <R> R fold(R r4, @NotNull l operation) {
        Intrinsics.echo(operation, "operation");
        return (R) operation.invoke(r4, this);
    }

    @Override // Nd.h
    @Nullable
    public <E extends f> E get(@NotNull g gVar) {
        return (E) AbstractC2832z6.alpha(this, gVar);
    }

    @Override // Nd.f
    @NotNull
    public g getKey() {
        return this.key;
    }

    @Override // Nd.h
    @NotNull
    public h minusKey(@NotNull g gVar) {
        return AbstractC2832z6.bravo(this, gVar);
    }

    @Override // Nd.h
    @NotNull
    public h plus(@NotNull h hVar) {
        return AbstractC2832z6.charlie(this, hVar);
    }
}
