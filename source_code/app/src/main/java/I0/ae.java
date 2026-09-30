package I0;

import android.view.Choreographer;
import com.incognia.internal.Q4n;
import com.incognia.internal.pl2;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Executor {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ae(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                ((Choreographer) this.purple).postFrameCallback(new af(runnable, 0));
                return;
            default:
                Q4n.b((pl2) this.purple, runnable);
                return;
        }
    }
}
