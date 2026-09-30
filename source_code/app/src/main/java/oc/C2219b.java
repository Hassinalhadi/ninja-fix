package oc;

import B9.ac;
import B9.ad;
import Yb.F;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loc/b;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: oc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2219b extends AbstractC2218a {

    /* renamed from: u, reason: collision with root package name */
    public PointRewardResponse f13129u;

    /* renamed from: v, reason: collision with root package name */
    public float f13130v;

    /* renamed from: w, reason: collision with root package name */
    public F f13131w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13132x = true;

    /* renamed from: y, reason: collision with root package name */
    public ac f13133y;

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = ac.f317o;
        ac acVar = (ac) z1.d.charlie(inflater, R.layout.bottom_sheet_redeem, viewGroup, false);
        Intrinsics.delta(acVar, "inflate(...)");
        this.f13133y = acVar;
        View view = acVar.red;
        Intrinsics.delta(view, "getRoot(...)");
        return view;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f14101q) {
            ac acVar = this.f13133y;
            if (acVar != null) {
                PointRewardResponse pointRewardResponse = this.f13129u;
                if (pointRewardResponse == null) {
                    return;
                }
                ad adVar = (ad) acVar;
                adVar.f326n = pointRewardResponse;
                synchronized (adVar) {
                    adVar.f328p |= 1;
                }
                adVar.delta();
                adVar.oscar();
                ac acVar2 = this.f13133y;
                if (acVar2 != null) {
                    acVar2.f320h.setText(String.valueOf(this.f13130v));
                    ac acVar3 = this.f13133y;
                    if (acVar3 != null) {
                        acVar3.f318f.setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(12, this));
                        return;
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF2344v() {
        return this.f13132x;
    }
}
