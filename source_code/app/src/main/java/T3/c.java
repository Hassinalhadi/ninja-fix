package T3;

import bv.aw;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.engine.u;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c {
    public static final u charlie = new u(Object.class, Object.class, Object.class, Collections.singletonList(new j(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new Q3.d(0), null)), null);
    public final bv.e alpha = new aw(0);
    public final AtomicReference bravo = new AtomicReference();

    public final void alpha(Class cls, Class cls2, Class cls3, u uVar) {
        synchronized (this.alpha) {
            bv.e eVar = this.alpha;
            Y3.j jVar = new Y3.j(cls, cls2, cls3);
            if (uVar == null) {
                uVar = charlie;
            }
            eVar.put(jVar, uVar);
        }
    }
}
