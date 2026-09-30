package delivery.samurai.android.ui.withdraw;

import A9.a;
import B9.AbstractC0071w;
import B9.ab;
import Ca.c;
import Dc.t;
import Eb.b;
import Wc.aa;
import Wc.v;
import X9.g;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.WithdrawTransaction;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import r3.C2492a;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z1.d;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/withdraw/WithdrawDetailActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class WithdrawDetailActivity extends k {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f12546N = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12547H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12548I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0071w f12549J;

    /* renamed from: K, reason: collision with root package name */
    public WithdrawTransaction f12550K;

    /* renamed from: L, reason: collision with root package name */
    public Integer f12551L;

    /* renamed from: M, reason: collision with root package name */
    public final c f12552M;

    public WithdrawDetailActivity() {
        addOnContextAvailableListener(new b(this, 19));
        this.f12548I = new ab(u.alpha.bravo(WithDrawHistoryViewModel.class), new aa(this, 1), new aa(this, 0), new aa(this, 2));
        this.f12552M = new c(10);
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12547H) {
            this.f12547H = true;
            Wc.ab abVar = (Wc.ab) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            WithdrawDetailActivity withdrawDetailActivity = (WithdrawDetailActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) abVar).alpha;
            withdrawDetailActivity.teal = (C3403a) pVar.sierra.get();
            withdrawDetailActivity.f12038c = (C3490g) pVar.uniform.get();
            withdrawDetailActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            withdrawDetailActivity.e = (InterfaceC2960e) pVar.xray.get();
            withdrawDetailActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            withdrawDetailActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            withdrawDetailActivity.f12042h = (l) pVar.amber.get();
            withdrawDetailActivity.f12043i = (a) pVar.azure.get();
            withdrawDetailActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            withdrawDetailActivity.f12045k = (C3488e) pVar.bronze.get();
            withdrawDetailActivity.f12046l = (C3484a) pVar.coral.get();
            withdrawDetailActivity.f12047m = (i) pVar.crimson.get();
            withdrawDetailActivity.f12048n = (z9.k) pVar.cyan.get();
            withdrawDetailActivity.f12049o = (C3404b) pVar.emerald.get();
            withdrawDetailActivity.f12050p = (g) pVar.gold.get();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void gold(int i4) {
        WithDrawHistoryViewModel withDrawHistoryViewModel = (WithDrawHistoryViewModel) this.f12548I.getValue();
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(withDrawHistoryViewModel, null, new v(withDrawHistoryViewModel, i4, auVar, null), 1, null);
        auVar.observe(this, new t(12, new Aa.l(27, this)));
    }

    public final AbstractC0071w gray() {
        AbstractC0071w abstractC0071w = this.f12549J;
        if (abstractC0071w != null) {
            return abstractC0071w;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WithdrawTransaction withdrawTransaction;
        Integer num;
        super.onCreate(bundle);
        z1.g delta = d.delta(this, R.layout.activity_withdraw_detail);
        Intrinsics.delta(delta, "setContentView(...)");
        this.f12549J = (AbstractC0071w) delta;
        Serializable serializableExtra = getIntent().getSerializableExtra("withdraw_HISTORY");
        Integer num2 = null;
        if (serializableExtra instanceof WithdrawTransaction) {
            withdrawTransaction = (WithdrawTransaction) serializableExtra;
        } else {
            withdrawTransaction = null;
        }
        if (withdrawTransaction != null) {
            this.f12550K = withdrawTransaction;
            this.f12551L = withdrawTransaction.getId();
            gray().f709h.romeo(withdrawTransaction);
        }
        AppCompatImageView arrow = gray().f709h.f597f;
        Intrinsics.delta(arrow, "arrow");
        arrow.setVisibility(8);
        gray().f707f.setAdapter(this.f12552M);
        final int i4 = 0;
        gray().f708g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Wc.z
            public final /* synthetic */ WithdrawDetailActivity purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        int i5 = WithdrawDetailActivity.f12546N;
                        this.purple.onBackPressed();
                        return;
                    default:
                        int i10 = WithdrawDetailActivity.f12546N;
                        WithdrawDetailActivity withdrawDetailActivity = this.purple;
                        String string = withdrawDetailActivity.getString(R.string.alert);
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = withdrawDetailActivity.getString(R.string.confirm_cancel_withdraw_msg);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = withdrawDetailActivity.getString(R.string.cancel_request);
                        Intrinsics.delta(string3, "getString(...)");
                        L9.d.olive(withdrawDetailActivity, string, string2, string3, new B2.q(25, withdrawDetailActivity), withdrawDetailActivity.getString(R.string.dont_cancel_request), null, 96);
                        return;
                }
            }
        });
        final int i5 = 1;
        gray().f709h.f598g.setOnClickListener(new View.OnClickListener(this) { // from class: Wc.z
            public final /* synthetic */ WithdrawDetailActivity purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        int i52 = WithdrawDetailActivity.f12546N;
                        this.purple.onBackPressed();
                        return;
                    default:
                        int i10 = WithdrawDetailActivity.f12546N;
                        WithdrawDetailActivity withdrawDetailActivity = this.purple;
                        String string = withdrawDetailActivity.getString(R.string.alert);
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = withdrawDetailActivity.getString(R.string.confirm_cancel_withdraw_msg);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = withdrawDetailActivity.getString(R.string.cancel_request);
                        Intrinsics.delta(string3, "getString(...)");
                        L9.d.olive(withdrawDetailActivity, string, string2, string3, new B2.q(25, withdrawDetailActivity), withdrawDetailActivity.getString(R.string.dont_cancel_request), null, 96);
                        return;
                }
            }
        });
        if (this.f12551L == null) {
            int intExtra = getIntent().getIntExtra("withdraw_ID", -1);
            Integer valueOf = Integer.valueOf(intExtra);
            if (intExtra > 0) {
                num2 = valueOf;
            }
            this.f12551L = num2;
        }
        WithdrawTransaction withdrawTransaction2 = this.f12550K;
        if (withdrawTransaction2 == null || (num = withdrawTransaction2.getId()) == null) {
            num = this.f12551L;
        }
        if (num != null) {
            gold(num.intValue());
        }
    }
}
