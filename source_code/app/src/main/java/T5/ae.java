package T5;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class ae extends w {
    public final G6.h bravo;
    public final /* synthetic */ int charlie;
    public final Object delta;

    public ae(int i4, G6.h hVar) {
        super(i4);
        this.bravo = hVar;
    }

    private final /* bridge */ /* synthetic */ void india(J2.l lVar, boolean z2) {
    }

    private final /* bridge */ /* synthetic */ void juliet(J2.l lVar, boolean z2) {
    }

    @Override // T5.w
    public final boolean alpha(r rVar) {
        switch (this.charlie) {
            case 0:
                return ((ab) this.delta).alpha.bravo;
            default:
                ab abVar = (ab) rVar.lima.get((i) this.delta);
                if (abVar != null && abVar.alpha.bravo) {
                    return true;
                }
                return false;
        }
    }

    @Override // T5.w
    public final Feature[] bravo(r rVar) {
        switch (this.charlie) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override // T5.w
    public final void charlie(Status status) {
        this.bravo.charlie(new ApiException(status));
    }

    @Override // T5.w
    public final void delta(RuntimeException runtimeException) {
        this.bravo.charlie(runtimeException);
    }

    @Override // T5.w
    public final void echo(r rVar) {
        try {
            hotel(rVar);
        } catch (DeadObjectException e) {
            charlie(w.golf(e));
            throw e;
        } catch (RemoteException e4) {
            charlie(w.golf(e4));
        } catch (RuntimeException e5) {
            this.bravo.charlie(e5);
        }
    }

    @Override // T5.w
    public final /* bridge */ /* synthetic */ void foxtrot(J2.l lVar, boolean z2) {
        int i4 = this.charlie;
    }

    public final void hotel(r rVar) {
        switch (this.charlie) {
            case 0:
                o oVar = ((ab) this.delta).alpha;
                ((l) oVar.echo).alpha.accept(rVar.hotel, this.bravo);
                i iVar = (i) ((K1.f) ((ab) this.delta).alpha.delta).bravo;
                if (iVar != null) {
                    rVar.lima.put(iVar, (ab) this.delta);
                    return;
                }
                return;
            default:
                ab abVar = (ab) rVar.lima.remove((i) this.delta);
                G6.h hVar = this.bravo;
                if (abVar != null) {
                    ((l) abVar.bravo.red).bravo.accept(rVar.hotel, hVar);
                    ((K1.f) abVar.alpha.delta).alpha();
                    return;
                } else {
                    hVar.delta(Boolean.FALSE);
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ae(i iVar, G6.h hVar) {
        this(4, hVar);
        this.charlie = 1;
        this.delta = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ae(ab abVar, G6.h hVar) {
        this(3, hVar);
        this.charlie = 0;
        this.delta = abVar;
    }
}
