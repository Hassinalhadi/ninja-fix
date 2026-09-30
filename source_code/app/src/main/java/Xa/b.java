package Xa;

import B9.AbstractC0055n0;
import B9.C0057o0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Country;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class b extends AbstractC3311e {
    public Integer charlie;
    public final String delta;
    public final c echo;

    public b(Integer num, String str, c type) {
        Intrinsics.echo(type, "type");
        this.charlie = num;
        this.delta = str;
        this.echo = type;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        boolean z2;
        Object validDemonym;
        Object obj;
        a holder = (a) f0Var;
        Intrinsics.echo(holder, "holder");
        AbstractC0055n0 abstractC0055n0 = holder.alpha;
        C0057o0 c0057o0 = (C0057o0) abstractC0055n0;
        c0057o0.f573g = (Country) this.alpha.get(i4);
        synchronized (c0057o0) {
            c0057o0.f586l |= 1;
        }
        c0057o0.delta();
        c0057o0.oscar();
        c cVar = this.echo;
        c cVar2 = c.purple;
        if (cVar == cVar2) {
            z2 = true;
        } else {
            z2 = false;
        }
        abstractC0055n0.sierra(Boolean.valueOf(z2));
        if (this.echo == cVar2) {
            validDemonym = ((Country) this.alpha.get(i4)).getId();
            obj = this.charlie;
        } else {
            validDemonym = ((Country) this.alpha.get(i4)).getValidDemonym();
            obj = this.delta;
        }
        abstractC0055n0.romeo(Boolean.valueOf(Intrinsics.areEqual(validDemonym, obj)));
        abstractC0055n0.f572f.setOnClickListener(new Ca.a(this, i4, 7));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i5 = AbstractC0055n0.f571j;
        AbstractC0055n0 abstractC0055n0 = (AbstractC0055n0) z1.d.charlie(from, R.layout.row_country, parent, false);
        Intrinsics.delta(abstractC0055n0, "inflate(...)");
        return new a(abstractC0055n0);
    }
}
