package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0488x;
import androidx.appcompat.widget.P0;
import androidx.appcompat.widget.S;
import androidx.camera.core.impl.ai;
import androidx.customview.view.AbsSavedState;
import com.SecurityGuardBrige.ArchersSmoothLoginers.FeatureAccessGuard;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.internal.z;
import g1.AbstractC1735d;
import g7.C1755a;
import id.C1915c;
import j1.AbstractC1928b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import l3.AbstractC2056a;
import l7.AbstractC2059a;
import s1.au;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;
import s6.AbstractC2815x7;
import s6.Q4;
import s6.R4;
import t6.AbstractC3032n3;
import x2.C3286g;
import x2.ad;
import x2.aw;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: w0, reason: collision with root package name */
    public static final int[][] f8158w0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public g7.i A;
    public StateListDrawable B;
    public boolean C;

    /* renamed from: D, reason: collision with root package name */
    public g7.i f8159D;

    /* renamed from: E, reason: collision with root package name */
    public g7.i f8160E;

    /* renamed from: F, reason: collision with root package name */
    public g7.m f8161F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8162G;

    /* renamed from: H, reason: collision with root package name */
    public final int f8163H;

    /* renamed from: I, reason: collision with root package name */
    public int f8164I;

    /* renamed from: J, reason: collision with root package name */
    public int f8165J;

    /* renamed from: K, reason: collision with root package name */
    public int f8166K;

    /* renamed from: L, reason: collision with root package name */
    public int f8167L;

    /* renamed from: M, reason: collision with root package name */
    public int f8168M;

    /* renamed from: N, reason: collision with root package name */
    public int f8169N;

    /* renamed from: O, reason: collision with root package name */
    public int f8170O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f8171P;
    public final Rect Q;

    /* renamed from: R, reason: collision with root package name */
    public final RectF f8172R;

    /* renamed from: S, reason: collision with root package name */
    public Typeface f8173S;

    /* renamed from: T, reason: collision with root package name */
    public ColorDrawable f8174T;

    /* renamed from: U, reason: collision with root package name */
    public int f8175U;

    /* renamed from: V, reason: collision with root package name */
    public final LinkedHashSet f8176V;

    /* renamed from: W, reason: collision with root package name */
    public ColorDrawable f8177W;

    /* renamed from: a, reason: collision with root package name */
    public int f8178a;

    /* renamed from: a0, reason: collision with root package name */
    public int f8179a0;
    public final FrameLayout alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f8180b;

    /* renamed from: b0, reason: collision with root package name */
    public Drawable f8181b0;

    /* renamed from: c, reason: collision with root package name */
    public int f8182c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f8183c0;

    /* renamed from: d, reason: collision with root package name */
    public final p f8184d;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f8185d0;
    public boolean e;

    /* renamed from: e0, reason: collision with root package name */
    public int f8186e0;

    /* renamed from: f, reason: collision with root package name */
    public int f8187f;

    /* renamed from: f0, reason: collision with root package name */
    public int f8188f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8189g;

    /* renamed from: g0, reason: collision with root package name */
    public int f8190g0;

    /* renamed from: h, reason: collision with root package name */
    public x f8191h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f8192h0;

    /* renamed from: i, reason: collision with root package name */
    public AppCompatTextView f8193i;

    /* renamed from: i0, reason: collision with root package name */
    public int f8194i0;

    /* renamed from: j, reason: collision with root package name */
    public int f8195j;

    /* renamed from: j0, reason: collision with root package name */
    public int f8196j0;

    /* renamed from: k, reason: collision with root package name */
    public int f8197k;

    /* renamed from: k0, reason: collision with root package name */
    public int f8198k0;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f8199l;

    /* renamed from: l0, reason: collision with root package name */
    public int f8200l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8201m;

    /* renamed from: m0, reason: collision with root package name */
    public int f8202m0;

    /* renamed from: n, reason: collision with root package name */
    public AppCompatTextView f8203n;

    /* renamed from: n0, reason: collision with root package name */
    public int f8204n0;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f8205o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f8206o0;

    /* renamed from: p, reason: collision with root package name */
    public int f8207p;

    /* renamed from: p0, reason: collision with root package name */
    public final com.google.android.material.internal.b f8208p0;
    public final u purple;

    /* renamed from: q, reason: collision with root package name */
    public C3286g f8209q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f8210q0;

    /* renamed from: r, reason: collision with root package name */
    public C3286g f8211r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f8212r0;
    public final l red;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f8213s;

    /* renamed from: s0, reason: collision with root package name */
    public ValueAnimator f8214s0;
    public final int silver;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f8215t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f8216t0;
    public EditText teal;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f8217u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f8218u0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f8219v;
    public boolean v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8220w;
    public CharSequence white;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f8221x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8222y;
    public int yellow;

    /* renamed from: z, reason: collision with root package name */
    public g7.i f8223z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public CharSequence red;
        public boolean silver;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.silver = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.red) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            TextUtils.writeToParcel(this.red, parcel, i4);
            parcel.writeInt(this.silver ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, delivery.samurai.android.R.attr.textInputStyle, 2132083665), attributeSet, delivery.samurai.android.R.attr.textInputStyle);
        this.yellow = -1;
        this.f8178a = -1;
        this.f8180b = -1;
        this.f8182c = -1;
        this.f8184d = new p(this);
        this.f8191h = new S7.a(27);
        this.f8171P = new Rect();
        this.Q = new Rect();
        this.f8172R = new RectF();
        this.f8176V = new LinkedHashSet();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f8208p0 = bVar;
        this.v0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.alpha = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = M6.a.alpha;
        bVar.olive = linearInterpolator;
        bVar.lima(false);
        bVar.ochre = linearInterpolator;
        bVar.lima(false);
        bVar.sierra(8388659);
        int[] iArr = L6.a.lime;
        z.alpha(context2, attributeSet, delivery.samurai.android.R.attr.textInputStyle, 2132083665);
        z.bravo(context2, attributeSet, iArr, delivery.samurai.android.R.attr.textInputStyle, 2132083665, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, delivery.samurai.android.R.attr.textInputStyle, 2132083665);
        C1915c c1915c = new C1915c(context2, obtainStyledAttributes);
        u uVar = new u(this, c1915c);
        this.purple = uVar;
        this.f8220w = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f8212r0 = obtainStyledAttributes.getBoolean(47, true);
        this.f8210q0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f8161F = g7.m.charlie(context2, attributeSet, delivery.samurai.android.R.attr.textInputStyle, 2132083665).alpha();
        this.f8163H = context2.getResources().getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f8165J = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.silver = getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f8167L = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f8168M = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f8166K = this.f8167L;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        g7.l golf = this.f8161F.golf();
        if (dimension >= 0.0f) {
            golf.echo = new C1755a(dimension);
        }
        if (dimension2 >= 0.0f) {
            golf.foxtrot = new C1755a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            golf.golf = new C1755a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            golf.hotel = new C1755a(dimension4);
        }
        this.f8161F = golf.alpha();
        ColorStateList bravo = AbstractC2719n0.bravo(context2, c1915c, 7);
        if (bravo != null) {
            int defaultColor = bravo.getDefaultColor();
            this.f8194i0 = defaultColor;
            this.f8170O = defaultColor;
            if (bravo.isStateful()) {
                this.f8196j0 = bravo.getColorForState(new int[]{-16842910}, -1);
                this.f8198k0 = bravo.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f8200l0 = bravo.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f8198k0 = this.f8194i0;
                ColorStateList charlie = AbstractC1735d.charlie(delivery.samurai.android.R.color.mtrl_filled_background_color, context2);
                this.f8196j0 = charlie.getColorForState(new int[]{-16842910}, -1);
                this.f8200l0 = charlie.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f8170O = 0;
            this.f8194i0 = 0;
            this.f8196j0 = 0;
            this.f8198k0 = 0;
            this.f8200l0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList november = c1915c.november(1);
            this.f8185d0 = november;
            this.f8183c0 = november;
        }
        ColorStateList bravo2 = AbstractC2719n0.bravo(context2, c1915c, 14);
        this.f8190g0 = obtainStyledAttributes.getColor(14, 0);
        this.f8186e0 = context2.getColor(delivery.samurai.android.R.color.mtrl_textinput_default_box_stroke_color);
        this.f8202m0 = context2.getColor(delivery.samurai.android.R.color.mtrl_textinput_disabled_color);
        this.f8188f0 = context2.getColor(delivery.samurai.android.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (bravo2 != null) {
            setBoxStrokeColorStateList(bravo2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC2719n0.bravo(context2, c1915c, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.f8217u = c1915c.november(24);
        this.f8219v = c1915c.november(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i4 = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z11 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f8197k = obtainStyledAttributes.getResourceId(22, 0);
        this.f8195j = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.f8195j);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f8197k);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c1915c.november(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c1915c.november(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c1915c.november(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c1915c.november(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c1915c.november(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c1915c.november(59));
        }
        l lVar = new l(this, c1915c);
        this.red = lVar;
        boolean z12 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        c1915c.xray();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(lVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z2);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        int i4;
        EditText editText = this.teal;
        if ((editText instanceof AutoCompleteTextView) && !AbstractC2056a.bravo(editText)) {
            int charlie = AbstractC2815x7.charlie(delivery.samurai.android.R.attr.colorControlHighlight, this.teal);
            int i5 = this.f8164I;
            int[][] iArr = f8158w0;
            if (i5 == 2) {
                Context context = getContext();
                g7.i iVar = this.f8223z;
                TypedValue delta = AbstractC2710m0.delta(context, delivery.samurai.android.R.attr.colorSurface, "TextInputLayout");
                int i10 = delta.resourceId;
                if (i10 != 0) {
                    i4 = context.getColor(i10);
                } else {
                    i4 = delta.data;
                }
                g7.i iVar2 = new g7.i(iVar.purple.alpha);
                int golf = AbstractC2815x7.golf(0.1f, charlie, i4);
                iVar2.quebec(new ColorStateList(iArr, new int[]{golf, 0}));
                iVar2.setTint(i4);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{golf, i4});
                g7.i iVar3 = new g7.i(iVar.purple.alpha);
                iVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar2, iVar3), iVar});
            }
            if (i5 == 1) {
                g7.i iVar4 = this.f8223z;
                int i11 = this.f8170O;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC2815x7.golf(0.1f, charlie, i11), i11}), iVar4, iVar4);
            }
            return null;
        }
        return this.f8223z;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.B == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.B = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.B.addState(new int[0], hotel(false));
        }
        return this.B;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.A == null) {
            this.A = hotel(true);
        }
        return this.A;
    }

    public static void mike(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                mike((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.teal == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.teal = editText;
            int i4 = this.yellow;
            if (i4 != -1) {
                setMinEms(i4);
            } else {
                setMinWidth(this.f8180b);
            }
            int i5 = this.f8178a;
            if (i5 != -1) {
                setMaxEms(i5);
            } else {
                setMaxWidth(this.f8182c);
            }
            this.C = false;
            kilo();
            setTextInputAccessibilityDelegate(new w(this));
            Typeface typeface = this.teal.getTypeface();
            com.google.android.material.internal.b bVar = this.f8208p0;
            boolean tango = bVar.tango(typeface);
            boolean zulu = bVar.zulu(typeface);
            if (tango || zulu) {
                bVar.lima(false);
            }
            bVar.yankee(this.teal.getTextSize());
            float letterSpacing = this.teal.getLetterSpacing();
            if (bVar.yellow != letterSpacing) {
                bVar.yellow = letterSpacing;
                bVar.lima(false);
            }
            int gravity = this.teal.getGravity();
            bVar.sierra((gravity & (-113)) | 48);
            bVar.xray(gravity);
            this.f8204n0 = editText.getMinimumHeight();
            this.teal.addTextChangedListener(new v(this, editText));
            if (this.f8183c0 == null) {
                this.f8183c0 = this.teal.getHintTextColors();
            }
            if (this.f8220w) {
                if (TextUtils.isEmpty(this.f8221x)) {
                    CharSequence hint = this.teal.getHint();
                    this.white = hint;
                    setHint(hint);
                    this.teal.setHint((CharSequence) null);
                }
                this.f8222y = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                romeo();
            }
            if (this.f8193i != null) {
                papa(this.teal.getText());
            }
            tango();
            this.f8184d.bravo();
            this.purple.bringToFront();
            l lVar = this.red;
            lVar.bringToFront();
            Iterator it = this.f8176V.iterator();
            while (it.hasNext()) {
                ((k) it.next()).alpha(this);
            }
            lVar.mike();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            whiskey(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f8221x)) {
            this.f8221x = charSequence;
            this.f8208p0.azure(charSequence);
            if (!this.f8206o0) {
                lima();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f8201m == z2) {
            return;
        }
        if (z2) {
            AppCompatTextView appCompatTextView = this.f8203n;
            if (appCompatTextView != null) {
                this.alpha.addView(appCompatTextView);
                this.f8203n.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f8203n;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f8203n = null;
        }
        this.f8201m = z2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.alpha;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            victor();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i4, layoutParams);
    }

    public final void alpha() {
        if (this.teal != null) {
            boolean z2 = true;
            if (this.f8164I == 1) {
                if (getHintMaxLines() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    EditText editText = this.teal;
                    editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f8208p0.golf() + this.silver), this.teal.getPaddingEnd(), getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText2 = this.teal;
                    editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.material_filled_edittext_font_2_0_padding_top), this.teal.getPaddingEnd(), getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                } else if (AbstractC2719n0.foxtrot(getContext())) {
                    EditText editText3 = this.teal;
                    editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.material_filled_edittext_font_1_3_padding_top), this.teal.getPaddingEnd(), getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                }
            }
        }
    }

    public final void bravo(float f5) {
        int i4 = 1;
        com.google.android.material.internal.b bVar = this.f8208p0;
        if (bVar.bravo == f5) {
            return;
        }
        if (this.f8214s0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8214s0 = valueAnimator;
            valueAnimator.setInterpolator(x2.q.foxtrot(getContext(), delivery.samurai.android.R.attr.motionEasingEmphasizedInterpolator, M6.a.bravo));
            this.f8214s0.setDuration(x2.q.echo(getContext(), delivery.samurai.android.R.attr.motionDurationMedium4, FeatureAccessGuard.FEATURE_PANEL));
            this.f8214s0.addUpdateListener(new com.google.android.material.appbar.f(i4, this));
        }
        this.f8214s0.setFloatValues(bVar.bravo, f5);
        this.f8214s0.start();
    }

    public final void charlie() {
        ColorStateList valueOf;
        int i4;
        int i5;
        g7.i iVar = this.f8223z;
        if (iVar == null) {
            return;
        }
        g7.m mVar = iVar.purple.alpha;
        g7.m mVar2 = this.f8161F;
        if (mVar != mVar2) {
            iVar.setShapeAppearanceModel(mVar2);
        }
        if (this.f8164I == 2 && (i4 = this.f8166K) > -1 && (i5 = this.f8169N) != 0) {
            g7.i iVar2 = this.f8223z;
            iVar2.purple.kilo = i4;
            iVar2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i5);
            g7.g gVar = iVar2.purple;
            if (gVar.echo != valueOf2) {
                gVar.echo = valueOf2;
                iVar2.onStateChange(iVar2.getState());
            }
        }
        int i10 = this.f8170O;
        if (this.f8164I == 1) {
            i10 = AbstractC1928b.bravo(this.f8170O, AbstractC2815x7.delta(getContext(), delivery.samurai.android.R.attr.colorSurface, 0));
        }
        this.f8170O = i10;
        this.f8223z.quebec(ColorStateList.valueOf(i10));
        g7.i iVar3 = this.f8159D;
        if (iVar3 != null && this.f8160E != null) {
            if (this.f8166K > -1 && this.f8169N != 0) {
                if (this.teal.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f8186e0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f8169N);
                }
                iVar3.quebec(valueOf);
                this.f8160E.quebec(ColorStateList.valueOf(this.f8169N));
            }
            invalidate();
        }
        uniform();
    }

    public final Rect delta(Rect rect) {
        boolean z2;
        if (this.teal != null) {
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i4 = rect.bottom;
            Rect rect2 = this.Q;
            rect2.bottom = i4;
            int i5 = this.f8164I;
            if (i5 != 1) {
                if (i5 != 2) {
                    rect2.left = india(rect.left, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = juliet(rect.right, z2);
                    return rect2;
                }
                rect2.left = this.teal.getPaddingLeft() + rect.left;
                rect2.top = rect.top - echo();
                rect2.right = rect.right - this.teal.getPaddingRight();
                return rect2;
            }
            rect2.left = india(rect.left, z2);
            rect2.top = rect.top + this.f8165J;
            rect2.right = juliet(rect.right, z2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.teal;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.white != null) {
            boolean z2 = this.f8222y;
            this.f8222y = false;
            CharSequence hint = editText.getHint();
            this.teal.setHint(this.white);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
                return;
            } finally {
                this.teal.setHint(hint);
                this.f8222y = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i4);
        onProvideAutofillVirtualStructure(viewStructure, i4);
        FrameLayout frameLayout = this.alpha;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
            View childAt = frameLayout.getChildAt(i5);
            ViewStructure newChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(newChild, i4);
            if (childAt == this.teal) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f8218u0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f8218u0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g7.i iVar;
        super.draw(canvas);
        boolean z2 = this.f8220w;
        com.google.android.material.internal.b bVar = this.f8208p0;
        if (z2) {
            bVar.foxtrot(canvas);
        }
        if (this.f8160E != null && (iVar = this.f8159D) != null) {
            iVar.draw(canvas);
            if (this.teal.isFocused()) {
                Rect bounds = this.f8160E.getBounds();
                Rect bounds2 = this.f8159D.getBounds();
                float f5 = bVar.bravo;
                int centerX = bounds2.centerX();
                bounds.left = M6.a.charlie(centerX, bounds2.left, f5);
                bounds.right = M6.a.charlie(centerX, bounds2.right, f5);
                this.f8160E.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.f8216t0) {
            return;
        }
        boolean z10 = true;
        this.f8216t0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f8208p0;
        if (bVar != null) {
            bVar.lime = drawableState;
            ColorStateList colorStateList2 = bVar.papa;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.oscar) != null && colorStateList.isStateful())) {
                bVar.lima(false);
                z2 = true;
                if (this.teal != null) {
                    if (!isLaidOut() || !isEnabled()) {
                        z10 = false;
                    }
                    whiskey(z10, false);
                }
                tango();
                zulu();
                if (z2) {
                    invalidate();
                }
                this.f8216t0 = false;
            }
        }
        z2 = false;
        if (this.teal != null) {
        }
        tango();
        zulu();
        if (z2) {
        }
        this.f8216t0 = false;
    }

    public final int echo() {
        if (this.f8220w) {
            int i4 = this.f8164I;
            com.google.android.material.internal.b bVar = this.f8208p0;
            if (i4 != 0) {
                if (i4 == 2) {
                    boolean z2 = true;
                    if (getHintMaxLines() != 1) {
                        z2 = false;
                    }
                    if (z2) {
                        return (int) (bVar.golf() / 2.0f);
                    }
                    float golf = bVar.golf();
                    TextPaint textPaint = bVar.navy;
                    textPaint.setTextSize(bVar.november);
                    textPaint.setTypeface(bVar.xray);
                    textPaint.setLetterSpacing(bVar.white);
                    return Math.max(0, (int) (golf - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) bVar.golf();
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x2.z, x2.g, x2.aw] */
    public final C3286g foxtrot() {
        ?? awVar = new aw();
        awVar.red = x2.q.echo(getContext(), delivery.samurai.android.R.attr.motionDurationShort2, 87);
        awVar.silver = x2.q.foxtrot(getContext(), delivery.samurai.android.R.attr.motionEasingLinearInterpolator, M6.a.alpha);
        return awVar;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.teal;
        if (editText != null) {
            return echo() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public g7.i getBoxBackground() {
        int i4 = this.f8164I;
        if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException();
        }
        return this.f8223z;
    }

    public int getBoxBackgroundColor() {
        return this.f8170O;
    }

    public int getBoxBackgroundMode() {
        return this.f8164I;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f8165J;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f8172R;
        if (layoutDirection == 1) {
            return this.f8161F.hotel.alpha(rectF);
        }
        return this.f8161F.golf.alpha(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f8172R;
        if (layoutDirection == 1) {
            return this.f8161F.golf.alpha(rectF);
        }
        return this.f8161F.hotel.alpha(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f8172R;
        if (layoutDirection == 1) {
            return this.f8161F.echo.alpha(rectF);
        }
        return this.f8161F.foxtrot.alpha(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f8172R;
        if (layoutDirection == 1) {
            return this.f8161F.foxtrot.alpha(rectF);
        }
        return this.f8161F.echo.alpha(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f8190g0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8192h0;
    }

    public int getBoxStrokeWidth() {
        return this.f8167L;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f8168M;
    }

    public int getCounterMaxLength() {
        return this.f8187f;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.e && this.f8189g && (appCompatTextView = this.f8193i) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8215t;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8213s;
    }

    public ColorStateList getCursorColor() {
        return this.f8217u;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f8219v;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8183c0;
    }

    public EditText getEditText() {
        return this.teal;
    }

    public CharSequence getEndIconContentDescription() {
        return this.red.yellow.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.red.yellow.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.red.f8228f;
    }

    public int getEndIconMode() {
        return this.red.f8225b;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.red.f8229g;
    }

    public CheckableImageButton getEndIconView() {
        return this.red.yellow;
    }

    public CharSequence getError() {
        p pVar = this.f8184d;
        if (pVar.quebec) {
            return pVar.papa;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f8184d.tango;
    }

    public CharSequence getErrorContentDescription() {
        return this.f8184d.sierra;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f8184d.romeo;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.red.red.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.f8184d;
        if (pVar.xray) {
            return pVar.whiskey;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f8184d.yankee;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f8220w) {
            return this.f8221x;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f8208p0.golf();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.b bVar = this.f8208p0;
        return bVar.hotel(bVar.papa);
    }

    public int getHintMaxLines() {
        return this.f8208p0.f8056g;
    }

    public ColorStateList getHintTextColor() {
        return this.f8185d0;
    }

    public x getLengthCounter() {
        return this.f8191h;
    }

    public int getMaxEms() {
        return this.f8178a;
    }

    public int getMaxWidth() {
        return this.f8182c;
    }

    public int getMinEms() {
        return this.yellow;
    }

    public int getMinWidth() {
        return this.f8180b;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.red.yellow.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.red.yellow.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8201m) {
            return this.f8199l;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8207p;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8205o;
    }

    public CharSequence getPrefixText() {
        return this.purple.red;
    }

    public ColorStateList getPrefixTextColor() {
        return this.purple.purple.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.purple.purple;
    }

    public g7.m getShapeAppearanceModel() {
        return this.f8161F;
    }

    public CharSequence getStartIconContentDescription() {
        return this.purple.silver.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.purple.silver.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.purple.yellow;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.purple.f8242a;
    }

    public CharSequence getSuffixText() {
        return this.red.f8231i;
    }

    public ColorStateList getSuffixTextColor() {
        return this.red.f8232j.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.red.f8232j;
    }

    public Typeface getTypeface() {
        return this.f8173S;
    }

    public final boolean golf() {
        if (this.f8220w && !TextUtils.isEmpty(this.f8221x) && (this.f8223z instanceof f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [g7.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [s6.Q4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [s6.Q4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [s6.Q4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [s6.Q4, java.lang.Object] */
    public final g7.i hotel(boolean z2) {
        float f5;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i4;
        int i5 = 0;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_shape_corner_size_small_component);
        if (z2) {
            f5 = dimensionPixelOffset2;
        } else {
            f5 = 0.0f;
        }
        EditText editText = this.teal;
        if (editText instanceof s) {
            dimensionPixelOffset = ((s) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(delivery.samurai.android.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        g7.f fVar = new g7.f(i5);
        g7.f fVar2 = new g7.f(i5);
        g7.f fVar3 = new g7.f(i5);
        g7.f fVar4 = new g7.f(i5);
        C1755a c1755a = new C1755a(f5);
        C1755a c1755a2 = new C1755a(f5);
        C1755a c1755a3 = new C1755a(dimensionPixelOffset2);
        C1755a c1755a4 = new C1755a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.alpha = obj;
        obj5.bravo = obj2;
        obj5.charlie = obj3;
        obj5.delta = obj4;
        obj5.echo = c1755a;
        obj5.foxtrot = c1755a2;
        obj5.golf = c1755a4;
        obj5.hotel = c1755a3;
        obj5.india = fVar;
        obj5.juliet = fVar2;
        obj5.kilo = fVar3;
        obj5.lima = fVar4;
        EditText editText2 = this.teal;
        if (editText2 instanceof s) {
            colorStateList = ((s) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = g7.i.f12648y;
            TypedValue delta = AbstractC2710m0.delta(context, delivery.samurai.android.R.attr.colorSurface, g7.i.class.getSimpleName());
            int i10 = delta.resourceId;
            if (i10 != 0) {
                i4 = context.getColor(i10);
            } else {
                i4 = delta.data;
            }
            colorStateList = ColorStateList.valueOf(i4);
        }
        g7.i iVar = new g7.i();
        iVar.mike(context);
        iVar.quebec(colorStateList);
        iVar.papa(dimensionPixelOffset);
        iVar.setShapeAppearanceModel(obj5);
        g7.g gVar = iVar.purple;
        if (gVar.hotel == null) {
            gVar.hotel = new Rect();
        }
        iVar.purple.hotel.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int india(int i4, boolean z2) {
        int compoundPaddingLeft;
        if (!z2 && getPrefixText() != null) {
            compoundPaddingLeft = this.purple.alpha();
        } else if (z2 && getSuffixText() != null) {
            compoundPaddingLeft = this.red.charlie();
        } else {
            compoundPaddingLeft = this.teal.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i4;
    }

    public final int juliet(int i4, boolean z2) {
        int compoundPaddingRight;
        if (!z2 && getSuffixText() != null) {
            compoundPaddingRight = this.red.charlie();
        } else if (z2 && getPrefixText() != null) {
            compoundPaddingRight = this.purple.alpha();
        } else {
            compoundPaddingRight = this.teal.getCompoundPaddingRight();
        }
        return i4 - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.google.android.material.textfield.f, g7.i] */
    public final void kilo() {
        int i4 = this.f8164I;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    if (this.f8220w && !(this.f8223z instanceof f)) {
                        g7.m mVar = this.f8161F;
                        int i5 = f.B;
                        if (mVar == null) {
                            mVar = new g7.m();
                        }
                        e eVar = new e(mVar, new RectF());
                        ?? iVar = new g7.i(eVar);
                        iVar.A = eVar;
                        this.f8223z = iVar;
                    } else {
                        this.f8223z = new g7.i(this.f8161F);
                    }
                    this.f8159D = null;
                    this.f8160E = null;
                } else {
                    throw new IllegalArgumentException(P0.cyan(new StringBuilder(), this.f8164I, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.f8223z = new g7.i(this.f8161F);
                this.f8159D = new g7.i();
                this.f8160E = new g7.i();
            }
        } else {
            this.f8223z = null;
            this.f8159D = null;
            this.f8160E = null;
        }
        uniform();
        zulu();
        if (this.f8164I == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f8165J = getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC2719n0.foxtrot(getContext())) {
                this.f8165J = getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        alpha();
        if (this.f8164I != 0) {
            victor();
        }
        EditText editText = this.teal;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f8164I;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lima() {
        float f5;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int i4;
        float f13;
        int i5;
        if (golf()) {
            int width = this.teal.getWidth();
            int gravity = this.teal.getGravity();
            com.google.android.material.internal.b bVar = this.f8208p0;
            boolean charlie = bVar.charlie(bVar.crimson);
            bVar.emerald = charlie;
            Rect rect = bVar.hotel;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (charlie) {
                        f5 = rect.right;
                        f10 = bVar.f8053c;
                    } else {
                        i5 = rect.left;
                        f11 = i5;
                    }
                } else if (charlie) {
                    i5 = rect.left;
                    f11 = i5;
                } else {
                    f5 = rect.right;
                    f10 = bVar.f8053c;
                }
                float max = Math.max(f11, rect.left);
                rectF = this.f8172R;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (bVar.emerald) {
                            i4 = rect.right;
                            f12 = i4;
                        } else {
                            f13 = bVar.f8053c;
                            f12 = f13 + max;
                        }
                    } else if (bVar.emerald) {
                        f13 = bVar.f8053c;
                        f12 = f13 + max;
                    } else {
                        i4 = rect.right;
                        f12 = i4;
                    }
                } else {
                    f12 = (width / 2.0f) + (bVar.f8053c / 2.0f);
                }
                rectF.right = Math.min(f12, rect.right);
                rectF.bottom = bVar.golf() + rect.top;
                if (bVar.f8052b != null && !bVar.beige()) {
                    StaticLayout staticLayout = bVar.f8052b;
                    float lineWidth = (bVar.november / bVar.mike) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (!bVar.emerald) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f14 = rectF.left;
                    float f15 = this.f8163H;
                    rectF.left = f14 - f15;
                    rectF.right += f15;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f8166K);
                    rectF.top = 0.0f;
                    f fVar = (f) this.f8223z;
                    fVar.getClass();
                    fVar.yankee(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f5 = width / 2.0f;
            f10 = bVar.f8053c / 2.0f;
            f11 = f5 - f10;
            float max2 = Math.max(f11, rect.left);
            rectF = this.f8172R;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity == 17) {
            }
            f12 = (width / 2.0f) + (bVar.f8053c / 2.0f);
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = bVar.golf() + rect.top;
            if (bVar.f8052b != null) {
                StaticLayout staticLayout2 = bVar.f8052b;
                float lineWidth2 = (bVar.november / bVar.mike) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (!bVar.emerald) {
                }
            }
            if (rectF.width() <= 0.0f) {
            }
        }
    }

    public final void november(AppCompatTextView appCompatTextView, int i4) {
        try {
            appCompatTextView.setTextAppearance(i4);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(2132083192);
        appCompatTextView.setTextColor(getContext().getColor(delivery.samurai.android.R.color.design_error));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8208p0.kilo(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        l lVar = this.red;
        lVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.v0 = false;
        if (this.teal != null && this.teal.getMeasuredHeight() < (max = Math.max(lVar.getMeasuredHeight(), this.purple.getMeasuredHeight()))) {
            this.teal.setMinimumHeight(max);
            z2 = true;
        }
        boolean sierra = sierra();
        if (!z2 && !sierra) {
            return;
        }
        this.teal.post(new ai(26, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        float india;
        boolean z10;
        int i12;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z2, i4, i5, i10, i11);
        EditText editText = this.teal;
        if (editText != null) {
            Rect rect = this.f8171P;
            com.google.android.material.internal.c.alpha(this, editText, rect);
            g7.i iVar = this.f8159D;
            if (iVar != null) {
                int i13 = rect.bottom;
                iVar.setBounds(rect.left, i13 - this.f8167L, rect.right, i13);
            }
            g7.i iVar2 = this.f8160E;
            if (iVar2 != null) {
                int i14 = rect.bottom;
                iVar2.setBounds(rect.left, i14 - this.f8168M, rect.right, i14);
            }
            if (this.f8220w) {
                float textSize = this.teal.getTextSize();
                com.google.android.material.internal.b bVar = this.f8208p0;
                bVar.yankee(textSize);
                int gravity = this.teal.getGravity();
                bVar.sierra((gravity & (-113)) | 48);
                bVar.xray(gravity);
                Rect delta = delta(rect);
                bVar.oscar(delta.left, delta.top, delta.right, delta.bottom);
                if (this.teal != null) {
                    int hintMaxLines = getHintMaxLines();
                    TextPaint textPaint = bVar.navy;
                    if (hintMaxLines == 1) {
                        textPaint.setTextSize(bVar.mike);
                        textPaint.setTypeface(bVar.amber);
                        textPaint.setLetterSpacing(bVar.yellow);
                        india = -textPaint.ascent();
                    } else {
                        india = bVar.india() * bVar.quebec;
                    }
                    int compoundPaddingLeft = this.teal.getCompoundPaddingLeft() + rect.left;
                    Rect rect2 = this.Q;
                    rect2.left = compoundPaddingLeft;
                    if (this.f8164I == 1 && this.teal.getMinLines() <= 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        compoundPaddingTop = (int) (rect.centerY() - (india / 2.0f));
                    } else {
                        if (this.f8164I == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(bVar.mike);
                            textPaint.setTypeface(bVar.amber);
                            textPaint.setLetterSpacing(bVar.yellow);
                            i12 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i12 = 0;
                        }
                        compoundPaddingTop = (this.teal.getCompoundPaddingTop() + rect.top) - i12;
                    }
                    rect2.top = compoundPaddingTop;
                    rect2.right = rect.right - this.teal.getCompoundPaddingRight();
                    if (this.f8164I == 1 && this.teal.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect2.top + india);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.teal.getCompoundPaddingBottom();
                    }
                    int i15 = compoundPaddingBottom;
                    rect2.bottom = i15;
                    bVar.uniform(true, rect2.left, rect2.top, rect2.right, i15);
                    bVar.lima(false);
                    if (golf() && !this.f8206o0) {
                        lima();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        float f5;
        boolean z2;
        float f10;
        EditText editText;
        super.onMeasure(i4, i5);
        boolean z10 = this.v0;
        l lVar = this.red;
        if (!z10) {
            lVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.v0 = true;
        }
        if (this.f8203n != null && (editText = this.teal) != null) {
            this.f8203n.setGravity(editText.getGravity());
            this.f8203n.setPadding(this.teal.getCompoundPaddingLeft(), this.teal.getCompoundPaddingTop(), this.teal.getCompoundPaddingRight(), this.teal.getCompoundPaddingBottom());
        }
        lVar.mike();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.teal.getMeasuredWidth() - this.teal.getCompoundPaddingLeft()) - this.teal.getCompoundPaddingRight();
            com.google.android.material.internal.b bVar = this.f8208p0;
            TextPaint textPaint = bVar.navy;
            textPaint.setTextSize(bVar.november);
            textPaint.setTypeface(bVar.xray);
            textPaint.setLetterSpacing(bVar.white);
            float f11 = measuredWidth;
            bVar.f8061l = bVar.echo(bVar.f8057h, textPaint, bVar.crimson, (bVar.november / bVar.mike) * f11, bVar.emerald).getHeight();
            textPaint.setTextSize(bVar.mike);
            textPaint.setTypeface(bVar.amber);
            textPaint.setLetterSpacing(bVar.yellow);
            bVar.f8062m = bVar.echo(bVar.f8056g, textPaint, bVar.crimson, f11, bVar.emerald).getHeight();
            EditText editText2 = this.teal;
            Rect rect = this.f8171P;
            com.google.android.material.internal.c.alpha(this, editText2, rect);
            Rect delta = delta(rect);
            bVar.oscar(delta.left, delta.top, delta.right, delta.bottom);
            victor();
            alpha();
            if (this.teal != null) {
                int i10 = bVar.f8062m;
                if (i10 != -1) {
                    f5 = i10;
                } else {
                    TextPaint textPaint2 = bVar.navy;
                    textPaint2.setTextSize(bVar.mike);
                    textPaint2.setTypeface(bVar.amber);
                    textPaint2.setLetterSpacing(bVar.yellow);
                    f5 = -textPaint2.ascent();
                }
                float f12 = 0.0f;
                if (this.f8199l != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.f8203n.getPaint());
                    textPaint3.setTextSize(this.f8203n.getTextSize());
                    textPaint3.setTypeface(this.f8203n.getTypeface());
                    textPaint3.setLetterSpacing(this.f8203n.getLetterSpacing());
                    try {
                        com.google.android.material.internal.u uVar = new com.google.android.material.internal.u(this.f8199l, textPaint3, measuredWidth);
                        if (getLayoutDirection() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        uVar.kilo = z2;
                        uVar.juliet = true;
                        float lineSpacingExtra = this.f8203n.getLineSpacingExtra();
                        float lineSpacingMultiplier = this.f8203n.getLineSpacingMultiplier();
                        uVar.golf = lineSpacingExtra;
                        uVar.hotel = lineSpacingMultiplier;
                        uVar.mike = new a4.u(17, this);
                        StaticLayout alpha = uVar.alpha();
                        if (this.f8164I == 1) {
                            f10 = bVar.golf() + this.f8165J + this.silver;
                        } else {
                            f10 = 0.0f;
                        }
                        f12 = alpha.getHeight() + f10;
                    } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                        Log.e("TextInputLayout", e.getCause().getMessage(), e);
                    }
                }
                float max = Math.max(f5, f12);
                if (this.teal.getMeasuredHeight() < max) {
                    this.teal.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        setError(savedState.red);
        if (savedState.silver) {
            post(new F6.b(26, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [g7.m, java.lang.Object] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        boolean z2 = true;
        if (i4 != 1) {
            z2 = false;
        }
        if (z2 != this.f8162G) {
            g7.d dVar = this.f8161F.echo;
            RectF rectF = this.f8172R;
            float alpha = dVar.alpha(rectF);
            float alpha2 = this.f8161F.foxtrot.alpha(rectF);
            float alpha3 = this.f8161F.hotel.alpha(rectF);
            float alpha4 = this.f8161F.golf.alpha(rectF);
            g7.m mVar = this.f8161F;
            Q4 q4 = mVar.alpha;
            Q4 q42 = mVar.bravo;
            Q4 q43 = mVar.delta;
            Q4 q44 = mVar.charlie;
            g7.f fVar = new g7.f(0);
            g7.f fVar2 = new g7.f(0);
            g7.f fVar3 = new g7.f(0);
            g7.f fVar4 = new g7.f(0);
            g7.l.bravo(q42);
            g7.l.bravo(q4);
            g7.l.bravo(q44);
            g7.l.bravo(q43);
            C1755a c1755a = new C1755a(alpha2);
            C1755a c1755a2 = new C1755a(alpha);
            C1755a c1755a3 = new C1755a(alpha4);
            C1755a c1755a4 = new C1755a(alpha3);
            ?? obj = new Object();
            obj.alpha = q42;
            obj.bravo = q4;
            obj.charlie = q43;
            obj.delta = q44;
            obj.echo = c1755a;
            obj.foxtrot = c1755a2;
            obj.golf = c1755a4;
            obj.hotel = c1755a3;
            obj.india = fVar;
            obj.juliet = fVar2;
            obj.kilo = fVar3;
            obj.lima = fVar4;
            this.f8162G = z2;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.material.textfield.TextInputLayout$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        if (oscar()) {
            absSavedState.red = getError();
        }
        l lVar = this.red;
        if (lVar.f8225b != 0 && lVar.yellow.silver) {
            z2 = true;
        } else {
            z2 = false;
        }
        absSavedState.silver = z2;
        return absSavedState;
    }

    public final boolean oscar() {
        p pVar = this.f8184d;
        if (pVar.oscar == 1 && pVar.romeo != null && !TextUtils.isEmpty(pVar.papa)) {
            return true;
        }
        return false;
    }

    public final void papa(Editable editable) {
        int i4;
        boolean z2;
        int i5;
        q1.b bVar;
        ((S7.a) this.f8191h).getClass();
        if (editable != null) {
            i4 = editable.length();
        } else {
            i4 = 0;
        }
        boolean z10 = this.f8189g;
        int i10 = this.f8187f;
        String str = null;
        if (i10 == -1) {
            this.f8193i.setText(String.valueOf(i4));
            this.f8193i.setContentDescription(null);
            this.f8189g = false;
        } else {
            if (i4 > i10) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f8189g = z2;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f8193i;
            int i11 = this.f8187f;
            if (this.f8189g) {
                i5 = delivery.samurai.android.R.string.character_counter_overflowed_content_description;
            } else {
                i5 = delivery.samurai.android.R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i5, Integer.valueOf(i4), Integer.valueOf(i11)));
            if (z10 != this.f8189g) {
                quebec();
            }
            String str2 = q1.b.bravo;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = q1.b.echo;
            } else {
                bVar = q1.b.delta;
            }
            AppCompatTextView appCompatTextView2 = this.f8193i;
            String string = getContext().getString(delivery.samurai.android.R.string.character_counter_pattern, Integer.valueOf(i4), Integer.valueOf(this.f8187f));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                Pf.j jVar = q1.g.alpha;
                str = bVar.charlie(string).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.teal != null && z10 != this.f8189g) {
            whiskey(false, false);
            zulu();
            tango();
        }
    }

    public final void quebec() {
        int i4;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f8193i;
        if (appCompatTextView != null) {
            if (this.f8189g) {
                i4 = this.f8195j;
            } else {
                i4 = this.f8197k;
            }
            november(appCompatTextView, i4);
            if (!this.f8189g && (colorStateList2 = this.f8213s) != null) {
                this.f8193i.setTextColor(colorStateList2);
            }
            if (this.f8189g && (colorStateList = this.f8215t) != null) {
                this.f8193i.setTextColor(colorStateList);
            }
        }
    }

    public final void romeo() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f8217u;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue bravo = AbstractC2710m0.bravo(delivery.samurai.android.R.attr.colorControlActivated, context);
            if (bravo != null) {
                int i4 = bravo.resourceId;
                if (i4 != 0) {
                    colorStateList2 = AbstractC1735d.charlie(i4, context);
                } else {
                    int i5 = bravo.data;
                    if (i5 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i5);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.teal;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.teal.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((oscar() || (this.f8193i != null && this.f8189g)) && (colorStateList = this.f8219v) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.f8170O != i4) {
            this.f8170O = i4;
            this.f8194i0 = i4;
            this.f8198k0 = i4;
            this.f8200l0 = i4;
            charlie();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(getContext().getColor(i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8194i0 = defaultColor;
        this.f8170O = defaultColor;
        this.f8196j0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8198k0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f8200l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        charlie();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 != this.f8164I) {
            this.f8164I = i4;
            if (this.teal != null) {
                kilo();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.f8165J = i4;
    }

    public void setBoxCornerFamily(int i4) {
        g7.l golf = this.f8161F.golf();
        g7.d dVar = this.f8161F.echo;
        Q4 alpha = R4.alpha(i4);
        golf.alpha = alpha;
        g7.l.bravo(alpha);
        golf.echo = dVar;
        g7.d dVar2 = this.f8161F.foxtrot;
        Q4 alpha2 = R4.alpha(i4);
        golf.bravo = alpha2;
        g7.l.bravo(alpha2);
        golf.foxtrot = dVar2;
        g7.d dVar3 = this.f8161F.hotel;
        Q4 alpha3 = R4.alpha(i4);
        golf.delta = alpha3;
        g7.l.bravo(alpha3);
        golf.hotel = dVar3;
        g7.d dVar4 = this.f8161F.golf;
        Q4 alpha4 = R4.alpha(i4);
        golf.charlie = alpha4;
        g7.l.bravo(alpha4);
        golf.golf = dVar4;
        this.f8161F = golf.alpha();
        charlie();
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f8190g0 != i4) {
            this.f8190g0 = i4;
            zulu();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8186e0 = colorStateList.getDefaultColor();
            this.f8202m0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8188f0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f8190g0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f8190g0 != colorStateList.getDefaultColor()) {
            this.f8190g0 = colorStateList.getDefaultColor();
        }
        zulu();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8192h0 != colorStateList) {
            this.f8192h0 = colorStateList;
            zulu();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.f8167L = i4;
        zulu();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f8168M = i4;
        zulu();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.e != z2) {
            Editable editable = null;
            p pVar = this.f8184d;
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f8193i = appCompatTextView;
                appCompatTextView.setId(delivery.samurai.android.R.id.textinput_counter);
                Typeface typeface = this.f8173S;
                if (typeface != null) {
                    this.f8193i.setTypeface(typeface);
                }
                this.f8193i.setMaxLines(1);
                pVar.alpha(this.f8193i, 2);
                ((ViewGroup.MarginLayoutParams) this.f8193i.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(delivery.samurai.android.R.dimen.mtrl_textinput_counter_margin_start));
                quebec();
                if (this.f8193i != null) {
                    EditText editText = this.teal;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    papa(editable);
                }
            } else {
                pVar.golf(this.f8193i, 2);
                this.f8193i = null;
            }
            this.e = z2;
        }
    }

    public void setCounterMaxLength(int i4) {
        Editable text;
        if (this.f8187f != i4) {
            if (i4 > 0) {
                this.f8187f = i4;
            } else {
                this.f8187f = -1;
            }
            if (this.e && this.f8193i != null) {
                EditText editText = this.teal;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                papa(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f8195j != i4) {
            this.f8195j = i4;
            quebec();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8215t != colorStateList) {
            this.f8215t = colorStateList;
            quebec();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f8197k != i4) {
            this.f8197k = i4;
            quebec();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8213s != colorStateList) {
            this.f8213s = colorStateList;
            quebec();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f8217u != colorStateList) {
            this.f8217u = colorStateList;
            romeo();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f8219v != colorStateList) {
            this.f8219v = colorStateList;
            if (!oscar() && (this.f8193i == null || !this.f8189g)) {
                return;
            }
            romeo();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8183c0 = colorStateList;
        this.f8185d0 = colorStateList;
        if (this.teal != null) {
            whiskey(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        mike(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.red.yellow.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.red.yellow.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i4) {
        l lVar = this.red;
        CharSequence text = i4 != 0 ? lVar.getResources().getText(i4) : null;
        CheckableImageButton checkableImageButton = lVar.yellow;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i4) {
        l lVar = this.red;
        Drawable echo = i4 != 0 ? AbstractC3032n3.echo(i4, lVar.getContext()) : null;
        CheckableImageButton checkableImageButton = lVar.yellow;
        checkableImageButton.setImageDrawable(echo);
        if (echo != null) {
            ColorStateList colorStateList = lVar.f8227d;
            PorterDuff.Mode mode = lVar.e;
            TextInputLayout textInputLayout = lVar.alpha;
            r6.s.alpha(textInputLayout, checkableImageButton, colorStateList, mode);
            r6.s.charlie(textInputLayout, checkableImageButton, lVar.f8227d);
        }
    }

    public void setEndIconMinSize(int i4) {
        l lVar = this.red;
        if (i4 >= 0) {
            if (i4 != lVar.f8228f) {
                lVar.f8228f = i4;
                CheckableImageButton checkableImageButton = lVar.yellow;
                checkableImageButton.setMinimumWidth(i4);
                checkableImageButton.setMinimumHeight(i4);
                CheckableImageButton checkableImageButton2 = lVar.red;
                checkableImageButton2.setMinimumWidth(i4);
                checkableImageButton2.setMinimumHeight(i4);
                return;
            }
            return;
        }
        lVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i4) {
        this.red.golf(i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.red;
        View.OnLongClickListener onLongClickListener = lVar.f8230h;
        CheckableImageButton checkableImageButton = lVar.yellow;
        checkableImageButton.setOnClickListener(onClickListener);
        r6.s.delta(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.red;
        lVar.f8230h = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.yellow;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r6.s.delta(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.red;
        lVar.f8229g = scaleType;
        lVar.yellow.setScaleType(scaleType);
        lVar.red.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        l lVar = this.red;
        if (lVar.f8227d != colorStateList) {
            lVar.f8227d = colorStateList;
            r6.s.alpha(lVar.alpha, lVar.yellow, colorStateList, lVar.e);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.red;
        if (lVar.e != mode) {
            lVar.e = mode;
            r6.s.alpha(lVar.alpha, lVar.yellow, lVar.f8227d, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.red.hotel(z2);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.f8184d;
        if (!pVar.quebec) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            pVar.charlie();
            pVar.papa = charSequence;
            pVar.romeo.setText(charSequence);
            int i4 = pVar.november;
            if (i4 != 1) {
                pVar.oscar = 1;
            }
            pVar.india(i4, pVar.oscar, pVar.hotel(pVar.romeo, charSequence));
            return;
        }
        pVar.foxtrot();
    }

    public void setErrorAccessibilityLiveRegion(int i4) {
        p pVar = this.f8184d;
        pVar.tango = i4;
        AppCompatTextView appCompatTextView = pVar.romeo;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i4);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.f8184d;
        pVar.sierra = charSequence;
        AppCompatTextView appCompatTextView = pVar.romeo;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        p pVar = this.f8184d;
        if (pVar.quebec == z2) {
            return;
        }
        pVar.charlie();
        TextInputLayout textInputLayout = pVar.hotel;
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.golf, null);
            pVar.romeo = appCompatTextView;
            appCompatTextView.setId(delivery.samurai.android.R.id.textinput_error);
            pVar.romeo.setTextAlignment(5);
            Typeface typeface = pVar.azure;
            if (typeface != null) {
                pVar.romeo.setTypeface(typeface);
            }
            int i4 = pVar.uniform;
            pVar.uniform = i4;
            AppCompatTextView appCompatTextView2 = pVar.romeo;
            if (appCompatTextView2 != null) {
                textInputLayout.november(appCompatTextView2, i4);
            }
            ColorStateList colorStateList = pVar.victor;
            pVar.victor = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.romeo;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.sierra;
            pVar.sierra = charSequence;
            AppCompatTextView appCompatTextView4 = pVar.romeo;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i5 = pVar.tango;
            pVar.tango = i5;
            AppCompatTextView appCompatTextView5 = pVar.romeo;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i5);
            }
            pVar.romeo.setVisibility(4);
            pVar.alpha(pVar.romeo, 0);
        } else {
            pVar.foxtrot();
            pVar.golf(pVar.romeo, 0);
            pVar.romeo = null;
            textInputLayout.tango();
            textInputLayout.zulu();
        }
        pVar.quebec = z2;
    }

    public void setErrorIconDrawable(int i4) {
        l lVar = this.red;
        lVar.india(i4 != 0 ? AbstractC3032n3.echo(i4, lVar.getContext()) : null);
        r6.s.charlie(lVar.alpha, lVar.red, lVar.silver);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.red;
        CheckableImageButton checkableImageButton = lVar.red;
        View.OnLongClickListener onLongClickListener = lVar.white;
        checkableImageButton.setOnClickListener(onClickListener);
        r6.s.delta(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.red;
        lVar.white = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.red;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r6.s.delta(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        l lVar = this.red;
        if (lVar.silver != colorStateList) {
            lVar.silver = colorStateList;
            r6.s.alpha(lVar.alpha, lVar.red, colorStateList, lVar.teal);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.red;
        if (lVar.teal != mode) {
            lVar.teal = mode;
            r6.s.alpha(lVar.alpha, lVar.red, lVar.silver, mode);
        }
    }

    public void setErrorTextAppearance(int i4) {
        p pVar = this.f8184d;
        pVar.uniform = i4;
        AppCompatTextView appCompatTextView = pVar.romeo;
        if (appCompatTextView != null) {
            pVar.hotel.november(appCompatTextView, i4);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.f8184d;
        pVar.victor = colorStateList;
        AppCompatTextView appCompatTextView = pVar.romeo;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f8210q0 != z2) {
            this.f8210q0 = z2;
            whiskey(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.f8184d;
        if (isEmpty) {
            if (pVar.xray) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.xray) {
            setHelperTextEnabled(true);
        }
        pVar.charlie();
        pVar.whiskey = charSequence;
        pVar.yankee.setText(charSequence);
        int i4 = pVar.november;
        if (i4 != 2) {
            pVar.oscar = 2;
        }
        pVar.india(i4, pVar.oscar, pVar.hotel(pVar.yankee, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.f8184d;
        pVar.amber = colorStateList;
        AppCompatTextView appCompatTextView = pVar.yankee;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        p pVar = this.f8184d;
        if (pVar.xray == z2) {
            return;
        }
        pVar.charlie();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.golf, null);
            pVar.yankee = appCompatTextView;
            appCompatTextView.setId(delivery.samurai.android.R.id.textinput_helper_text);
            pVar.yankee.setTextAlignment(5);
            Typeface typeface = pVar.azure;
            if (typeface != null) {
                pVar.yankee.setTypeface(typeface);
            }
            pVar.yankee.setVisibility(4);
            pVar.yankee.setAccessibilityLiveRegion(1);
            int i4 = pVar.zulu;
            pVar.zulu = i4;
            AppCompatTextView appCompatTextView2 = pVar.yankee;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i4);
            }
            ColorStateList colorStateList = pVar.amber;
            pVar.amber = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.yankee;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            pVar.alpha(pVar.yankee, 1);
            pVar.yankee.setAccessibilityDelegate(new o(pVar));
        } else {
            pVar.charlie();
            int i5 = pVar.november;
            if (i5 == 2) {
                pVar.oscar = 0;
            }
            pVar.india(i5, pVar.oscar, pVar.hotel(pVar.yankee, ""));
            pVar.golf(pVar.yankee, 1);
            pVar.yankee = null;
            TextInputLayout textInputLayout = pVar.hotel;
            textInputLayout.tango();
            textInputLayout.zulu();
        }
        pVar.xray = z2;
    }

    public void setHelperTextTextAppearance(int i4) {
        p pVar = this.f8184d;
        pVar.zulu = i4;
        AppCompatTextView appCompatTextView = pVar.yankee;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i4);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f8220w) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f8212r0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f8220w) {
            this.f8220w = z2;
            if (!z2) {
                this.f8222y = false;
                if (!TextUtils.isEmpty(this.f8221x) && TextUtils.isEmpty(this.teal.getHint())) {
                    this.teal.setHint(this.f8221x);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.teal.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f8221x)) {
                        setHint(hint);
                    }
                    this.teal.setHint((CharSequence) null);
                }
                this.f8222y = true;
            }
            if (this.teal != null) {
                victor();
            }
        }
    }

    public void setHintMaxLines(int i4) {
        com.google.android.material.internal.b bVar = this.f8208p0;
        if (i4 != bVar.f8057h) {
            bVar.f8057h = i4;
            bVar.lima(false);
        }
        bVar.victor(i4);
        requestLayout();
    }

    public void setHintTextAppearance(int i4) {
        com.google.android.material.internal.b bVar = this.f8208p0;
        bVar.quebec(i4);
        this.f8185d0 = bVar.papa;
        if (this.teal != null) {
            whiskey(false, false);
            victor();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8185d0 != colorStateList) {
            if (this.f8183c0 == null) {
                this.f8208p0.romeo(colorStateList);
            }
            this.f8185d0 = colorStateList;
            if (this.teal != null) {
                whiskey(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.f8191h = xVar;
    }

    public void setMaxEms(int i4) {
        this.f8178a = i4;
        EditText editText = this.teal;
        if (editText != null && i4 != -1) {
            editText.setMaxEms(i4);
        }
    }

    public void setMaxWidth(int i4) {
        this.f8182c = i4;
        EditText editText = this.teal;
        if (editText != null && i4 != -1) {
            editText.setMaxWidth(i4);
        }
    }

    public void setMaxWidthResource(int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.yellow = i4;
        EditText editText = this.teal;
        if (editText != null && i4 != -1) {
            editText.setMinEms(i4);
        }
    }

    public void setMinWidth(int i4) {
        this.f8180b = i4;
        EditText editText = this.teal;
        if (editText != null && i4 != -1) {
            editText.setMinWidth(i4);
        }
    }

    public void setMinWidthResource(int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        l lVar = this.red;
        lVar.yellow.setContentDescription(i4 != 0 ? lVar.getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        l lVar = this.red;
        lVar.yellow.setImageDrawable(i4 != 0 ? AbstractC3032n3.echo(i4, lVar.getContext()) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        l lVar = this.red;
        if (z2 && lVar.f8225b != 1) {
            lVar.golf(1);
        } else if (!z2) {
            lVar.golf(0);
        } else {
            lVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        l lVar = this.red;
        lVar.f8227d = colorStateList;
        r6.s.alpha(lVar.alpha, lVar.yellow, colorStateList, lVar.e);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        l lVar = this.red;
        lVar.e = mode;
        r6.s.alpha(lVar.alpha, lVar.yellow, lVar.f8227d, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f8203n == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f8203n = appCompatTextView;
            appCompatTextView.setId(delivery.samurai.android.R.id.textinput_placeholder);
            this.f8203n.setImportantForAccessibility(1);
            this.f8203n.setAccessibilityLiveRegion(1);
            C3286g foxtrot = foxtrot();
            this.f8209q = foxtrot;
            foxtrot.purple = 67L;
            this.f8211r = foxtrot();
            setPlaceholderTextAppearance(this.f8207p);
            setPlaceholderTextColor(this.f8205o);
            au.november(this.f8203n, new I1.c(5));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f8201m) {
                setPlaceholderTextEnabled(true);
            }
            this.f8199l = charSequence;
        }
        EditText editText = this.teal;
        if (editText != null) {
            editable = editText.getText();
        }
        xray(editable);
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.f8207p = i4;
        AppCompatTextView appCompatTextView = this.f8203n;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8205o != colorStateList) {
            this.f8205o = colorStateList;
            AppCompatTextView appCompatTextView = this.f8203n;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        u uVar = this.purple;
        uVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        uVar.red = charSequence2;
        uVar.purple.setText(charSequence);
        uVar.echo();
    }

    public void setPrefixTextAppearance(int i4) {
        this.purple.purple.setTextAppearance(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.purple.purple.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(g7.m mVar) {
        g7.i iVar = this.f8223z;
        if (iVar != null && iVar.purple.alpha != mVar) {
            this.f8161F = mVar;
            charlie();
        }
    }

    public void setStartIconCheckable(boolean z2) {
        this.purple.silver.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.purple.silver;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? AbstractC3032n3.echo(i4, getContext()) : null);
    }

    public void setStartIconMinSize(int i4) {
        u uVar = this.purple;
        if (i4 >= 0) {
            if (i4 != uVar.yellow) {
                uVar.yellow = i4;
                CheckableImageButton checkableImageButton = uVar.silver;
                checkableImageButton.setMinimumWidth(i4);
                checkableImageButton.setMinimumHeight(i4);
                return;
            }
            return;
        }
        uVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.purple;
        View.OnLongClickListener onLongClickListener = uVar.f8243b;
        CheckableImageButton checkableImageButton = uVar.silver;
        checkableImageButton.setOnClickListener(onClickListener);
        r6.s.delta(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.purple;
        uVar.f8243b = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.silver;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r6.s.delta(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.purple;
        uVar.f8242a = scaleType;
        uVar.silver.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.purple;
        if (uVar.teal != colorStateList) {
            uVar.teal = colorStateList;
            r6.s.alpha(uVar.alpha, uVar.silver, colorStateList, uVar.white);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.purple;
        if (uVar.white != mode) {
            uVar.white = mode;
            r6.s.alpha(uVar.alpha, uVar.silver, uVar.teal, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.purple.charlie(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        l lVar = this.red;
        lVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        lVar.f8231i = charSequence2;
        lVar.f8232j.setText(charSequence);
        lVar.november();
    }

    public void setSuffixTextAppearance(int i4) {
        this.red.f8232j.setTextAppearance(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.red.f8232j.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.teal;
        if (editText != null) {
            au.november(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8173S) {
            this.f8173S = typeface;
            com.google.android.material.internal.b bVar = this.f8208p0;
            boolean tango = bVar.tango(typeface);
            boolean zulu = bVar.zulu(typeface);
            if (tango || zulu) {
                bVar.lima(false);
            }
            p pVar = this.f8184d;
            if (typeface != pVar.azure) {
                pVar.azure = typeface;
                AppCompatTextView appCompatTextView = pVar.romeo;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = pVar.yankee;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f8193i;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean sierra() {
        boolean z2;
        l lVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.teal == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z10 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            u uVar = this.purple;
            if (uVar.getMeasuredWidth() > 0) {
                int measuredWidth = uVar.getMeasuredWidth() - this.teal.getPaddingLeft();
                if (this.f8174T == null || this.f8175U != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f8174T = colorDrawable3;
                    this.f8175U = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.teal.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f8174T;
                if (drawable2 != colorDrawable4) {
                    this.teal.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    lVar = this.red;
                    if ((!lVar.echo() || ((lVar.f8225b != 0 && lVar.delta()) || lVar.f8231i != null)) && lVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = lVar.f8232j.getMeasuredWidth() - this.teal.getPaddingRight();
                        if (!lVar.echo()) {
                            checkableImageButton = lVar.red;
                        } else if (lVar.f8225b != 0 && lVar.delta()) {
                            checkableImageButton = lVar.yellow;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.teal.getCompoundDrawablesRelative();
                        colorDrawable = this.f8177W;
                        if (colorDrawable == null && this.f8179a0 != measuredWidth2) {
                            this.f8179a0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.teal.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f8177W, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f8177W = colorDrawable5;
                            this.f8179a0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f8177W;
                        if (drawable != colorDrawable2) {
                            this.f8181b0 = drawable;
                            this.teal.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f8177W != null) {
                        Drawable[] compoundDrawablesRelative3 = this.teal.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f8177W) {
                            this.teal.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f8181b0, compoundDrawablesRelative3[3]);
                        } else {
                            z10 = z2;
                        }
                        this.f8177W = null;
                        return z10;
                    }
                    return z2;
                }
                z2 = false;
                lVar = this.red;
                if (!lVar.echo()) {
                }
                int measuredWidth22 = lVar.f8232j.getMeasuredWidth() - this.teal.getPaddingRight();
                if (!lVar.echo()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.teal.getCompoundDrawablesRelative();
                colorDrawable = this.f8177W;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f8177W;
                if (drawable != colorDrawable2) {
                }
                return z2;
            }
        }
        if (this.f8174T != null) {
            Drawable[] compoundDrawablesRelative4 = this.teal.getCompoundDrawablesRelative();
            this.teal.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f8174T = null;
            z2 = true;
            lVar = this.red;
            if (!lVar.echo()) {
            }
            int measuredWidth222 = lVar.f8232j.getMeasuredWidth() - this.teal.getPaddingRight();
            if (!lVar.echo()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.teal.getCompoundDrawablesRelative();
            colorDrawable = this.f8177W;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f8177W;
            if (drawable != colorDrawable2) {
            }
            return z2;
        }
        z2 = false;
        lVar = this.red;
        if (!lVar.echo()) {
        }
        int measuredWidth2222 = lVar.f8232j.getMeasuredWidth() - this.teal.getPaddingRight();
        if (!lVar.echo()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.teal.getCompoundDrawablesRelative();
        colorDrawable = this.f8177W;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f8177W;
        if (drawable != colorDrawable2) {
        }
        return z2;
    }

    public final void tango() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.teal;
        if (editText != null && this.f8164I == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = S.alpha;
            Drawable mutate = background.mutate();
            if (oscar()) {
                mutate.setColorFilter(C0488x.charlie(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f8189g && (appCompatTextView = this.f8193i) != null) {
                mutate.setColorFilter(C0488x.charlie(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.teal.refreshDrawableState();
            }
        }
    }

    public final void uniform() {
        EditText editText = this.teal;
        if (editText != null && this.f8223z != null) {
            if ((this.C || editText.getBackground() == null) && this.f8164I != 0) {
                this.teal.setBackground(getEditTextBoxBackground());
                this.C = true;
            }
        }
    }

    public final void victor() {
        if (this.f8164I != 1) {
            FrameLayout frameLayout = this.alpha;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int echo = echo();
            if (echo != layoutParams.topMargin) {
                layoutParams.topMargin = echo;
                frameLayout.requestLayout();
            }
        }
    }

    public final void whiskey(boolean z2, boolean z10) {
        boolean z11;
        boolean z12;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i4;
        boolean isEnabled = isEnabled();
        EditText editText = this.teal;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        EditText editText2 = this.teal;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        ColorStateList colorStateList3 = this.f8183c0;
        com.google.android.material.internal.b bVar = this.f8208p0;
        if (colorStateList3 != null) {
            bVar.november(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f8183c0;
            if (colorStateList4 != null) {
                i4 = colorStateList4.getColorForState(new int[]{-16842910}, this.f8202m0);
            } else {
                i4 = this.f8202m0;
            }
            bVar.november(ColorStateList.valueOf(i4));
        } else if (oscar()) {
            AppCompatTextView appCompatTextView2 = this.f8184d.romeo;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.november(colorStateList2);
        } else if (this.f8189g && (appCompatTextView = this.f8193i) != null) {
            bVar.november(appCompatTextView.getTextColors());
        } else if (z12 && (colorStateList = this.f8185d0) != null) {
            bVar.romeo(colorStateList);
        }
        l lVar = this.red;
        u uVar = this.purple;
        if (!z11 && this.f8210q0 && (!isEnabled() || !z12)) {
            if (z10 || !this.f8206o0) {
                ValueAnimator valueAnimator = this.f8214s0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f8214s0.cancel();
                }
                if (z2 && this.f8212r0) {
                    bravo(0.0f);
                } else {
                    bVar.amber(0.0f);
                }
                if (golf() && !((f) this.f8223z).A.romeo.isEmpty() && golf()) {
                    ((f) this.f8223z).yankee(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f8206o0 = true;
                AppCompatTextView appCompatTextView3 = this.f8203n;
                if (appCompatTextView3 != null && this.f8201m) {
                    appCompatTextView3.setText((CharSequence) null);
                    ad.alpha(this.alpha, this.f8211r);
                    this.f8203n.setVisibility(4);
                }
                uVar.f8244c = true;
                uVar.echo();
                lVar.f8233k = true;
                lVar.november();
                return;
            }
            return;
        }
        if (!z10 && !this.f8206o0) {
            return;
        }
        ValueAnimator valueAnimator2 = this.f8214s0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f8214s0.cancel();
        }
        if (z2 && this.f8212r0) {
            bravo(1.0f);
        } else {
            bVar.amber(1.0f);
        }
        this.f8206o0 = false;
        if (golf()) {
            lima();
        }
        EditText editText3 = this.teal;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        xray(editable);
        uVar.f8244c = false;
        uVar.echo();
        lVar.f8233k = false;
        lVar.november();
    }

    public final void xray(Editable editable) {
        int i4;
        ((S7.a) this.f8191h).getClass();
        if (editable != null) {
            i4 = editable.length();
        } else {
            i4 = 0;
        }
        FrameLayout frameLayout = this.alpha;
        if (i4 == 0 && !this.f8206o0) {
            if (this.f8203n != null && this.f8201m && !TextUtils.isEmpty(this.f8199l)) {
                this.f8203n.setText(this.f8199l);
                ad.alpha(frameLayout, this.f8209q);
                this.f8203n.setVisibility(0);
                this.f8203n.bringToFront();
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f8203n;
        if (appCompatTextView != null && this.f8201m) {
            appCompatTextView.setText((CharSequence) null);
            ad.alpha(frameLayout, this.f8211r);
            this.f8203n.setVisibility(4);
        }
    }

    public final void yankee(boolean z2, boolean z10) {
        int defaultColor = this.f8192h0.getDefaultColor();
        int colorForState = this.f8192h0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f8192h0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f8169N = colorForState2;
        } else if (z10) {
            this.f8169N = colorForState;
        } else {
            this.f8169N = defaultColor;
        }
    }

    public final void zulu() {
        boolean z2;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f8223z != null && this.f8164I != 0) {
            boolean z10 = false;
            if (!isFocused() && ((editText2 = this.teal) == null || !editText2.hasFocus())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (isHovered() || ((editText = this.teal) != null && editText.isHovered())) {
                z10 = true;
            }
            if (!isEnabled()) {
                this.f8169N = this.f8202m0;
            } else if (oscar()) {
                if (this.f8192h0 != null) {
                    yankee(z2, z10);
                } else {
                    this.f8169N = getErrorCurrentTextColors();
                }
            } else if (this.f8189g && (appCompatTextView = this.f8193i) != null) {
                if (this.f8192h0 != null) {
                    yankee(z2, z10);
                } else {
                    this.f8169N = appCompatTextView.getCurrentTextColor();
                }
            } else if (z2) {
                this.f8169N = this.f8190g0;
            } else if (z10) {
                this.f8169N = this.f8188f0;
            } else {
                this.f8169N = this.f8186e0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                romeo();
            }
            l lVar = this.red;
            lVar.lima();
            CheckableImageButton checkableImageButton = lVar.red;
            ColorStateList colorStateList = lVar.silver;
            TextInputLayout textInputLayout = lVar.alpha;
            r6.s.charlie(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = lVar.f8227d;
            CheckableImageButton checkableImageButton2 = lVar.yellow;
            r6.s.charlie(textInputLayout, checkableImageButton2, colorStateList2);
            if (lVar.bravo() instanceof i) {
                if (textInputLayout.oscar() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = checkableImageButton2.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    r6.s.alpha(textInputLayout, checkableImageButton2, lVar.f8227d, lVar.e);
                }
            }
            u uVar = this.purple;
            r6.s.charlie(uVar.alpha, uVar.silver, uVar.teal);
            if (this.f8164I == 2) {
                int i4 = this.f8166K;
                if (z2 && isEnabled()) {
                    this.f8166K = this.f8168M;
                } else {
                    this.f8166K = this.f8167L;
                }
                if (this.f8166K != i4 && golf() && !this.f8206o0) {
                    if (golf()) {
                        ((f) this.f8223z).yankee(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    lima();
                }
            }
            if (this.f8164I == 1) {
                if (!isEnabled()) {
                    this.f8170O = this.f8196j0;
                } else if (z10 && !z2) {
                    this.f8170O = this.f8200l0;
                } else if (z2) {
                    this.f8170O = this.f8198k0;
                } else {
                    this.f8170O = this.f8194i0;
                }
            }
            charlie();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.purple.bravo(drawable);
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.red.yellow.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.red.yellow.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.red.india(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.red.yellow;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        l lVar = this.red;
        CheckableImageButton checkableImageButton = lVar.yellow;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = lVar.f8227d;
            PorterDuff.Mode mode = lVar.e;
            TextInputLayout textInputLayout = lVar.alpha;
            r6.s.alpha(textInputLayout, checkableImageButton, colorStateList, mode);
            r6.s.charlie(textInputLayout, checkableImageButton, lVar.f8227d);
        }
    }
}
