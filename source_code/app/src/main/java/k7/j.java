package k7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.z;
import com.google.android.material.tabs.TabLayout;
import e7.AbstractC1632a;
import g.C1718a;
import java.util.WeakHashMap;
import s1.C2576i;
import s1.af;
import s1.an;
import s1.au;
import t1.C2951c;
import t6.AbstractC3032n3;
import t6.AbstractC3056s3;

/* loaded from: classes2.dex */
public final class j extends LinearLayout {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public ImageView f12923a;
    public g alpha;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f12924b;

    /* renamed from: c, reason: collision with root package name */
    public int f12925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TabLayout f12926d;
    public TextView purple;
    public ImageView red;
    public View silver;
    public N6.a teal;
    public View white;
    public TextView yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLayout tabLayout, Context context) {
        super(context);
        C1718a c1718a;
        int i4 = 22;
        this.f12926d = tabLayout;
        this.f12925c = 2;
        echo(context);
        setPaddingRelative(tabLayout.teal, tabLayout.white, tabLayout.yellow, tabLayout.f8133a);
        setGravity(17);
        setOrientation(!tabLayout.f8154w ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            c1718a = new C1718a(i4, E2.d.echo(context2));
        } else {
            c1718a = new C1718a(i4, (Object) null);
        }
        WeakHashMap weakHashMap = au.alpha;
        if (i5 >= 24) {
            an.alpha(this, af.india((PointerIcon) c1718a.purple));
        }
    }

    private N6.a getBadge() {
        return this.teal;
    }

    private N6.a getOrCreateBadge() {
        if (this.teal == null) {
            this.teal = new N6.a(getContext());
        }
        bravo();
        N6.a aVar = this.teal;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void alpha() {
        if (this.teal != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.silver;
            if (view != null) {
                N6.a aVar = this.teal;
                if (aVar != null) {
                    if (aVar.delta() != null) {
                        aVar.delta().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.silver = null;
            }
        }
    }

    public final void bravo() {
        if (this.teal != null) {
            if (this.white != null) {
                alpha();
                return;
            }
            TextView textView = this.purple;
            if (textView != null && this.alpha != null) {
                if (this.silver != textView) {
                    alpha();
                    TextView textView2 = this.purple;
                    if (this.teal != null && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        N6.a aVar = this.teal;
                        Rect rect = new Rect();
                        textView2.getDrawingRect(rect);
                        aVar.setBounds(rect);
                        aVar.india(textView2, null);
                        if (aVar.delta() != null) {
                            aVar.delta().setForeground(aVar);
                        } else {
                            textView2.getOverlay().add(aVar);
                        }
                        this.silver = textView2;
                        return;
                    }
                    return;
                }
                charlie(textView);
                return;
            }
            alpha();
        }
    }

    public final void charlie(View view) {
        N6.a aVar = this.teal;
        if (aVar != null && view == this.silver) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.india(view, null);
        }
    }

    public final void delta() {
        boolean z2;
        foxtrot();
        g gVar = this.alpha;
        if (gVar != null) {
            TabLayout tabLayout = gVar.delta;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == gVar.bravo) {
                    z2 = true;
                    setSelected(z2);
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        z2 = false;
        setSelected(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12924b;
        if (drawable != null && drawable.isStateful()) {
            z2 = this.f12924b.setState(drawableState);
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
            this.f12926d.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r10v0, types: [k7.j, android.view.View] */
    public final void echo(Context context) {
        TabLayout tabLayout = this.f12926d;
        int i4 = tabLayout.f8144m;
        GradientDrawable gradientDrawable = null;
        if (i4 != 0) {
            Drawable echo = AbstractC3032n3.echo(i4, context);
            this.f12924b = echo;
            if (echo != null && echo.isStateful()) {
                this.f12924b.setState(getDrawableState());
            }
        } else {
            this.f12924b = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (tabLayout.f8138g != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.f8138g;
            int alpha = AbstractC1632a.alpha(colorStateList, AbstractC1632a.charlie);
            int[] iArr = AbstractC1632a.bravo;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{AbstractC1632a.delta, iArr, StateSet.NOTHING}, new int[]{alpha, AbstractC1632a.alpha(colorStateList, iArr), AbstractC1632a.alpha(colorStateList, AbstractC1632a.alpha)});
            boolean z2 = tabLayout.A;
            if (z2) {
                gradientDrawable2 = null;
            }
            if (!z2) {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable2, gradientDrawable);
        }
        setBackground(gradientDrawable2);
        tabLayout.invalidate();
    }

    public final void foxtrot() {
        View view;
        int i4;
        ViewParent parent;
        g gVar = this.alpha;
        if (gVar != null) {
            view = gVar.charlie;
        } else {
            view = null;
        }
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.white;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.white);
                }
                addView(view);
            }
            this.white = view;
            TextView textView = this.purple;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.red;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.red.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.yellow = textView2;
            if (textView2 != null) {
                this.f12925c = textView2.getMaxLines();
            }
            this.f12923a = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.white;
            if (view3 != null) {
                removeView(view3);
                this.white = null;
            }
            this.yellow = null;
            this.f12923a = null;
        }
        if (this.white == null) {
            if (this.red == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(delivery.samurai.android.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.red = imageView2;
                addView(imageView2, 0);
            }
            if (this.purple == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(delivery.samurai.android.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.purple = textView3;
                addView(textView3);
                this.f12925c = this.purple.getMaxLines();
            }
            TextView textView4 = this.purple;
            TabLayout tabLayout = this.f12926d;
            textView4.setTextAppearance(tabLayout.f8134b);
            if (isSelected() && (i4 = tabLayout.f8136d) != -1) {
                this.purple.setTextAppearance(i4);
            } else {
                this.purple.setTextAppearance(tabLayout.f8135c);
            }
            ColorStateList colorStateList = tabLayout.e;
            if (colorStateList != null) {
                this.purple.setTextColor(colorStateList);
            }
            golf(this.purple, this.red, true);
            bravo();
            ImageView imageView3 = this.red;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new i(this, imageView3));
            }
            TextView textView5 = this.purple;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new i(this, textView5));
            }
        } else {
            TextView textView6 = this.yellow;
            if (textView6 != null || this.f12923a != null) {
                golf(textView6, this.f12923a, false);
            }
        }
        if (gVar != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.purple, this.red, this.white};
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                if (z2) {
                    i5 = Math.min(i5, view.getTop());
                } else {
                    i5 = view.getTop();
                }
                if (z2) {
                    i4 = Math.max(i4, view.getBottom());
                } else {
                    i4 = view.getBottom();
                }
                z2 = true;
            }
        }
        return i4 - i5;
    }

    public int getContentWidth() {
        View[] viewArr = {this.purple, this.red, this.white};
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                if (z2) {
                    i5 = Math.min(i5, view.getLeft());
                } else {
                    i5 = view.getLeft();
                }
                if (z2) {
                    i4 = Math.max(i4, view.getRight());
                } else {
                    i4 = view.getRight();
                }
                z2 = true;
            }
        }
        return i4 - i5;
    }

    public g getTab() {
        return this.alpha;
    }

    public final void golf(TextView textView, ImageView imageView, boolean z2) {
        CharSequence charSequence;
        boolean z10;
        int i4;
        CharSequence charSequence2;
        int i5;
        g gVar = this.alpha;
        CharSequence charSequence3 = null;
        if (gVar != null) {
            charSequence = gVar.alpha;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (!isEmpty) {
                this.alpha.getClass();
                z10 = true;
            } else {
                z10 = false;
            }
            if (!isEmpty) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            textView.setText(charSequence2);
            if (z10) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            textView.setVisibility(i5);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z2 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z10 && imageView.getVisibility() == 0) {
                i4 = (int) z.delta(8, getContext());
            } else {
                i4 = 0;
            }
            if (this.f12926d.f8154w) {
                if (i4 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i4);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i4 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i4;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (!isEmpty) {
                charSequence3 = charSequence;
            }
            AbstractC3056s3.alpha(this, charSequence3);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        N6.a aVar = this.teal;
        if (aVar != null && aVar.isVisible()) {
            N6.a aVar2 = this.teal;
            CharSequence charSequence = null;
            if (aVar2.isVisible()) {
                BadgeState$State badgeState$State = aVar2.teal.bravo;
                String str = badgeState$State.f7824c;
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    charSequence = badgeState$State.f7828h;
                    if (charSequence == null) {
                        charSequence = str;
                    }
                } else if (aVar2.golf()) {
                    if (badgeState$State.f7830j != 0 && (context = (Context) aVar2.alpha.get()) != null) {
                        if (aVar2.f1871a != -2) {
                            int echo = aVar2.echo();
                            int i4 = aVar2.f1871a;
                            if (echo > i4) {
                                charSequence = context.getString(badgeState$State.f7831k, Integer.valueOf(i4));
                            }
                        }
                        charSequence = context.getResources().getQuantityString(badgeState$State.f7830j, aVar2.echo(), Integer.valueOf(aVar2.echo()));
                    }
                } else {
                    charSequence = badgeState$State.f7829i;
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C2576i.hotel(0, 1, this.alpha.bravo, 1, false, isSelected()).alpha);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2951c.golf.alpha);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(delivery.samurai.android.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        TabLayout tabLayout = this.f12926d;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i4 = View.MeasureSpec.makeMeasureSpec(tabLayout.f8145n, RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i4, i5);
        if (this.purple != null) {
            float f5 = tabLayout.f8141j;
            if (isSelected() && tabLayout.f8136d != -1) {
                f5 = tabLayout.f8142k;
            }
            int i10 = this.f12925c;
            ImageView imageView = this.red;
            if (imageView != null && imageView.getVisibility() == 0) {
                i10 = 1;
            } else {
                TextView textView = this.purple;
                if (textView != null && textView.getLineCount() > 1) {
                    f5 = tabLayout.f8143l;
                }
            }
            float textSize = this.purple.getTextSize();
            int lineCount = this.purple.getLineCount();
            int maxLines = this.purple.getMaxLines();
            if (f5 != textSize || (maxLines >= 0 && i10 != maxLines)) {
                if (tabLayout.f8153v == 1 && f5 > textSize && lineCount == 1) {
                    Layout layout = this.purple.getLayout();
                    if (layout != null) {
                        if ((f5 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.purple.setTextSize(0, f5);
                this.purple.setMaxLines(i10);
                super.onMeasure(i4, i5);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.alpha != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.alpha.alpha();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z2) {
        isSelected();
        super.setSelected(z2);
        TextView textView = this.purple;
        if (textView != null) {
            textView.setSelected(z2);
        }
        ImageView imageView = this.red;
        if (imageView != null) {
            imageView.setSelected(z2);
        }
        View view = this.white;
        if (view != null) {
            view.setSelected(z2);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.alpha) {
            this.alpha = gVar;
            delta();
        }
    }
}
