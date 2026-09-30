package x7;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import pe.AbstractC2327c;
import s7.e;
import s7.j;
import t7.f;
import z7.C3470b;
import z7.H;

/* loaded from: classes2.dex */
public abstract class b {
    static {
        t7.d[] dVarArr = {new t7.d(11, e.class)};
        HashMap hashMap = new HashMap();
        t7.d dVar = dVarArr[0];
        boolean containsKey = hashMap.containsKey(dVar.alpha);
        Class cls = dVar.alpha;
        if (!containsKey) {
            hashMap.put(cls, dVar);
            Class cls2 = dVarArr[0].alpha;
            Collections.unmodifiableMap(hashMap);
            int i4 = H.CONFIG_NAME_FIELD_NUMBER;
            try {
                alpha();
                return;
            } catch (GeneralSecurityException e) {
                throw new ExceptionInInitializerError(e);
            }
        }
        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, s7.h] */
    public static void alpha() {
        j.echo(new f(), true);
        j.echo(new f(C3470b.class, new t7.d[]{new t7.d(10, e.class)}, 9), true);
        j.foxtrot(new Object());
    }
}
