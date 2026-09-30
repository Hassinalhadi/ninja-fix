package Gc;

import B9.ab;
import B9.am;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.an;
import com.app.network.network.models.Action;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.TicketActionType;
import com.clevertap.android.sdk.Constants;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.support.SupportViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.A0;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LGc/q;", "Lx9/a;", "<init>", "()V", "W8/a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class q extends i {

    /* renamed from: u, reason: collision with root package name */
    public final androidx.core.widget.f f1387u = new androidx.core.widget.f(18);

    /* renamed from: v, reason: collision with root package name */
    public ActionType f1388v;

    /* renamed from: w, reason: collision with root package name */
    public final ab f1389w;

    /* renamed from: x, reason: collision with root package name */
    public am f1390x;

    /* renamed from: y, reason: collision with root package name */
    public Yc.a f1391y;

    /* renamed from: z, reason: collision with root package name */
    public q3.g f1392z;
    public static final /* synthetic */ ge.v[] B = {kotlin.jvm.internal.u.alpha.foxtrot(new kotlin.jvm.internal.l(q.class, "orderId", "getOrderId()I", 0))};
    public static final W8.a A = new W8.a(4);

    public q() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Aa.g(21, new Aa.g(20, this)));
        this.f1389w = new ab(kotlin.jvm.internal.u.alpha.bravo(SupportViewModel.class), new Aa.h(alpha, 16), new Aa.i(12, this, alpha), new Aa.h(alpha, 17));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final int bronze() {
        ge.v property = B[0];
        androidx.core.widget.f fVar = this.f1387u;
        fVar.getClass();
        Intrinsics.echo(property, "property");
        Integer num = (Integer) fVar.purple;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Object delta = new com.google.gson.l().delta(ActionType.class, arguments.getString(Constants.KEY_TYPE));
            Intrinsics.delta(delta, "fromJson(...)");
            this.f1388v = (ActionType) delta;
            int i4 = arguments.getInt("orderId");
            ge.v property = B[0];
            Integer valueOf = Integer.valueOf(i4);
            androidx.core.widget.f fVar = this.f1387u;
            fVar.getClass();
            Intrinsics.echo(property, "property");
            fVar.purple = valueOf;
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.ticket_type_detail_fragment, viewGroup, false);
        ComposeView composeView = (ComposeView) S3.bravo(R.id.composeView, inflate);
        if (composeView != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.f1390x = new am(frameLayout, composeView);
            Intrinsics.delta(frameLayout, "getRoot(...)");
            return frameLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.composeView)));
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Action action;
        Object obj;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        amber();
        an requireActivity = requireActivity();
        Intrinsics.delta(requireActivity, "requireActivity(...)");
        q3.g gVar = this.f1392z;
        if (gVar != null) {
            this.f1391y = new Yc.a(requireActivity, gVar);
            ActionType actionType = this.f1388v;
            if (actionType != null) {
                List<Action> actions = actionType.getActions();
                if (actions != null) {
                    Iterator<T> it = actions.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Action action2 = (Action) obj;
                            if (action2.getEnabled() && action2.getActionType() == TicketActionType.DEEP_LINK) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    action = (Action) obj;
                } else {
                    action = null;
                }
                am amVar = this.f1390x;
                if (amVar != null) {
                    A0 a02 = A0.alpha;
                    ComposeView composeView = amVar.alpha;
                    composeView.setViewCompositionStrategy(a02);
                    composeView.setContent(new P.d(new Ac.n(this, composeView, action, 2), 914519867, true));
                    return;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima(Constants.KEY_TYPE);
            throw null;
        }
        Intrinsics.lima("featureFlagProvider");
        throw null;
    }
}
