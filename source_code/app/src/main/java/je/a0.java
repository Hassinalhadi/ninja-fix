package je;

import com.clevertap.android.sdk.Constants;
import ge.InterfaceC1771c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import oe.C2233d;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2349y;
import qe.InterfaceC2465a;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;
import s6.AbstractC2644e6;
import se.C2871u;
import t6.AbstractC3062u;
import t6.AbstractC3080x2;
import ue.C3157a;
import ue.C3161e;
import ve.AbstractC3192d;
import ve.C3193e;

/* loaded from: classes2.dex */
public abstract class a0 {
    public static final Ne.c alpha = new Ne.c("kotlin.jvm.JvmStatic");

    public static final r alpha(InterfaceC1771c interfaceC1771c) {
        r rVar;
        if (interfaceC1771c instanceof r) {
            rVar = (r) interfaceC1771c;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            ah bravo = bravo(interfaceC1771c);
            if (bravo != null) {
                return bravo;
            }
            return charlie(interfaceC1771c);
        }
        return rVar;
    }

    public static final ah bravo(Object obj) {
        ah ahVar;
        kotlin.jvm.internal.h hVar;
        InterfaceC1771c interfaceC1771c;
        if (obj instanceof ah) {
            ahVar = (ah) obj;
        } else {
            ahVar = null;
        }
        if (ahVar == null) {
            if (obj instanceof kotlin.jvm.internal.h) {
                hVar = (kotlin.jvm.internal.h) obj;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                interfaceC1771c = hVar.compute();
            } else {
                interfaceC1771c = null;
            }
            if (!(interfaceC1771c instanceof ah)) {
                return null;
            }
            return (ah) interfaceC1771c;
        }
        return ahVar;
    }

    public static final L charlie(Object obj) {
        L l10;
        kotlin.jvm.internal.p pVar;
        InterfaceC1771c interfaceC1771c;
        if (obj instanceof L) {
            l10 = (L) obj;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            if (obj instanceof kotlin.jvm.internal.p) {
                pVar = (kotlin.jvm.internal.p) obj;
            } else {
                pVar = null;
            }
            if (pVar != null) {
                interfaceC1771c = pVar.compute();
            } else {
                interfaceC1771c = null;
            }
            if (!(interfaceC1771c instanceof L)) {
                return null;
            }
            return (L) interfaceC1771c;
        }
        return l10;
    }

