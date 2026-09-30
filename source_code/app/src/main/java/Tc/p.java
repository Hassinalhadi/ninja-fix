package Tc;

import com.app.network.network.models.CaptainClaimUnsettled;
import com.app.network.network.models.Transaction;
import com.app.network.network.models.Wallet;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import t3.InterfaceC2957b;
import vf.ab;
import vf.ao;
import wf.C3268e;

/* loaded from: classes2.dex */
public final class p extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ WalletViewModel purple;
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(WalletViewModel walletViewModel, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = walletViewModel;
        this.red = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new p(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (vf.ad.blue(r0, r9, r17) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (vf.ad.blue(r6, r8, r17) != r2) goto L38;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Float f5;
        Float f10;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        int i5 = this.red;
        WalletViewModel walletViewModel = this.purple;
        try {
        } catch (Exception e) {
            e = e;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            Cf.e eVar = ao.alpha;
            C3268e c3268e = Af.n.alpha;
            o oVar = new o(walletViewModel, i5, e, null);
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
            InterfaceC2957b interfaceC2957b = walletViewModel.alpha;
            InterfaceC2957b interfaceC2957b2 = walletViewModel.alpha;
            Wallet blockingGet = interfaceC2957b.echo().blockingGet();
            DataResponse<Transaction> blockingGet2 = interfaceC2957b2.magenta(i5).blockingGet();
            if (blockingGet2.getPageCount() - 1 > i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                CaptainClaimUnsettled blockingGet3 = interfaceC2957b2.juliet().blockingGet();
                if (blockingGet3 != null) {
                    f10 = blockingGet3.getAmount();
                } else {
                    f10 = null;
                }
                f5 = f10;
            } catch (Exception unused) {
                f5 = null;
            }
            Cf.e eVar2 = ao.alpha;
            C3268e c3268e2 = Af.n.alpha;
            n nVar = new n(this.red, this.purple, blockingGet2, blockingGet, z2, f5, null);
            this.alpha = 1;
        }
        return Unit.INSTANCE;
    }
}
