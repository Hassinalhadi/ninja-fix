package R;

import B2.q;
import android.os.Bundle;
import androidx.lifecycle.ac;
import androidx.lifecycle.an;
import java.util.Map;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import o2.C2194d;
import o2.C2195e;
import o2.InterfaceC2196f;
import q2.C2406a;

/* loaded from: classes3.dex */
public final class j implements g, InterfaceC2196f {
    public final /* synthetic */ h alpha;
    public final C2195e purple;
    public final an red;
    public final C2194d silver;

    public j(h hVar) {
        Bundle bundle;
        this.alpha = hVar;
        C2195e c2195e = new C2195e(new C2406a(this, new n(8, this)));
        this.purple = c2195e;
        this.red = new an(this, false);
        this.silver = c2195e.bravo;
        Object delta = hVar.delta("androidx.savedstate.SavedStateRegistry");
        if (delta instanceof Bundle) {
            bundle = (Bundle) delta;
        } else {
            bundle = null;
        }
        c2195e.bravo(bundle);
        hVar.echo("androidx.savedstate.SavedStateRegistry", new q(19, this));
    }

    @Override // R.g
    public final boolean bravo(Object obj) {
        return this.alpha.bravo(obj);
    }

    @Override // R.g
    public final Map charlie() {
        return this.alpha.charlie();
    }

    @Override // R.g
    public final Object delta(String str) {
        return this.alpha.delta(str);
    }

    @Override // R.g
    public final f echo(String str, Function0 function0) {
        return this.alpha.echo(str, function0);
    }

    @Override // androidx.lifecycle.al
    public final ac getLifecycle() {
        return this.red;
    }

    @Override // o2.InterfaceC2196f
    public final C2194d getSavedStateRegistry() {
        return this.silver;
    }
}
