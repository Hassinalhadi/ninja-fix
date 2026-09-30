package r2;

import java.util.Collections;
import java.util.HashMap;
import pe.AbstractC2327c;
import s1.C2576i;
import s7.InterfaceC2836c;
import z7.aa;
import z7.z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2488b {
    public static final EnumC2488b purple;
    public static final /* synthetic */ EnumC2488b[] red;
    public final C2576i alpha;

    static {
        z oscar = aa.oscar();
        oscar.charlie();
        aa.mike((aa) oscar.purple);
        aa aaVar = (aa) oscar.alpha();
        t7.d[] dVarArr = {new t7.d(9, InterfaceC2836c.class)};
        HashMap hashMap = new HashMap();
        t7.d dVar = dVarArr[0];
        boolean containsKey = hashMap.containsKey(dVar.alpha);
        Class cls = dVar.alpha;
        if (!containsKey) {
            hashMap.put(cls, dVar);
            Class cls2 = dVarArr[0].alpha;
            Collections.unmodifiableMap(hashMap);
            EnumC2488b enumC2488b = new EnumC2488b(C2576i.bravo("type.googleapis.com/google.crypto.tink.AesSivKey", aaVar.bravo()));
            purple = enumC2488b;
            red = new EnumC2488b[]{enumC2488b};
            return;
        }
        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    public EnumC2488b(C2576i c2576i) {
        this.alpha = c2576i;
    }

    public static EnumC2488b valueOf(String str) {
        return (EnumC2488b) Enum.valueOf(EnumC2488b.class, str);
    }

    public static EnumC2488b[] values() {
        return (EnumC2488b[]) red.clone();
    }
}
