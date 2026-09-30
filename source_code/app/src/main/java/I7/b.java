package I7;

import B2.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s6.F5;

/* loaded from: classes2.dex */
public final class b {
    public final String alpha;
    public final Set bravo;
    public final Set charlie;
    public final int delta;
    public final int echo;
    public final e foxtrot;
    public final Set golf;

    public b(String str, Set set, Set set2, int i4, int i5, e eVar, Set set3) {
        this.alpha = str;
        this.bravo = Collections.unmodifiableSet(set);
        this.charlie = Collections.unmodifiableSet(set2);
        this.delta = i4;
        this.echo = i5;
        this.foxtrot = eVar;
        this.golf = Collections.unmodifiableSet(set3);
    }

    public static a alpha(p pVar) {
        return new a(pVar, new p[0]);
    }

    public static a bravo(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b charlie(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.alpha(cls));
        for (Class cls2 : clsArr) {
            F5.bravo(cls2, "Null interface");
            hashSet.add(p.alpha(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s(7, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.bravo.toArray()) + ">{" + this.delta + ", type=" + this.echo + ", deps=" + Arrays.toString(this.charlie.toArray()) + "}";
    }
}
