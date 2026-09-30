package Oc;

import B9.AbstractC0039f0;
import B9.T;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.tickets.TicketCommentResponse;
import delivery.samurai.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class f extends AbstractC3311e {
    public long charlie;

    @Override // androidx.recyclerview.widget.az
    public final int getItemViewType(int i4) {
        int i5 = e.$EnumSwitchMapping$0[((TicketCommentResponse) this.alpha.get(i4)).getActorType().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        d holder = (d) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        holder.bravo((TicketCommentResponse) obj);
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i4 != 0) {
            if (i4 != 1) {
                int i5 = T.f231i;
                T t5 = (T) z1.d.charlie(from, R.layout.row_admin_message, parent, false);
                Intrinsics.delta(t5, "inflate(...)");
                return new d(this, t5);
            }
            int i10 = AbstractC0039f0.f455i;
            AbstractC0039f0 abstractC0039f0 = (AbstractC0039f0) z1.d.charlie(from, R.layout.row_captain_message, parent, false);
            Intrinsics.delta(abstractC0039f0, "inflate(...)");
            return new d(this, abstractC0039f0);
        }
        int i11 = T.f231i;
        T t10 = (T) z1.d.charlie(from, R.layout.row_admin_message, parent, false);
        Intrinsics.delta(t10, "inflate(...)");
        return new d(this, t10);
    }
}
