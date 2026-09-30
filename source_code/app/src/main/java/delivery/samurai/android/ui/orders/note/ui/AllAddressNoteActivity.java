package delivery.samurai.android.ui.orders.note.ui;

import A9.a;
import Aa.f;
import B9.AbstractC0032c;
import B9.ab;
import Sc.p;
import Wb.o;
import Wb.q;
import X9.g;
import a4.s;
import ah.b;
import android.os.Bundle;
import com.app.base.BaseViewModel;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/orders/note/ui/AllAddressNoteActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AllAddressNoteActivity extends k {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f12362R = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12363H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12364I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0032c f12365J;

    /* renamed from: K, reason: collision with root package name */
    public p f12366K;

    /* renamed from: L, reason: collision with root package name */
    public int f12367L;

    /* renamed from: M, reason: collision with root package name */
    public int f12368M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f12369N;

    /* renamed from: O, reason: collision with root package name */
    public double f12370O;

    /* renamed from: P, reason: collision with root package name */
    public double f12371P;
    public final b Q;

    public AllAddressNoteActivity() {
        addOnContextAvailableListener(new Eb.b(this, 16));
        this.f12364I = new ab(u.alpha.bravo(AllAddressNoteViewModel.class), new Wb.p(this, 1), new Wb.p(this, 0), new Wb.p(this, 2));
        this.f12367L = -1;
        this.f12368M = -1;
        this.Q = registerForActivityResult(new s(5), new o(this));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AllAddressNoteViewModel) this.f12364I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12363H) {
            this.f12363H = true;
            q qVar = (q) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            AllAddressNoteActivity allAddressNoteActivity = (AllAddressNoteActivity) UnsafeCasts.unsafeCast(this);
            w9.p pVar = ((j) qVar).alpha;
            allAddressNoteActivity.teal = (C3403a) pVar.sierra.get();
            allAddressNoteActivity.f12038c = (C3490g) pVar.uniform.get();
            allAddressNoteActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            allAddressNoteActivity.e = (InterfaceC2960e) pVar.xray.get();
            allAddressNoteActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            allAddressNoteActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            allAddressNoteActivity.f12042h = (l) pVar.amber.get();
            allAddressNoteActivity.f12043i = (a) pVar.azure.get();
            allAddressNoteActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            allAddressNoteActivity.f12045k = (C3488e) pVar.bronze.get();
            allAddressNoteActivity.f12046l = (C3484a) pVar.coral.get();
            allAddressNoteActivity.f12047m = (i) pVar.crimson.get();
            allAddressNoteActivity.f12048n = (z9.k) pVar.cyan.get();
            allAddressNoteActivity.f12049o = (C3404b) pVar.emerald.get();
            allAddressNoteActivity.f12050p = (g) pVar.gold.get();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12367L = getIntent().getIntExtra("taskAddressId", -1);
        this.f12368M = getIntent().getIntExtra("orderTaskId", -1);
        int i4 = 0;
        this.f12369N = getIntent().getBooleanExtra("canAddAddressNote", false);
        this.f12370O = getIntent().getDoubleExtra("lat", 0.0d);
        this.f12371P = getIntent().getDoubleExtra("lng", 0.0d);
        z1.g delta = d.delta(this, R.layout.activity_all_address_note);
        Intrinsics.delta(delta, "setContentView(...)");
        AbstractC0032c abstractC0032c = (AbstractC0032c) delta;
        this.f12365J = abstractC0032c;
        if (!this.f12369N) {
            i4 = 8;
        }
        abstractC0032c.f424f.setVisibility(i4);
        p pVar = new p(1);
        this.f12366K = pVar;
        AbstractC0032c abstractC0032c2 = this.f12365J;
        if (abstractC0032c2 != null) {
            abstractC0032c2.f426h.setAdapter(pVar);
            p pVar2 = this.f12366K;
            if (pVar2 != null) {
                pVar2.echo = new Ac.k(15, this);
                AbstractC0032c abstractC0032c3 = this.f12365J;
                if (abstractC0032c3 != null) {
                    abstractC0032c3.f424f.setOnClickListener(new Fb.b(this, 19));
                    AbstractC0032c abstractC0032c4 = this.f12365J;
                    if (abstractC0032c4 != null) {
                        abstractC0032c4.f427i.setOnRefreshListener(new o(this));
                        ab abVar = this.f12364I;
                        ((AllAddressNoteViewModel) abVar.getValue()).hotel.observe(this, new f(17, new Aa.l(25, this)));
                        ((AllAddressNoteViewModel) abVar.getValue()).alpha(this.f12367L);
                        return;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("adapter");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
