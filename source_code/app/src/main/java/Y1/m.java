package Y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {
    public final S5.k alpha;

    public m(l lVar) {
        this.alpha = new S5.k(lVar, lVar.purple.purple.charlie);
    }

    public m(Bundle state) {
        Intrinsics.echo(state, "state");
        state.setClassLoader(m.class.getClassLoader());
        this.alpha = new S5.k(state);
    }
}
