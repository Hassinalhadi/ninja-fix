package of;

import androidx.appcompat.widget.P0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: of.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2257l extends AbstractList implements RandomAccess {
    public int alpha;
    public Object purple;

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 7) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 != 5 && i4 != 6 && i4 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            } else {
                objArr[1] = "toArray";
            }
        } else {
            objArr[1] = "iterator";
        }
        switch (i4) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i4 = this.alpha;
        if (i4 == 0) {
            this.purple = obj;
        } else if (i4 == 1) {
            this.purple = new Object[]{this.purple, obj};
        } else {
            Object[] objArr = (Object[]) this.purple;
            int length = objArr.length;
            if (i4 >= length) {
                int ivory = P0.ivory(length, 3, 2, 1);
                int i5 = i4 + 1;
                if (ivory < i5) {
                    ivory = i5;
                }
                Object[] objArr2 = new Object[ivory];
                this.purple = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.alpha] = obj;
        }
        this.alpha++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.purple = null;
        this.alpha = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5;
        if (i4 >= 0 && i4 < (i5 = this.alpha)) {
            if (i5 == 1) {
                return this.purple;
            }
            return ((Object[]) this.purple)[i4];
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index: ", ", Size: ");
        sierra.append(this.alpha);
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i4 = this.alpha;
        if (i4 == 0) {
            return C2255j.alpha;
        }
        if (i4 == 1) {
            return new C2256k(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        alpha(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        int i5;
        Object obj;
        if (i4 >= 0 && i4 < (i5 = this.alpha)) {
            if (i5 == 1) {
                obj = this.purple;
                this.purple = null;
            } else {
                Object[] objArr = (Object[]) this.purple;
                Object obj2 = objArr[i4];
                if (i5 == 2) {
                    this.purple = objArr[1 - i4];
                } else {
                    int i10 = (i5 - i4) - 1;
                    if (i10 > 0) {
                        System.arraycopy(objArr, i4 + 1, objArr, i4, i10);
                    }
                    objArr[this.alpha - 1] = null;
                }
                obj = obj2;
            }
            this.alpha--;
            ((AbstractList) this).modCount++;
            return obj;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index: ", ", Size: ");
        sierra.append(this.alpha);
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int i5;
        if (i4 >= 0 && i4 < (i5 = this.alpha)) {
            if (i5 == 1) {
                Object obj2 = this.purple;
                this.purple = obj;
                return obj2;
            }
            Object[] objArr = (Object[]) this.purple;
            Object obj3 = objArr[i4];
            objArr[i4] = obj;
            return obj3;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index: ", ", Size: ");
        sierra.append(this.alpha);
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.alpha;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i4 = this.alpha;
        if (i4 >= 2) {
            Arrays.sort((Object[]) this.purple, 0, i4, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = this.alpha;
            if (i4 == 1) {
                if (length != 0) {
                    objArr[0] = this.purple;
                } else {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                    objArr2[0] = this.purple;
                    return objArr2;
                }
            } else {
                if (length < i4) {
                    Object[] copyOf = Arrays.copyOf((Object[]) this.purple, i4, objArr.getClass());
                    if (copyOf != null) {
                        return copyOf;
                    }
                    alpha(6);
                    throw null;
                }
                if (i4 != 0) {
                    System.arraycopy(this.purple, 0, objArr, 0, i4);
                }
            }
            int i5 = this.alpha;
            if (length > i5) {
                objArr[i5] = null;
            }
            return objArr;
        }
        alpha(4);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        if (i4 >= 0 && i4 <= (i5 = this.alpha)) {
            if (i5 == 0) {
                this.purple = obj;
            } else if (i5 == 1 && i4 == 0) {
                this.purple = new Object[]{obj, this.purple};
            } else {
                Object[] objArr = new Object[i5 + 1];
                if (i5 == 1) {
                    objArr[0] = this.purple;
                } else {
                    Object[] objArr2 = (Object[]) this.purple;
                    System.arraycopy(objArr2, 0, objArr, 0, i4);
                    System.arraycopy(objArr2, i4, objArr, i4 + 1, this.alpha - i4);
                }
                objArr[i4] = obj;
                this.purple = objArr;
            }
            this.alpha++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index: ", ", Size: ");
        sierra.append(this.alpha);
        throw new IndexOutOfBoundsException(sierra.toString());
    }
}
