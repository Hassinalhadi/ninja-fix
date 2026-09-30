package Sc;

import android.app.AlertDialog;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TransferCardListActivity purple;

    public /* synthetic */ c(TransferCardListActivity transferCardListActivity, int i4) {
        this.alpha = i4;
        this.purple = transferCardListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        boolean z2;
        List items;
        int i5;
        List items2;
        int i10 = 0;
        boolean z10 = true;
        TransferCardListActivity transferCardListActivity = this.purple;
        C2492a c2492a = (C2492a) obj;
        switch (this.alpha) {
            case 0:
                int i11 = TransferCardListActivity.f12528O;
                int i12 = c2492a.alpha;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            transferCardListActivity.gray().delta.setRefreshing(true);
                        }
                    } else {
                        transferCardListActivity.gray().delta.setRefreshing(false);
                        DataResponse dataResponse = (DataResponse) c2492a.charlie;
                        if (dataResponse != null) {
                            i4 = dataResponse.getPageCount() - 1;
                        } else {
                            i4 = 0;
                        }
                        int i13 = transferCardListActivity.f12531J;
                        if (i4 == i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        transferCardListActivity.f12532K = z2;
                        p pVar = transferCardListActivity.f12533L;
                        if (i13 > 0) {
                            if (dataResponse != null && (items2 = dataResponse.getItems()) != null) {
                                pVar.alpha(items2);
                            } else {
                                return Unit.INSTANCE;
                            }
                        } else if (dataResponse != null && (items = dataResponse.getItems()) != null) {
                            pVar.bravo(items);
                            LinearLayoutCompat linearLayoutCompat = transferCardListActivity.gray().bravo;
                            List items3 = dataResponse.getItems();
                            if (items3 != null && !items3.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                i5 = 0;
                            } else {
                                i5 = 8;
                            }
                            linearLayoutCompat.setVisibility(i5);
                            RecyclerView recyclerView = transferCardListActivity.gray().charlie;
                            List items4 = dataResponse.getItems();
                            if (items4 == null || items4.isEmpty()) {
                                i10 = 8;
                            }
                            recyclerView.setVisibility(i10);
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    transferCardListActivity.gray().delta.setRefreshing(false);
                }
                return Unit.INSTANCE;
            case 1:
                int i14 = TransferCardListActivity.f12528O;
                int i15 = c2492a.alpha;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            transferCardListActivity.bronze();
                        }
                    } else {
                        transferCardListActivity.tango();
                        transferCardListActivity.f12531J = 0;
                        transferCardListActivity.gold();
                        new AlertDialog.Builder(transferCardListActivity).setTitle(R.string.my_live_transfer_cards).setMessage(R.string.transfer_card_accepted).setPositiveButton(android.R.string.ok, new Gc.e(2, transferCardListActivity)).create().show();
                    }
                } else {
                    transferCardListActivity.tango();
                    String str = c2492a.bravo;
                    if (str == null) {
                        str = transferCardListActivity.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str, "getString(...)");
                    }
                    L9.d.pink(transferCardListActivity, str);
                }
                return Unit.INSTANCE;
            default:
                int i16 = TransferCardListActivity.f12528O;
                int i17 = c2492a.alpha;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            transferCardListActivity.bronze();
                        }
                    } else {
                        transferCardListActivity.tango();
                        transferCardListActivity.f12531J = 0;
                        String string = transferCardListActivity.getString(R.string.transfer_card_rejected);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(transferCardListActivity, string);
                        transferCardListActivity.gold();
                    }
                } else {
                    transferCardListActivity.tango();
                    String str2 = c2492a.bravo;
                    if (str2 == null) {
                        str2 = transferCardListActivity.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str2, "getString(...)");
                    }
                    L9.d.pink(transferCardListActivity, str2);
                }
                return Unit.INSTANCE;
        }
    }
}
