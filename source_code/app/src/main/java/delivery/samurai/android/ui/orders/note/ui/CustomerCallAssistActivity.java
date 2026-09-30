package delivery.samurai.android.ui.orders.note.ui;

import A9.a;
import B9.AbstractC0042h;
import B9.ab;
import Ca.c;
import Eb.b;
import Wb.v;
import Wb.w;
import X9.g;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.app.base.BaseViewModel;
import com.google.maps.android.BuildConfig;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.note.ui.CustomerCallAssistActivity;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/orders/note/ui/CustomerCallAssistActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class CustomerCallAssistActivity extends k {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f12372M = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12373H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12374I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0042h f12375J;

    /* renamed from: K, reason: collision with root package name */
    public c f12376K;

    /* renamed from: L, reason: collision with root package name */
    public c f12377L;

    public CustomerCallAssistActivity() {
        addOnContextAvailableListener(new b(this, 17));
        this.f12374I = new ab(u.alpha.bravo(AllAddressNoteViewModel.class), new v(this, 1), new v(this, 0), new v(this, 2));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AllAddressNoteViewModel) this.f12374I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12373H) {
            this.f12373H = true;
            w wVar = (w) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            CustomerCallAssistActivity customerCallAssistActivity = (CustomerCallAssistActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) wVar).alpha;
            customerCallAssistActivity.teal = (C3403a) pVar.sierra.get();
            customerCallAssistActivity.f12038c = (C3490g) pVar.uniform.get();
            customerCallAssistActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            customerCallAssistActivity.e = (InterfaceC2960e) pVar.xray.get();
            customerCallAssistActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            customerCallAssistActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            customerCallAssistActivity.f12042h = (l) pVar.amber.get();
            customerCallAssistActivity.f12043i = (a) pVar.azure.get();
            customerCallAssistActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            customerCallAssistActivity.f12045k = (C3488e) pVar.bronze.get();
            customerCallAssistActivity.f12046l = (C3484a) pVar.coral.get();
            customerCallAssistActivity.f12047m = (i) pVar.crimson.get();
            customerCallAssistActivity.f12048n = (z9.k) pVar.cyan.get();
            customerCallAssistActivity.f12049o = (C3404b) pVar.emerald.get();
            customerCallAssistActivity.f12050p = (g) pVar.gold.get();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializableExtra;
        int i4 = 9;
        final int i5 = 0;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = getIntent().getSerializableExtra("customerCallData", Hb.a.class);
            if (serializableExtra == null) {
                LayoutInflater layoutInflater = getLayoutInflater();
                int i10 = AbstractC0042h.f472o;
                AbstractC0042h abstractC0042h = (AbstractC0042h) d.charlie(layoutInflater, R.layout.activity_call_customer, null, false);
                Intrinsics.delta(abstractC0042h, "inflate(...)");
                this.f12375J = abstractC0042h;
                setContentView(abstractC0042h.red);
                AbstractC0042h abstractC0042h2 = this.f12375J;
                if (abstractC0042h2 != null) {
                    abstractC0042h2.f475h.setVisibility(8);
                    this.f12376K = new c(i4);
                    this.f12377L = new c(i4);
                    AbstractC0042h abstractC0042h3 = this.f12375J;
                    if (abstractC0042h3 != null) {
                        c cVar = this.f12376K;
                        if (cVar != null) {
                            abstractC0042h3.f477j.setAdapter(cVar);
                            AbstractC0042h abstractC0042h4 = this.f12375J;
                            if (abstractC0042h4 != null) {
                                c cVar2 = this.f12377L;
                                if (cVar2 != null) {
                                    abstractC0042h4.f478k.setAdapter(cVar2);
                                    AbstractC0042h abstractC0042h5 = this.f12375J;
                                    if (abstractC0042h5 != null) {
                                        abstractC0042h5.f480m.setVisibility(8);
                                        AbstractC0042h abstractC0042h6 = this.f12375J;
                                        if (abstractC0042h6 != null) {
                                            abstractC0042h6.f481n.setVisibility(8);
                                            AbstractC0042h abstractC0042h7 = this.f12375J;
                                            if (abstractC0042h7 != null) {
                                                abstractC0042h7.f474g.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.u
                                                    public final /* synthetic */ CustomerCallAssistActivity purple;

                                                    {
                                                        this.purple = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        CustomerCallAssistActivity customerCallAssistActivity = this.purple;
                                                        switch (i5) {
                                                            case 0:
                                                                int i11 = CustomerCallAssistActivity.f12372M;
                                                                customerCallAssistActivity.finish();
                                                                return;
                                                            case 1:
                                                                int i12 = CustomerCallAssistActivity.f12372M;
                                                                customerCallAssistActivity.onBackPressed();
                                                                return;
                                                            default:
                                                                int i13 = CustomerCallAssistActivity.f12372M;
                                                                ((AllAddressNoteViewModel) customerCallAssistActivity.f12374I.getValue()).bravo(BuildConfig.TRAVIS).observe(customerCallAssistActivity, new Aa.f(18, new Aa.l(26, customerCallAssistActivity)));
                                                                return;
                                                        }
                                                    }
                                                });
                                                AbstractC0042h abstractC0042h8 = this.f12375J;
                                                if (abstractC0042h8 != null) {
                                                    final int i11 = 1;
                                                    abstractC0042h8.f479l.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Wb.u
                                                        public final /* synthetic */ CustomerCallAssistActivity purple;

                                                        {
                                                            this.purple = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            CustomerCallAssistActivity customerCallAssistActivity = this.purple;
                                                            switch (i11) {
                                                                case 0:
                                                                    int i112 = CustomerCallAssistActivity.f12372M;
                                                                    customerCallAssistActivity.finish();
                                                                    return;
                                                                case 1:
                                                                    int i12 = CustomerCallAssistActivity.f12372M;
                                                                    customerCallAssistActivity.onBackPressed();
                                                                    return;
                                                                default:
                                                                    int i13 = CustomerCallAssistActivity.f12372M;
                                                                    ((AllAddressNoteViewModel) customerCallAssistActivity.f12374I.getValue()).bravo(BuildConfig.TRAVIS).observe(customerCallAssistActivity, new Aa.f(18, new Aa.l(26, customerCallAssistActivity)));
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    AbstractC0042h abstractC0042h9 = this.f12375J;
                                                    if (abstractC0042h9 != null) {
                                                        final int i12 = 2;
                                                        abstractC0042h9.f473f.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.u
                                                            public final /* synthetic */ CustomerCallAssistActivity purple;

                                                            {
                                                                this.purple = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                CustomerCallAssistActivity customerCallAssistActivity = this.purple;
                                                                switch (i12) {
                                                                    case 0:
                                                                        int i112 = CustomerCallAssistActivity.f12372M;
                                                                        customerCallAssistActivity.finish();
                                                                        return;
                                                                    case 1:
                                                                        int i122 = CustomerCallAssistActivity.f12372M;
                                                                        customerCallAssistActivity.onBackPressed();
                                                                        return;
                                                                    default:
                                                                        int i13 = CustomerCallAssistActivity.f12372M;
                                                                        ((AllAddressNoteViewModel) customerCallAssistActivity.f12374I.getValue()).bravo(BuildConfig.TRAVIS).observe(customerCallAssistActivity, new Aa.f(18, new Aa.l(26, customerCallAssistActivity)));
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        ((AllAddressNoteViewModel) this.f12374I.getValue()).alpha(-1);
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
                                Intrinsics.lima("firstAddressImagesAdapter");
                                throw null;
                            }
                            Intrinsics.lima("binding");
                            throw null;
                        }
                        Intrinsics.lima("addressImagesAdapter");
                        throw null;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            throw new ClassCastException();
        }
        Intrinsics.charlie(getIntent().getSerializableExtra("customerCallData"), "null cannot be cast to non-null type delivery.samurai.android.ui.home.CustomerCallData");
        throw new ClassCastException();
    }
}
