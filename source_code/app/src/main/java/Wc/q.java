package Wc;

import android.content.Context;
import androidx.cardview.widget.CardView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ WithDrawHistoryFragment purple;

    public /* synthetic */ q(WithDrawHistoryFragment withDrawHistoryFragment, int i4) {
        this.alpha = i4;
        this.purple = withDrawHistoryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context;
        int i4;
        boolean z2;
        Context context2;
        C2492a c2492a = (C2492a) obj;
        switch (this.alpha) {
            case 0:
                int i5 = c2492a.alpha;
                WithDrawHistoryFragment withDrawHistoryFragment = this.purple;
                int i10 = 0;
                if (i5 != 0) {
                    boolean z10 = true;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ((SwipeRefreshLayout) withDrawHistoryFragment.romeo().teal).setRefreshing(true);
                        }
                    } else {
                        ((SwipeRefreshLayout) withDrawHistoryFragment.romeo().teal).setRefreshing(false);
                        DataResponse dataResponse = (DataResponse) c2492a.charlie;
                        if (dataResponse != null) {
                            i4 = dataResponse.getPageCount() - 1;
                        } else {
                            i4 = 0;
                        }
                        int i11 = withDrawHistoryFragment.f12543h;
                        if (i4 == i11) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        withDrawHistoryFragment.f12544i = z2;
                        Hc.b bVar = withDrawHistoryFragment.f12542g;
                        List list = null;
                        if (i11 > 0) {
                            if (dataResponse != null) {
                                list = dataResponse.getItems();
                            }
                            bVar.alpha(list);
                        } else {
                            if (dataResponse != null) {
                                list = dataResponse.getItems();
                            }
                            CardView cardView = (CardView) withDrawHistoryFragment.romeo().silver;
                            if (list != null) {
                                z10 = list.isEmpty();
                            }
                            if (!z10) {
                                i10 = 8;
                            }
                            cardView.setVisibility(i10);
                            bVar.bravo(list);
                        }
                    }
                } else {
                    ((SwipeRefreshLayout) withDrawHistoryFragment.romeo().teal).setRefreshing(false);
                    String str = c2492a.bravo;
                    if (str != null && (context = withDrawHistoryFragment.getContext()) != null) {
                        L9.d.pink(context, str);
                    }
                }
                return Unit.INSTANCE;
            default:
                int i12 = c2492a.alpha;
                WithDrawHistoryFragment withDrawHistoryFragment2 = this.purple;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            ((SwipeRefreshLayout) withDrawHistoryFragment2.romeo().teal).setRefreshing(true);
                        }
                    } else {
                        ((SwipeRefreshLayout) withDrawHistoryFragment2.romeo().teal).setRefreshing(false);
                        withDrawHistoryFragment2.quebec();
                    }
                } else {
                    ((SwipeRefreshLayout) withDrawHistoryFragment2.romeo().teal).setRefreshing(false);
                    String str2 = c2492a.bravo;
                    if (str2 != null && (context2 = withDrawHistoryFragment2.getContext()) != null) {
                        L9.d.pink(context2, str2);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
