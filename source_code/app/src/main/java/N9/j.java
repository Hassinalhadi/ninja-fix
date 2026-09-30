package N9;

import F8.r;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.au;
import yf.az;

/* loaded from: classes2.dex */
public final class j implements q3.e {
    public final E8.b alpha;
    public final az bravo;

    public j() {
        E8.b echo = E8.b.echo();
        Intrinsics.delta(echo, "getInstance(...)");
        this.alpha = echo;
        az bravo = AbstractC3428A.bravo(0, 1, null, 5);
        this.bravo = bravo;
        bravo.alpha(Unit.INSTANCE);
    }

    @Override // q3.e
    public final void alpha(String userId, Ld.g gVar) {
        Intrinsics.echo(userId, "userId");
    }

    @Override // q3.e
    public final void bravo() {
    }

    @Override // q3.e
    public final Boolean charlie(String str) {
        E8.e golf = golf(str);
        if (golf != null) {
            return Boolean.valueOf(((r) golf).alpha());
        }
        return null;
    }

    @Override // q3.e
    public final Long delta(String str) {
        E8.e golf = golf(str);
        if (golf != null) {
            return Long.valueOf(((r) golf).charlie());
        }
        return null;
    }

    @Override // q3.e
    public final String echo(String str) {
        E8.e golf = golf(str);
        if (golf != null) {
            return ((r) golf).delta();
        }
        return null;
    }

    @Override // q3.e
    public final InterfaceC3439i foxtrot() {
        return new au(this.bravo);
    }

    public final E8.e golf(String str) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(this.alpha.hotel.echo(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        E8.e eVar = (E8.e) m206constructorimpl;
        if (eVar == null || ((r) eVar).bravo == 0) {
            return null;
        }
        return eVar;
    }
}
