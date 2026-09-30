package delivery.samurai.android.ui.withdraw;

import A9.a;
import B9.AbstractC0067u;
import B9.ab;
import Ba.h;
import Eb.b;
import Wc.n;
import Wc.o;
import Wc.p;
import X9.g;
import android.os.Bundle;
import android.widget.EditText;
import com.app.base.BaseViewModel;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import w9.j;
import y9.C3403a;
import y9.C3404b;
import z1.d;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/withdraw/WalletTopUpActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class WalletTopUpActivity extends k {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f12536L = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12537H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12538I;

    /* renamed from: J, reason: collision with root package name */
    public final Regex f12539J;

    /* renamed from: K, reason: collision with root package name */
    public AbstractC0067u f12540K;

    public WalletTopUpActivity() {
        addOnContextAvailableListener(new b(this, 18));
        this.f12538I = new ab(u.alpha.bravo(WithDrawHistoryViewModel.class), new o(this, 1), new o(this, 0), new o(this, 2));
        this.f12539J = new Regex("^\\d+(?:\\.\\d{1,2})?$");
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12537H) {
            this.f12537H = true;
            p pVar = (p) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            WalletTopUpActivity walletTopUpActivity = (WalletTopUpActivity) UnsafeCasts.unsafeCast(this);
            w9.p pVar2 = ((j) pVar).alpha;
            walletTopUpActivity.teal = (C3403a) pVar2.sierra.get();
            walletTopUpActivity.f12038c = (C3490g) pVar2.uniform.get();
            walletTopUpActivity.f12039d = (InterfaceC2958c) pVar2.whiskey.get();
            walletTopUpActivity.e = (InterfaceC2960e) pVar2.xray.get();
            walletTopUpActivity.f12040f = (InterfaceC2956a) pVar2.yankee.get();
            walletTopUpActivity.f12041g = (InterfaceC1628b) pVar2.zulu.get();
            walletTopUpActivity.f12042h = (l) pVar2.amber.get();
            walletTopUpActivity.f12043i = (a) pVar2.azure.get();
            walletTopUpActivity.f12044j = (InterfaceC1627a) pVar2.black.get();
            walletTopUpActivity.f12045k = (C3488e) pVar2.bronze.get();
            walletTopUpActivity.f12046l = (C3484a) pVar2.coral.get();
            walletTopUpActivity.f12047m = (i) pVar2.crimson.get();
            walletTopUpActivity.f12048n = (z9.k) pVar2.cyan.get();
            walletTopUpActivity.f12049o = (C3404b) pVar2.emerald.get();
            walletTopUpActivity.f12050p = (g) pVar2.gold.get();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z1.g delta = d.delta(this, R.layout.activity_wallet_top_up);
        Intrinsics.delta(delta, "setContentView(...)");
        AbstractC0067u abstractC0067u = (AbstractC0067u) delta;
        this.f12540K = abstractC0067u;
        abstractC0067u.f697i.setText(getIntent().getStringExtra("extra_currency_symbol"));
        AbstractC0067u abstractC0067u2 = this.f12540K;
        if (abstractC0067u2 != null) {
            abstractC0067u2.f694f.setOnClickListener(new Fb.b(this, 21));
            AbstractC0067u abstractC0067u3 = this.f12540K;
            if (abstractC0067u3 != null) {
                abstractC0067u3.f694f.setEnabled(false);
                AbstractC0067u abstractC0067u4 = this.f12540K;
                if (abstractC0067u4 != null) {
                    abstractC0067u4.f696h.setInputType(8194);
                    AbstractC0067u abstractC0067u5 = this.f12540K;
                    if (abstractC0067u5 != null) {
                        abstractC0067u5.f696h.setFilters(new n[]{new n()});
                        AbstractC0067u abstractC0067u6 = this.f12540K;
                        if (abstractC0067u6 != null) {
                            EditText etAmount = abstractC0067u6.f696h;
                            Intrinsics.delta(etAmount, "etAmount");
                            etAmount.addTextChangedListener(new h(6, this));
                            return;
                        }
                        Intrinsics.lima("binding");
                        throw null;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
