package io.reactivex.internal.util;

/* loaded from: classes2.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public static int mix(int i4) {
        int i5 = i4 * INT_PHI;
        return i5 ^ (i5 >>> 16);
    }

    public boolean add(T t5) {
        T t10;
        T[] tArr = this.keys;
        int i4 = this.mask;
        int mix = mix(t5.hashCode()) & i4;
        T t11 = tArr[mix];
        if (t11 != null) {
            if (t11.equals(t5)) {
                return false;
            }
            do {
                mix = (mix + 1) & i4;
                t10 = tArr[mix];
                if (t10 == null) {
                }
            } while (!t10.equals(t5));
            return false;
        }
        tArr[mix] = t5;
        int i5 = this.size + 1;
        this.size = i5;
        if (i5 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public Object[] keys() {
        return this.keys;
    }

    public void rehash() {
        T t5;
        T[] tArr = this.keys;
        int length = tArr.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        T[] tArr2 = (T[]) new Object[i4];
        int i10 = this.size;
        while (true) {
            int i11 = i10 - 1;
            if (i10 == 0) {
                this.mask = i5;
                this.maxSize = (int) (i4 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
                t5 = tArr[length];
            } while (t5 == null);
            int mix = mix(t5.hashCode()) & i5;
            if (tArr2[mix] == null) {
                tArr2[mix] = tArr[length];
                i10 = i11;
            }
            do {
                mix = (mix + 1) & i5;
            } while (tArr2[mix] != null);
            tArr2[mix] = tArr[length];
            i10 = i11;
        }
    }

    public boolean remove(T t5) {
        T t10;
        T[] tArr = this.keys;
        int i4 = this.mask;
        int mix = mix(t5.hashCode()) & i4;
        T t11 = tArr[mix];
        if (t11 == null) {
            return false;
        }
        if (t11.equals(t5)) {
            return removeEntry(mix, tArr, i4);
        }
        do {
            mix = (mix + 1) & i4;
            t10 = tArr[mix];
            if (t10 == null) {
                return false;
            }
        } while (!t10.equals(t5));
        return removeEntry(mix, tArr, i4);
    }

    public boolean removeEntry(int i4, T[] tArr, int i5) {
        int i10;
        T t5;
        this.size--;
        while (true) {
            int i11 = i4 + 1;
            while (true) {
                i10 = i11 & i5;
                t5 = tArr[i10];
                if (t5 == null) {
                    tArr[i4] = null;
                    return true;
                }
                int mix = mix(t5.hashCode()) & i5;
                if (i4 <= i10) {
                    if (i4 < mix && mix <= i10) {
                        i11 = i10 + 1;
                    }
                } else {
                    if (i4 >= mix && mix > i10) {
                        break;
                    }
                    i11 = i10 + 1;
                }
            }
            tArr[i4] = t5;
            i4 = i10;
        }
    }

    public int size() {
        return this.size;
    }

    public OpenHashSet(int i4) {
        this(i4, 0.75f);
    }

    public OpenHashSet(int i4, float f5) {
        this.loadFactor = f5;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i4);
        this.mask = roundToPowerOfTwo - 1;
        this.maxSize = (int) (f5 * roundToPowerOfTwo);
        this.keys = (T[]) new Object[roundToPowerOfTwo];
    }
}
