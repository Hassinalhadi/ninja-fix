package kf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.aq;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;

/* loaded from: classes2.dex */
public final class c extends aq {
    @Override // kotlin.reflect.jvm.internal.impl.types.aq
    public final as golf(ap key) {
        Re.b bVar;
        Intrinsics.echo(key, "key");
        if (key instanceof Re.b) {
            bVar = (Re.b) key;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        if (bVar.alpha().charlie()) {
            return new at(3, bVar.alpha().bravo());
        }
        return bVar.alpha();
    }
}
