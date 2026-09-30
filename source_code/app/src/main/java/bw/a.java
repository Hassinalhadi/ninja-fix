package bw;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final int[] alpha = new int[0];
    public static final long[] bravo = new long[0];
    public static final Object[] charlie = new Object[0];

    public static final int alpha(int i4, int i5, int[] array) {
        Intrinsics.echo(array, "array");
        int i10 = i4 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = array[i12];
            if (i13 < i5) {
                i11 = i12 + 1;
            } else if (i13 > i5) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int bravo(long[] array, int i4, long j5) {
        Intrinsics.echo(array, "array");
        int i5 = i4 - 1;
        int i10 = 0;
        while (i10 <= i5) {
            int i11 = (i10 + i5) >>> 1;
            long j6 = array[i11];
            if (j6 < j5) {
                i10 = i11 + 1;
            } else if (j6 > j5) {
                i5 = i11 - 1;
            } else {
                return i11;
            }
        }
        return ~i10;
    }

    public static final void charlie(String message) {
        Intrinsics.echo(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void delta(String message) {
        Intrinsics.echo(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void echo(String message) {
        Intrinsics.echo(message, "message");
        throw new NoSuchElementException(message);
    }
}
