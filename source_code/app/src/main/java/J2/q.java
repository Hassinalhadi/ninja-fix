package J2;

import V5.x;
import android.database.Cursor;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.O;
import com.google.android.gms.measurement.internal.U;
import com.google.android.gms.measurement.internal.V;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class q implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ q(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean bool;
        switch (this.alpha) {
            case 0:
                Cursor mike = ((r) this.red).alpha.mike((l2.p) this.purple);
                try {
                    if (mike.moveToFirst()) {
                        boolean z2 = false;
                        if (mike.getInt(0) != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                    } else {
                        bool = Boolean.FALSE;
                    }
                    mike.close();
                    return bool;
                } catch (Throwable th) {
                    mike.close();
                    throw th;
                }
            case 1:
                return ((Y8.c) this.purple).zza((X8.a) this.red);
            case 2:
                O o5 = (O) this.red;
                o5.golf.echo();
                C1450j c1450j = o5.golf.red;
                Z0.cyan(c1450j);
                return c1450j.e0((String) this.purple);
            case 3:
                O o10 = (O) this.red;
                o10.golf.echo();
                return new zzap(o10.golf.purple(((zzr) this.purple).alpha));
            default:
                zzr zzrVar = (zzr) this.purple;
                String str = zzrVar.alpha;
                x.hotel(str);
                Z0 z02 = (Z0) this.red;
                V e = z02.e(str);
                U u4 = U.ANALYTICS_STORAGE;
                if (e.kilo(u4) && V.echo(100, zzrVar.f7709n).kilo(u4)) {
                    return z02.silver(zzrVar).delta();
                }
                z02.crimson().f7636g.alpha("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public void finalize() {
        switch (this.alpha) {
            case 0:
                ((l2.p) this.purple).golf();
                return;
            default:
                super.finalize();
                return;
        }
    }

    public /* synthetic */ q(Y8.c cVar, X8.a aVar) {
        this.alpha = 1;
        this.purple = cVar;
        this.red = aVar;
    }
}
