package za;

import B9.C0059p0;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Country;
import delivery.samurai.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s1.C2576i;

/* renamed from: za.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3495d extends az {
    public Integer alpha;
    public final ArrayList bravo = new ArrayList();
    public C2576i charlie;

    public C3495d(Integer num) {
        this.alpha = num;
    }

    @Override // androidx.recyclerview.widget.az
    public final int getItemCount() {
        return this.bravo.size();
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        Typeface typeface;
        C3494c holder = (C3494c) f0Var;
        Intrinsics.echo(holder, "holder");
        Country country = (Country) this.bravo.get(i4);
        country.setSelected(Intrinsics.areEqual(country.getId(), this.alpha));
        C0059p0 c0059p0 = holder.alpha;
        c0059p0.f593i = country;
        synchronized (c0059p0) {
            c0059p0.f596l |= 1;
        }
        c0059p0.delta();
        c0059p0.oscar();
        TextView textView = holder.alpha.f592h;
        if (country.getIsSelected()) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        holder.alpha.red.setOnClickListener(new Hc.c(i4, 3, this, country));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        C0059p0 c0059p0 = (C0059p0) z1.d.charlie(LayoutInflater.from(parent.getContext()), R.layout.row_country_selection, parent, false);
        Intrinsics.checkNotNull(c0059p0);
        return new C3494c(c0059p0);
    }
}
