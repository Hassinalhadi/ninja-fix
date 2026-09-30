package sd;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ac implements Serializable {
    public static final ac red;
    public static final ac silver;
    public static final LinkedHashMap teal;
    public final String alpha;
    public final int purple;

    static {
        int collectionSizeOrDefault;
        ac acVar = new ac("http", 80);
        red = acVar;
        ac acVar2 = new ac("https", 443);
        silver = acVar2;
        List listOf = CollectionsKt.listOf(acVar, acVar2, new ac("ws", 80), new ac("wss", 443), new ac("socks", 1080));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10);
        int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        for (Object obj : listOf) {
            linkedHashMap.put(((ac) obj).alpha, obj);
        }
        teal = linkedHashMap;
    }

    public ac(String name, int i4) {
        Intrinsics.echo(name, "name");
        this.alpha = name;
        this.purple = i4;
        for (int i5 = 0; i5 < name.length(); i5++) {
            char charAt = name.charAt(i5);
            if (Character.toLowerCase(charAt) != charAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ac) {
                ac acVar = (ac) obj;
                if (!Intrinsics.areEqual(this.alpha, acVar.alpha) || this.purple != acVar.purple) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.purple;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.alpha);
        sb2.append(", defaultPort=");
        return Q0.c.quebec(sb2, this.purple, ')');
    }
}
