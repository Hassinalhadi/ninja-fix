package Wc;

import Jb.ar;
import android.app.AlertDialog;
import com.app.network.network.models.TopUpTerminal;
import delivery.samurai.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class g implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ l purple;

    public /* synthetic */ g(l lVar, int i4) {
        this.alpha = i4;
        this.purple = lVar;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                TopUpTerminal topUpTerminal = (TopUpTerminal) obj;
                boolean z2 = topUpTerminal instanceof TopUpTerminal.SUCCESS;
                l lVar = this.purple;
                if (z2) {
                    lVar.victor().tango();
                    lVar.coral().alpha();
                    lVar.victor().setResult(-1);
                    lVar.victor().finish();
                } else if (topUpTerminal instanceof TopUpTerminal.FAILED) {
                    lVar.victor().tango();
                    lVar.coral().alpha();
                    lVar.juliet();
                    if (!lVar.isAdded()) {
                        return Unit.INSTANCE;
                    }
                    new AlertDialog.Builder(lVar.requireContext()).setTitle(R.string.transaction_failed).setMessage(R.string.payment_failed).setPositiveButton(android.R.string.ok, new ar(2)).create().show();
                } else if (topUpTerminal instanceof TopUpTerminal.DECLINED) {
                    lVar.victor().tango();
                    lVar.coral().alpha();
                } else if (topUpTerminal instanceof TopUpTerminal.TIMEOUT) {
                    lVar.victor().tango();
                    lVar.coral().alpha();
                    lVar.juliet();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            default:
                l lVar2 = this.purple;
                lVar2.victor().tango();
                lVar2.coral().alpha();
                lVar2.black((String) obj);
                return Unit.INSTANCE;
        }
    }
}
