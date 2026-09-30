package L;

import androidx.compose.runtime.J;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import s6.AbstractC2653f6;
import s6.B6;

/* loaded from: classes3.dex */
public final class g extends kotlin.collections.g implements Collection, Yd.b {

    /* renamed from: a, reason: collision with root package name */
    public int f1699a;
    public c alpha;
    public Object[] purple;
    public Object[] red;
    public int silver;
    public O.b teal = new Object();
    public Object[] white;
    public Object[] yellow;

    /* JADX WARN: Type inference failed for: r4v1, types: [O.b, java.lang.Object] */
    public g(c cVar, Object[] objArr, Object[] objArr2, int i4) {
        this.alpha = cVar;
        this.purple = objArr;
        this.red = objArr2;
        this.silver = i4;
        this.white = objArr;
        this.yellow = objArr2;
        this.f1699a = cVar.alpha();
    }

    public static void hotel(Object[] objArr, int i4, Iterator it) {
        while (i4 < 32 && it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        B6.charlie(i4, alpha());
        if (i4 == alpha()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int cyan = cyan();
        if (i4 >= cyan) {
            mike(i4 - cyan, obj, this.white);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.white;
        Intrinsics.checkNotNull(objArr);
        mike(0, eVar.alpha, lima(objArr, this.silver, i4, obj, eVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        Collection collection2;
        g gVar;
        Object[] sierra;
        B6.charlie(i4, this.f1699a);
        if (i4 == this.f1699a) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i5 = (i4 >> 5) << 5;
        int size = ((collection.size() + (this.f1699a - i5)) - 1) / 32;
        if (size == 0) {
            int i10 = i4 & 31;
            int size2 = ((collection.size() + i4) - 1) & 31;
            Object[] objArr = this.yellow;
            Object[] quebec = quebec(objArr);
            ArraysKt.yankee(size2 + 1, i10, gold(), objArr, quebec);
            hotel(quebec, i10, collection.iterator());
            this.yellow = quebec;
            this.f1699a = collection.size() + this.f1699a;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int gold = gold();
        int size3 = collection.size() + this.f1699a;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i4 >= cyan()) {
            sierra = sierra();
            collection2 = collection;
            fuchsia(collection2, i4, this.yellow, gold, objArr2, size, sierra);
            gVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            gVar = this;
            if (size3 > gold) {
                int i11 = size3 - gold;
                Object[] romeo = romeo(i11, gVar.yellow);
                gVar.kilo(collection2, i4, i11, objArr2, size, romeo);
                objArr2 = objArr2;
                sierra = romeo;
            } else {
                Object[] objArr3 = gVar.yellow;
                sierra = sierra();
                int i12 = gold - size3;
                ArraysKt.yankee(0, i12, gold, objArr3, sierra);
                int i13 = 32 - i12;
                Object[] romeo2 = romeo(i13, gVar.yellow);
                int i14 = size - 1;
                objArr2[i14] = romeo2;
                gVar.kilo(collection2, i4, i13, objArr2, i14, romeo2);
                collection2 = collection2;
            }
        }
        gVar.white = yankee(gVar.white, i5, objArr2);
        gVar.yellow = sierra;
        gVar.f1699a = collection2.size() + gVar.f1699a;
        return true;
    }

    @Override // kotlin.collections.g
    public final int alpha() {
        return this.f1699a;
    }

    public final Object[] amber(int i4, Object[] objArr, Object[] objArr2) {
        int bravo = AbstractC2653f6.bravo(alpha() - 1, i4);
        Object[] quebec = quebec(objArr);
        if (i4 == 5) {
            quebec[bravo] = objArr2;
            return quebec;
        }
        quebec[bravo] = amber(i4 - 5, (Object[]) quebec[bravo], objArr2);
        return quebec;
    }

    public final int azure(Function1 function1, Object[] objArr, int i4, int i5, e eVar, ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
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

    public final int black(Function1 function1, Object[] objArr, int i4, e eVar) {
        Object[] objArr2 = objArr;
        int i5 = i4;
        boolean z2 = false;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
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

    public final int blue(Function1 function1, int i4, e eVar) {
        int black = black(function1, this.yellow, i4, eVar);
        if (black == i4) {
            return i4;
        }
        Object obj = eVar.alpha;
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, black, i4, (Object) null);
        this.yellow = objArr;
        this.f1699a -= i4 - black;
        return black;
    }

    @Override // kotlin.collections.g
    public final Object bravo(int i4) {
        B6.bravo(i4, alpha());
        ((AbstractList) this).modCount++;
        int cyan = cyan();
        if (i4 >= cyan) {
            return crimson(this.white, cyan, this.silver, i4 - cyan);
        }
        e eVar = new e(this.yellow[0]);
        Object[] objArr = this.white;
        Intrinsics.checkNotNull(objArr);
        crimson(coral(objArr, this.silver, i4, eVar), cyan, this.silver, 0);
        return eVar.alpha;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (blue(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bronze(Function1 function1) {
        Object[] xray;
        int i4;
        Function1 function12 = function1;
        int gold = gold();
        Object[] objArr = null;
        e eVar = new e(null);
        boolean z2 = false;
        if (this.white != null) {
            a oscar = oscar(0);
            int i5 = 32;
            while (i5 == 32 && oscar.hasNext()) {
                i5 = black(function12, (Object[]) oscar.next(), 32, eVar);
            }
            if (i5 == 32) {
                int blue = blue(function12, gold, eVar);
                if (blue == 0) {
                    whiskey(this.f1699a, this.white, this.silver);
                }
            } else {
                int i10 = (oscar.purple - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = i5;
                while (oscar.hasNext()) {
                    i11 = azure(function12, (Object[]) oscar.next(), 32, i11, eVar, arrayList2, arrayList);
                    function12 = function1;
                }
                int azure = azure(function1, this.yellow, gold, i11, eVar, arrayList2, arrayList);
                Object obj = eVar.alpha;
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, azure, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    xray = this.white;
                    Intrinsics.checkNotNull(xray);
                } else {
                    xray = xray(this.white, i10, this.silver, arrayList.iterator());
                }
                int size = i10 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    J.alpha("invalid size");
                }
                if (size == 0) {
                    this.silver = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i4 = this.silver;
                        if ((i12 >> i4) != 0) {
                            break;
                        }
                        this.silver = i4 - 5;
                        Object[] objArr3 = xray[0];
                        Intrinsics.charlie(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        xray = objArr3;
                    }
                    objArr = uniform(i12, xray, i4);
                }
                this.white = objArr;
                this.yellow = objArr2;
                this.f1699a = size + azure;
            }
            z2 = true;
        }
        if (z2) {
            ((AbstractList) this).modCount++;
        }
        return z2;
    }

    public final Object[] coral(Object[] objArr, int i4, int i5, e eVar) {
        int bravo = AbstractC2653f6.bravo(i5, i4);
        int i10 = 31;
        if (i4 == 0) {
            Object obj = objArr[bravo];
            Object[] quebec = quebec(objArr);
            ArraysKt.yankee(bravo, bravo + 1, 32, objArr, quebec);
            quebec[31] = eVar.alpha;
            eVar.alpha = obj;
            return quebec;
        }
        if (objArr[31] == null) {
            i10 = AbstractC2653f6.bravo(cyan() - 1, i4);
        }
        Object[] quebec2 = quebec(objArr);
        int i11 = i4 - 5;
        int i12 = bravo + 1;
        if (i12 <= i10) {
            while (true) {
                Object obj2 = quebec2[i10];
                Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                quebec2[i10] = coral((Object[]) obj2, i11, 0, eVar);
                if (i10 == i12) {
                    break;
                }
                i10--;
            }
        }
        Object obj3 = quebec2[bravo];
        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        quebec2[bravo] = coral((Object[]) obj3, i11, i5, eVar);
        return quebec2;
    }

    public final Object crimson(Object[] objArr, int i4, int i5, int i10) {
        int i11 = this.f1699a - i4;
        if (i11 == 1) {
            Object obj = this.yellow[0];
            whiskey(i4, objArr, i5);
            return obj;
        }
        Object[] objArr2 = this.yellow;
        Object obj2 = objArr2[i10];
        Object[] quebec = quebec(objArr2);
        ArraysKt.yankee(i10, i10 + 1, i11, objArr2, quebec);
        quebec[i11 - 1] = null;
        this.white = objArr;
        this.yellow = quebec;
        this.f1699a = (i4 + i11) - 1;
        this.silver = i5;
        return obj2;
    }

    public final int cyan() {
        int i4 = this.f1699a;
        if (i4 <= 32) {
            return 0;
        }
        return (i4 - 1) & (-32);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [O.b, java.lang.Object] */
    public final c delta() {
        c fVar;
        Object[] objArr = this.white;
        if (objArr == this.purple && this.yellow == this.red) {
            fVar = this.alpha;
        } else {
            this.teal = new Object();
            this.purple = objArr;
            Object[] objArr2 = this.yellow;
            this.red = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    fVar = j.purple;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, this.f1699a);
                    Intrinsics.delta(copyOf, "copyOf(...)");
                    fVar = new j(copyOf);
                }
            } else {
                Intrinsics.checkNotNull(objArr);
                fVar = new f(objArr, this.yellow, this.f1699a, this.silver);
            }
        }
        this.alpha = fVar;
        return fVar;
    }

    public final Object[] emerald(Object[] objArr, int i4, int i5, Object obj, e eVar) {
        int bravo = AbstractC2653f6.bravo(i5, i4);
        Object[] quebec = quebec(objArr);
        if (i4 == 0) {
            if (quebec != objArr) {
                ((AbstractList) this).modCount++;
            }
            eVar.alpha = quebec[bravo];
            quebec[bravo] = obj;
            return quebec;
        }
        Object obj2 = quebec[bravo];
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        quebec[bravo] = emerald((Object[]) obj2, i4 - 5, i5, obj, eVar);
        return quebec;
    }

    public final void fuchsia(Collection collection, int i4, Object[] objArr, int i5, Object[][] objArr2, int i10, Object[] objArr3) {
        Object[] sierra;
        if (i10 < 1) {
            J.alpha("requires at least one nullBuffer");
        }
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
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        Object[] objArr;
        B6.bravo(i4, alpha());
        if (cyan() <= i4) {
            objArr = this.yellow;
        } else {
            objArr = this.white;
            Intrinsics.checkNotNull(objArr);
            for (int i5 = this.silver; i5 > 0; i5 -= 5) {
                Object obj = objArr[AbstractC2653f6.bravo(i4, i5)];
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i4 & 31];
    }

    public final int gold() {
        int i4 = this.f1699a;
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

    public final void kilo(Collection collection, int i4, int i5, Object[][] objArr, int i10, Object[] objArr2) {
        if (this.white != null) {
            int i11 = i4 >> 5;
            a oscar = oscar(cyan() >> 5);
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
            int cyan = i10 - (((cyan() >> 5) - 1) - i11);
            if (cyan < i10) {
                objArr2 = objArr[cyan];
                Intrinsics.checkNotNull(objArr2);
            }
            fuchsia(collection, i4, objArr5, 32, objArr, cyan, objArr2);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    public final Object[] lima(Object[] objArr, int i4, int i5, Object obj, e eVar) {
        Object obj2;
        int bravo = AbstractC2653f6.bravo(i5, i4);
        if (i4 == 0) {
            eVar.alpha = objArr[31];
            Object[] quebec = quebec(objArr);
            ArraysKt.yankee(bravo + 1, bravo, 31, objArr, quebec);
            quebec[bravo] = obj;
            return quebec;
        }
        Object[] quebec2 = quebec(objArr);
        int i10 = i4 - 5;
        Object obj3 = quebec2[bravo];
        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        quebec2[bravo] = lima((Object[]) obj3, i10, i5, obj, eVar);
        while (true) {
            bravo++;
            if (bravo >= 32 || (obj2 = quebec2[bravo]) == null) {
                break;
            }
            quebec2[bravo] = lima((Object[]) obj2, i10, 0, eVar.alpha, eVar);
        }
        return quebec2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        B6.charlie(i4, this.f1699a);
        return new i(this, i4);
    }

    public final void mike(int i4, Object obj, Object[] objArr) {
        int gold = gold();
        Object[] quebec = quebec(this.yellow);
        if (gold < 32) {
            ArraysKt.yankee(i4 + 1, i4, gold, this.yellow, quebec);
            quebec[i4] = obj;
            this.white = objArr;
            this.yellow = quebec;
            this.f1699a++;
            return;
        }
        Object[] objArr2 = this.yellow;
        Object obj2 = objArr2[31];
        ArraysKt.yankee(i4 + 1, i4, 31, objArr2, quebec);
        quebec[i4] = obj;
        zulu(objArr, quebec, tango(obj2));
    }

    public final boolean november(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.teal) {
            return true;
        }
        return false;
    }

    public final a oscar(int i4) {
        Object[] objArr = this.white;
        if (objArr != null) {
            int cyan = cyan() >> 5;
            B6.charlie(i4, cyan);
            int i5 = this.silver;
            if (i5 == 0) {
                return new d(i4, objArr);
            }
            return new k(objArr, i4, cyan, i5 / 5);
        }
        throw new IllegalStateException("Invalid root");
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return bronze(new b(1, collection));
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
        B6.bravo(i4, alpha());
        if (cyan() <= i4) {
            Object[] quebec = quebec(this.yellow);
            if (quebec != this.yellow) {
                ((AbstractList) this).modCount++;
            }
            int i5 = i4 & 31;
            Object obj2 = quebec[i5];
            quebec[i5] = obj;
            this.yellow = quebec;
            return obj2;
        }
        e eVar = new e(null);
        Object[] objArr = this.white;
        Intrinsics.checkNotNull(objArr);
        this.white = emerald(objArr, this.silver, i4, obj, eVar);
        return eVar.alpha;
    }

    public final Object[] sierra() {
        Object[] objArr = new Object[33];
        objArr[32] = this.teal;
        return objArr;
    }

    public final Object[] tango(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.teal;
        return objArr;
    }

    public final Object[] uniform(int i4, Object[] objArr, int i5) {
        if (i5 < 0) {
            J.alpha("shift should be positive");
        }
        if (i5 == 0) {
            return objArr;
        }
        int bravo = AbstractC2653f6.bravo(i4, i5);
        Object obj = objArr[bravo];
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object uniform = uniform(i4, (Object[]) obj, i5 - 5);
        if (bravo < 31) {
            int i10 = bravo + 1;
            if (objArr[i10] != null) {
                if (november(objArr)) {
                    Arrays.fill(objArr, i10, 32, (Object) null);
                }
                Object[] sierra = sierra();
                ArraysKt.yankee(0, 0, i10, objArr, sierra);
                objArr = sierra;
            }
        }
        if (uniform != objArr[bravo]) {
            Object[] quebec = quebec(objArr);
            quebec[bravo] = uniform;
            return quebec;
        }
        return objArr;
    }

    public final Object[] victor(Object[] objArr, int i4, int i5, e eVar) {
        Object[] victor;
        int bravo = AbstractC2653f6.bravo(i5 - 1, i4);
        if (i4 == 5) {
            eVar.alpha = objArr[bravo];
            victor = null;
        } else {
            Object obj = objArr[bravo];
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            victor = victor((Object[]) obj, i4 - 5, i5, eVar);
        }
        if (victor == null && bravo == 0) {
            return null;
        }
        Object[] quebec = quebec(objArr);
        quebec[bravo] = victor;
        return quebec;
    }

    public final void whiskey(int i4, Object[] objArr, int i5) {
        if (i5 == 0) {
            this.white = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.yellow = objArr;
            this.f1699a = i4;
            this.silver = i5;
            return;
        }
        e eVar = new e(null);
        Intrinsics.checkNotNull(objArr);
        Object[] victor = victor(objArr, i5, i4, eVar);
        Intrinsics.checkNotNull(victor);
        Object obj = eVar.alpha;
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.yellow = (Object[]) obj;
        this.f1699a = i4;
        if (victor[1] == null) {
            this.white = (Object[]) victor[0];
            this.silver = i5 - 5;
        } else {
            this.white = victor;
            this.silver = i5;
        }
    }

    public final Object[] xray(Object[] objArr, int i4, int i5, Iterator it) {
        boolean z2;
        if (!it.hasNext()) {
            J.alpha("invalid buffersIterator");
        }
        if (i5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J.alpha("negative shift");
        }
        if (i5 == 0) {
            return (Object[]) it.next();
        }
        Object[] quebec = quebec(objArr);
        int bravo = AbstractC2653f6.bravo(i4, i5);
        int i10 = i5 - 5;
        quebec[bravo] = xray((Object[]) quebec[bravo], i4, i10, it);
        while (true) {
            bravo++;
            if (bravo >= 32 || !it.hasNext()) {
                break;
            }
            quebec[bravo] = xray((Object[]) quebec[bravo], 0, i10, it);
        }
        return quebec;
    }

    public final Object[] yankee(Object[] objArr, int i4, Object[][] objArr2) {
        Object[] quebec;
        Lf.h golf = x.golf(objArr2);
        int i5 = i4 >> 5;
        int i10 = this.silver;
        if (i5 < (1 << i10)) {
            quebec = xray(objArr, i4, i10, golf);
        } else {
            quebec = quebec(objArr);
        }
        while (golf.hasNext()) {
            this.silver += 5;
            quebec = tango(quebec);
            int i11 = this.silver;
            xray(quebec, 1 << i11, i11, golf);
        }
        return quebec;
    }

    public final void zulu(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i4 = this.f1699a;
        int i5 = i4 >> 5;
        int i10 = this.silver;
        if (i5 > (1 << i10)) {
            this.white = amber(this.silver + 5, tango(objArr), objArr2);
            this.yellow = objArr3;
            this.silver += 5;
            this.f1699a++;
            return;
        }
        if (objArr == null) {
            this.white = objArr2;
            this.yellow = objArr3;
            this.f1699a = i4 + 1;
        } else {
            this.white = amber(i10, objArr, objArr2);
            this.yellow = objArr3;
            this.f1699a++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int gold = gold();
        if (gold < 32) {
            Object[] quebec = quebec(this.yellow);
            quebec[gold] = obj;
            this.yellow = quebec;
            this.f1699a = alpha() + 1;
        } else {
            zulu(this.white, this.yellow, tango(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int gold = gold();
        Iterator it = collection.iterator();
        if (32 - gold >= collection.size()) {
            Object[] quebec = quebec(this.yellow);
            hotel(quebec, gold, it);
            this.yellow = quebec;
            this.f1699a = collection.size() + this.f1699a;
            return true;
        }
        int size = ((collection.size() + gold) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] quebec2 = quebec(this.yellow);
        hotel(quebec2, gold, it);
        objArr[0] = quebec2;
        for (int i4 = 1; i4 < size; i4++) {
            Object[] sierra = sierra();
            hotel(sierra, 0, it);
            objArr[i4] = sierra;
        }
        this.white = yankee(this.white, cyan(), objArr);
        Object[] sierra2 = sierra();
        hotel(sierra2, 0, it);
        this.yellow = sierra2;
        this.f1699a = collection.size() + this.f1699a;
        return true;
    }
}
