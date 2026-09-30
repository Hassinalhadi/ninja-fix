package Kb;

import B9.AbstractC0064s0;
import B9.C0066t0;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.aq;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import n3.EnumC2159b;

/* loaded from: classes2.dex */
public final class m extends aq {
    public static final j bravo = new Object();
    public final Aa.l alpha;

    public m(Aa.l lVar) {
        super(bravo);
        this.alpha = lVar;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        l holder = (l) f0Var;
        Intrinsics.echo(holder, "holder");
        a aVar = (a) getItem(i4);
        AbstractC0064s0 abstractC0064s0 = holder.alpha;
        Ib.a aVar2 = new Ib.a(EnumC2159b.valueOf(aVar.alpha.name()), aVar.bravo, aVar.charlie);
        C0066t0 c0066t0 = (C0066t0) abstractC0064s0;
        c0066t0.f689i = aVar2;
        synchronized (c0066t0) {
            c0066t0.f693k |= 1;
        }
        c0066t0.delta();
        c0066t0.oscar();
        abstractC0064s0.f686f.getBackground().setColorFilter(abstractC0064s0.red.getContext().getColor(R.color.progress_red), PorterDuff.Mode.SRC_IN);
        abstractC0064s0.hotel();
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i5 = AbstractC0064s0.f685j;
        AbstractC0064s0 abstractC0064s0 = (AbstractC0064s0) z1.d.charlie(from, R.layout.row_location_accuracy_checklist, parent, false);
        Intrinsics.delta(abstractC0064s0, "inflate(...)");
        return new l(this, abstractC0064s0, this);
    }
}
