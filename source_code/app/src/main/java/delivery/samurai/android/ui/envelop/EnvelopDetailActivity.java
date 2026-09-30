package delivery.samurai.android.ui.envelop;

import A9.a;
import Aa.f;
import B9.AbstractC0050l;
import B9.ab;
import Eb.b;
import Fb.c;
import Fb.d;
import Fb.m;
import X9.g;
import android.os.Bundle;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.EnvelopNotification;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
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
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/envelop/EnvelopDetailActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class EnvelopDetailActivity extends k {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f12246L = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12247H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12248I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0050l f12249J;

    /* renamed from: K, reason: collision with root package name */
    public String f12250K;

    public EnvelopDetailActivity() {
        addOnContextAvailableListener(new b(this, 1));
        this.f12248I = new ab(u.alpha.bravo(EnvelopsViewModel.class), new c(this, 1), new c(this, 0), new c(this, 2));
        this.f12250K = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (EnvelopsViewModel) this.f12248I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12247H) {
            this.f12247H = true;
            d dVar = (d) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            EnvelopDetailActivity envelopDetailActivity = (EnvelopDetailActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) dVar).alpha;
            envelopDetailActivity.teal = (C3403a) pVar.sierra.get();
            envelopDetailActivity.f12038c = (C3490g) pVar.uniform.get();
            envelopDetailActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            envelopDetailActivity.e = (InterfaceC2960e) pVar.xray.get();
            envelopDetailActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            envelopDetailActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            envelopDetailActivity.f12042h = (l) pVar.amber.get();
            envelopDetailActivity.f12043i = (a) pVar.azure.get();
            envelopDetailActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            envelopDetailActivity.f12045k = (C3488e) pVar.bronze.get();
            envelopDetailActivity.f12046l = (C3484a) pVar.coral.get();
            envelopDetailActivity.f12047m = (i) pVar.crimson.get();
            envelopDetailActivity.f12048n = (z9.k) pVar.cyan.get();
            envelopDetailActivity.f12049o = (C3404b) pVar.emerald.get();
            envelopDetailActivity.f12050p = (g) pVar.gold.get();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EnvelopNotification envelopNotification;
        super.onCreate(bundle);
        z1.g delta = z1.d.delta(this, R.layout.activity_envelop_detail);
        Intrinsics.delta(delta, "setContentView(...)");
        this.f12249J = (AbstractC0050l) delta;
        String stringExtra = getIntent().getStringExtra("ENVELOP_NOTIFICATION_ID");
        if (stringExtra == null) {
            stringExtra = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        }
        this.f12250K = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("ENVELOP_NOTIFICATION");
        if (serializableExtra instanceof EnvelopNotification) {
            envelopNotification = (EnvelopNotification) serializableExtra;
        } else {
            envelopNotification = null;
        }
        if (envelopNotification == null) {
            EnvelopsViewModel envelopsViewModel = (EnvelopsViewModel) this.f12248I.getValue();
            String envelopId = this.f12250K;
            Intrinsics.echo(envelopId, "envelopId");
            ?? auVar = new au(new C2492a(2, "loading"));
            BaseViewModel.launchApi$default(envelopsViewModel, null, new m(envelopsViewModel, envelopId, auVar, null), 1, null);
            auVar.observe(this, new f(5, new Aa.l(6, this)));
        } else {
            AbstractC0050l abstractC0050l = this.f12249J;
            if (abstractC0050l != null) {
                abstractC0050l.romeo(envelopNotification);
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        AbstractC0050l abstractC0050l2 = this.f12249J;
        if (abstractC0050l2 != null) {
            abstractC0050l2.f522f.setNavigationOnClickListener(new Fb.b(this, 0));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }
}
