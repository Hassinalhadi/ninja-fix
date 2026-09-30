package va;

import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ NafathVerificationActivity red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(NafathVerificationActivity nafathVerificationActivity, Nd.c cVar) {
        super(2, cVar);
        this.red = nafathVerificationActivity;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        k kVar = new k(this.red, cVar);
        kVar.purple = obj;
        return kVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((k) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ab abVar = (ab) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        NafathVerificationActivity nafathVerificationActivity = this.red;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                throw new KotlinNothingValueException();
            }
            ResultKt.alpha(obj);
            int i5 = NafathVerificationActivity.f12165N;
            nafathVerificationActivity.gray().startNafathPolling(nafathVerificationActivity.f12168J, 5000L, 90000L);
            ad.zulu(abVar, null, null, new g(nafathVerificationActivity, null), 3);
            ad.zulu(abVar, null, null, new i(nafathVerificationActivity, null), 3);
            ad.zulu(abVar, null, null, new j(nafathVerificationActivity, null), 3);
            this.purple = null;
            this.alpha = 1;
            ad.india(this);
            return aVar;
        } catch (Throwable th) {
            int i10 = NafathVerificationActivity.f12165N;
            nafathVerificationActivity.gray().stopNafathPolling();
            throw th;
        }
    }
}
