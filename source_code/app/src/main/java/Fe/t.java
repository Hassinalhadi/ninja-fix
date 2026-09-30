package Fe;

import ge.InterfaceC1772d;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t {
    public final LinkedHashMap alpha;

    public t(int i4) {
        switch (i4) {
            case 1:
                this.alpha = new LinkedHashMap();
                return;
            case 2:
                this.alpha = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.alpha = new LinkedHashMap();
                return;
        }
    }

    public void alpha(InterfaceC1772d clazz, Function1 initializer) {
        Intrinsics.echo(clazz, "clazz");
        Intrinsics.echo(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.alpha;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new T1.f(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.juliet() + '.').toString());
    }

    public T1.d bravo() {
        Collection initializers = this.alpha.values();
        Intrinsics.echo(initializers, "initializers");
        T1.f[] fVarArr = (T1.f[]) initializers.toArray(new T1.f[0]);
        return new T1.d((T1.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
