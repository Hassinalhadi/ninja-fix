package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Collections;
import l7.AbstractC2059a;
import s6.G7;
import s6.R4;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: S, reason: collision with root package name */
    public static final ImageView.ScaleType[] f7817S = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: N, reason: collision with root package name */
    public Integer f7818N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7819O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f7820P;
    public ImageView.ScaleType Q;

    /* renamed from: R, reason: collision with root package name */
    public Boolean f7821R;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.toolbarStyle, 2132083987), attributeSet, 0);
        ColorStateList bravo;
        Context context2 = getContext();
        TypedArray golf = z.golf(context2, attributeSet, L6.a.coral, R.attr.toolbarStyle, 2132083987, new int[0]);
        if (golf.hasValue(2)) {
            setNavigationIconTint(golf.getColor(2, -1));
        }
        this.f7819O = golf.getBoolean(4, false);
        this.f7820P = golf.getBoolean(3, false);
        int i4 = golf.getInt(1, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f7817S;
            if (i4 < scaleTypeArr.length) {
                this.Q = scaleTypeArr[i4];
            }
        }
        if (golf.hasValue(0)) {
            this.f7821R = Boolean.valueOf(golf.getBoolean(0, false));
        }
        golf.recycle();
        Drawable background = getBackground();
        if (background == null) {
            bravo = ColorStateList.valueOf(0);
        } else {
            bravo = G7.bravo(background);
        }
        if (bravo != null) {
            g7.i iVar = new g7.i();
            iVar.quebec(bravo);
            iVar.mike(context2);
            iVar.papa(getElevation());
            setBackground(iVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.Q;
    }

    public Integer getNavigationIconTint() {
        return this.f7818N;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        R4.echo(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i4, i5, i10, i11);
        int i12 = 0;
        ImageView imageView2 = null;
        if (this.f7819O || this.f7820P) {
            ArrayList foxtrot = z.foxtrot(this, getTitle());
            boolean isEmpty = foxtrot.isEmpty();
            Sb.k kVar = z.charlie;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(foxtrot, kVar);
            }
            ArrayList foxtrot2 = z.foxtrot(this, getSubtitle());
            if (foxtrot2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(foxtrot2, kVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i13 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i13 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i13 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f7819O && textView != null) {
                    whiskey(textView, pair);
                }
                if (this.f7820P && textView2 != null) {
                    whiskey(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i12 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i12);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i12++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f7821R;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.Q;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        R4.charlie(this, f5);
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f7821R;
        if (bool != null && bool.booleanValue() == z2) {
            return;
        }
        this.f7821R = Boolean.valueOf(z2);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.Q != scaleType) {
            this.Q = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f7818N != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f7818N.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i4) {
        this.f7818N = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f7820P != z2) {
            this.f7820P = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f7819O != z2) {
            this.f7819O = z2;
            requestLayout();
        }
    }

    public final void whiskey(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i4;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i4 += max;
            i5 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5 - i4, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i4, textView.getTop(), i5, textView.getBottom());
    }
}
