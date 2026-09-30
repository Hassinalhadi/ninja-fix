package Ub;

import B9.P;
import Kb.k;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Attachment;
import delivery.samurai.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class f extends az {
    public final ArrayList alpha = new ArrayList();

    @Override // androidx.recyclerview.widget.az
    public final int getItemCount() {
        return this.alpha.size();
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        e holder = (e) f0Var;
        Intrinsics.echo(holder, "holder");
        Attachment item = (Attachment) this.alpha.get(i4);
        Intrinsics.echo(item, "item");
        P p4 = holder.alpha;
        ImageView ivAddressImage = p4.f213f;
        Intrinsics.delta(ivAddressImage, "ivAddressImage");
        AbstractC2643e5.charlie(ivAddressImage, item.getFileUrl(), 0, 6);
        p4.f213f.setOnClickListener(new k(2, holder, item));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i5 = P.f212g;
        P p4 = (P) z1.d.charlie(from, R.layout.row_address_note_image, parent, false);
        Intrinsics.delta(p4, "inflate(...)");
        return new e(p4);
    }
}
