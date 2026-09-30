package R3;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class c implements b {
    public final Context alpha;
    public final com.bumptech.glide.l purple;

    public c(Context context, com.bumptech.glide.l lVar) {
        this.alpha = context.getApplicationContext();
        this.purple = lVar;
    }

    @Override // R3.i
    public final void alpha() {
        s delta = s.delta(this.alpha);
        com.bumptech.glide.l lVar = this.purple;
        synchronized (delta) {
            ((HashSet) delta.silver).remove(lVar);
            if (delta.purple && ((HashSet) delta.silver).isEmpty()) {
                ((o) delta.red).unregister();
                delta.purple = false;
            }
        }
    }

    @Override // R3.i
    public final void bravo() {
    }

    @Override // R3.i
    public final void charlie() {
        s delta = s.delta(this.alpha);
        com.bumptech.glide.l lVar = this.purple;
        synchronized (delta) {
            ((HashSet) delta.silver).add(lVar);
            if (!delta.purple && !((HashSet) delta.silver).isEmpty()) {
                delta.purple = ((o) delta.red).register();
            }
        }
    }
}
