package C3;

import V5.k;
import com.google.android.gms.internal.measurement.C1315f1;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.O;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.au;
import com.google.android.gms.measurement.internal.zzbh;
import java.util.concurrent.Callable;
import r6.q;
import s6.P7;
import t6.h4;

/* loaded from: classes3.dex */
public final class b implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final Object alpha() {
        synchronized (((i9.f) this.purple)) {
            try {
                i9.f fVar = (i9.f) this.purple;
                if (fVar.f12770b != null) {
                    fVar.gray();
                    if (((i9.f) this.purple).juliet()) {
                        ((i9.f) this.purple).beige();
                        ((i9.f) this.purple).f12772d = 0;
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                synchronized (((f) this.purple)) {
                    try {
                        f fVar = (f) this.purple;
                        if (fVar.f785b != null) {
                            fVar.green();
                            if (((f) this.purple).quebec()) {
                                ((f) this.purple).crimson();
                                ((f) this.purple).f787d = 0;
                            }
                            return null;
                        }
                        return null;
                    } finally {
                    }
                }
            case 1:
                ((Runnable) this.purple).run();
                return null;
            case 2:
                return new C1315f1(((A) this.purple).f7499d);
            case 3:
                O o5 = (O) this.purple;
                o5.golf.echo();
                au auVar = o5.golf.f7538a;
                Z0.cyan(auVar);
                auVar.W();
                throw new IllegalStateException("Unexpected call on client side");
            case 4:
                return alpha();
            case 5:
                q qVar = (q) this.purple;
                qVar.getClass();
                return k.charlie.alpha(qVar.alpha);
            case 6:
                P7 p72 = (P7) this.purple;
                p72.getClass();
                return k.charlie.alpha(p72.golf);
            default:
                h4 h4Var = (h4) this.purple;
                h4Var.getClass();
                return k.charlie.alpha(h4Var.golf);
        }
    }

    public b(O o5, zzbh zzbhVar, String str) {
        this.alpha = 3;
        this.purple = o5;
    }
}
