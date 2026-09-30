package q6;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class u extends r {

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f13160b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f13161c;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f13162a;
    public final transient Object[] silver;
    public final transient int teal;
    public final transient Object[] white;
    public final transient int yellow;

    static {
        Object[] objArr = new Object[0];
        f13160b = objArr;
        f13161c = new u(0, 0, 0, objArr, objArr);
    }

    public u(int i4, int i5, int i10, Object[] objArr, Object[] objArr2) {
        this.silver = objArr;
        this.teal = i4;
        this.white = objArr2;
        this.yellow = i5;
        this.f13162a = i10;
    }

    @Override // q6.n
    public final int alpha(Object[] objArr) {
        Object[] objArr2 = this.silver;
        int i4 = this.f13162a;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // q6.n
    public final int bravo() {
        return this.f13162a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.white;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i4 = rotateLeft & this.yellow;
                    Object obj2 = objArr[i4];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i4 + 1;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // q6.n
    public final int delta() {
        return 0;
    }

    @Override // q6.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.teal;
    }

    @Override // q6.n
    public final Object[] hotel() {
        return this.silver;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        q qVar = this.purple;
        if (qVar == null) {
            o oVar = q.purple;
            int i4 = this.f13162a;
            if (i4 == 0) {
                qVar = t.teal;
            } else {
                qVar = new t(i4, this.silver);
            }
            this.purple = qVar;
        }
        return qVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13162a;
    }
}
