package O7;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class m implements Callable {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ n purple;

    public m(n nVar, long j5) {
        this.purple = nVar;
        this.alpha = j5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.alpha);
        this.purple.kilo.juliet(bundle);
        return null;
    }
}
