package Y1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class al extends ap {
    public final Class sierra;

    public al(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.sierra = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // Y1.ap, Y1.aq
    public final String bravo() {
        return this.sierra.getName();
    }

    @Override // Y1.ap
    /* renamed from: hotel, reason: merged with bridge method [inline-methods] */
    public final Enum delta(String value) {
        Object obj;
        Intrinsics.echo(value, "value");
        Class cls = this.sierra;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.delta(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                obj = enumConstants[i4];
                if (kotlin.text.r.hotel(((Enum) obj).name(), value, true)) {
                    break;
                }
                i4++;
            } else {
                obj = null;
                break;
            }
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder victor = Q0.c.victor("Enum value ", value, " not found for type ");
        victor.append(cls.getName());
        victor.append('.');
        throw new IllegalArgumentException(victor.toString());
    }
}
