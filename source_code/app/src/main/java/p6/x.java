package p6;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class x implements Executor {
    public static final x alpha;
    public static final /* synthetic */ x[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p6.x, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        alpha = r12;
        purple = new x[]{r12};
    }

    public static x[] values() {
        return (x[]) purple.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
