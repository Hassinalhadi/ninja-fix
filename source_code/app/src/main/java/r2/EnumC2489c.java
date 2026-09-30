package r2;

import java.util.Collections;
import java.util.HashMap;
import pe.AbstractC2327c;
import s1.C2576i;
import s7.InterfaceC2834a;
import z7.s;
import z7.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2489c {
    public static final EnumC2489c purple;
    public static final /* synthetic */ EnumC2489c[] red;
    public final C2576i alpha;

    static {
        s oscar = t.oscar();
        oscar.charlie();
        t.mike((t) oscar.purple);
        t tVar = (t) oscar.alpha();
        t7.d[] dVarArr = {new t7.d(3, InterfaceC2834a.class)};
        HashMap hashMap = new HashMap();
        t7.d dVar = dVarArr[0];
        boolean containsKey = hashMap.containsKey(dVar.alpha);
        Class cls = dVar.alpha;
        if (!containsKey) {
            hashMap.put(cls, dVar);
            Class cls2 = dVarArr[0].alpha;
            Collections.unmodifiableMap(hashMap);
            EnumC2489c enumC2489c = new EnumC2489c(C2576i.bravo("type.googleapis.com/google.crypto.tink.AesGcmKey", tVar.bravo()));
            purple = enumC2489c;
            red = new EnumC2489c[]{enumC2489c};
            return;
        }
        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    public EnumC2489c(C2576i c2576i) {
        this.alpha = c2576i;
    }

    public static EnumC2489c valueOf(String str) {
        return (EnumC2489c) Enum.valueOf(EnumC2489c.class, str);
    }

    public static EnumC2489c[] values() {
        return (EnumC2489c[]) red.clone();
    }
}
