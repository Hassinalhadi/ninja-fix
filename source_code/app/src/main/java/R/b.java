package R;

import B2.q;
import J2.t;
import S.p;
import androidx.compose.runtime.InterfaceC0563a0;
import androidx.compose.runtime.as;

/* loaded from: classes3.dex */
public final class b implements InterfaceC0563a0 {
    public k alpha;
    public g purple;
    public String red;
    public Object silver;
    public Object[] teal;
    public f white;
    public final q yellow = new q(18, this);

    public b(k kVar, g gVar, String str, Object obj, Object[] objArr) {
        this.alpha = kVar;
        this.purple = gVar;
        this.red = str;
        this.silver = obj;
        this.teal = objArr;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
        f fVar = this.white;
        if (fVar != null) {
            ((t) fVar).azure();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        f fVar = this.white;
        if (fVar != null) {
            ((t) fVar).azure();
        }
    }

    public final void charlie() {
        String alpha;
        g gVar = this.purple;
        if (this.white == null) {
            if (gVar != null) {
                q qVar = this.yellow;
                Object invoke = qVar.invoke();
                if (invoke != null && !gVar.bravo(invoke)) {
                    if (invoke instanceof p) {
                        p pVar = (p) invoke;
                        if (pVar.foxtrot() != as.red && pVar.foxtrot() != as.white && pVar.foxtrot() != as.silver) {
                            alpha = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            alpha = "MutableState containing " + pVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        alpha = l.alpha(invoke);
                    }
                    throw new IllegalArgumentException(alpha);
                }
                this.white = gVar.echo(this.red, qVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.white + ") is not null").toString());
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
        charlie();
    }
}