    public static final ArrayList delta(InterfaceC2465a interfaceC2465a) {
        List juliet;
        C3193e c3193e;
        Intrinsics.echo(interfaceC2465a, "<this>");
        InterfaceC2472h annotations = interfaceC2465a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotation = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC2466b interfaceC2466b = (InterfaceC2466b) it.next();
            pe.an echo = interfaceC2466b.echo();
            if (echo instanceof C3157a) {
                annotation = ((C3157a) echo).alpha;
            } else if (echo instanceof ue.f) {
                ve.u uVar = ((ue.f) echo).alpha;
                if (uVar instanceof C3193e) {
                    c3193e = (C3193e) uVar;
                } else {
                    c3193e = null;
                }
                if (c3193e != null) {
                    annotation = c3193e.alpha;
                }
            } else {
                annotation = india(interfaceC2466b);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(AbstractC3062u.bravo(AbstractC3062u.alpha((Annotation) it2.next())).getSimpleName(), "Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Annotation annotation2 = (Annotation) it3.next();
                        Class bravo = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation2));
                        if (Intrinsics.areEqual(bravo.getSimpleName(), "Container") && bravo.getAnnotation(kotlin.jvm.internal.w.class) != null) {
                            Object invoke = bravo.getDeclaredMethod("value", null).invoke(annotation2, null);
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            juliet = ArraysKt.sierra((Annotation[]) invoke);
                        } else {
                            juliet = kotlin.collections.ab.juliet(annotation2);
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, juliet);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object echo(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (Intrinsics.areEqual(type, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (Intrinsics.areEqual(type, Character.TYPE)) {
                return (char) 0;
            }
            if (Intrinsics.areEqual(type, Byte.TYPE)) {
                return (byte) 0;
            }
            if (Intrinsics.areEqual(type, Short.TYPE)) {
                return (short) 0;
            }
            if (Intrinsics.areEqual(type, Integer.TYPE)) {
                return 0;
            }
            if (Intrinsics.areEqual(type, Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (Intrinsics.areEqual(type, Long.TYPE)) {
                return 0L;
            }
            if (Intrinsics.areEqual(type, Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (Intrinsics.areEqual(type, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type);
        }
        return null;
    }

    public static final InterfaceC2326b foxtrot(Class moduleAnchor, Oe.l proto, Ke.e nameResolver, G6.j jVar, Ke.a metadataVersion, Xd.l lVar) {
        List list;
        Intrinsics.echo(moduleAnchor, "moduleAnchor");
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(metadataVersion, "metadataVersion");
        C3161e alpha2 = S.alpha(moduleAnchor);
        if (proto instanceof Ie.y) {
            list = ((Ie.y) proto).f1613b;
        } else if (proto instanceof Ie.ag) {
            list = ((Ie.ag) proto).f1447b;
        } else {
            throw new IllegalStateException(("Unsupported message: " + proto).toString());
        }
        List typeParameters = list;
        B9.K k6 = alpha2.alpha;
        Ke.f fVar = Ke.f.alpha;
        Intrinsics.delta(typeParameters, "typeParameters");
        return (InterfaceC2326b) lVar.invoke(new cf.q(new D5.s(k6, nameResolver, (InterfaceC2349y) k6.bravo, jVar, fVar, metadataVersion, null, null, typeParameters)), proto);
    }

    public static final C2871u golf(InterfaceC2328d interfaceC2328d) {
        Intrinsics.echo(interfaceC2328d, "<this>");
        if (interfaceC2328d.a() != null) {
            InterfaceC2335k lima = interfaceC2328d.lima();
            Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((InterfaceC2330f) lima).C();
        }
        return null;
    }

    public static final Class hotel(ClassLoader classLoader, Ne.b bVar, int i4) {
        String str = C2233d.alpha;
        Ne.e india = bVar.bravo().india();
        Intrinsics.delta(india, "kotlinClassId.asSingleFqName().toUnsafe()");
        Ne.b foxtrot = C2233d.foxtrot(india);
        if (foxtrot != null) {
            bVar = foxtrot;
        }
        String bravo = bVar.golf().bravo();
        String bravo2 = bVar.hotel().bravo();
        if (Intrinsics.areEqual(bravo, "kotlin")) {
            switch (bravo2.hashCode()) {
                case -901856463:
                    if (bravo2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (bravo2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (bravo2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (bravo2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (bravo2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (bravo2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (bravo2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (bravo2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (bravo2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i4 > 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                sb2.append(Constants.AES_PREFIX);
            }
            sb2.append("L");
        }
        if (bravo.length() > 0) {
            sb2.append(bravo.concat("."));
        }
        sb2.append(kotlin.text.r.november(bravo2, '.', '$'));
        if (i4 > 0) {
            sb2.append(";");
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return AbstractC3080x2.bravo(classLoader, sb3);
    }

    public static final Annotation india(InterfaceC2466b interfaceC2466b) {
        Class cls;
        int collectionSizeOrDefault;
        Pair pair;
        InterfaceC2330f delta = Ue.e.delta(interfaceC2466b);
        if (delta != null) {
            cls = juliet(delta);
        } else {
            cls = null;
        }
        if (cls == null) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry> entrySet = interfaceC2466b.bravo().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            Ne.f fVar = (Ne.f) entry.getKey();
            Se.g gVar = (Se.g) entry.getValue();
            ClassLoader classLoader = cls.getClassLoader();
            Intrinsics.delta(classLoader, "annotationClass.classLoader");
            Object kilo = kilo(gVar, classLoader);
            if (kilo != null) {
                pair = new Pair(fVar.bravo(), kilo);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map yankee = kotlin.collections.y.yankee(arrayList);
        Set keySet = yankee.keySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) AbstractC2644e6.alpha(cls, yankee, arrayList2);
    }

    public static final Class juliet(InterfaceC2330f interfaceC2330f) {
        Intrinsics.echo(interfaceC2330f, "<this>");
        pe.an source = interfaceC2330f.echo();
        Intrinsics.delta(source, "source");
        if (source instanceof Ge.n) {
            return ((Ge.n) source).alpha.alpha;
        }
        if (source instanceof ue.f) {
            ve.u uVar = ((ue.f) source).alpha;
            Intrinsics.charlie(uVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ve.q) uVar).alpha;
        }
        Ne.b foxtrot = Ue.e.foxtrot(interfaceC2330f);
        if (foxtrot == null) {
            return null;
        }
        return hotel(AbstractC3192d.delta(interfaceC2330f.getClass()), foxtrot, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object kilo(Se.g gVar, ClassLoader classLoader) {
        InterfaceC2330f interfaceC2330f;
        Se.w wVar;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        int collectionSizeOrDefault;
        me.j quebec;
        int i4;
        InterfaceC2330f interfaceC2330f2;
        Class hotel;
        boolean z2 = true;
        if (gVar instanceof Se.a) {
            return india((InterfaceC2466b) ((Se.a) gVar).alpha);
        }
        int i5 = 0;
        if (gVar instanceof Se.b) {
            Se.b bVar = (Se.b) gVar;
            if (bVar instanceof Se.w) {
                wVar = (Se.w) bVar;
            } else {
                wVar = null;
            }
            if (wVar != null && (yVar = wVar.charlie) != null) {
                Iterable iterable = (Iterable) bVar.alpha;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(kilo((Se.g) it.next(), classLoader));
                }
                Ne.f fVar = AbstractC2120h.echo;
                InterfaceC2332h kilo = yVar.green().kilo();
                if (kilo == null) {
                    quebec = null;
                } else {
                    quebec = AbstractC2120h.quebec(kilo);
                }
                if (quebec == null) {
                    i4 = -1;
                } else {
                    i4 = Z.$EnumSwitchMapping$0[quebec.ordinal()];
                }
                Object obj = bVar.alpha;
                switch (i4) {
                    case -1:
                        if (AbstractC2120h.xray(yVar)) {
                            kotlin.reflect.jvm.internal.impl.types.y bravo = ((kotlin.reflect.jvm.internal.impl.types.as) CollectionsKt.k(yVar.cyan())).bravo();
                            Intrinsics.delta(bravo, "type.arguments.single().type");
                            InterfaceC2332h kilo2 = bravo.green().kilo();
                            if (kilo2 instanceof InterfaceC2330f) {
                                interfaceC2330f2 = (InterfaceC2330f) kilo2;
                            } else {
                                interfaceC2330f2 = null;
                            }
                            if (interfaceC2330f2 != null) {
                                if (AbstractC2120h.bronze(bravo)) {
                                    int size = ((List) obj).size();
                                    String[] strArr = new String[size];
                                    while (i5 < size) {
                                        Object obj2 = arrayList.get(i5);
                                        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.String");
                                        strArr[i5] = obj2;
                                        i5++;
                                    }
                                    return strArr;
                                }
                                if (AbstractC2120h.bravo(interfaceC2330f2, me.m.ivory)) {
                                    int size2 = ((List) obj).size();
                                    Class[] clsArr = new Class[size2];
                                    while (i5 < size2) {
                                        Object obj3 = arrayList.get(i5);
                                        Intrinsics.charlie(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                        clsArr[i5] = obj3;
                                        i5++;
                                    }
                                    return clsArr;
                                }
                                Ne.b foxtrot = Ue.e.foxtrot(interfaceC2330f2);
                                if (foxtrot != null && (hotel = hotel(classLoader, foxtrot, 0)) != null) {
                                    Object newInstance = Array.newInstance((Class<?>) hotel, ((List) obj).size());
                                    Intrinsics.charlie(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                                    Object[] objArr = (Object[]) newInstance;
                                    int size3 = arrayList.size();
                                    while (i5 < size3) {
                                        objArr[i5] = arrayList.get(i5);
                                        i5++;
                                    }
                                    return objArr;
                                }
                            } else {
                                throw new IllegalStateException(("Not a class type: " + bravo).toString());
                            }
                        } else {
                            throw new IllegalStateException(("Not an array type: " + yVar).toString());
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i5 < size4) {
                            Object obj4 = arrayList.get(i5);
                            Intrinsics.charlie(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i5] = ((Boolean) obj4).booleanValue();
                            i5++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i5 < size5) {
                            Object obj5 = arrayList.get(i5);
                            Intrinsics.charlie(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i5] = ((Character) obj5).charValue();
                            i5++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i5 < size6) {
                            Object obj6 = arrayList.get(i5);
                            Intrinsics.charlie(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i5] = ((Byte) obj6).byteValue();
                            i5++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i5 < size7) {
                            Object obj7 = arrayList.get(i5);
                            Intrinsics.charlie(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i5] = ((Short) obj7).shortValue();
                            i5++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i5 < size8) {
                            Object obj8 = arrayList.get(i5);
                            Intrinsics.charlie(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i5] = ((Integer) obj8).intValue();
                            i5++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i5 < size9) {
                            Object obj9 = arrayList.get(i5);
                            Intrinsics.charlie(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i5] = ((Float) obj9).floatValue();
                            i5++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i5 < size10) {
                            Object obj10 = arrayList.get(i5);
                            Intrinsics.charlie(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i5] = ((Long) obj10).longValue();
                            i5++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i5 < size11) {
                            Object obj11 = arrayList.get(i5);
                            Intrinsics.charlie(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i5] = ((Double) obj11).doubleValue();
                            i5++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof Se.i) {
            Pair pair = (Pair) ((Se.i) gVar).alpha;
            Ne.b bVar2 = (Ne.b) pair.first;
            Ne.f fVar2 = (Ne.f) pair.second;
            Class hotel2 = hotel(classLoader, bVar2, 0);
            if (hotel2 != null) {
                return Enum.valueOf(hotel2, fVar2.bravo());
            }
        } else if (gVar instanceof Se.r) {
            Se.q qVar = (Se.q) ((Se.r) gVar).alpha;
            if (qVar instanceof Se.p) {
                Se.f fVar3 = ((Se.p) qVar).alpha;
                return hotel(classLoader, fVar3.alpha, fVar3.bravo);
            }
            if (qVar instanceof Se.o) {
                InterfaceC2332h kilo3 = ((Se.o) qVar).alpha.green().kilo();
                if (kilo3 instanceof InterfaceC2330f) {
                    interfaceC2330f = (InterfaceC2330f) kilo3;
                } else {
                    interfaceC2330f = null;
                }
                if (interfaceC2330f != null) {
                    return juliet(interfaceC2330f);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(gVar instanceof Se.j)) {
                z2 = gVar instanceof Se.t;
            }
            if (!z2) {
                return gVar.bravo();
            }
        }
        return null;
    }
}
