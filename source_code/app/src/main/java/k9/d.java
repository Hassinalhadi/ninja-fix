package k9;

import B9.C0062r0;
import B9.e1;
import B9.f1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Country;
import delivery.samurai.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import za.C3493b;

/* loaded from: classes2.dex */
public final class d extends az {
    public final /* synthetic */ int alpha;
    public boolean bravo;
    public final Object charlie;
    public Object delta;

    public d() {
        this.alpha = 1;
        this.charlie = new ArrayList();
    }

    public boolean alpha(int i4) {
        int i5;
        boolean z2 = this.bravo;
        if (z2) {
            if (z2) {
                i5 = getItemCount() - 1;
            } else {
                i5 = -1;
            }
            if (i4 == i5) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.az
    public final int getItemCount() {
        switch (this.alpha) {
            case 0:
                boolean z2 = this.bravo;
                az azVar = (az) this.charlie;
                if (z2) {
                    return azVar.getItemCount() + 1;
                }
                return azVar.getItemCount();
            default:
                return ((ArrayList) this.charlie).size() + (this.bravo ? 1 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.az
    public long getItemId(int i4) {
        switch (this.alpha) {
            case 0:
                if (alpha(i4)) {
                    return -1L;
                }
                return ((az) this.charlie).getItemId(i4);
            default:
                return super.getItemId(i4);
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final int getItemViewType(int i4) {
        switch (this.alpha) {
            case 0:
                if (alpha(i4)) {
                    return 2147483597;
                }
                return ((az) this.charlie).getItemViewType(i4);
            default:
                if (i4 < ((ArrayList) this.charlie).size()) {
                    return 0;
                }
                return 1;
        }
    }

    @Override // androidx.recyclerview.widget.az
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        switch (this.alpha) {
            case 0:
                super.onAttachedToRecyclerView(recyclerView);
                ((az) this.charlie).onAttachedToRecyclerView(recyclerView);
                return;
            default:
                super.onAttachedToRecyclerView(recyclerView);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 holder, int i4) {
        switch (this.alpha) {
            case 0:
                if (alpha(i4)) {
                    ((C2022b) this.delta).getClass();
                    return;
                } else {
                    ((az) this.charlie).onBindViewHolder(holder, i4);
                    return;
                }
            default:
                Intrinsics.echo(holder, "holder");
                if ((holder instanceof C3493b) && i4 < ((ArrayList) this.charlie).size()) {
                    Country country = (Country) ((ArrayList) this.charlie).get(i4);
                    C3493b c3493b = (C3493b) holder;
                    f1 f1Var = (f1) c3493b.alpha;
                    f1Var.f452j = country;
                    synchronized (f1Var) {
                        f1Var.f461m |= 1;
                    }
                    f1Var.delta();
                    f1Var.oscar();
                    boolean z2 = true;
                    int i5 = 0;
                    if (i4 != ((ArrayList) this.charlie).size() - 1) {
                        z2 = false;
                    }
                    View view = c3493b.alpha.f451i;
                    if (z2 && !this.bravo) {
                        i5 = 8;
                    }
                    view.setVisibility(i5);
                    c3493b.alpha.f448f.setOnClickListener(new Hc.c(i4, 2, this, country));
                    return;
                }
                return;
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        switch (this.alpha) {
            case 0:
                if (i4 == 2147483597) {
                    ((C2022b) this.delta).getClass();
                    return new f0(LayoutInflater.from(parent.getContext()).inflate(R.layout.loading_row, parent, false));
                }
                return ((az) this.charlie).onCreateViewHolder(parent, i4);
            default:
                Intrinsics.echo(parent, "parent");
                if (i4 == 0) {
                    LayoutInflater from = LayoutInflater.from(parent.getContext());
                    int i5 = e1.f447k;
                    e1 e1Var = (e1) z1.d.charlie(from, R.layout.row_select_country, parent, false);
                    Intrinsics.delta(e1Var, "inflate(...)");
                    return new C3493b(e1Var);
                }
                LayoutInflater from2 = LayoutInflater.from(parent.getContext());
                int i10 = C0062r0.f612g;
                C0062r0 c0062r0 = (C0062r0) z1.d.charlie(from2, R.layout.row_loading, parent, false);
                Intrinsics.delta(c0062r0, "inflate(...)");
                return new f0(c0062r0.red);
        }
    }

    @Override // androidx.recyclerview.widget.az
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        switch (this.alpha) {
            case 0:
                super.onDetachedFromRecyclerView(recyclerView);
                ((az) this.charlie).onDetachedFromRecyclerView(recyclerView);
                return;
            default:
                super.onDetachedFromRecyclerView(recyclerView);
                return;
        }
    }

    public d(az azVar) {
        this.alpha = 0;
        C2022b c2022b = C2022b.alpha;
        this.bravo = true;
        this.charlie = azVar;
        this.delta = c2022b;
        setHasStableIds(azVar.hasStableIds());
    }
}
