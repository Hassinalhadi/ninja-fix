package Va;

import B9.AbstractC0035d0;
import B9.AbstractC0043h0;
import B9.C0037e0;
import B9.C0045i0;
import B9.Q0;
import B9.R0;
import B9.S0;
import B9.T0;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Bank;
import com.app.network.network.models.City;
import com.app.network.network.models.PlatformListResponse;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import t6.U2;
import x9.AbstractC3311e;
import za.C3497f;

/* loaded from: classes2.dex */
public final class d extends AbstractC3311e {
    public final /* synthetic */ int charlie;
    public Integer delta;

    public /* synthetic */ d(int i4) {
        this.charlie = i4;
    }

    private final void charlie(f0 f0Var, int i4) {
        c holder = (c) f0Var;
        Intrinsics.echo(holder, "holder");
        AbstractC0035d0 abstractC0035d0 = holder.alpha;
        C0037e0 c0037e0 = (C0037e0) abstractC0035d0;
        c0037e0.f440g = (Bank) this.alpha.get(i4);
        synchronized (c0037e0) {
            c0037e0.f446k |= 2;
        }
        c0037e0.delta();
        c0037e0.oscar();
        abstractC0035d0.romeo(Boolean.valueOf(Intrinsics.areEqual(((Bank) this.alpha.get(i4)).getId(), this.delta)));
        abstractC0035d0.f439f.setOnClickListener(new Ca.a(this, i4, 5));
    }

    private final void delta(f0 f0Var, int i4) {
        Wa.a holder = (Wa.a) f0Var;
        Intrinsics.echo(holder, "holder");
        AbstractC0043h0 abstractC0043h0 = holder.alpha;
        C0045i0 c0045i0 = (C0045i0) abstractC0043h0;
        c0045i0.f484g = (City) this.alpha.get(i4);
        synchronized (c0045i0) {
            c0045i0.f492k |= 1;
        }
        c0045i0.delta();
        c0045i0.oscar();
        abstractC0043h0.romeo(Boolean.valueOf(Intrinsics.areEqual(((City) this.alpha.get(i4)).getId(), this.delta)));
        abstractC0043h0.f483f.setOnClickListener(new Ca.a(this, i4, 6));
    }

    private final void echo(f0 f0Var, int i4) {
        Ya.b holder = (Ya.b) f0Var;
        Intrinsics.echo(holder, "holder");
        S0 s02 = holder.alpha;
        if (s02 != null) {
            T0 t02 = (T0) s02;
            t02.f229g = (PlatformListResponse) this.alpha.get(i4);
            synchronized (t02) {
                t02.f237j |= 1;
            }
            t02.delta();
            t02.oscar();
            s02.romeo(Boolean.valueOf(Intrinsics.areEqual(((PlatformListResponse) this.alpha.get(i4)).getId(), this.delta)));
            s02.red.setOnClickListener(new Ca.a(this, i4, 8));
        }
    }

    public void foxtrot(Integer num) {
        Integer num2 = this.delta;
        this.delta = num;
        if (!Intrinsics.areEqual(num2, num)) {
            ArrayList arrayList = this.alpha;
            Iterator it = arrayList.iterator();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((PlatformListResponse) it.next()).getId(), num2)) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    i5 = -1;
                    break;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.areEqual(((PlatformListResponse) it2.next()).getId(), num)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i5 != -1) {
                notifyItemChanged(i5);
            }
            if (i4 != -1) {
                notifyItemChanged(i4);
            }
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        Typeface typeface;
        switch (this.charlie) {
            case 0:
                charlie(f0Var, i4);
                return;
            case 1:
                delta(f0Var, i4);
                return;
            case 2:
                echo(f0Var, i4);
                return;
            default:
                C3497f holder = (C3497f) f0Var;
                Intrinsics.echo(holder, "holder");
                Q0 q02 = holder.alpha;
                if (q02 != null) {
                    boolean areEqual = Intrinsics.areEqual(((PlatformListResponse) this.alpha.get(i4)).getId(), this.delta);
                    TextView textView = q02.f220h;
                    if (areEqual) {
                        typeface = Typeface.DEFAULT_BOLD;
                    } else {
                        typeface = Typeface.DEFAULT;
                    }
                    textView.setTypeface(typeface);
                    R0 r02 = (R0) q02;
                    r02.f221i = (PlatformListResponse) this.alpha.get(i4);
                    synchronized (r02) {
                        r02.f225l |= 2;
                    }
                    r02.delta();
                    r02.oscar();
                    q02.romeo(Boolean.valueOf(areEqual));
                    q02.red.setOnClickListener(new Ca.a(this, i4, 14));
                    q02.hotel();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [Ya.b, androidx.recyclerview.widget.f0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.recyclerview.widget.f0, za.f] */
    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        switch (this.charlie) {
            case 0:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from = LayoutInflater.from(parent.getContext());
                int i5 = AbstractC0035d0.f438i;
                AbstractC0035d0 abstractC0035d0 = (AbstractC0035d0) z1.d.charlie(from, R.layout.row_bank, parent, false);
                Intrinsics.delta(abstractC0035d0, "inflate(...)");
                return new c(abstractC0035d0);
            case 1:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from2 = LayoutInflater.from(parent.getContext());
                int i10 = AbstractC0043h0.f482i;
                AbstractC0043h0 abstractC0043h0 = (AbstractC0043h0) z1.d.charlie(from2, R.layout.row_city, parent, false);
                Intrinsics.delta(abstractC0043h0, "inflate(...)");
                return new Wa.a(abstractC0043h0);
            case 2:
                Intrinsics.echo(parent, "parent");
                View charlie = U2.charlie(parent, R.layout.row_platforms_select);
                ?? f0Var = new f0(charlie);
                f0Var.alpha = (S0) z1.d.alpha(charlie);
                return f0Var;
            default:
                Intrinsics.echo(parent, "parent");
                View charlie2 = U2.charlie(parent, R.layout.row_platform_selection);
                ?? f0Var2 = new f0(charlie2);
                f0Var2.alpha = (Q0) z1.d.alpha(charlie2);
                return f0Var2;
        }
    }
}
