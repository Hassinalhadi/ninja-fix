package T5;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes2.dex */
public final class af extends w {
    public final o bravo;
    public final G6.h charlie;
    public final a delta;

    public af(int i4, o oVar, G6.h hVar, a aVar) {
        super(i4);
        this.charlie = hVar;
        this.bravo = oVar;
        this.delta = aVar;
        if (i4 == 2 && oVar.bravo) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // T5.w
    public final boolean alpha(r rVar) {
        return this.bravo.bravo;
    }

    @Override // T5.w
    public final Feature[] bravo(r rVar) {
        return (Feature[]) this.bravo.echo;
    }

    @Override // T5.w
    public final void charlie(Status status) {
        this.delta.getClass();
        this.charlie.charlie(V5.x.mike(status));
    }

    @Override // T5.w
    public final void delta(RuntimeException runtimeException) {
        this.charlie.charlie(runtimeException);
    }

    @Override // T5.w
    public final void echo(r rVar) {
        G6.h hVar = this.charlie;
        try {
            o oVar = this.bravo;
            ((m) ((o) oVar.delta).delta).accept(rVar.hotel, hVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e4) {
            charlie(w.golf(e4));
        } catch (RuntimeException e5) {
            hVar.charlie(e5);
        }
    }

    @Override // T5.w
    public final void foxtrot(J2.l lVar, boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Map map = (Map) lVar.purple;
        G6.h hVar = this.charlie;
        map.put(hVar, valueOf);
        hVar.alpha.bravo(new J2.e(16, (Object) lVar, (Object) hVar, false));
    }
}
