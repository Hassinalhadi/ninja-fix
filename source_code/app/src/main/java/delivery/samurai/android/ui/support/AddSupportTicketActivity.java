package delivery.samurai.android.ui.support;

import A9.a;
import Aa.f;
import B9.ab;
import Eb.b;
import Gc.c;
import X9.g;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.au;
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
import r3.C2492a;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.S3;
import w.o;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/support/AddSupportTicketActivity;", "Ld3/k;", "<init>", "()V", "U8/a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AddSupportTicketActivity extends k {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f12493K = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12494H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12495I;

    /* renamed from: J, reason: collision with root package name */
    public o f12496J;

    public AddSupportTicketActivity() {
        addOnContextAvailableListener(new b(this, 6));
        this.f12495I = new ab(u.alpha.bravo(SupportViewModel.class), new Gc.b(this, 1), new Gc.b(this, 0), new Gc.b(this, 2));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12494H) {
            this.f12494H = true;
            c cVar = (c) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            AddSupportTicketActivity addSupportTicketActivity = (AddSupportTicketActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) cVar).alpha;
            addSupportTicketActivity.teal = (C3403a) pVar.sierra.get();
            addSupportTicketActivity.f12038c = (C3490g) pVar.uniform.get();
            addSupportTicketActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            addSupportTicketActivity.e = (InterfaceC2960e) pVar.xray.get();
            addSupportTicketActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            addSupportTicketActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            addSupportTicketActivity.f12042h = (l) pVar.amber.get();
            addSupportTicketActivity.f12043i = (a) pVar.azure.get();
            addSupportTicketActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            addSupportTicketActivity.f12045k = (C3488e) pVar.bronze.get();
            addSupportTicketActivity.f12046l = (C3484a) pVar.coral.get();
            addSupportTicketActivity.f12047m = (i) pVar.crimson.get();
            addSupportTicketActivity.f12048n = (z9.k) pVar.cyan.get();
            addSupportTicketActivity.f12049o = (C3404b) pVar.emerald.get();
            addSupportTicketActivity.f12050p = (g) pVar.gold.get();
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Integer valueOf;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.add_support_ticket_activity, (ViewGroup) null, false);
        int i4 = R.id.composeView;
        ComposeView composeView = (ComposeView) S3.bravo(R.id.composeView, inflate);
        if (composeView != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            Toolbar toolbar = (Toolbar) S3.bravo(R.id.toolbar, inflate);
            if (toolbar != null) {
                this.f12496J = new o(frameLayout, composeView, toolbar, 1);
                setContentView(frameLayout);
                o oVar = this.f12496J;
                if (oVar != null) {
                    ((Toolbar) oVar.red).setNavigationOnClickListener(new Fb.b(this, 3));
                    SupportViewModel supportViewModel = (SupportViewModel) this.f12495I.getValue();
                    if (getIntent().hasExtra("ORDER_ID")) {
                        str = "CAPTAINS_ORDER";
                    } else {
                        str = "CAPTAINS";
                    }
                    String str2 = str;
                    int intExtra = getIntent().getIntExtra("ORDER_ID", -1);
                    if (intExtra == -1) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(intExtra);
                    }
                    ?? auVar = new au(new C2492a(2, "loading"));
                    BaseViewModel.launchApi$default(supportViewModel, null, new Gc.l(supportViewModel, str2, valueOf, auVar, null), 1, null);
                    auVar.observe(this, new f(9, new Gc.a(this, 0)));
                    return;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            i4 = R.id.toolbar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }
}
