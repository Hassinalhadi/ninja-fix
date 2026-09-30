package ve;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import ge.InterfaceC1772d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import je.InterfaceC1966e;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import t6.AbstractC3062u;

/* renamed from: ve.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3192d {
    public static final List alpha;
    public static final Map bravo;
    public static final Map charlie;
    public static final Map delta;

    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        int i4 = 0;
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        List<InterfaceC1772d> listOf = CollectionsKt.listOf(vVar.bravo(Boolean.TYPE), vVar.bravo(Byte.TYPE), vVar.bravo(Character.TYPE), vVar.bravo(Double.TYPE), vVar.bravo(Float.TYPE), vVar.bravo(Integer.TYPE), vVar.bravo(Long.TYPE), vVar.bravo(Short.TYPE));
        alpha = listOf;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InterfaceC1772d interfaceC1772d : listOf) {
            arrayList.add(new Pair(AbstractC3062u.charlie(interfaceC1772d), AbstractC3062u.delta(interfaceC1772d)));
        }
        bravo = kotlin.collections.y.yankee(arrayList);
        List<InterfaceC1772d> list = alpha;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (InterfaceC1772d interfaceC1772d2 : list) {
            arrayList2.add(new Pair(AbstractC3062u.delta(interfaceC1772d2), AbstractC3062u.charlie(interfaceC1772d2)));
        }
        charlie = kotlin.collections.y.yankee(arrayList2);
        List listOf2 = CollectionsKt.listOf(Function0.class, Function1.class, Xd.l.class, Xd.m.class, Xd.n.class, Xd.o.class, Xd.p.class, Xd.q.class, Xd.r.class, Xd.s.class, Xd.a.class, Xd.b.class, InterfaceC1966e.class, Xd.c.class, Xd.d.class, Xd.e.class, Xd.f.class, Xd.g.class, Xd.h.class, Xd.i.class, Xd.j.class, Xd.k.class, InterfaceC1966e.class);
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (Object obj : listOf2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        delta = kotlin.collections.y.yankee(arrayList3);
    }

    public static final Ne.b alpha(Class cls) {
        Ne.b alpha2;
        Intrinsics.echo(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null && (alpha2 = alpha(declaringClass)) != null) {
                        return alpha2.delta(Ne.f.echo(cls.getSimpleName()));
                    }
                    return Ne.b.juliet(new Ne.c(cls.getName()));
                }
                Ne.c cVar = new Ne.c(cls.getName());
                return new Ne.b(cVar.echo(), Ne.c.juliet(cVar.foxtrot()), true);
            }
            throw new IllegalArgumentException(P0.blue(cls, "Can't compute ClassId for array type: "));
        }
        throw new IllegalArgumentException(P0.blue(cls, "Can't compute ClassId for primitive type: "));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    public static final String bravo(Class cls) {
        Intrinsics.echo(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 64711720:
                    if (name.equals(CTVariableUtils.BOOLEAN)) {
                        return "Z";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
                default:
                    throw new IllegalArgumentException(P0.blue(cls, "Unsupported primitive type: "));
            }
        }
        if (cls.isArray()) {
            return kotlin.text.r.november(cls.getName(), '.', '/');
        }
        return "L" + kotlin.text.r.november(cls.getName(), '.', '/') + ';';
    }

    public static final List charlie(Type type) {
        Intrinsics.echo(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt.emptyList();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Intrinsics.delta(actualTypeArguments, "actualTypeArguments");
            return ArraysKt.b(actualTypeArguments);
        }
        return AbstractC2360j.quebec(AbstractC2360j.juliet(AbstractC2360j.lima(type, C3190b.alpha), C3191c.alpha));
    }

    public static final ClassLoader delta(Class cls) {
        Intrinsics.echo(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            Intrinsics.delta(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }
}
