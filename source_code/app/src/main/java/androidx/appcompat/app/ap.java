package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC0449d;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Z0;
import androidx.appcompat.widget.e1;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s1.au;
import s1.az;

/* loaded from: classes3.dex */
public final class ap extends a implements InterfaceC0449d {
    public Context alpha;
    public Context bravo;
    public ActionBarOverlayLayout charlie;
    public ActionBarContainer delta;
    public Q echo;
    public ActionBarContextView foxtrot;
    public final View golf;
    public boolean hotel;
    public ao india;
    public ao juliet;
    public J2.e kilo;
    public boolean lima;
    public final ArrayList mike;
    public int november;
    public boolean oscar;
    public boolean papa;
    public boolean quebec;
    public boolean romeo;
    public boolean sierra;
    public an.k tango;
    public boolean uniform;
    public boolean victor;
    public final an whiskey;
    public final an xray;
    public final O7.j yankee;
    public static final AccelerateInterpolator zulu = new AccelerateInterpolator();
    public static final DecelerateInterpolator amber = new DecelerateInterpolator();

    public ap(Activity activity, boolean z2) {
        new ArrayList();
        this.mike = new ArrayList();
        this.november = 0;
        this.oscar = true;
        this.sierra = true;
        this.whiskey = new an(this, 0);
        this.xray = new an(this, 1);
        this.yankee = new O7.j(22, this);
        View decorView = activity.getWindow().getDecorView();
        yankee(decorView);
        if (z2) {
            return;
        }
        this.golf = decorView.findViewById(R.id.content);
    }

