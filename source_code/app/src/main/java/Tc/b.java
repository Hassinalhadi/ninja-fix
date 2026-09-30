package Tc;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.ui.wallet.WalletFragment;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.Unit;
import s6.I0;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ WalletFragment purple;

    public /* synthetic */ b(WalletFragment walletFragment, int i4) {
        this.alpha = i4;
        this.purple = walletFragment;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    I0.alpha(P.e.echo(1130934748, new b(this.purple, 1), c0585q), c0585q, 48);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    Vc.r.alpha((WalletViewModel) this.purple.e.getValue(), null, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
