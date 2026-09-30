package v7;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import pe.AbstractC2327c;
import s7.InterfaceC2836c;
import s7.j;
import t7.d;
import t7.f;
import z7.H;
import z7.y;

/* renamed from: v7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3173a {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, s7.h] */
    static {
        d[] dVarArr = {new d(9, InterfaceC2836c.class)};
        HashMap hashMap = new HashMap();
        d dVar = dVarArr[0];
        boolean containsKey = hashMap.containsKey(dVar.alpha);
        Class cls = dVar.alpha;
        if (!containsKey) {
            hashMap.put(cls, dVar);
            Class cls2 = dVarArr[0].alpha;
            Collections.unmodifiableMap(hashMap);
            int i4 = H.CONFIG_NAME_FIELD_NUMBER;
            try {
                j.echo(new f(y.class, new d[]{new d(9, InterfaceC2836c.class)}, 8), true);
                j.foxtrot(new Object());
                return;
            } catch (GeneralSecurityException e) {
                throw new ExceptionInInitializerError(e);
            }
        }
        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }
}
