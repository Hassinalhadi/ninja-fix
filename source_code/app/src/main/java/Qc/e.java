package Qc;

import B9.ab;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import yf.N;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ TicketsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TicketsFragment ticketsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = ticketsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        e eVar = new e(this.purple, cVar);
        eVar.alpha = obj;
        return eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((C2492a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C2492a c2492a = (C2492a) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        List list = null;
        if (c2492a != null) {
            num = new Integer(c2492a.alpha);
        } else {
            num = null;
        }
        TicketsFragment ticketsFragment = this.purple;
        if (num != null && num.intValue() == 2) {
            ab abVar = ticketsFragment.e;
            if (abVar != null) {
                ((SwipeRefreshLayout) abVar.silver).setRefreshing(true);
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        } else if (num != null && num.intValue() == 1) {
            ab abVar2 = ticketsFragment.e;
            if (abVar2 != null) {
                ((SwipeRefreshLayout) abVar2.silver).setRefreshing(false);
                DataResponse dataResponse = (DataResponse) c2492a.charlie;
                if (dataResponse != null) {
                    list = dataResponse.getItems();
                }
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                int i4 = ((k) ((N) ticketsFragment.romeo().charlie.alpha).getValue()).alpha;
                if (list.isEmpty() && i4 == 0) {
                    ticketsFragment.getString(R.string.no_tickets_found);
                    ticketsFragment.sierra();
                } else {
                    Rc.b bVar = ticketsFragment.f12518g;
                    if (i4 == 0) {
                        bVar.bravo(list);
                    } else {
                        bVar.alpha(list);
                    }
                    ticketsFragment.tango();
                }
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        } else if (num != null && num.intValue() == 0) {
            if (c2492a.bravo == null) {
                Intrinsics.delta(ticketsFragment.getString(R.string.error_something_went_wrong), "getString(...)");
            }
            ticketsFragment.sierra();
        } else if (num != null && num.intValue() == 3) {
            ab abVar3 = ticketsFragment.e;
            if (abVar3 != null) {
                ((SwipeRefreshLayout) abVar3.silver).setRefreshing(false);
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        return Unit.INSTANCE;
    }
}
