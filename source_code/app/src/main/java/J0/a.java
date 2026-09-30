package J0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {
    public static final void alpha(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void bravo(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
