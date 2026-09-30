package E5;

import android.content.Context;
import id.C1915c;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class s {
    public static volatile k echo;
    public final N5.a alpha;
    public final N5.a bravo;
    public final J5.c charlie;
    public final K5.i delta;

    public s(N5.a aVar, N5.a aVar2, J5.c cVar, K5.i iVar, K5.k kVar) {
        this.alpha = aVar;
        this.bravo = aVar2;
        this.charlie = cVar;
        this.delta = iVar;
        kVar.getClass();
        kVar.alpha.execute(new A2.q(11, kVar));
    }

    public static s alpha() {
        k kVar = echo;
        if (kVar != null) {
            return (s) kVar.white.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void bravo(Context context) {
        if (echo == null) {
            synchronized (s.class) {
                try {
                    if (echo == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.purple = context;
                        echo = jVar.foxtrot();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q charlie(C5.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar != null) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(C5.a.delta);
        } else {
            singleton = Collections.singleton(new B5.c("proto"));
        }
        C1915c alpha = i.alpha();
        aVar.getClass();
        alpha.purple = "cct";
        String str = aVar.alpha;
        String str2 = aVar.bravo;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = av.q.foxtrot("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        alpha.red = bytes;
        return new q(singleton, alpha.hotel(), this);
    }
}
