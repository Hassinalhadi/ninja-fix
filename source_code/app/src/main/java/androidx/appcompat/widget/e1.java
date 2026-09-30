package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import delivery.samurai.android.R;
import id.C1915c;

/* loaded from: classes3.dex */
public final class e1 implements Q {
    public final Toolbar alpha;
    public int bravo;
    public final View charlie;
    public Drawable delta;
    public Drawable echo;
    public Drawable foxtrot;
    public boolean golf;
    public CharSequence hotel;
    public final CharSequence india;
    public CharSequence juliet;
    public Window.Callback kilo;
    public boolean lima;
    public C0469n mike;
    public final int november;
    public final Drawable oscar;

    public e1(Toolbar toolbar, boolean z2) {
        boolean z10;
        Drawable drawable;
        this.november = 0;
        this.alpha = toolbar;
        this.hotel = toolbar.getTitle();
        this.india = toolbar.getSubtitle();
        if (this.hotel != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.golf = z10;
        this.foxtrot = toolbar.getNavigationIcon();
        C1915c victor = C1915c.victor(toolbar.getContext(), null, aj.a.alpha, R.attr.actionBarStyle);
        int i4 = 15;
        this.oscar = victor.oscar(15);
        if (z2) {
            TypedArray typedArray = (TypedArray) victor.red;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.golf = true;
                this.hotel = text;
                if ((this.bravo & 8) != 0) {
                    Toolbar toolbar2 = this.alpha;
                    toolbar2.setTitle(text);
                    if (this.golf) {
                        s1.au.oscar(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.india = text2;
                if ((this.bravo & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable oscar = victor.oscar(20);
            if (oscar != null) {
                this.echo = oscar;
                delta();
            }
            Drawable oscar2 = victor.oscar(17);
            if (oscar2 != null) {
                this.delta = oscar2;
                delta();
            }
            if (this.foxtrot == null && (drawable = this.oscar) != null) {
                this.foxtrot = drawable;
                int i5 = this.bravo & 4;
                Toolbar toolbar3 = this.alpha;
                if (i5 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            alpha(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.charlie;
                if (view != null && (this.bravo & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.charlie = inflate;
                if (inflate != null && (this.bravo & 16) != 0) {
                    toolbar.addView(inflate);
                }
                alpha(this.bravo | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.delta();
                toolbar.f2846m.alpha(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.e = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.purple;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f2839f = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.red;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.oscar = toolbar.getNavigationIcon();
            } else {
                i4 = 11;
            }
            this.bravo = i4;
        }
        victor.xray();
        if (R.string.abc_action_bar_up_description != this.november) {
            this.november = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                bravo(this.november);
            }
        }
        this.juliet = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new d1(this));
    }

    public final void alpha(int i4) {
        View view;
        int i5 = this.bravo ^ i4;
        this.bravo = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    charlie();
                }
                int i10 = this.bravo & 4;
                Toolbar toolbar = this.alpha;
                if (i10 != 0) {
                    Drawable drawable = this.foxtrot;
                    if (drawable == null) {
                        drawable = this.oscar;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                delta();
            }
            int i11 = i5 & 8;
            Toolbar toolbar2 = this.alpha;
            if (i11 != 0) {
                if ((i4 & 8) != 0) {
                    toolbar2.setTitle(this.hotel);
                    toolbar2.setSubtitle(this.india);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) != 0 && (view = this.charlie) != null) {
                if ((i4 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void bravo(int i4) {
        String string;
        if (i4 == 0) {
            string = null;
        } else {
            string = this.alpha.getContext().getString(i4);
        }
        this.juliet = string;
        charlie();
    }

    public final void charlie() {
        if ((this.bravo & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.juliet);
            Toolbar toolbar = this.alpha;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.november);
            } else {
                toolbar.setNavigationContentDescription(this.juliet);
            }
        }
    }

    public final void delta() {
        Drawable drawable;
        int i4 = this.bravo;
        if ((i4 & 2) != 0) {
            if ((i4 & 1) != 0) {
                drawable = this.echo;
                if (drawable == null) {
                    drawable = this.delta;
                }
            } else {
                drawable = this.delta;
            }
        } else {
            drawable = null;
        }
        this.alpha.setLogo(drawable);
    }
}
