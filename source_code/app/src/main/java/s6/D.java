package s6;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class D implements Executor {
    public static final D alpha;
    public static final /* synthetic */ D[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, s6.D] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        alpha = r12;
        purple = new D[]{r12};
    }

    public static D[] values() {
        return (D[]) purple.clone();
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
