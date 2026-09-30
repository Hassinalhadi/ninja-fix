package androidx.navigation.fragment;

import Y1.ag;
import Y1.aw;
import Yb.C0312j0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import c2.h;
import delivery.samurai.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC2991f2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/ai;", "", "<init>", "()V", "J2/f", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class NavHostFragment extends ai {
    public final Lazy alpha = LazyKt.lazy(new C0312j0(13, this));
    public View purple;
    public int red;
    public boolean silver;

    public final ag juliet() {
        return (ag) this.alpha.getValue();
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Context context) {
        Intrinsics.echo(context, "context");
        super.onAttach(context);
        if (this.silver) {
            L parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0606a c0606a = new C0606a(parentFragmentManager);
            c0606a.november(this);
            c0606a.india();
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        juliet();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.silver = true;
            L parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0606a c0606a = new C0606a(parentFragmentManager);
            c0606a.november(this);
            c0606a.india();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.delta(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id2);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.ai
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.purple;
        if (view != null && AbstractC2991f2.echo(view) == juliet()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.purple = null;
    }

    @Override // androidx.fragment.app.ai
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, aw.bravo);
        Intrinsics.delta(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.red = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, h.charlie);
        Intrinsics.delta(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.silver = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.ai
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.echo(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.silver) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, juliet());
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getParent() != null) {
                Object parent = viewGroup.getParent();
                Intrinsics.charlie(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.purple = view2;
                Intrinsics.checkNotNull(view2);
                if (view2.getId() == getId()) {
                    View view3 = this.purple;
                    Intrinsics.checkNotNull(view3);
                    ag juliet = juliet();
                    Intrinsics.echo(view3, "view");
                    view3.setTag(R.id.nav_controller_view_tag, juliet);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}
