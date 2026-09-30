package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p implements Executor {
    public static final p alpha;
    public static final /* synthetic */ p[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, com.google.mlkit.common.sdkinternal.p] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        alpha = r12;
        purple = new p[]{r12};
    }

    public static p[] values() {
        return (p[]) purple.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g.alpha().alpha.post(runnable);
    }
}
