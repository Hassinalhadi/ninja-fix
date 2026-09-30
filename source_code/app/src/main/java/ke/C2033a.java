package ke;

import ge.InterfaceC1772d;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2644e6;
import s6.AbstractC2653f6;
import t6.AbstractC3062u;
import ve.AbstractC3192d;

/* renamed from: ke.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2033a implements InterfaceC2037e {
    public final Class alpha;
    public final ArrayList bravo;
    public final int charlie;
    public final List delta;
    public final ArrayList echo;
    public final ArrayList foxtrot;
    public final ArrayList golf;

    public C2033a(Class jClass, ArrayList arrayList, int i4, int i5, List methods) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Intrinsics.echo(jClass, "jClass");
        com.google.android.material.datepicker.j.papa(i4, "callMode");
        com.google.android.material.datepicker.j.papa(i5, "origin");
        Intrinsics.echo(methods, "methods");
        this.alpha = jClass;
        this.bravo = arrayList;
        this.charlie = i4;
        this.delta = methods;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(methods, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.echo = arrayList2;
        List list = this.delta;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> it3 = ((Method) it2.next()).getReturnType();
            Intrinsics.delta(it3, "it");
            List list2 = AbstractC3192d.alpha;
            Class<?> cls = (Class) AbstractC3192d.charlie.get(it3);
            if (cls != null) {
                it3 = cls;
            }
            arrayList3.add(it3);
        }
        this.foxtrot = arrayList3;
        List list3 = this.delta;
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Method) it4.next()).getDefaultValue());
        }
        this.golf = arrayList4;
        if (this.charlie == 2 && i5 == 1 && !CollectionsKt.teal(this.bravo, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // ke.InterfaceC2037e
    public final List alpha() {
        return this.echo;
    }

    @Override // ke.InterfaceC2037e
    public final /* bridge */ /* synthetic */ Member bravo() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r11.isInstance(r8) != false) goto L30;
     */
    @Override // ke.InterfaceC2037e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(Object[] args) {
        InterfaceC1772d echo;
        String juliet;
        Intrinsics.echo(args, "args");
        AbstractC2653f6.alpha(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = this.bravo;
            if (i4 < length) {
                Object obj = args[i4];
                int i10 = i5 + 1;
                ArrayList arrayList3 = this.foxtrot;
                if (obj == null && this.charlie == 1) {
                    obj = this.golf.get(i5);
                } else {
                    Class cls = (Class) arrayList3.get(i5);
                    if (!(obj instanceof Class)) {
                        if (obj instanceof InterfaceC1772d) {
                            obj = AbstractC3062u.bravo((InterfaceC1772d) obj);
                        } else if (obj instanceof Object[]) {
                            Object[] objArr = (Object[]) obj;
                            if (!(objArr instanceof Class[])) {
                                if (objArr instanceof InterfaceC1772d[]) {
                                    Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                    InterfaceC1772d[] interfaceC1772dArr = (InterfaceC1772d[]) obj;
                                    ArrayList arrayList4 = new ArrayList(interfaceC1772dArr.length);
                                    for (InterfaceC1772d interfaceC1772d : interfaceC1772dArr) {
                                        arrayList4.add(AbstractC3062u.bravo(interfaceC1772d));
                                    }
                                    obj = arrayList4.toArray(new Class[0]);
                                } else {
                                    obj = objArr;
                                }
                            }
                        }
                    }
                    obj = null;
                }
                if (obj == null) {
                    String str = (String) arrayList2.get(i5);
                    Class cls2 = (Class) arrayList3.get(i5);
                    if (Intrinsics.areEqual(cls2, Class.class)) {
                        echo = kotlin.jvm.internal.u.alpha.bravo(InterfaceC1772d.class);
                    } else if (cls2.isArray() && Intrinsics.areEqual(cls2.getComponentType(), Class.class)) {
                        echo = kotlin.jvm.internal.u.alpha.bravo(InterfaceC1772d[].class);
                    } else {
                        echo = AbstractC3062u.echo(cls2);
                    }
                    if (Intrinsics.areEqual(echo.juliet(), kotlin.jvm.internal.u.alpha.bravo(Object[].class).juliet())) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(echo.juliet());
                        sb2.append('<');
                        Class<?> componentType = AbstractC3062u.bravo(echo).getComponentType();
                        Intrinsics.delta(componentType, "kotlinClass.java.componentType");
                        sb2.append(AbstractC3062u.echo(componentType).juliet());
                        sb2.append('>');
                        juliet = sb2.toString();
                    } else {
                        juliet = echo.juliet();
                    }
                    throw new IllegalArgumentException("Argument #" + i5 + ' ' + str + " is not of the required type " + juliet);
                }
                arrayList.add(obj);
                i4++;
                i5 = i10;
            } else {
                return AbstractC2644e6.alpha(this.alpha, kotlin.collections.y.yankee(CollectionsKt.H(arrayList2, arrayList)), this.delta);
            }
        }
    }

    @Override // ke.InterfaceC2037e
    public final Type getReturnType() {
        return this.alpha;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2033a(Class cls, ArrayList arrayList, int i4) {
        this(cls, arrayList, i4, 2, r5);
        int collectionSizeOrDefault;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
    }
}
