package p0;

import org.jetbrains.annotations.NotNull;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2264a {
    public static final void alpha(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void bravo(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void charlie(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    public static final void delta(@NotNull String str) {
        throw new IndexOutOfBoundsException(str);
    }
}
