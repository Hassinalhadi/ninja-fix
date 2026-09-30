package je;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import ve.AbstractC3192d;

/* renamed from: je.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1972k extends V {
    public final Field purple;

    public C1972k(Field field) {
        Intrinsics.echo(field, "field");
        this.purple = field;
    }

    @Override // je.V
    public final String foxtrot() {
        StringBuilder sb2 = new StringBuilder();
        Field field = this.purple;
        String name = field.getName();
        Intrinsics.delta(name, "field.name");
        sb2.append(ye.aa.alpha(name));
        sb2.append("()");
        Class<?> type = field.getType();
        Intrinsics.delta(type, "field.type");
        sb2.append(AbstractC3192d.bravo(type));
        return sb2.toString();
    }
}
