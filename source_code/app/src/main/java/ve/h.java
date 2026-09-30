package ve;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends f implements Ee.a {
    public final Object[] bravo;

    public h(Ne.f fVar, Object[] objArr) {
        super(fVar);
        this.bravo = objArr;
    }

    public final ArrayList alpha() {
        f xVar;
        Object[] objArr = this.bravo;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object value : objArr) {
            Intrinsics.checkNotNull(value);
            Intrinsics.echo(value, "value");
            Class<?> cls = value.getClass();
            List list = AbstractC3192d.alpha;
            if (Enum.class.isAssignableFrom(cls)) {
                xVar = new v(null, (Enum) value);
            } else if (value instanceof Annotation) {
                xVar = new g(null, (Annotation) value);
            } else if (value instanceof Object[]) {
                xVar = new h(null, (Object[]) value);
            } else if (value instanceof Class) {
                xVar = new r(null, (Class) value);
            } else {
                xVar = new x(null, value);
            }
            arrayList.add(xVar);
        }
        return arrayList;
    }
}
