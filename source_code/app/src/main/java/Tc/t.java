package Tc;

import com.app.network.network.models.WalletSettlementResponse;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ao;
import wf.C3268e;

/* loaded from: classes2.dex */
public final class t extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ WalletViewModel purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WalletViewModel walletViewModel, String str, String str2, Nd.c cVar) {
        super(2, cVar);
        this.purple = walletViewModel;
        this.red = str;
        this.silver = str2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new t(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (vf.ad.blue(r11, r2, r10) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (vf.ad.blue(r0, r2, r10) != r1) goto L24;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        WalletViewModel walletViewModel = this.purple;
        try {
        } catch (Exception e) {
            Throwable th = e;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            Cf.e eVar = ao.alpha;
            C3268e c3268e = Af.n.alpha;
            s sVar = new s(walletViewModel, th, null);
            this.alpha = 2;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            WalletSettlementResponse blockingGet = walletViewModel.alpha.lime().blockingGet();
            Cf.e eVar2 = ao.alpha;
            C3268e c3268e2 = Af.n.alpha;
            r rVar = new r(walletViewModel, blockingGet, this.red, this.silver, null);
            this.alpha = 1;
        }
        return Unit.INSTANCE;
    }
}
