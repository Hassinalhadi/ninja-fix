package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.AbstractC2327c;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2345u;
import qe.InterfaceC2472h;

/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1380u1 {
    public static final ArrayList alpha(List list, List oldValueParameters, InterfaceC2345u interfaceC2345u) {
        int collectionSizeOrDefault;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        Intrinsics.echo(oldValueParameters, "oldValueParameters");
        list.size();
        oldValueParameters.size();
        ArrayList H10 = CollectionsKt.H(list, oldValueParameters);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(H10, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = H10.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            kotlin.reflect.jvm.internal.impl.types.y yVar2 = (kotlin.reflect.jvm.internal.impl.types.y) pair.first;
            se.aq aqVar = (se.aq) pair.second;
            int i4 = aqVar.white;
            InterfaceC2472h annotations = aqVar.getAnnotations();
            Ne.f name = aqVar.getName();
            Intrinsics.delta(name, "oldParameter.name");
            boolean a02 = aqVar.a0();
            if (aqVar.f13747c != null) {
                yVar = Ue.e.juliet(interfaceC2345u).juliet().foxtrot(yVar2);
            } else {
                yVar = null;
            }
            kotlin.reflect.jvm.internal.impl.types.y yVar3 = yVar;
            pe.an echo = aqVar.echo();
            Intrinsics.delta(echo, "oldParameter.source");
            arrayList.add(new se.aq(interfaceC2345u, null, i4, annotations, name, yVar2, a02, aqVar.f13745a, aqVar.f13746b, yVar3, echo));
        }
        return arrayList;
    }

    public static final Ce.ak bravo(InterfaceC2330f interfaceC2330f) {
        Ce.ak akVar;
        InterfaceC2330f interfaceC2330f2;
        InterfaceC2332h kilo;
        Intrinsics.echo(interfaceC2330f, "<this>");
        int i4 = Ue.e.alpha;
        Iterator it = interfaceC2330f.oscar().green().lima().iterator();
        while (true) {
            akVar = null;
            if (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.y yVar = (kotlin.reflect.jvm.internal.impl.types.y) it.next();
                if (!AbstractC2120h.whiskey(yVar)) {
                    kilo = yVar.green().kilo();
                    if (Qe.e.november(kilo, 1) || Qe.e.november(kilo, 3)) {
                        break;
                    }
                }
            } else {
                interfaceC2330f2 = null;
                break;
            }
        }
        Intrinsics.charlie(kilo, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        interfaceC2330f2 = (InterfaceC2330f) kilo;
        if (interfaceC2330f2 == null) {
            return null;
        }
        Xe.n lime = interfaceC2330f2.lime();
        if (lime instanceof Ce.ak) {
            akVar = (Ce.ak) lime;
        }
        if (akVar == null) {
            return bravo(interfaceC2330f2);
        }
        return akVar;
    }

    public static InterfaceC1355o charlie(Q0 q02) {
        if (q02 == null) {
            return InterfaceC1355o.gold;
        }
        int victor = q02.victor() - 1;
        if (victor != 1) {
            if (victor != 2) {
                if (victor != 3) {
                    if (victor == 4) {
                        D1 quebec = q02.quebec();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = quebec.iterator();
                        while (it.hasNext()) {
                            arrayList.add(charlie((Q0) it.next()));
                        }
                        return new C1359p(q02.oscar(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (q02.sierra()) {
                    return new C1313f(Boolean.valueOf(q02.romeo()));
                }
                return new C1313f(null);
            }
            if (q02.tango()) {
                return new C1323h(Double.valueOf(q02.november()));
            }
            return new C1323h(null);
        }
        if (q02.uniform()) {
            return new r(q02.papa());
        }
        return InterfaceC1355o.lime;
    }

    public static InterfaceC1355o delta(Object obj) {
        if (obj == null) {
            return InterfaceC1355o.gray;
        }
        if (obj instanceof String) {
            return new r((String) obj);
        }
        if (obj instanceof Double) {
            return new C1323h((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1323h(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1323h(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1313f((Boolean) obj);
        }
        if (obj instanceof Map) {
            C1343l c1343l = new C1343l();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC1355o delta = delta(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c1343l.india((String) obj2, delta);
                }
            }
            return c1343l;
        }
        if (obj instanceof List) {
            C1308e c1308e = new C1308e();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1308e.uniform(c1308e.november(), delta(it.next()));
            }
            return c1308e;
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static C1368r1 echo() {
        String str;
        ClassLoader classLoader = AbstractC1380u1.class.getClassLoader();
        if (!C1368r1.class.equals(C1368r1.class)) {
            if (!C1368r1.class.getPackage().equals(AbstractC1380u1.class.getPackage())) {
                throw new IllegalArgumentException(C1368r1.class.getName());
            }
            str = AbstractC2327c.xray(C1368r1.class.getPackage().getName(), ".BlazeGenerated", C1368r1.class.getSimpleName(), "Loader");
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    try {
                        ao.ad.cyan(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    } catch (InvocationTargetException e4) {
                        throw new IllegalStateException(e4);
                    }
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(e5);
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = Arrays.asList(new AbstractC1380u1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                    break;
                } catch (ServiceConfigurationError e11) {
                    Logger.getLogger(C1365q1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C1368r1.class.getSimpleName()), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (C1368r1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C1368r1) C1368r1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(e14);
            }
        }
    }
}
