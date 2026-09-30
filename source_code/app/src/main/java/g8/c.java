package g8;

import G6.q;
import android.content.Context;
import i8.InterfaceC1904b;
import java.util.Set;
import java.util.concurrent.Executor;
import s6.V4;
import s6.V6;

/* loaded from: classes2.dex */
public final class c implements e, f {
    public final B7.c alpha;
    public final Context bravo;
    public final InterfaceC1904b charlie;
    public final Set delta;
    public final Executor echo;

    public c(Context context, String str, Set set, InterfaceC1904b interfaceC1904b, Executor executor) {
        this.alpha = new B7.c(context, str);
        this.delta = set;
        this.echo = executor;
        this.charlie = interfaceC1904b;
        this.bravo = context;
    }

    public final synchronized int alpha() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.alpha.get();
        if (gVar.india(currentTimeMillis)) {
            gVar.golf();
            return 3;
        }
        return 1;
    }

    public final q bravo() {
        if (!V6.alpha(this.bravo)) {
            return V4.echo("");
        }
        return V4.charlie(this.echo, new b(this, 0));
    }

    public final void charlie() {
        if (this.delta.size() <= 0) {
            V4.echo(null);
        } else if (!V6.alpha(this.bravo)) {
            V4.echo(null);
        } else {
            V4.charlie(this.echo, new b(this, 1));
        }
    }
}
