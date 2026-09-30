package Nc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ai;
import com.app.network.network.models.Root;
import delivery.samurai.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t0.A0;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNc/n;", "Landroidx/fragment/app/ai;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n extends ai {
    public J2.l alpha;
    public final Lazy purple;
    public final Lazy red;

    public n() {
        final int i4 = 0;
        this.purple = LazyKt.lazy(new Function0(this) { // from class: Nc.m
            public final /* synthetic */ n purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                switch (i4) {
                    case 0:
                        Bundle arguments = this.purple.getArguments();
                        int i5 = -1;
                        if (arguments != null) {
                            i5 = arguments.getInt("order_id", -1);
                        }
                        return Integer.valueOf(i5);
                    default:
                        Bundle arguments2 = this.purple.getArguments();
                        if (arguments2 != null && (string = arguments2.getString("root")) != null) {
                            return (Root) new com.google.gson.l().delta(Root.class, string);
                        }
                        return null;
                }
            }
        });
        final int i5 = 1;
        this.red = LazyKt.lazy(new Function0(this) { // from class: Nc.m
            public final /* synthetic */ n purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                switch (i5) {
                    case 0:
                        Bundle arguments = this.purple.getArguments();
                        int i52 = -1;
                        if (arguments != null) {
                            i52 = arguments.getInt("order_id", -1);
                        }
                        return Integer.valueOf(i52);
                    default:
                        Bundle arguments2 = this.purple.getArguments();
                        if (arguments2 != null && (string = arguments2.getString("root")) != null) {
                            return (Root) new com.google.gson.l().delta(Root.class, string);
                        }
                        return null;
                }
            }
        });
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_ticket_sub_types, viewGroup, false);
        int i4 = R.id.composeView;
        ComposeView composeView = (ComposeView) S3.bravo(R.id.composeView, inflate);
        if (composeView != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            Toolbar toolbar = (Toolbar) S3.bravo(R.id.toolbar, inflate);
            if (toolbar != null) {
                this.alpha = new J2.l(frameLayout, composeView, toolbar);
                Intrinsics.delta(frameLayout, "getRoot(...)");
                return frameLayout;
            }
            i4 = R.id.toolbar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        J2.l lVar = this.alpha;
        if (lVar != null) {
            Root root = (Root) this.red.getValue();
            if (root != null) {
                str = root.getName();
            } else {
                str = null;
            }
            ((Toolbar) lVar.purple).setTitle(str);
            J2.l lVar2 = this.alpha;
            if (lVar2 != null) {
                ((Toolbar) lVar2.purple).setNavigationOnClickListener(new Fb.b(this, 6));
                J2.l lVar3 = this.alpha;
                if (lVar3 != null) {
                    A0 a02 = A0.alpha;
                    ComposeView composeView = (ComposeView) lVar3.alpha;
                    composeView.setViewCompositionStrategy(a02);
                    composeView.setContent(new P.d(new Ac.k(12, this), -399460727, true));
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
}
