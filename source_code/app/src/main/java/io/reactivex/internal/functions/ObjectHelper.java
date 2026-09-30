package io.reactivex.internal.functions;

import av.q;
import io.reactivex.functions.BiPredicate;

/* loaded from: classes2.dex */
public final class ObjectHelper {
    static final BiPredicate<Object, Object> EQUALS = new BiObjectPredicate();

    /* loaded from: classes2.dex */
    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.functions.BiPredicate
        public boolean test(Object obj, Object obj2) {
            return ObjectHelper.equals(obj, obj2);
        }
    }

    private ObjectHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static int compare(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 > i5 ? 1 : 0;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static <T> BiPredicate<T, T> equalsPredicate() {
        return (BiPredicate<T, T>) EQUALS;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }

    public static int verifyPositive(int i4, String str) {
        if (i4 > 0) {
            return i4;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i4);
    }

    public static int compare(long j5, long j6) {
        if (j5 < j6) {
            return -1;
        }
        return j5 > j6 ? 1 : 0;
    }

    @Deprecated
    public static long requireNonNull(long j5, String str) {
        throw new InternalError(q.echo("Null check on a primitive: ", str));
    }

    public static long verifyPositive(long j5, String str) {
        if (j5 > 0) {
            return j5;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j5);
    }
}
