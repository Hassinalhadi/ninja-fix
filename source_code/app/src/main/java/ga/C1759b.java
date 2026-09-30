package ga;

import android.graphics.Bitmap;
import androidx.compose.runtime.t0;
import delivery.samurai.android.ui.about.AccountQrCodeActivity;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: ga.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1759b extends Pd.i implements Xd.l {
    public AccountQrCodeActivity alpha;
    public int purple;
    public final /* synthetic */ AccountQrCodeActivity red;
    public final /* synthetic */ String silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759b(AccountQrCodeActivity accountQrCodeActivity, String str, Nd.c cVar) {
        super(2, cVar);
        this.red = accountQrCodeActivity;
        this.silver = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1759b(this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1759b) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        AccountQrCodeActivity accountQrCodeActivity;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                accountQrCodeActivity = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            Cf.e eVar = vf.ao.alpha;
            C1758a c1758a = new C1758a(this.silver, null);
            AccountQrCodeActivity accountQrCodeActivity2 = this.red;
            this.alpha = accountQrCodeActivity2;
            this.purple = 1;
            obj = vf.ad.blue(eVar, c1758a, this);
            if (obj == aVar) {
                return aVar;
            }
            accountQrCodeActivity = accountQrCodeActivity2;
        }
        ((t0) accountQrCodeActivity.f12108H).setValue((Bitmap) obj);
        return Unit.INSTANCE;
    }
}
