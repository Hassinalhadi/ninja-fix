package tf;

import com.google.android.gms.measurement.internal.C1467s;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import t6.A2;
import t6.AbstractC3050r2;

/* renamed from: tf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3122d extends kotlin.collections.g implements sf.c {
    public int alpha;
    public AbstractC3119a purple;
    public C1467s red;
    public Object[] silver;
    public Object[] teal;
    public int white;

    public C3122d(AbstractC3119a abstractC3119a, Object[] objArr, Object[] vectorTail, int i4) {
        Intrinsics.echo(vectorTail, "vectorTail");
        this.alpha = i4;
        this.purple = abstractC3119a;
        this.red = new C1467s(16);
        this.silver = objArr;
        this.teal = vectorTail;
        this.white = abstractC3119a.alpha();
    }

    public static void hotel(Object[] objArr, int i4, Iterator it) {
        while (i4 < 32 && it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        A2.bravo(i4, alpha());
        if (i4 == alpha()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int crimson = crimson();
        if (i4 >= crimson) {
            mike(i4 - crimson, obj, this.silver);
            return;
        }
        L.e eVar = new L.e(null);
        Object[] objArr = this.silver;
        Intrinsics.checkNotNull(objArr);
        mike(0, eVar.alpha, kilo(objArr, this.alpha, i4, obj, eVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection elements) {
        Collection collection;
        C3122d c3122d;
        Object[] sierra;
        Intrinsics.echo(elements, "elements");
        A2.bravo(i4, this.white);
        if (i4 == this.white) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i5 = (i4 >> 5) << 5;
        int size = ((elements.size() + (this.white - i5)) - 1) / 32;
        if (size == 0) {
            int i10 = i4 & 31;
            int size2 = ((elements.size() + i4) - 1) & 31;
            Object[] objArr = this.teal;
            Object[] quebec = quebec(objArr);
            ArraysKt.yankee(size2 + 1, i10, green(), objArr, quebec);
            hotel(quebec, i10, elements.iterator());
            fuchsia(quebec);
            this.white = elements.size() + this.white;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int green = green();
        int size3 = elements.size() + this.white;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i4 >= crimson()) {
            sierra = sierra();
            collection = elements;
            gold(collection, i4, this.teal, green, objArr2, size, sierra);
            c3122d = this;
            objArr2 = objArr2;
        } else {
            collection = elements;
            c3122d = this;
            if (size3 > green) {
                int i11 = size3 - green;
                Object[] romeo = romeo(i11, c3122d.teal);
                c3122d.lima(collection, i4, i11, objArr2, size, romeo);
                objArr2 = objArr2;
                sierra = romeo;
            } else {
                Object[] objArr3 = c3122d.teal;
                sierra = sierra();
                int i12 = green - size3;
                ArraysKt.yankee(0, i12, green, objArr3, sierra);
                int i13 = 32 - i12;
                Object[] romeo2 = romeo(i13, c3122d.teal);
                int i14 = size - 1;
                objArr2[i14] = romeo2;
                c3122d.lima(collection, i4, i13, objArr2, i14, romeo2);
                collection = collection;
            }
        }
        emerald(yankee(c3122d.silver, i5, objArr2));
        fuchsia(sierra);
        c3122d.white = collection.size() + c3122d.white;
        return true;
    }

    @Override // kotlin.collections.g
    public final int alpha() {
        return this.white;
    }

    public final Object[] amber(int i4, Object[] objArr, Object[] objArr2) {
        int echo = AbstractC3050r2.echo(alpha() - 1, i4);
        Object[] quebec = quebec(objArr);
        if (i4 == 5) {
            quebec[echo] = objArr2;
            return quebec;
        }
        quebec[echo] = amber(i4 - 5, (Object[]) quebec[echo], objArr2);
        return quebec;
    }

    public final int azure(L.b bVar, Object[] objArr, int i4, int i5, L.e eVar, ArrayList arrayList, ArrayList arrayList2) {
        Object[] sierra;
        if (november(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.alpha;
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj2 = objArr[i10];
            if (!((Boolean) bVar.invoke(obj2)).booleanValue()) {
                if (i5 == 32) {
                    if (!arrayList.isEmpty()) {
                        sierra = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        sierra = sierra();
                    }
                    objArr3 = sierra;
                    i5 = 0;
                }
                objArr3[i5] = obj2;
                i5++;
            }
        }
        eVar.alpha = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i5;
    }

    public final int black(L.b bVar, Object[] objArr, int i4, L.e eVar) {
        Object[] objArr2 = objArr;
        int i5 = i4;
        boolean z2 = false;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArr2 = quebec(objArr);
                    z2 = true;
                    i5 = i10;
                }
            } else if (z2) {
                objArr2[i5] = obj;
                i5++;
            }
        }
        eVar.alpha = objArr2;
        return i5;
    }

    public final int blue(L.b bVar, int i4, L.e eVar) {
        int black = black(bVar, this.teal, i4, eVar);
        if (black == i4) {
            return i4;
        }
        Object obj = eVar.alpha;
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, black, i4, (Object) null);
        fuchsia(objArr);
        this.white -= i4 - black;
        return black;
    }

    @Override // kotlin.collections.g
    public final Object bravo(int i4) {
        A2.alpha(i4, alpha());
        ((AbstractList) this).modCount++;
        int crimson = crimson();
        if (i4 >= crimson) {
            return coral(this.silver, crimson, this.alpha, i4 - crimson);
        }
        L.e eVar = new L.e(this.teal[0]);
        Object[] objArr = this.silver;
        Intrinsics.checkNotNull(objArr);
        coral(bronze(objArr, this.alpha, i4, eVar), crimson, this.alpha, 0);
        return eVar.alpha;
    }

    public final Object[] bronze(Object[] objArr, int i4, int i5, L.e eVar) {
        int echo = AbstractC3050r2.echo(i5, i4);
        int i10 = 31;
        if (i4 == 0) {
            Object obj = objArr[echo];
            Object[] quebec = quebec(objArr);
            ArraysKt.yankee(echo, echo + 1, 32, objArr, quebec);
            quebec[31] = eVar.alpha;
            eVar.alpha = obj;
            return quebec;
        }
        if (objArr[31] == null) {
            i10 = AbstractC3050r2.echo(crimson() - 1, i4);
        }
        Object[] quebec2 = quebec(objArr);
        int i11 = i4 - 5;
        int i12 = echo + 1;
        if (i12 <= i10) {
            while (true) {
                Object obj2 = quebec2[i10];
                Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                quebec2[i10] = bronze((Object[]) obj2, i11, 0, eVar);
                if (i10 == i12) {
                    break;
                }
                i10--;
            }
        }
        Object obj3 = quebec2[echo];
        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        quebec2[echo] = bronze((Object[]) obj3, i11, i5, eVar);
        return quebec2;
    }

    public final Object coral(Object[] objArr, int i4, int i5, int i10) {
        int i11 = this.white - i4;
        if (i11 == 1) {
            Object obj = this.teal[0];
            whiskey(i4, objArr, i5);
            return obj;
        }
        Object[] objArr2 = this.teal;
        Object obj2 = objArr2[i10];
        Object[] quebec = quebec(objArr2);
        ArraysKt.yankee(i10, i10 + 1, i11, objArr2, quebec);
        quebec[i11 - 1] = null;
        emerald(objArr);
        fuchsia(quebec);
        this.white = (i4 + i11) - 1;
        this.alpha = i5;
        return obj2;
    }

    public final int crimson() {
        int i4 = this.white;
        if (i4 <= 32) {
            return 0;
        }
        return (i4 - 1) & (-32);
    }

    public final Object[] cyan(Object[] objArr, int i4, int i5, Object obj, L.e eVar) {
        int echo = AbstractC3050r2.echo(i5, i4);
        Object[] quebec = quebec(objArr);
        if (i4 == 0) {
            if (quebec != objArr) {
                ((AbstractList) this).modCount++;
            }
            eVar.alpha = quebec[echo];
            quebec[echo] = obj;
            return quebec;
        }
        Object obj2 = quebec[echo];
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        quebec[echo] = cyan((Object[]) obj2, i4 - 5, i5, obj, eVar);
        return quebec;
    }

    public final AbstractC3119a delta() {
        AbstractC3119a abstractC3119a = this.purple;
        if (abstractC3119a == null) {
            Object[] objArr = this.silver;
            Object[] objArr2 = this.teal;
            this.red = new C1467s(16);
            if (objArr == null) {
                if (objArr2.length == 0) {
                    abstractC3119a = C3125g.purple;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, this.white);
                    Intrinsics.delta(copyOf, "copyOf(...)");
                    abstractC3119a = new C3125g(copyOf);
                }
            } else {
                abstractC3119a = new C3121c(objArr, objArr2, this.white, this.alpha);
            }
            this.purple = abstractC3119a;
        }
        return abstractC3119a;
    }

    public final void emerald(Object[] objArr) {
        if (objArr != this.silver) {
            this.purple = null;
            this.silver = objArr;
        }
    }

    public final void fuchsia(Object[] objArr) {
        if (objArr != this.teal) {
            this.purple = null;
            this.teal = objArr;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        Object[] objArr;
        A2.alpha(i4, alpha());
        if (crimson() <= i4) {
            objArr = this.teal;
        } else {
            objArr = this.silver;
            Intrinsics.checkNotNull(objArr);
            for (int i5 = this.alpha; i5 > 0; i5 -= 5) {
                Object obj = objArr[AbstractC3050r2.echo(i4, i5)];
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i4 & 31];
    }

    public final void gold(Collection collection, int i4, Object[] objArr, int i5, Object[][] objArr2, int i10, Object[] objArr3) {
        Object[] sierra;
        if (i10 >= 1) {
            Object[] quebec = quebec(objArr);
            objArr2[0] = quebec;
            int i11 = i4 & 31;
            int size = ((collection.size() + i4) - 1) & 31;
            int i12 = (i5 - i11) + size;
            if (i12 < 32) {
                ArraysKt.yankee(size + 1, i11, i5, quebec, objArr3);
            } else {
                int i13 = i12 - 31;
                if (i10 == 1) {
                    sierra = quebec;
                } else {
                    sierra = sierra();
                    i10--;
                    objArr2[i10] = sierra;
                }
                int i14 = i5 - i13;
                ArraysKt.yankee(0, i14, i5, quebec, objArr3);
                ArraysKt.yankee(size + 1, i11, i14, quebec, sierra);
                objArr3 = sierra;
            }
            Iterator it = collection.iterator();
            hotel(quebec, i11, it);
            for (int i15 = 1; i15 < i10; i15++) {
                Object[] sierra2 = sierra();
                hotel(sierra2, 0, it);
                objArr2[i15] = sierra2;
            }
            hotel(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int green() {
        int i4 = this.white;
        if (i4 <= 32) {
            return i4;
        }
        return i4 - ((i4 - 1) & (-32));
    }

    public final int india() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] kilo(Object[] objArr, int i4, int i5, Object obj, L.e eVar) {
        Object obj2;
        int echo = AbstractC3050r2.echo(i5, i4);
        if (i4 == 0) {
            eVar.alpha = objArr[31];
            Object[] quebec = quebec(objArr);
            ArraysKt.yankee(echo + 1, echo, 31, objArr, quebec);
            quebec[echo] = obj;
            return quebec;
        }
        Object[] quebec2 = quebec(objArr);
        int i10 = i4 - 5;
        Object obj3 = quebec2[echo];
        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        quebec2[echo] = kilo((Object[]) obj3, i10, i5, obj, eVar);
        while (true) {
            echo++;
            if (echo >= 32 || (obj2 = quebec2[echo]) == null) {
                break;
            }
            quebec2[echo] = kilo((Object[]) obj2, i10, 0, eVar.alpha, eVar);
        }
        return quebec2;
    }

    public final void lima(Collection collection, int i4, int i5, Object[][] objArr, int i10, Object[] objArr2) {
        if (this.silver != null) {
            int i11 = i4 >> 5;
            L.a oscar = oscar(crimson() >> 5);
            int i12 = i10;
            Object[] objArr3 = objArr2;
            while (oscar.purple - 1 != i11) {
                Object[] objArr4 = (Object[]) oscar.previous();
                ArraysKt.yankee(0, 32 - i5, 32, objArr4, objArr3);
                objArr3 = romeo(i5, objArr4);
                i12--;
                objArr[i12] = objArr3;
            }
            Object[] objArr5 = (Object[]) oscar.previous();
            int crimson = i10 - (((crimson() >> 5) - 1) - i11);
            if (crimson < i10) {
                objArr2 = objArr[crimson];
                Intrinsics.checkNotNull(objArr2);
            }
            gold(collection, i4, objArr5, 32, objArr, crimson, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        A2.bravo(i4, this.white);
        return new C3124f(this, i4);
    }

    public final void mike(int i4, Object obj, Object[] objArr) {
        int green = green();
        Object[] quebec = quebec(this.teal);
        if (green < 32) {
            ArraysKt.yankee(i4 + 1, i4, green, this.teal, quebec);
            quebec[i4] = obj;
            emerald(objArr);
            fuchsia(quebec);
            this.white++;
            return;
        }
        Object[] objArr2 = this.teal;
        Object obj2 = objArr2[31];
        ArraysKt.yankee(i4 + 1, i4, 31, objArr2, quebec);
        quebec[i4] = obj;
        zulu(objArr, quebec, tango(obj2));
    }

    public final boolean november(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.red) {
            return true;
        }
        return false;
    }

    public final L.a oscar(int i4) {
        if (this.silver != null) {
            int crimson = crimson() >> 5;
            A2.bravo(i4, crimson);
            int i5 = this.alpha;
            if (i5 == 0) {
                Object[] objArr = this.silver;
                Intrinsics.checkNotNull(objArr);
                return new C3120b(i4, objArr);
            }
            Object[] objArr2 = this.silver;
            Intrinsics.checkNotNull(objArr2);
            return new C3126h(objArr2, i4, crimson, i5 / 5);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Object[] quebec(Object[] objArr) {
        if (objArr == null) {
            return sierra();
        }
        if (november(objArr)) {
            return objArr;
        }
        Object[] sierra = sierra();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ArraysKt.beige(0, length, 6, objArr, sierra);
        return sierra;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r0 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (blue(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection elements) {
        Object[] xray;
        int i4;
        Intrinsics.echo(elements, "elements");
        boolean z2 = false;
        if (elements.isEmpty()) {
            return false;
        }
        L.b bVar = new L.b(3, elements);
        int green = green();
        Object[] objArr = null;
        L.e eVar = new L.e(null);
        if (this.silver != null) {
            L.a oscar = oscar(0);
            int i5 = 32;
            while (i5 == 32 && oscar.hasNext()) {
                i5 = black(bVar, (Object[]) oscar.next(), 32, eVar);
            }
            if (i5 == 32) {
                int blue = blue(bVar, green, eVar);
                if (blue == 0) {
                    whiskey(this.white, this.silver, this.alpha);
                }
            } else {
                int i10 = (oscar.purple - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = i5;
                while (oscar.hasNext()) {
                    i11 = azure(bVar, (Object[]) oscar.next(), 32, i11, eVar, arrayList2, arrayList);
                }
                C3122d c3122d = this;
                int azure = c3122d.azure(bVar, c3122d.teal, green, i11, eVar, arrayList2, arrayList);
                Object obj = eVar.alpha;
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, azure, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    xray = c3122d.silver;
                    Intrinsics.checkNotNull(xray);
                } else {
                    xray = xray(c3122d.silver, i10, c3122d.alpha, arrayList.iterator());
                }
                int size = i10 + (arrayList.size() << 5);
                if ((size & 31) == 0) {
                    if (size == 0) {
                        c3122d.alpha = 0;
                    } else {
                        int i12 = size - 1;
                        while (true) {
                            i4 = c3122d.alpha;
                            if ((i12 >> i4) != 0) {
                                break;
                            }
                            c3122d.alpha = i4 - 5;
                            Object[] objArr3 = xray[0];
                            Intrinsics.charlie(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                            xray = objArr3;
                        }
                        objArr = uniform(i12, xray, i4);
                    }
                    emerald(objArr);
                    fuchsia(objArr2);
                    c3122d.white = size + azure;
                    z2 = true;
                    if (z2) {
                        ((AbstractList) c3122d).modCount++;
                    }
                    return z2;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final Object[] romeo(int i4, Object[] objArr) {
        if (november(objArr)) {
            ArraysKt.yankee(i4, 0, 32 - i4, objArr, objArr);
            return objArr;
        }
        Object[] sierra = sierra();
        ArraysKt.yankee(i4, 0, 32 - i4, objArr, sierra);
        return sierra;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        A2.alpha(i4, alpha());
        if (crimson() <= i4) {
            Object[] quebec = quebec(this.teal);
            if (quebec != this.teal) {
                ((AbstractList) this).modCount++;
            }
            int i5 = i4 & 31;
            Object obj2 = quebec[i5];
            quebec[i5] = obj;
            fuchsia(quebec);
            return obj2;
        }
        L.e eVar = new L.e(null);
        Object[] objArr = this.silver;
        Intrinsics.checkNotNull(objArr);
        emerald(cyan(objArr, this.alpha, i4, obj, eVar));
        return eVar.alpha;
    }

    public final Object[] sierra() {
        Object[] objArr = new Object[33];
        objArr[32] = this.red;
        return objArr;
    }

    public final Object[] tango(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.red;
        return objArr;
    }

    public final Object[] uniform(int i4, Object[] objArr, int i5) {
        if (i5 >= 0) {
            if (i5 == 0) {
                return objArr;
            }
            int echo = AbstractC3050r2.echo(i4, i5);
            Object obj = objArr[echo];
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object uniform = uniform(i4, (Object[]) obj, i5 - 5);
            if (echo < 31) {
                int i10 = echo + 1;
                if (objArr[i10] != null) {
                    if (november(objArr)) {
                        Arrays.fill(objArr, i10, 32, (Object) null);
                    }
                    Object[] sierra = sierra();
                    ArraysKt.yankee(0, 0, i10, objArr, sierra);
                    objArr = sierra;
                }
            }
            if (uniform != objArr[echo]) {
                Object[] quebec = quebec(objArr);
                quebec[echo] = uniform;
                return quebec;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final Object[] victor(Object[] objArr, int i4, int i5, L.e eVar) {
        Object[] victor;
        int echo = AbstractC3050r2.echo(i5 - 1, i4);
        if (i4 == 5) {
            eVar.alpha = objArr[echo];
            victor = null;
        } else {
            Object obj = objArr[echo];
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            victor = victor((Object[]) obj, i4 - 5, i5, eVar);
        }
        if (victor == null && echo == 0) {
            return null;
        }
        Object[] quebec = quebec(objArr);
        quebec[echo] = victor;
        return quebec;
    }

    public final void whiskey(int i4, Object[] objArr, int i5) {
        if (i5 == 0) {
            emerald(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            fuchsia(objArr);
            this.white = i4;
            this.alpha = i5;
            return;
        }
        L.e eVar = new L.e(null);
        Intrinsics.checkNotNull(objArr);
        Object[] victor = victor(objArr, i5, i4, eVar);
        Intrinsics.checkNotNull(victor);
        Object obj = eVar.alpha;
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        fuchsia((Object[]) obj);
        this.white = i4;
        if (victor[1] == null) {
            emerald((Object[]) victor[0]);
            this.alpha = i5 - 5;
        } else {
            emerald(victor);
            this.alpha = i5;
        }
    }

    public final Object[] xray(Object[] objArr, int i4, int i5, Iterator it) {
        if (it.hasNext()) {
            if (i5 >= 0) {
                if (i5 == 0) {
                    return (Object[]) it.next();
                }
                Object[] quebec = quebec(objArr);
                int echo = AbstractC3050r2.echo(i4, i5);
                int i10 = i5 - 5;
                quebec[echo] = xray((Object[]) quebec[echo], i4, i10, it);
                while (true) {
                    echo++;
                    if (echo >= 32 || !it.hasNext()) {
                        break;
                    }
                    quebec[echo] = xray((Object[]) quebec[echo], 0, i10, it);
                }
                return quebec;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final Object[] yankee(Object[] objArr, int i4, Object[][] objArr2) {
        Object[] quebec;
        Lf.h golf = x.golf(objArr2);
        int i5 = i4 >> 5;
        int i10 = this.alpha;
        if (i5 < (1 << i10)) {
            quebec = xray(objArr, i4, i10, golf);
        } else {
            quebec = quebec(objArr);
        }
        while (golf.hasNext()) {
            this.alpha += 5;
            quebec = tango(quebec);
            int i11 = this.alpha;
            xray(quebec, 1 << i11, i11, golf);
        }
        return quebec;
    }

    public final void zulu(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i4 = this.white >> 5;
        int i5 = this.alpha;
        if (i4 > (1 << i5)) {
            emerald(amber(this.alpha + 5, tango(objArr), objArr2));
            fuchsia(objArr3);
            this.alpha += 5;
            this.white++;
            return;
        }
        if (objArr == null) {
            emerald(objArr2);
            fuchsia(objArr3);
            this.white++;
        } else {
            emerald(amber(i5, objArr, objArr2));
            fuchsia(objArr3);
            this.white++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int green = green();
        if (green < 32) {
            Object[] quebec = quebec(this.teal);
            quebec[green] = obj;
            fuchsia(quebec);
            this.white = alpha() + 1;
        } else {
            zulu(this.silver, this.teal, tango(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int green = green();
        Iterator it = elements.iterator();
        if (32 - green >= elements.size()) {
            Object[] quebec = quebec(this.teal);
            hotel(quebec, green, it);
            fuchsia(quebec);
            this.white = elements.size() + this.white;
            return true;
        }
        int size = ((elements.size() + green) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] quebec2 = quebec(this.teal);
        hotel(quebec2, green, it);
        objArr[0] = quebec2;
        for (int i4 = 1; i4 < size; i4++) {
            Object[] sierra = sierra();
            hotel(sierra, 0, it);
            objArr[i4] = sierra;
        }
        emerald(yankee(this.silver, crimson(), objArr));
        Object[] sierra2 = sierra();
        hotel(sierra2, 0, it);
        fuchsia(sierra2);
        this.white = elements.size() + this.white;
        return true;
    }
}
