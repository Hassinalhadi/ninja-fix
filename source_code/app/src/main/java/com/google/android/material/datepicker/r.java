package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.au;
import androidx.recyclerview.widget.j0;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class r<S> extends ac {

    /* renamed from: a, reason: collision with root package name */
    public B2.ad f7987a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7988b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView f7989c;

    /* renamed from: d, reason: collision with root package name */
    public View f7990d;
    public View e;

    /* renamed from: f, reason: collision with root package name */
    public View f7991f;

    /* renamed from: g, reason: collision with root package name */
    public View f7992g;

    /* renamed from: h, reason: collision with root package name */
    public MaterialButton f7993h;

    /* renamed from: i, reason: collision with root package name */
    public AccessibilityManager f7994i;
    public int purple;
    public DateSelector red;
    public CalendarConstraints silver;
    public DayViewDecorator teal;
    public Month white;
    public int yellow;

    @Override // com.google.android.material.datepicker.ac
    public final void juliet(t tVar) {
        this.alpha.add(tVar);
    }

    public final void kilo(Month month) {
        boolean z2;
        ab abVar = (ab) this.f7989c.getAdapter();
        int golf = abVar.alpha.alpha.golf(month);
        AccessibilityManager accessibilityManager = this.f7994i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.white = month;
            this.f7989c.scrollToPosition(golf);
        } else {
            int golf2 = golf - abVar.alpha.alpha.golf(this.white);
            boolean z10 = false;
            if (Math.abs(golf2) > 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (golf2 > 0) {
                z10 = true;
            }
            this.white = month;
            if (z2 && z10) {
                this.f7989c.scrollToPosition(golf - 3);
                this.f7989c.post(new m(this, golf));
            } else if (z2) {
                this.f7989c.scrollToPosition(golf + 3);
                this.f7989c.post(new m(this, golf));
            } else {
                this.f7989c.post(new m(this, golf));
            }
        }
        mike(golf);
    }

    public final void lima(int i4) {
        this.yellow = i4;
        if (i4 == 2) {
            this.f7988b.getLayoutManager().n(this.white.red - ((al) this.f7988b.getAdapter()).alpha.silver.alpha.red);
            this.f7991f.setVisibility(0);
            this.f7992g.setVisibility(8);
            this.f7990d.setVisibility(8);
            this.e.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            this.f7991f.setVisibility(8);
            this.f7992g.setVisibility(0);
            this.f7990d.setVisibility(0);
            this.e.setVisibility(0);
            kilo(this.white);
        }
    }

    public final void mike(int i4) {
        boolean z2;
        View view = this.e;
        boolean z10 = true;
        if (i4 + 1 < this.f7989c.getAdapter().getItemCount()) {
            z2 = true;
        } else {
            z2 = false;
        }
        view.setEnabled(z2);
        View view2 = this.f7990d;
        if (i4 - 1 < 0) {
            z10 = false;
        }
        view2.setEnabled(z10);
    }

    @Override // androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.purple = bundle.getInt("THEME_RES_ID_KEY");
        this.red = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.silver = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.teal = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.white = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        int i5;
        k kVar;
        au auVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.purple);
        this.f7987a = new B2.ad(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f7994i = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month month = this.silver.alpha;
        if (v.uniform(R.attr.windowFullscreen, contextThemeWrapper)) {
            i4 = delivery.samurai.android.R.layout.mtrl_calendar_vertical;
            i5 = 1;
        } else {
            i4 = delivery.samurai.android.R.layout.mtrl_calendar_horizontal;
            i5 = 0;
        }
        View inflate = cloneInContext.inflate(i4, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(delivery.samurai.android.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(delivery.samurai.android.R.dimen.mtrl_calendar_days_of_week_height);
        int i10 = y.yellow;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_calendar_month_vertical_padding) * (i10 - 1)) + (resources.getDimensionPixelSize(delivery.samurai.android.R.dimen.mtrl_calendar_day_height) * i10) + resources.getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(delivery.samurai.android.R.id.mtrl_calendar_days_of_week);
        s1.au.november(gridView, new I1.c(2));
        int i11 = this.silver.teal;
        if (i11 > 0) {
            kVar = new k(i11);
        } else {
            kVar = new k();
        }
        gridView.setAdapter((ListAdapter) kVar);
        gridView.setNumColumns(month.silver);
        gridView.setEnabled(false);
        this.f7989c = (RecyclerView) inflate.findViewById(delivery.samurai.android.R.id.mtrl_calendar_months);
        getContext();
        this.f7989c.setLayoutManager(new n(this, i5, i5));
        this.f7989c.setTag("MONTHS_VIEW_GROUP_TAG");
        ab abVar = new ab(contextThemeWrapper, this.red, this.silver, this.teal, new o(this));
        this.f7989c.setAdapter(abVar);
        int integer = contextThemeWrapper.getResources().getInteger(delivery.samurai.android.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(delivery.samurai.android.R.id.mtrl_calendar_year_selector_frame);
        this.f7988b = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f7988b.setLayoutManager(new GridLayoutManager(integer));
            this.f7988b.setAdapter(new al(this));
            this.f7988b.addItemDecoration(new p(this));
        }
        View findViewById = inflate.findViewById(delivery.samurai.android.R.id.month_navigation_fragment_toggle);
        CalendarConstraints calendarConstraints = abVar.alpha;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(delivery.samurai.android.R.id.month_navigation_fragment_toggle);
            this.f7993h = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            s1.au.november(this.f7993h, new com.google.android.material.button.e(1, this));
            View findViewById2 = inflate.findViewById(delivery.samurai.android.R.id.month_navigation_previous);
            this.f7990d = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(delivery.samurai.android.R.id.month_navigation_next);
            this.e = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f7991f = inflate.findViewById(delivery.samurai.android.R.id.mtrl_calendar_year_selector_frame);
            this.f7992g = inflate.findViewById(delivery.samurai.android.R.id.mtrl_calendar_day_selector_frame);
            lima(1);
            this.f7993h.setText(this.white.foxtrot());
            this.f7989c.addOnScrollListener(new q(this, abVar));
            this.f7993h.setOnClickListener(new Z8.c(2, this));
            this.e.setOnClickListener(new l(this, abVar, 1));
            this.f7990d.setOnClickListener(new l(this, abVar, 0));
            mike(calendarConstraints.alpha.golf(this.white));
        }
        if (!v.uniform(R.attr.windowFullscreen, contextThemeWrapper) && (recyclerView2 = (auVar = new au()).alpha) != (recyclerView = this.f7989c)) {
            j0 j0Var = auVar.bravo;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(j0Var);
                auVar.alpha.setOnFlingListener(null);
            }
            auVar.alpha = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    auVar.alpha.addOnScrollListener(j0Var);
                    auVar.alpha.setOnFlingListener(auVar);
                    new Scroller(auVar.alpha.getContext(), new DecelerateInterpolator());
                    auVar.foxtrot();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        this.f7989c.scrollToPosition(calendarConstraints.alpha.golf(this.white));
        s1.au.november(this.f7989c, new I1.c(3));
        return inflate;
    }

    @Override // androidx.fragment.app.ai
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.purple);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.red);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.silver);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.teal);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.white);
    }
}
