package L2;

import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.E;
import com.google.android.gms.measurement.internal.G;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class b implements Executor {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                ((c) this.purple).charlie.post(runnable);
                return;
            default:
                E e = ((G) ((C1459n0) this.purple).alpha).f7508c;
                G.foxtrot(e);
                e.g0(runnable);
                return;
        }
    }
}
