package Wc;

import Lb.C;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.T;
import androidx.lifecycle.ag;
import androidx.lifecycle.al;
import com.app.network.network.models.Payment;
import com.app.network.network.models.PaymentSession;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.component.CheckoutComponentConfigurationKt;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.model.PaymentSessionResponse;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.C2889G;
import t6.S3;
import vf.Y;
import vf.ao;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWc/l;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class l extends a {

    /* renamed from: v, reason: collision with root package name */
    public PaymentSession f2229v;

    /* renamed from: x, reason: collision with root package name */
    public final B9.ab f2231x;

    /* renamed from: y, reason: collision with root package name */
    public J2.t f2232y;

    /* renamed from: z, reason: collision with root package name */
    public Payment f2233z;

    /* renamed from: u, reason: collision with root package name */
    public int f2228u = -1;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2230w = true;

    public l() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C(21, new C(20, this)));
        this.f2231x = new B9.ab(kotlin.jvm.internal.u.alpha.bravo(WithDrawHistoryViewModel.class), new Qb.l(alpha, 12), new Aa.i(27, this, alpha), new Qb.l(alpha, 13));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final J2.t bronze() {
        J2.t tVar = this.f2232y;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final WithDrawHistoryViewModel coral() {
        return (WithDrawHistoryViewModel) this.f2231x.getValue();
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_top_up, viewGroup, false);
        int i4 = R.id.btnDismiss;
        ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnDismiss, inflate);
        if (imageButton != null) {
            i4 = R.id.composeFlow;
            ComposeView composeView = (ComposeView) S3.bravo(R.id.composeFlow, inflate);
            if (composeView != null) {
                i4 = R.id.title;
                if (((TextView) S3.bravo(R.id.title, inflate)) != null) {
                    this.f2232y = new J2.t((ConstraintLayout) inflate, imageButton, composeView);
                    return (ConstraintLayout) bronze().alpha;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:8:0x0059, B:10:0x007c, B:14:0x0088, B:16:0x008c, B:17:0x0092, B:19:0x009a, B:21:0x00a1, B:23:0x009e), top: B:7:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:8:0x0059, B:10:0x007c, B:14:0x0088, B:16:0x008c, B:17:0x0092, B:19:0x009a, B:21:0x00a1, B:23:0x009e), top: B:7:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:8:0x0059, B:10:0x007c, B:14:0x0088, B:16:0x008c, B:17:0x0092, B:19:0x009a, B:21:0x00a1, B:23:0x009e), top: B:7:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Payment payment;
        String str2;
        Environment environment;
        final int i4 = 1;
        final int i5 = 0;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f14101q) {
            ((ComposeView) bronze().red).setBackgroundColor(0);
            ((ComposeView) bronze().red).setViewCompositionStrategy(C2889G.teal);
            ((ImageButton) bronze().purple).setOnClickListener(new Fb.b(this, 20));
            Context requireContext = requireContext();
            Intrinsics.delta(requireContext, "requireContext(...)");
            this.f2233z = L9.d.papa(requireContext);
            PaymentSession paymentSession = this.f2229v;
            if (paymentSession != null && this.f2228u != -1) {
                try {
                    victor().bronze();
                    Context requireContext2 = requireContext();
                    Intrinsics.delta(requireContext2, "requireContext(...)");
                    PaymentSessionResponse paymentSessionResponse = new PaymentSessionResponse(paymentSession.getId(), paymentSession.getToken(), paymentSession.getSecret());
                    Payment payment2 = this.f2233z;
                    if (payment2 != null) {
                        str = payment2.getPublicKey();
                        if (str == null) {
                        }
                        String str3 = str;
                        payment = this.f2233z;
                        if (payment == null) {
                            str2 = payment.getEnvironment();
                        } else {
                            str2 = null;
                        }
                        if (!kotlin.text.r.hotel(str2, "SANDBOX", true)) {
                            environment = Environment.SANDBOX;
                        } else {
                            environment = Environment.PRODUCTION;
                        }
                        CheckoutComponentConfiguration CheckoutComponentConfiguration$default = CheckoutComponentConfigurationKt.CheckoutComponentConfiguration$default(requireContext2, str3, environment, paymentSessionResponse, null, null, null, null, null, new ComponentCallback(new Function1(this) { // from class: Wc.c
                            public final /* synthetic */ l purple;

                            {
                                this.purple = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                PaymentMethodComponent it = (PaymentMethodComponent) obj;
                                switch (i5) {
                                    case 0:
                                        Intrinsics.echo(it, "it");
                                        l lVar = this.purple;
                                        lVar.victor().tango();
                                        ((ComposeView) lVar.bronze().red).setVisibility(0);
                                        return Unit.INSTANCE;
                                    default:
                                        Intrinsics.echo(it, "it");
                                        this.purple.victor().tango();
                                        return Unit.INSTANCE;
                                }
                            }
                        }, null, new Function1(this) { // from class: Wc.c
                            public final /* synthetic */ l purple;

                            {
                                this.purple = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                PaymentMethodComponent it = (PaymentMethodComponent) obj;
                                switch (i4) {
                                    case 0:
                                        Intrinsics.echo(it, "it");
                                        l lVar = this.purple;
                                        lVar.victor().tango();
                                        ((ComposeView) lVar.bronze().red).setVisibility(0);
                                        return Unit.INSTANCE;
                                    default:
                                        Intrinsics.echo(it, "it");
                                        this.purple.victor().tango();
                                        return Unit.INSTANCE;
                                }
                            }
                        }, new Xd.l(this) { // from class: Wc.d
                            public final /* synthetic */ l purple;

                            {
                                this.purple = this;
                            }

                            @Override // Xd.l
                            public final Object invoke(Object obj, Object obj2) {
                                PaymentMethodComponent paymentMethodComponent = (PaymentMethodComponent) obj;
                                switch (i5) {
                                    case 0:
                                        Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                        Intrinsics.echo((String) obj2, "<unused var>");
                                        l lVar = this.purple;
                                        lVar.victor().tango();
                                        long j5 = lVar.f2228u;
                                        lVar.victor().bronze();
                                        WithDrawHistoryViewModel coral = lVar.coral();
                                        Y y10 = coral.golf;
                                        if (y10 == null || !y10.echo()) {
                                            coral.golf = vf.ad.zulu(T.hotel(coral), null, null, new x(coral, j5, null), 3);
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        CheckoutError err = (CheckoutError) obj2;
                                        Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                        Intrinsics.echo(err, "err");
                                        l lVar2 = this.purple;
                                        lVar2.coral().alpha();
                                        lVar2.victor().tango();
                                        if (!lVar2.isAdded()) {
                                            return Unit.INSTANCE;
                                        }
                                        new AlertDialog.Builder(lVar2.requireContext()).setTitle(R.string.transaction_failed).setMessage(err.getMessage()).setPositiveButton(android.R.string.ok, new e(lVar2, 1)).create().show();
                                        return Unit.INSTANCE;
                                }
                            }
                        }, new Xd.l(this) { // from class: Wc.d
                            public final /* synthetic */ l purple;

                            {
                                this.purple = this;
                            }

                            @Override // Xd.l
                            public final Object invoke(Object obj, Object obj2) {
                                PaymentMethodComponent paymentMethodComponent = (PaymentMethodComponent) obj;
                                switch (i4) {
                                    case 0:
                                        Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                        Intrinsics.echo((String) obj2, "<unused var>");
                                        l lVar = this.purple;
                                        lVar.victor().tango();
                                        long j5 = lVar.f2228u;
                                        lVar.victor().bronze();
                                        WithDrawHistoryViewModel coral = lVar.coral();
                                        Y y10 = coral.golf;
                                        if (y10 == null || !y10.echo()) {
                                            coral.golf = vf.ad.zulu(T.hotel(coral), null, null, new x(coral, j5, null), 3);
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        CheckoutError err = (CheckoutError) obj2;
                                        Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                        Intrinsics.echo(err, "err");
                                        l lVar2 = this.purple;
                                        lVar2.coral().alpha();
                                        lVar2.victor().tango();
                                        if (!lVar2.isAdded()) {
                                            return Unit.INSTANCE;
                                        }
                                        new AlertDialog.Builder(lVar2.requireContext()).setTitle(R.string.transaction_failed).setMessage(err.getMessage()).setPositiveButton(android.R.string.ok, new e(lVar2, 1)).create().show();
                                        return Unit.INSTANCE;
                                }
                            }
                        }, null, null, null, null, 482, null), 496, null);
                        ag foxtrot = T.foxtrot(this);
                        Cf.e eVar = ao.alpha;
                        vf.ad.zulu(foxtrot, Af.n.alpha, null, new f(CheckoutComponentConfiguration$default, this, null), 2);
                    }
                    str = "";
                    String str32 = str;
                    payment = this.f2233z;
                    if (payment == null) {
                    }
                    if (!kotlin.text.r.hotel(str2, "SANDBOX", true)) {
                    }
                    CheckoutComponentConfiguration CheckoutComponentConfiguration$default2 = CheckoutComponentConfigurationKt.CheckoutComponentConfiguration$default(requireContext2, str32, environment, paymentSessionResponse, null, null, null, null, null, new ComponentCallback(new Function1(this) { // from class: Wc.c
                        public final /* synthetic */ l purple;

                        {
                            this.purple = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            PaymentMethodComponent it = (PaymentMethodComponent) obj;
                            switch (i5) {
                                case 0:
                                    Intrinsics.echo(it, "it");
                                    l lVar = this.purple;
                                    lVar.victor().tango();
                                    ((ComposeView) lVar.bronze().red).setVisibility(0);
                                    return Unit.INSTANCE;
                                default:
                                    Intrinsics.echo(it, "it");
                                    this.purple.victor().tango();
                                    return Unit.INSTANCE;
                            }
                        }
                    }, null, new Function1(this) { // from class: Wc.c
                        public final /* synthetic */ l purple;

                        {
                            this.purple = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            PaymentMethodComponent it = (PaymentMethodComponent) obj;
                            switch (i4) {
                                case 0:
                                    Intrinsics.echo(it, "it");
                                    l lVar = this.purple;
                                    lVar.victor().tango();
                                    ((ComposeView) lVar.bronze().red).setVisibility(0);
                                    return Unit.INSTANCE;
                                default:
                                    Intrinsics.echo(it, "it");
                                    this.purple.victor().tango();
                                    return Unit.INSTANCE;
                            }
                        }
                    }, new Xd.l(this) { // from class: Wc.d
                        public final /* synthetic */ l purple;

                        {
                            this.purple = this;
                        }

                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            PaymentMethodComponent paymentMethodComponent = (PaymentMethodComponent) obj;
                            switch (i5) {
                                case 0:
                                    Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                    Intrinsics.echo((String) obj2, "<unused var>");
                                    l lVar = this.purple;
                                    lVar.victor().tango();
                                    long j5 = lVar.f2228u;
                                    lVar.victor().bronze();
                                    WithDrawHistoryViewModel coral = lVar.coral();
                                    Y y10 = coral.golf;
                                    if (y10 == null || !y10.echo()) {
                                        coral.golf = vf.ad.zulu(T.hotel(coral), null, null, new x(coral, j5, null), 3);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    CheckoutError err = (CheckoutError) obj2;
                                    Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                    Intrinsics.echo(err, "err");
                                    l lVar2 = this.purple;
                                    lVar2.coral().alpha();
                                    lVar2.victor().tango();
                                    if (!lVar2.isAdded()) {
                                        return Unit.INSTANCE;
                                    }
                                    new AlertDialog.Builder(lVar2.requireContext()).setTitle(R.string.transaction_failed).setMessage(err.getMessage()).setPositiveButton(android.R.string.ok, new e(lVar2, 1)).create().show();
                                    return Unit.INSTANCE;
                            }
                        }
                    }, new Xd.l(this) { // from class: Wc.d
                        public final /* synthetic */ l purple;

                        {
                            this.purple = this;
                        }

                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            PaymentMethodComponent paymentMethodComponent = (PaymentMethodComponent) obj;
                            switch (i4) {
                                case 0:
                                    Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                    Intrinsics.echo((String) obj2, "<unused var>");
                                    l lVar = this.purple;
                                    lVar.victor().tango();
                                    long j5 = lVar.f2228u;
                                    lVar.victor().bronze();
                                    WithDrawHistoryViewModel coral = lVar.coral();
                                    Y y10 = coral.golf;
                                    if (y10 == null || !y10.echo()) {
                                        coral.golf = vf.ad.zulu(T.hotel(coral), null, null, new x(coral, j5, null), 3);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    CheckoutError err = (CheckoutError) obj2;
                                    Intrinsics.echo(paymentMethodComponent, "<unused var>");
                                    Intrinsics.echo(err, "err");
                                    l lVar2 = this.purple;
                                    lVar2.coral().alpha();
                                    lVar2.victor().tango();
                                    if (!lVar2.isAdded()) {
                                        return Unit.INSTANCE;
                                    }
                                    new AlertDialog.Builder(lVar2.requireContext()).setTitle(R.string.transaction_failed).setMessage(err.getMessage()).setPositiveButton(android.R.string.ok, new e(lVar2, 1)).create().show();
                                    return Unit.INSTANCE;
                            }
                        }
                    }, null, null, null, null, 482, null), 496, null);
                    ag foxtrot2 = T.foxtrot(this);
                    Cf.e eVar2 = ao.alpha;
                    vf.ad.zulu(foxtrot2, Af.n.alpha, null, new f(CheckoutComponentConfiguration$default2, this, null), 2);
                } catch (Exception unused) {
                    if (isAdded()) {
                        new AlertDialog.Builder(requireContext()).setTitle(R.string.wallet_top_up_title).setMessage(R.string.error_something_went_wrong).setPositiveButton(android.R.string.ok, new e(this, 0)).create().show();
                    }
                }
            }
            al viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            vf.ad.zulu(T.foxtrot(viewLifecycleOwner), null, null, new k(this, null), 3);
        }
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF42x() {
        return this.f2230w;
    }
}
