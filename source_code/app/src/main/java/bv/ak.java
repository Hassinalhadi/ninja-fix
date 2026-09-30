package bv;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ak implements Yd.f, Set, Yd.a {
    public final ai alpha;
    public final ai purple;

    public ak(ai parent) {
        Intrinsics.echo(parent, "parent");
        this.alpha = parent;
        this.purple = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.purple.alpha(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        ai aiVar = this.purple;
        aiVar.getClass();
        int i4 = aiVar.golf;
        for (Object obj : elements) {
            int delta = aiVar.delta(obj);
            aiVar.bravo[delta] = obj;
            long[] jArr = aiVar.charlie;
            int i5 = aiVar.delta;
            jArr[delta] = (i5 & 2147483647L) | 4611686016279904256L;
            if (i5 != Integer.MAX_VALUE) {
                jArr[i5] = ((2147483647L & delta) << 31) | (jArr[i5] & (-4611686016279904257L));
            }
            aiVar.delta = delta;
            if (aiVar.echo == Integer.MAX_VALUE) {
                aiVar.echo = delta;
            }
        }
        if (i4 != aiVar.golf) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.purple.bravo();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.alpha.charlie(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.alpha.charlie(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ak.class == obj.getClass()) {
            return Intrinsics.areEqual(this.alpha, ((ak) obj).alpha);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.alpha.golf == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new N.d(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.purple.golf(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection elements) {
        int i4;
        int i5;
        Intrinsics.echo(elements, "elements");
        ai aiVar = this.purple;
        aiVar.getClass();
        int i10 = aiVar.golf;
        Iterator it = elements.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                i4 = next.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = i4 * (-862048943);
            int i14 = i13 ^ (i13 << 16);
            int i15 = i14 & 127;
            int i16 = aiVar.foxtrot;
            int i17 = (i14 >>> 7) & i16;
            while (true) {
                long[] jArr = aiVar.alpha;
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                int i20 = i11;
                int i21 = i12;
                long j5 = (((-i19) >> 63) & (jArr[i18 + i11] << (64 - i19))) | (jArr[i18] >>> i19);
                long j6 = (i15 * 72340172838076673L) ^ j5;
                long j7 = -9187201950435737472L;
                long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i5 = ((Long.numberOfTrailingZeros(j10) >> 3) + i17) & i16;
                    long j11 = j7;
                    if (Intrinsics.areEqual(aiVar.bravo[i5], next)) {
                        break;
                    }
                    j10 &= j10 - 1;
                    j7 = j11;
                }
                i12 = i21 + 8;
                i17 = (i17 + i12) & i16;
                i11 = i20;
            }
            if (i5 >= 0) {
                aiVar.hotel(i5);
            }
        }
        if (i10 != aiVar.golf) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        return this.purple.india(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.alpha.golf;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    public final String toString() {
        return this.alpha.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        return kotlin.jvm.internal.j.delta(this, array);
    }
}
