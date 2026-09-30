package ve;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class ab extends ad implements Ee.d {
    public final Class alpha;
    public final List bravo = CollectionsKt.emptyList();

    public ab(Class cls) {
        this.alpha = cls;
    }

    @Override // ve.ad
    public final Type bravo() {
        return this.alpha;
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        return this.bravo;
    }
}
