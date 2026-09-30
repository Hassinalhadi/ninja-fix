package wa;

import B9.ab;
import B9.at;
import B9.au;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import com.app.network.network.models.CsatResponse;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import qe.C2474j;
import s6.R6;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwa/d;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: wa.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3248d extends AbstractC3247c {

    /* renamed from: u, reason: collision with root package name */
    public int f14031u = -1;

    /* renamed from: v, reason: collision with root package name */
    public List f14032v;

    /* renamed from: w, reason: collision with root package name */
    public final ab f14033w;

    /* renamed from: x, reason: collision with root package name */
    public at f14034x;

    /* renamed from: y, reason: collision with root package name */
    public CsatResponse f14035y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14036z;

    public C3248d() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C2474j(13, new C2474j(12, this)));
        this.f14033w = new ab(u.alpha.bravo(OrdersViewModel.class), new ga.ab(alpha, 26), new qa.j(10, this, alpha), new ga.ab(alpha, 27));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
        List list = this.f14032v;
        if (list != null) {
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((ImageView) obj).setOnClickListener(new Ca.a(this, i4, 11));
                i4 = i5;
            }
            at bronze = bronze();
            bronze.f379f.setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(21, this));
            return;
        }
        Intrinsics.lima("rateStars");
        throw null;
    }

    public final at bronze() {
        at atVar = this.f14034x;
        if (atVar != null) {
            return atVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Intrinsics.delta(requireArguments, "requireArguments(...)");
        CsatResponse csatResponse = (CsatResponse) R6.bravo(requireArguments, "arg_csat", CsatResponse.class);
        if (csatResponse != null) {
            this.f14035y = csatResponse;
            return;
        }
        throw new IllegalStateException("RateSupportBottomSheet requires CSAT argument");
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = at.f378t;
        DataBinderMapperImpl dataBinderMapperImpl = z1.d.alpha;
        at atVar = (at) z1.g.kilo(inflater, R.layout.dialog_rate_support, viewGroup, false, null);
        Intrinsics.delta(atVar, "inflate(...)");
        this.f14034x = atVar;
        return bronze().red;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        View findViewById;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (findViewById = dialog.findViewById(R.id.design_bottom_sheet)) != null) {
            BottomSheetBehavior juliet = BottomSheetBehavior.juliet(findViewById);
            Intrinsics.delta(juliet, "from(...)");
            juliet.sierra(3);
            juliet.C = true;
            juliet.f7854D = false;
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        at bronze = bronze();
        ImageView ivStar1 = bronze.f381h;
        Intrinsics.delta(ivStar1, "ivStar1");
        ImageView ivStar2 = bronze.f382i;
        Intrinsics.delta(ivStar2, "ivStar2");
        ImageView ivStar3 = bronze.f383j;
        Intrinsics.delta(ivStar3, "ivStar3");
        ImageView ivStar4 = bronze.f384k;
        Intrinsics.delta(ivStar4, "ivStar4");
        ImageView ivStar5 = bronze.f385l;
        Intrinsics.delta(ivStar5, "ivStar5");
        this.f14032v = CollectionsKt.listOf(ivStar1, ivStar2, ivStar3, ivStar4, ivStar5);
        amber();
        at bronze2 = bronze();
        CsatResponse csatResponse = this.f14035y;
        if (csatResponse != null) {
            au auVar = (au) bronze2;
            auVar.f392s = csatResponse;
            synchronized (auVar) {
                auVar.f394u |= 1;
            }
            auVar.delta();
            auVar.oscar();
            bronze().f379f.setEnabled(false);
            azure();
            return;
        }
        Intrinsics.lima("csat");
        throw null;
    }
}
