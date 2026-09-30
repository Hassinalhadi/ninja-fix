package dagger.hilt.internal;

/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z2, String str, Object... objArr) {
        if (z2) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t5) {
        t5.getClass();
        return t5;
    }

    public static void checkState(boolean z2, String str, Object... objArr) {
        if (z2) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }
}
