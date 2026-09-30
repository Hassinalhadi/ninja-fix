package Sc;

import Dc.t;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.TransferCard;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import delivery.samurai.android.ui.transfer.TransferCardViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TransferCardListActivity purple;

    public /* synthetic */ b(TransferCardListActivity transferCardListActivity, int i4) {
        this.alpha = i4;
        this.purple = transferCardListActivity;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        TransferCardListActivity transferCardListActivity = this.purple;
        int i4 = this.alpha;
        TransferCard card = (TransferCard) obj;
        ((Integer) obj2).getClass();
        int i5 = TransferCardListActivity.f12528O;
        switch (i4) {
            case 0:
                Intrinsics.echo(card, "card");
                TransferCardViewModel transferCardViewModel = (TransferCardViewModel) transferCardListActivity.f12530I.getValue();
                Integer id2 = card.getId();
                ?? auVar = new au(new C2492a(2, "loading"));
                BaseViewModel.launchApi$default(transferCardViewModel, null, new j(transferCardViewModel, id2, auVar, null), 1, null);
                auVar.observe(transferCardListActivity, new t(9, new c(transferCardListActivity, 1)));
                return Unit.INSTANCE;
            default:
                Intrinsics.echo(card, "card");
                TransferCardViewModel transferCardViewModel2 = (TransferCardViewModel) transferCardListActivity.f12530I.getValue();
                Integer id3 = card.getId();
                ?? auVar2 = new au(new C2492a(2, "loading"));
                BaseViewModel.launchApi$default(transferCardViewModel2, null, new l(transferCardViewModel2, id3, auVar2, null), 1, null);
                auVar2.observe(transferCardListActivity, new t(9, new c(transferCardListActivity, 2)));
                return Unit.INSTANCE;
        }
    }
}
