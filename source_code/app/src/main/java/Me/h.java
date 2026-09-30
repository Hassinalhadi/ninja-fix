package Me;

import G6.j;
import Ie.C0181a;
import Ie.ac;
import Ie.ag;
import Ie.aq;
import Ie.ay;
import Ie.l;
import Ie.y;
import Le.k;
import Oe.n;
import Oe.v;
import androidx.appcompat.widget.P0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import s6.AbstractC2617b6;
import s6.AbstractC2626c6;

/* loaded from: classes2.dex */
public final class h {
    public static final Oe.h alpha;

    static {
        Oe.h hVar = new Oe.h();
        hVar.alpha(k.alpha);
        hVar.alpha(k.bravo);
        hVar.alpha(k.charlie);
        hVar.alpha(k.delta);
        hVar.alpha(k.echo);
        hVar.alpha(k.foxtrot);
        hVar.alpha(k.golf);
        hVar.alpha(k.hotel);
        hVar.alpha(k.india);
        hVar.alpha(k.juliet);
        hVar.alpha(k.kilo);
        hVar.alpha(k.lima);
        hVar.alpha(k.mike);
        hVar.alpha(k.november);
        alpha = hVar;
    }

    public static e alpha(l proto, Ke.e nameResolver, j typeTable) {
        String str;
        int collectionSizeOrDefault;
        String maroon;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(typeTable, "typeTable");
        n constructorSignature = k.alpha;
        Intrinsics.delta(constructorSignature, "constructorSignature");
        Le.c cVar = (Le.c) AbstractC2617b6.charlie(proto, constructorSignature);
        if (cVar != null && (cVar.purple & 1) == 1) {
            str = nameResolver.getString(cVar.red);
        } else {
            str = "<init>";
        }
        if (cVar != null && (cVar.purple & 2) == 2) {
            maroon = nameResolver.getString(cVar.silver);
        } else {
            List<ay> list = proto.teal;
            Intrinsics.delta(list, "proto.valueParameterList");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (ay it : list) {
                Intrinsics.delta(it, "it");
                String echo = echo(AbstractC2626c6.juliet(it, typeTable), nameResolver);
                if (echo == null) {
                    return null;
                }
                arrayList.add(echo);
            }
            maroon = CollectionsKt.maroon(arrayList, "", "(", ")V", null, 56);
        }
        return new e(str, maroon);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r4 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d bravo(ag proto, Ke.e nameResolver, j typeTable, boolean z2) {
        Le.b bVar;
        int i4;
        String echo;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(typeTable, "typeTable");
        n propertySignature = k.delta;
        Intrinsics.delta(propertySignature, "propertySignature");
        Le.e eVar = (Le.e) AbstractC2617b6.charlie(proto, propertySignature);
        if (eVar != null) {
            if ((eVar.purple & 1) == 1) {
                bVar = eVar.red;
            } else {
                bVar = null;
            }
            if (bVar != null || !z2) {
                if (bVar != null && (bVar.purple & 1) == 1) {
                    i4 = bVar.red;
                } else {
                    i4 = proto.white;
                }
                if (bVar != null && (bVar.purple & 2) == 2) {
                    echo = nameResolver.getString(bVar.silver);
                } else {
                    echo = echo(AbstractC2626c6.india(proto, typeTable), nameResolver);
                }
                return new d(nameResolver.getString(i4), echo);
            }
        }
        return null;
    }

    public static e charlie(y proto, Ke.e nameResolver, j typeTable) {
        int i4;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        String gold;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(typeTable, "typeTable");
        n methodSignature = k.bravo;
        Intrinsics.delta(methodSignature, "methodSignature");
        Le.c cVar = (Le.c) AbstractC2617b6.charlie(proto, methodSignature);
        if (cVar != null && (cVar.purple & 1) == 1) {
            i4 = cVar.red;
        } else {
            i4 = proto.white;
        }
        if (cVar != null && (cVar.purple & 2) == 2) {
            gold = nameResolver.getString(cVar.silver);
        } else {
            List orange = CollectionsKt.orange(AbstractC2626c6.golf(proto, typeTable));
            List<ay> list = proto.f1618h;
            Intrinsics.delta(list, "proto.valueParameterList");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (ay it : list) {
                Intrinsics.delta(it, "it");
                arrayList.add(AbstractC2626c6.juliet(it, typeTable));
            }
            ArrayList a6 = CollectionsKt.a(orange, arrayList);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(a6, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            Iterator it2 = a6.iterator();
            while (it2.hasNext()) {
                String echo = echo((aq) it2.next(), nameResolver);
                if (echo != null) {
                    arrayList2.add(echo);
                } else {
                    return null;
                }
            }
            String echo2 = echo(AbstractC2626c6.hotel(proto, typeTable), nameResolver);
            if (echo2 == null) {
                return null;
            }
            gold = P0.gold(new StringBuilder(), CollectionsKt.maroon(arrayList2, "", "(", ")", null, 56), echo2);
        }
        return new e(nameResolver.getString(i4), gold);
    }

    public static final boolean delta(ag proto) {
        Intrinsics.echo(proto, "proto");
        Ke.b bVar = c.alpha;
        Object kilo = proto.kilo(k.echo);
        Intrinsics.delta(kilo, "proto.getExtension(JvmProtoBuf.flags)");
        return bVar.echo(((Number) kilo).intValue()).booleanValue();
    }

    public static String echo(aq aqVar, Ke.e eVar) {
        if (aqVar.papa()) {
            return b.bravo(eVar.hotel(aqVar.f1475b));
        }
        return null;
    }

    public static final Pair foxtrot(String[] strArr, String[] strings) {
        Intrinsics.echo(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.alpha(strArr));
        g golf = golf(byteArrayInputStream, strings);
        C0181a c0181a = Ie.j.f1560D;
        c0181a.getClass();
        Oe.f fVar = new Oe.f(byteArrayInputStream);
        v vVar = (v) c0181a.alpha(fVar, alpha);
        try {
            if (fVar.foxtrot == 0) {
                Oe.c.bravo(vVar);
                return new Pair(golf, (Ie.j) vVar);
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(vVar);
        }
    }

    public static g golf(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        Le.j jVar = (Le.j) Le.j.f1850a.charlie(byteArrayInputStream, alpha);
        Intrinsics.delta(jVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new g(jVar, strArr);
    }

    public static final Pair hotel(String[] data, String[] strings) {
        Intrinsics.echo(data, "data");
        Intrinsics.echo(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.alpha(data));
        g golf = golf(byteArrayInputStream, strings);
        C0181a c0181a = ac.e;
        c0181a.getClass();
        Oe.f fVar = new Oe.f(byteArrayInputStream);
        v vVar = (v) c0181a.alpha(fVar, alpha);
        try {
            if (fVar.foxtrot == 0) {
                Oe.c.bravo(vVar);
                return new Pair(golf, (ac) vVar);
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(vVar);
        }
    }
}
