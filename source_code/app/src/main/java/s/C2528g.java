package s;

import A2.s;
import S.x;
import android.view.ActionMode;
import android.view.View;
import b.Q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import u.InterfaceC3132f;
import u.InterfaceC3133g;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2528g implements InterfaceC3133g {
    public final View alpha;
    public final Function1 bravo;
    public final Function0 charlie;
    public final Q delta = new Q();
    public final x echo = new x(new C2523b(this, 0));
    public final C2523b foxtrot = new C2523b(this, 1);
    public final C2523b golf = new C2523b(this, 2);
    public ActionMode hotel;
    public s india;

    public C2528g(View view, Function1 function1, Function0 function0) {
        this.alpha = view;
        this.bravo = function1;
        this.charlie = function0;
    }

    @Override // u.InterfaceC3133g
    public final Object alpha(InterfaceC3132f interfaceC3132f, Pd.i iVar) {
        Object bravo = Q.bravo(this.delta, new C2527f(this, interfaceC3132f, null), iVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }
}
