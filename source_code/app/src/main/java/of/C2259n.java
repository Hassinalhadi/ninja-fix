package of;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

/* renamed from: of.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2259n extends AbstractSet {
    public static final /* synthetic */ int red = 0;
    public Object alpha;
    public int purple;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (kotlin.jvm.internal.x.delta(r2).add(r5) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean add(Object obj) {
        Object[] objArr;
        int i4 = this.purple;
        if (i4 == 0) {
            this.alpha = obj;
        } else {
            if (i4 == 1) {
                if (!Intrinsics.areEqual(this.alpha, obj)) {
                    this.alpha = new Object[]{this.alpha, obj};
                }
                return false;
            }
            if (i4 < 5) {
                Object obj2 = this.alpha;
                Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                Object[] objArr2 = (Object[]) obj2;
                if (!ArraysKt.whiskey(objArr2, obj)) {
                    int i5 = this.purple;
                    if (i5 == 4) {
                        ?? india = ab.india(Arrays.copyOf(objArr2, objArr2.length));
                        india.add(obj);
                        objArr = india;
                    } else {
                        Object[] copyOf = Arrays.copyOf(objArr2, i5 + 1);
                        Intrinsics.delta(copyOf, "copyOf(this, newSize)");
                        copyOf[copyOf.length - 1] = obj;
                        objArr = copyOf;
                    }
                    this.alpha = objArr;
                }
                return false;
            }
            Object obj3 = this.alpha;
            Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        }
        this.purple++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.alpha = null;
        this.purple = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i4 = this.purple;
        if (i4 == 0) {
            return false;
        }
        if (i4 == 1) {
            return Intrinsics.areEqual(this.alpha, obj);
        }
        if (i4 < 5) {
            Object obj2 = this.alpha;
            Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt.whiskey((Object[]) obj2, obj);
        }
        Object obj3 = this.alpha;
        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i4 = this.purple;
        if (i4 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i4 == 1) {
            return new C2258m(0, this.alpha);
        }
        if (i4 < 5) {
            Object obj = this.alpha;
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new M.h((Object[]) obj);
        }
        Object obj2 = this.alpha;
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return x.delta(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.purple;
    }
}
