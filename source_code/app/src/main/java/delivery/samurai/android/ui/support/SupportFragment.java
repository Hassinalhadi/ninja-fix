package delivery.samurai.android.ui.support;

import A2.q;
import Aa.m;
import B2.s;
import B9.ab;
import Ca.c;
import Fb.b;
import Gc.h;
import Gc.u;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2661g5;
import t6.S3;
import zendesk.support.ProviderStore;
import zendesk.support.RequestProvider;
import zendesk.support.Support;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/support/SupportFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class SupportFragment extends h {
    public ab e;

    /* renamed from: f, reason: collision with root package name */
    public final c f12497f = new c(3);

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_support, viewGroup, false);
        int i4 = R.id.btnCreateNewTicket;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnCreateNewTicket, inflate);
        if (materialButton != null) {
            i4 = R.id.cardView;
            if (((CardView) S3.bravo(R.id.cardView, inflate)) != null) {
                i4 = R.id.emptyView;
                TextView textView = (TextView) S3.bravo(R.id.emptyView, inflate);
                if (textView != null) {
                    i4 = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
                    if (recyclerView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                        this.e = new ab(swipeRefreshLayout, materialButton, textView, recyclerView, swipeRefreshLayout);
                        return (SwipeRefreshLayout) romeo().purple;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        quebec();
        ab romeo = romeo();
        ((RecyclerView) romeo.white).postDelayed(new q(5, this), 1500L);
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ((RecyclerView) romeo().white).setAdapter(this.f12497f);
        AbstractC2661g5.charlie((RecyclerView) romeo().white, R.dimen.spacing_6, R.dimen.spacing_6);
        AbstractC2661g5.alpha((RecyclerView) romeo().white, R.dimen.spacing_12, R.dimen.spacing_12);
        ab romeo = romeo();
        ((SwipeRefreshLayout) romeo.teal).setOnRefreshListener(new s(5, this));
    }

    @Override // d3.n
    public final void oscar() {
        ab romeo = romeo();
        ((MaterialButton) romeo.silver).setOnClickListener(new b(this, 4));
        this.f12497f.bravo = new m(12, this);
    }

    public final void quebec() {
        RequestProvider requestProvider;
        ((SwipeRefreshLayout) romeo().teal).setRefreshing(true);
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider != null) {
            requestProvider = provider.requestProvider();
        } else {
            requestProvider = null;
        }
        if (requestProvider == null) {
            ((SwipeRefreshLayout) romeo().teal).setRefreshing(false);
        } else {
            requestProvider.getAllRequests(new u(2, this));
        }
    }

    public final ab romeo() {
        ab abVar = this.e;
        if (abVar != null) {
            return abVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
