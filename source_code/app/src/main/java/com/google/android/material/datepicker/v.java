package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.fragment.app.L;
import com.google.android.material.internal.CheckableImageButton;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import g.C1718a;
import j1.AbstractC1928b;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s1.au;
import s1.b0;
import s1.d0;
import s6.AbstractC2710m0;
import s6.AbstractC2815x7;
import s6.G7;
import t6.AbstractC3032n3;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public class v<S> extends DialogInterfaceOnCancelListenerC0627w {
    public CharSequence A;
    public int B;
    public CharSequence C;

    /* renamed from: D, reason: collision with root package name */
    public int f7995D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f7996E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f7997F;

    /* renamed from: G, reason: collision with root package name */
    public TextView f7998G;

    /* renamed from: H, reason: collision with root package name */
    public CheckableImageButton f7999H;

    /* renamed from: I, reason: collision with root package name */
    public g7.i f8000I;

    /* renamed from: J, reason: collision with root package name */
    public Button f8001J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f8002K;

    /* renamed from: L, reason: collision with root package name */
    public CharSequence f8003L;

    /* renamed from: M, reason: collision with root package name */
    public CharSequence f8004M;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f8005j = new LinkedHashSet();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f8006k = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f8007l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f8008m = new LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public int f8009n;

    /* renamed from: o, reason: collision with root package name */
    public DateSelector f8010o;

    /* renamed from: p, reason: collision with root package name */
    public ac f8011p;

    /* renamed from: q, reason: collision with root package name */
    public CalendarConstraints f8012q;

    /* renamed from: r, reason: collision with root package name */
    public DayViewDecorator f8013r;

    /* renamed from: s, reason: collision with root package name */
    public r f8014s;

    /* renamed from: t, reason: collision with root package name */
    public int f8015t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f8016u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8017v;

    /* renamed from: w, reason: collision with root package name */
    public int f8018w;

    /* renamed from: x, reason: collision with root package name */
    public int f8019x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f8020y;

    /* renamed from: z, reason: collision with root package name */
    public int f8021z;

    public static int tango(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(ai.hotel());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i4 = month.silver;
        return ((i4 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i4) + (dimensionPixelOffset * 2);
    }

    public static boolean uniform(int i4, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC2710m0.delta(context, R.attr.materialCalendarStyle, r.class.getCanonicalName()).data, new int[]{i4});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i4 = this.f8009n;
        if (i4 == 0) {
            i4 = sierra().silver(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i4);
        Context context = dialog.getContext();
        this.f8017v = uniform(android.R.attr.windowFullscreen, context);
        this.f8000I = new g7.i(context, null, R.attr.materialCalendarStyle, 2132083920);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, L6.a.whiskey, R.attr.materialCalendarStyle, 2132083920);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f8000I.mike(context);
        this.f8000I.quebec(ColorStateList.valueOf(color));
        this.f8000I.papa(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f8007l.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8009n = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f8010o = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f8012q = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8013r = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f8015t = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f8016u = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f8018w = bundle.getInt("INPUT_MODE_KEY");
        this.f8019x = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f8020y = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f8021z = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.A = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.B = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.C = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f7995D = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f7996E = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f8016u;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f8015t);
        }
        this.f8003L = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f8004M = charSequence;
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        boolean z2;
        if (this.f8017v) {
            i4 = R.layout.mtrl_picker_fullscreen;
        } else {
            i4 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i4, viewGroup);
        Context context = inflate.getContext();
        if (this.f8017v) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(tango(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(tango(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f7998G = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f7999H = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f7997F = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f7999H.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f7999H;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC3032n3.echo(R.drawable.material_ic_calendar_black_24dp, context));
        stateListDrawable.addState(new int[0], AbstractC3032n3.echo(R.drawable.material_ic_edit_black_24dp, context));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f7999H;
        if (this.f8018w != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkableImageButton2.setChecked(z2);
        au.november(this.f7999H, null);
        whiskey(this.f7999H);
        final int i5 = 2;
        this.f7999H.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.s
            public final /* synthetic */ v purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = 0;
                v vVar = this.purple;
                switch (i5) {
                    case 0:
                        Iterator it = vVar.f8005j.iterator();
                        while (it.hasNext()) {
                            Ba.c cVar = (Ba.c) it.next();
                            Object p4 = vVar.sierra().p();
                            switch (cVar.alpha) {
                                case 0:
                                    ((Ba.a) cVar.bravo).invoke(p4);
                                    break;
                                case 1:
                                    ((Cb.ad) cVar.bravo).invoke(p4);
                                    break;
                                default:
                                    int i11 = SignUpActivity.f12184d0;
                                    ((wa.i) cVar.bravo).invoke(p4);
                                    break;
                            }
                        }
                        vVar.lima(false, false);
                        return;
                    case 1:
                        Iterator it2 = vVar.f8006k.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        vVar.lima(false, false);
                        return;
                    default:
                        vVar.f8001J.setEnabled(vVar.sierra().d());
                        vVar.f7999H.toggle();
                        if (vVar.f8018w != 1) {
                            i10 = 1;
                        }
                        vVar.f8018w = i10;
                        vVar.whiskey(vVar.f7999H);
                        vVar.victor();
                        return;
                }
            }
        });
        this.f8001J = (Button) inflate.findViewById(R.id.confirm_button);
        if (sierra().d()) {
            this.f8001J.setEnabled(true);
        } else {
            this.f8001J.setEnabled(false);
        }
        this.f8001J.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f8020y;
        if (charSequence != null) {
            this.f8001J.setText(charSequence);
        } else {
            int i10 = this.f8019x;
            if (i10 != 0) {
                this.f8001J.setText(i10);
            }
        }
        CharSequence charSequence2 = this.A;
        if (charSequence2 != null) {
            this.f8001J.setContentDescription(charSequence2);
        } else if (this.f8021z != 0) {
            this.f8001J.setContentDescription(getContext().getResources().getText(this.f8021z));
        }
        final int i11 = 0;
        this.f8001J.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.s
            public final /* synthetic */ v purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = 0;
                v vVar = this.purple;
                switch (i11) {
                    case 0:
                        Iterator it = vVar.f8005j.iterator();
                        while (it.hasNext()) {
                            Ba.c cVar = (Ba.c) it.next();
                            Object p4 = vVar.sierra().p();
                            switch (cVar.alpha) {
                                case 0:
                                    ((Ba.a) cVar.bravo).invoke(p4);
                                    break;
                                case 1:
                                    ((Cb.ad) cVar.bravo).invoke(p4);
                                    break;
                                default:
                                    int i112 = SignUpActivity.f12184d0;
                                    ((wa.i) cVar.bravo).invoke(p4);
                                    break;
                            }
                        }
                        vVar.lima(false, false);
                        return;
                    case 1:
                        Iterator it2 = vVar.f8006k.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        vVar.lima(false, false);
                        return;
                    default:
                        vVar.f8001J.setEnabled(vVar.sierra().d());
                        vVar.f7999H.toggle();
                        if (vVar.f8018w != 1) {
                            i102 = 1;
                        }
                        vVar.f8018w = i102;
                        vVar.whiskey(vVar.f7999H);
                        vVar.victor();
                        return;
                }
            }
        });
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.C;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i12 = this.B;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        CharSequence charSequence4 = this.f7996E;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f7995D != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f7995D));
        }
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.s
            public final /* synthetic */ v purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = 0;
                v vVar = this.purple;
                switch (i13) {
                    case 0:
                        Iterator it = vVar.f8005j.iterator();
                        while (it.hasNext()) {
                            Ba.c cVar = (Ba.c) it.next();
                            Object p4 = vVar.sierra().p();
                            switch (cVar.alpha) {
                                case 0:
                                    ((Ba.a) cVar.bravo).invoke(p4);
                                    break;
                                case 1:
                                    ((Cb.ad) cVar.bravo).invoke(p4);
                                    break;
                                default:
                                    int i112 = SignUpActivity.f12184d0;
                                    ((wa.i) cVar.bravo).invoke(p4);
                                    break;
                            }
                        }
                        vVar.lima(false, false);
                        return;
                    case 1:
                        Iterator it2 = vVar.f8006k.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        vVar.lima(false, false);
                        return;
                    default:
                        vVar.f8001J.setEnabled(vVar.sierra().d());
                        vVar.f7999H.toggle();
                        if (vVar.f8018w != 1) {
                            i102 = 1;
                        }
                        vVar.f8018w = i102;
                        vVar.whiskey(vVar.f7999H);
                        vVar.victor();
                        return;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f8008m.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.datepicker.b, java.lang.Object] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onSaveInstanceState(Bundle bundle) {
        Month month;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f8009n);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f8010o);
        CalendarConstraints calendarConstraints = this.f8012q;
        ?? obj = new Object();
        obj.alpha = b.foxtrot;
        obj.bravo = b.golf;
        obj.echo = new DateValidatorPointForward(Long.MIN_VALUE);
        obj.alpha = calendarConstraints.alpha.white;
        obj.bravo = calendarConstraints.purple.white;
        obj.charlie = Long.valueOf(calendarConstraints.silver.white);
        obj.delta = calendarConstraints.teal;
        obj.echo = calendarConstraints.red;
        r rVar = this.f8014s;
        if (rVar == null) {
            month = null;
        } else {
            month = rVar.white;
        }
        if (month != null) {
            obj.charlie = Long.valueOf(month.white);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", obj.alpha());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f8013r);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f8015t);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f8016u);
        bundle.putInt("INPUT_MODE_KEY", this.f8018w);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f8019x);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f8020y);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f8021z);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.A);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.B);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.C);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f7995D);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f7996E);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Integer num;
        boolean z2;
        int i4;
        boolean z10;
        t6.ab b0Var;
        t6.ab b0Var2;
        super.onStart();
        Window window = november().getWindow();
        if (this.f8017v) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f8000I);
            if (!this.f8002K) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList bravo = G7.bravo(findViewById.getBackground());
                if (bravo != null) {
                    num = Integer.valueOf(bravo.getDefaultColor());
                } else {
                    num = null;
                }
                boolean z11 = false;
                if (num != null && num.intValue() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int delta = AbstractC2815x7.delta(window.getContext(), android.R.attr.colorBackground, ShapeBuilder.DEFAULT_SHAPE_COLOR);
                if (z2) {
                    num = Integer.valueOf(delta);
                }
                AbstractC3087z.charlie(window, false);
                window.getContext();
                Context context = window.getContext();
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 27) {
                    i4 = AbstractC1928b.delta(AbstractC2815x7.delta(context, android.R.attr.navigationBarColor, ShapeBuilder.DEFAULT_SHAPE_COLOR), 128);
                } else {
                    i4 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i4);
                boolean foxtrot = AbstractC2815x7.foxtrot(num.intValue());
                if (!AbstractC2815x7.foxtrot(0) && !foxtrot) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                C1718a c1718a = new C1718a(window.getDecorView());
                if (i5 >= 35) {
                    b0Var = new d0(window, c1718a);
                } else if (i5 >= 30) {
                    b0Var = new d0(window, c1718a);
                } else if (i5 >= 26) {
                    b0Var = new b0(window, c1718a);
                } else {
                    b0Var = new b0(window, c1718a);
                }
                b0Var.echo(z10);
                boolean foxtrot2 = AbstractC2815x7.foxtrot(delta);
                if (AbstractC2815x7.foxtrot(i4) || (i4 == 0 && foxtrot2)) {
                    z11 = true;
                }
                C1718a c1718a2 = new C1718a(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 35) {
                    b0Var2 = new d0(window, c1718a2);
                } else if (i10 >= 30) {
                    b0Var2 = new d0(window, c1718a2);
                } else if (i10 >= 26) {
                    b0Var2 = new b0(window, c1718a2);
                } else {
                    b0Var2 = new b0(window, c1718a2);
                }
                b0Var2.delta(z11);
                I0.i iVar = new I0.i(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = au.alpha;
                s1.al.lima(findViewById, iVar);
                this.f8002K = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f8000I, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new T6.a(november(), rect));
        }
        victor();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStop() {
        this.f8011p.alpha.clear();
        super.onStop();
    }

    public final DateSelector sierra() {
        if (this.f8010o == null) {
            this.f8010o = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f8010o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.material.datepicker.w, androidx.fragment.app.ai] */
    public final void victor() {
        CharSequence charSequence;
        Context requireContext = requireContext();
        int i4 = this.f8009n;
        if (i4 == 0) {
            i4 = sierra().silver(requireContext);
        }
        DateSelector sierra = sierra();
        CalendarConstraints calendarConstraints = this.f8012q;
        DayViewDecorator dayViewDecorator = this.f8013r;
        r rVar = new r();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", sierra);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.silver);
        rVar.setArguments(bundle);
        this.f8014s = rVar;
        if (this.f8018w == 1) {
            DateSelector sierra2 = sierra();
            CalendarConstraints calendarConstraints2 = this.f8012q;
            ?? wVar = new w();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i4);
            bundle2.putParcelable("DATE_SELECTOR_KEY", sierra2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            wVar.setArguments(bundle2);
            rVar = wVar;
        }
        this.f8011p = rVar;
        TextView textView = this.f7997F;
        if (this.f8018w == 1 && getResources().getConfiguration().orientation == 2) {
            charSequence = this.f8004M;
        } else {
            charSequence = this.f8003L;
        }
        textView.setText(charSequence);
        String quebec = sierra().quebec(getContext());
        this.f7998G.setContentDescription(sierra().peach(requireContext()));
        this.f7998G.setText(quebec);
        L childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C0606a c0606a = new C0606a(childFragmentManager);
        c0606a.echo(this.f8011p, null, R.id.mtrl_calendar_frame);
        if (!c0606a.golf) {
            c0606a.hotel = false;
            c0606a.romeo.amber(c0606a, false);
            this.f8011p.juliet(new t(this, 0));
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void whiskey(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f8018w == 1) {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f7999H.setContentDescription(string);
    }
}
