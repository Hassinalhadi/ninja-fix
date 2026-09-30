package t6;

import java.util.concurrent.ExecutionException;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.Intrinsics;
import s6.J6;
import vf.C3207k;

/* renamed from: t6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3008j {
    public static final Object alpha(com.google.common.util.concurrent.e eVar, Pd.i iVar) {
        try {
            if (eVar.isDone()) {
                return V0.g.golf(eVar);
            }
            C3207k c3207k = new C3207k(1, J6.delta(iVar));
            eVar.foxtrot(new s6.E(7, eVar, c3207k), V0.l.alpha);
            c3207k.victor(new A0.p(19, eVar));
            Object sierra = c3207k.sierra();
            Od.a aVar = Od.a.alpha;
            return sierra;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            Intrinsics.kilo(kotlinNullPointerException, Intrinsics.class.getName());
            throw kotlinNullPointerException;
        }
    }

    public static int bravo(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }
}