    public final void amber(boolean z2) {
        boolean z10;
        int i4 = 2;
        boolean z11 = this.papa;
        boolean z12 = this.quebec;
        if (this.romeo || (!z11 && !z12)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.golf;
        b7.m mVar = null;
        O7.j jVar = this.yankee;
        if (z10) {
            if (!this.sierra) {
                this.sierra = true;
                an.k kVar = this.tango;
                if (kVar != null) {
                    kVar.alpha();
                }
                this.delta.setVisibility(0);
                int i5 = this.november;
                an anVar = this.xray;
                if (i5 == 0 && (this.uniform || z2)) {
                    this.delta.setTranslationY(0.0f);
                    float f5 = -this.delta.getHeight();
                    if (z2) {
                        this.delta.getLocationInWindow(new int[]{0, 0});
                        f5 -= r13[1];
                    }
                    this.delta.setTranslationY(f5);
                    an.k kVar2 = new an.k();
                    az alpha = au.alpha(this.delta);
                    alpha.echo(0.0f);
                    View view2 = (View) alpha.alpha.get();
                    if (view2 != null) {
                        if (jVar != null) {
                            mVar = new b7.m(i4, jVar, view2);
                        }
                        view2.animate().setUpdateListener(mVar);
                    }
                    boolean z13 = kVar2.echo;
                    ArrayList arrayList = kVar2.alpha;
                    if (!z13) {
                        arrayList.add(alpha);
                    }
                    if (this.oscar && view != null) {
                        view.setTranslationY(f5);
                        az alpha2 = au.alpha(view);
                        alpha2.echo(0.0f);
                        if (!kVar2.echo) {
                            arrayList.add(alpha2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = amber;
                    boolean z14 = kVar2.echo;
                    if (!z14) {
                        kVar2.charlie = decelerateInterpolator;
                    }
                    if (!z14) {
                        kVar2.bravo = 250L;
                    }
                    if (!z14) {
                        kVar2.delta = anVar;
                    }
                    this.tango = kVar2;
                    kVar2.bravo();
                } else {
                    this.delta.setAlpha(1.0f);
                    this.delta.setTranslationY(0.0f);
                    if (this.oscar && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    anVar.bravo();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.charlie;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = au.alpha;
                    s1.aj.charlie(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.sierra) {
            this.sierra = false;
            an.k kVar3 = this.tango;
            if (kVar3 != null) {
                kVar3.alpha();
            }
            int i10 = this.november;
            an anVar2 = this.whiskey;
            if (i10 == 0 && (this.uniform || z2)) {
                this.delta.setAlpha(1.0f);
                this.delta.setTransitioning(true);
                an.k kVar4 = new an.k();
                float f10 = -this.delta.getHeight();
                if (z2) {
                    this.delta.getLocationInWindow(new int[]{0, 0});
                    f10 -= r13[1];
                }
                az alpha3 = au.alpha(this.delta);
                alpha3.echo(f10);
                View view3 = (View) alpha3.alpha.get();
                if (view3 != null) {
                    if (jVar != null) {
                        mVar = new b7.m(i4, jVar, view3);
                    }
                    view3.animate().setUpdateListener(mVar);
                }
                boolean z15 = kVar4.echo;
                ArrayList arrayList2 = kVar4.alpha;
                if (!z15) {
                    arrayList2.add(alpha3);
                }
                if (this.oscar && view != null) {
                    az alpha4 = au.alpha(view);
                    alpha4.echo(f10);
                    if (!kVar4.echo) {
                        arrayList2.add(alpha4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = zulu;
                boolean z16 = kVar4.echo;
                if (!z16) {
                    kVar4.charlie = accelerateInterpolator;
                }
                if (!z16) {
                    kVar4.bravo = 250L;
                }
                if (!z16) {
                    kVar4.delta = anVar2;
                }
                this.tango = kVar4;
                kVar4.bravo();
                return;
            }
            anVar2.bravo();
        }
    }

    @Override // androidx.appcompat.app.a
    public final boolean bravo() {
        Z0 z02;
        ao.n nVar;
        Q q4 = this.echo;
        if (q4 != null && (z02 = ((e1) q4).alpha.f2827F) != null && z02.purple != null) {
            Z0 z03 = ((e1) q4).alpha.f2827F;
            if (z03 == null) {
                nVar = null;
            } else {
                nVar = z03.purple;
            }
            if (nVar != null) {
                nVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public final void charlie(boolean z2) {
        if (z2 != this.lima) {
            this.lima = z2;
            ArrayList arrayList = this.mike;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // androidx.appcompat.app.a
    public final int delta() {
        return ((e1) this.echo).bravo;
    }

    @Override // androidx.appcompat.app.a
    public final Context echo() {
        if (this.bravo == null) {
            TypedValue typedValue = new TypedValue();
            this.alpha.getTheme().resolveAttribute(delivery.samurai.android.R.attr.actionBarWidgetTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.bravo = new ContextThemeWrapper(this.alpha, i4);
            } else {
                this.bravo = this.alpha;
            }
        }
        return this.bravo;
    }

    @Override // androidx.appcompat.app.a
    public final void foxtrot() {
        if (!this.papa) {
            this.papa = true;
            amber(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public final void hotel() {
        zulu(this.alpha.getResources().getBoolean(delivery.samurai.android.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.a
    public final boolean juliet(int i4, KeyEvent keyEvent) {
        ao.l lVar;
        ao aoVar = this.india;
        if (aoVar == null || (lVar = aoVar.silver) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z2 = false;
        }
        lVar.setQwertyMode(z2);
        return lVar.performShortcut(i4, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final void mike(ColorDrawable colorDrawable) {
        this.delta.setPrimaryBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.a
    public final void november(boolean z2) {
        if (!this.hotel) {
            oscar(z2);
        }
    }

    @Override // androidx.appcompat.app.a
    public final void oscar(boolean z2) {
        int i4;
        if (z2) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        e1 e1Var = (e1) this.echo;
        int i5 = e1Var.bravo;
        this.hotel = true;
        e1Var.alpha((i4 & 4) | (i5 & (-5)));
    }

    @Override // androidx.appcompat.app.a
    public final void papa(boolean z2) {
        int i4;
        if (z2) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        e1 e1Var = (e1) this.echo;
        e1Var.alpha((i4 & 2) | (e1Var.bravo & (-3)));
    }

    @Override // androidx.appcompat.app.a
    public final void quebec(int i4) {
        ((e1) this.echo).bravo(i4);
    }

    @Override // androidx.appcompat.app.a
    public final void romeo(Drawable drawable) {
        e1 e1Var = (e1) this.echo;
        e1Var.foxtrot = drawable;
        int i4 = e1Var.bravo & 4;
        Toolbar toolbar = e1Var.alpha;
        if (i4 != 0) {
            if (drawable == null) {
                drawable = e1Var.oscar;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    @Override // androidx.appcompat.app.a
    public final void sierra(boolean z2) {
        an.k kVar;
        this.uniform = z2;
        if (!z2 && (kVar = this.tango) != null) {
            kVar.alpha();
        }
    }

    @Override // androidx.appcompat.app.a
    public final void tango(CharSequence charSequence) {
        e1 e1Var = (e1) this.echo;
        e1Var.golf = true;
        e1Var.hotel = charSequence;
        if ((e1Var.bravo & 8) != 0) {
            Toolbar toolbar = e1Var.alpha;
            toolbar.setTitle(charSequence);
            if (e1Var.golf) {
                au.oscar(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final void uniform(CharSequence charSequence) {
        e1 e1Var = (e1) this.echo;
        if (!e1Var.golf) {
            e1Var.hotel = charSequence;
            if ((e1Var.bravo & 8) != 0) {
                Toolbar toolbar = e1Var.alpha;
                toolbar.setTitle(charSequence);
                if (e1Var.golf) {
                    au.oscar(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final void victor() {
        if (this.papa) {
            this.papa = false;
            amber(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public final an.b whiskey(J2.e eVar) {
        ao aoVar = this.india;
        if (aoVar != null) {
            aoVar.alpha();
        }
        this.charlie.setHideOnContentScrollEnabled(false);
        this.foxtrot.echo();
        ao aoVar2 = new ao(this, this.foxtrot.getContext(), eVar);
        ao.l lVar = aoVar2.silver;
        lVar.whiskey();
        try {
            if (((an.a) aoVar2.teal.purple).pink(aoVar2, lVar)) {
                this.india = aoVar2;
                aoVar2.golf();
                this.foxtrot.charlie(aoVar2);
                xray(true);
                return aoVar2;
            }
            return null;
        } finally {
            lVar.victor();
        }
    }

    public final void xray(boolean z2) {
        az india;
        az azVar;
        long j5;
        if (z2) {
            if (!this.romeo) {
                this.romeo = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.charlie;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                amber(false);
            }
        } else if (this.romeo) {
            this.romeo = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.charlie;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            amber(false);
        }
        if (this.delta.isLaidOut()) {
            if (z2) {
                e1 e1Var = (e1) this.echo;
                india = au.alpha(e1Var.alpha);
                india.alpha(0.0f);
                india.charlie(100L);
                india.delta(new an.j(e1Var, 4));
                azVar = this.foxtrot.india(0, 200L);
            } else {
                e1 e1Var2 = (e1) this.echo;
                az alpha = au.alpha(e1Var2.alpha);
                alpha.alpha(1.0f);
                alpha.charlie(200L);
                alpha.delta(new an.j(e1Var2, 0));
                india = this.foxtrot.india(8, 100L);
                azVar = alpha;
            }
            an.k kVar = new an.k();
            ArrayList arrayList = kVar.alpha;
            arrayList.add(india);
            View view = (View) india.alpha.get();
            if (view != null) {
                j5 = view.animate().getDuration();
            } else {
                j5 = 0;
            }
            View view2 = (View) azVar.alpha.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j5);
            }
            arrayList.add(azVar);
            kVar.bravo();
            return;
        }
        if (z2) {
            ((e1) this.echo).alpha.setVisibility(4);
            this.foxtrot.setVisibility(0);
        } else {
            ((e1) this.echo).alpha.setVisibility(0);
            this.foxtrot.setVisibility(8);
        }
    }

    public final void yankee(View view) {
        String str;
        Q wrapper;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(delivery.samurai.android.R.id.decor_content_parent);
        this.charlie = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(delivery.samurai.android.R.id.action_bar);
        if (findViewById instanceof Q) {
            wrapper = (Q) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = BuildConfig.TRAVIS;
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.echo = wrapper;
        this.foxtrot = (ActionBarContextView) view.findViewById(delivery.samurai.android.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(delivery.samurai.android.R.id.action_bar_container);
        this.delta = actionBarContainer;
        Q q4 = this.echo;
        if (q4 != null && this.foxtrot != null && actionBarContainer != null) {
            Context context = ((e1) q4).alpha.getContext();
            this.alpha = context;
            if ((((e1) this.echo).bravo & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.hotel = true;
            }
            int i4 = context.getApplicationInfo().targetSdkVersion;
            this.echo.getClass();
            zulu(context.getResources().getBoolean(delivery.samurai.android.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.alpha.obtainStyledAttributes(null, aj.a.alpha, delivery.samurai.android.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.charlie;
                if (actionBarOverlayLayout2.yellow) {
                    this.victor = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.delta;
                WeakHashMap weakHashMap = au.alpha;
                s1.al.kilo(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(ap.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void zulu(boolean z2) {
        if (!z2) {
            ((e1) this.echo).getClass();
            this.delta.setTabContainer(null);
        } else {
            this.delta.setTabContainer(null);
            ((e1) this.echo).getClass();
        }
        this.echo.getClass();
        ((e1) this.echo).alpha.setCollapsible(false);
        this.charlie.setHasNonEmbeddedTabs(false);
    }

    public ap(Dialog dialog) {
        new ArrayList();
        this.mike = new ArrayList();
        this.november = 0;
        this.oscar = true;
        this.sierra = true;
        this.whiskey = new an(this, 0);
        this.xray = new an(this, 1);
        this.yankee = new O7.j(22, this);
        yankee(dialog.getWindow().getDecorView());
    }
}
