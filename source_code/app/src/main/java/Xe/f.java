package Xe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {
    public static final r6.u charlie = new r6.u(12);
    public static final int delta;
    public static final int echo;
    public static final int foxtrot;
    public static final int golf;
    public static final int hotel;
    public static final int india;
    public static final int juliet;
    public static final int kilo;
    public static final int lima;
    public static final f mike;
    public static final f november;
    public static final f oscar;
    public static final f papa;
    public static final f quebec;
    public static final ArrayList romeo;
    public static final ArrayList sierra;
    public final List alpha;
    public final int bravo;

    static {
        e eVar;
        f fVar;
        int i4 = delta;
        int i5 = i4 << 1;
        echo = i4;
        int i10 = i4 << 2;
        foxtrot = i5;
        int i11 = i4 << 3;
        golf = i10;
        int i12 = i4 << 4;
        hotel = i11;
        int i13 = i4 << 5;
        india = i12;
        juliet = i13;
        delta = i4 << 7;
        int i14 = (i4 << 6) - 1;
        kilo = i14;
        int i15 = i4 | i5 | i10;
        lima = i15;
        mike = new f(i14);
        november = new f(i12 | i13);
        new f(i4);
        new f(i5);
        new f(i10);
        oscar = new f(i15);
        new f(i11);
        papa = new f(i12);
        quebec = new f(i13);
        new f(i5 | i12 | i13);
        Field[] fields = f.class.getFields();
        Intrinsics.delta(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            if (obj instanceof f) {
                fVar = (f) obj;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                String name = field2.getName();
                Intrinsics.delta(name, "field.name");
                eVar2 = new e(fVar.bravo, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        romeo = arrayList2;
        Field[] fields2 = f.class.getFields();
        Intrinsics.delta(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (Intrinsics.areEqual(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                Intrinsics.delta(name2, "field.name");
                eVar = new e(intValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        sierra = arrayList5;
    }

    public f(int i4, List excludes) {
        Intrinsics.echo(excludes, "excludes");
        this.alpha = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i4 &= ~((d) it.next()).alpha();
        }
        this.bravo = i4;
    }

    public final boolean alpha(int i4) {
        if ((i4 & this.bravo) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(f.class, cls)) {
            return false;
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.alpha, fVar.alpha) && this.bravo == fVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        Iterator it = romeo.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((e) obj).alpha == this.bravo) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        e eVar = (e) obj;
        if (eVar != null) {
            str = eVar.bravo;
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = sierra;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (alpha(eVar2.alpha)) {
                    str2 = eVar2.bravo;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            str = CollectionsKt.maroon(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder victor = Q0.c.victor("DescriptorKindFilter(", str, ", ");
        victor.append(this.alpha);
        victor.append(')');
        return victor.toString();
    }

    public /* synthetic */ f(int i4) {
        this(i4, CollectionsKt.emptyList());
    }
}
