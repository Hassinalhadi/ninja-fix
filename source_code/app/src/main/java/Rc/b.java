package Rc;

import P.d;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.tickets.TicketResponse;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import kotlin.jvm.internal.Intrinsics;
import t0.A0;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class b extends AbstractC3311e {
    public final /* synthetic */ int charlie;
    public final TicketsFragment delta;

    public /* synthetic */ b(TicketsFragment ticketsFragment, int i4) {
        this.charlie = i4;
        this.delta = ticketsFragment;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        switch (this.charlie) {
            case 0:
                a holder = (a) f0Var;
                Intrinsics.echo(holder, "holder");
                Object obj = this.alpha.get(i4);
                Intrinsics.delta(obj, "get(...)");
                holder.alpha.setContent(new d(new Cb.a(11, (TicketResponse) obj, this), 2119280612, true));
                return;
            default:
                c holder2 = (c) f0Var;
                Intrinsics.echo(holder2, "holder");
                Object obj2 = this.alpha.get(i4);
                Intrinsics.delta(obj2, "get(...)");
                holder2.alpha.setContent(new d(new Cb.a(12, (TicketResponse) obj2, this), -204063930, true));
                return;
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        switch (this.charlie) {
            case 0:
                Intrinsics.echo(parent, "parent");
                Context context = parent.getContext();
                Intrinsics.delta(context, "getContext(...)");
                ComposeView composeView = new ComposeView(context, null, 6);
                composeView.setViewCompositionStrategy(A0.alpha);
                return new a(composeView);
            default:
                Intrinsics.echo(parent, "parent");
                Context context2 = parent.getContext();
                Intrinsics.delta(context2, "getContext(...)");
                ComposeView composeView2 = new ComposeView(context2, null, 6);
                composeView2.setViewCompositionStrategy(A0.alpha);
                return new c(composeView2);
        }
    }
}
