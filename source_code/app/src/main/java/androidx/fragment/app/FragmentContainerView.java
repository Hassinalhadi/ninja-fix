package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/ai;", "F", "getFragment", "()Landroidx/fragment/app/ai;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList alpha;
    public final ArrayList purple;
    public View.OnApplyWindowInsetsListener red;
    public boolean silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        Intrinsics.echo(context, "context");
        this.alpha = new ArrayList();
        this.purple = new ArrayList();
        this.silver = true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i4, ViewGroup.LayoutParams layoutParams) {
        ai aiVar;
        Intrinsics.echo(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof ai) {
            aiVar = (ai) tag;
        } else {
            aiVar = null;
        }
        if (aiVar != null) {
            super.addView(child, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    public final void alpha(View view) {
        if (this.purple.contains(view)) {
            this.alpha.add(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        s1.a0 india;
        Intrinsics.echo(insets, "insets");
        s1.a0 hotel = s1.a0.hotel(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.red;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            Intrinsics.echo(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.delta(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            india = s1.a0.hotel(null, onApplyWindowInsets);
        } else {
            india = s1.au.india(this, hotel);
        }
        Intrinsics.delta(india, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!india.alpha.oscar()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                s1.au.bravo(getChildAt(i4), india);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.echo(canvas, "canvas");
        if (this.silver) {
            Iterator it = this.alpha.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j5) {
        Intrinsics.echo(canvas, "canvas");
        Intrinsics.echo(child, "child");
        if (this.silver) {
            ArrayList arrayList = this.alpha;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j5);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.echo(view, "view");
        this.purple.remove(view);
        if (this.alpha.remove(view)) {
            this.silver = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends ai> F getFragment() {
        an anVar;
        L supportFragmentManager;
        ai bronze = L.bronze(this);
        if (bronze != null) {
            if (bronze.isAdded()) {
                supportFragmentManager = bronze.getChildFragmentManager();
            } else {
                throw new IllegalStateException("The Fragment " + bronze + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof an) {
                        anVar = (an) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    anVar = null;
                    break;
                }
            }
            if (anVar != null) {
                supportFragmentManager = anVar.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) supportFragmentManager.black(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.echo(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View view = getChildAt(childCount);
                Intrinsics.delta(view, "view");
                alpha(view);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.echo(view, "view");
        alpha(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        View view = getChildAt(i4);
        Intrinsics.delta(view, "view");
        alpha(view);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.echo(view, "view");
        alpha(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i4, int i5) {
        int i10 = i4 + i5;
        for (int i11 = i4; i11 < i10; i11++) {
            View view = getChildAt(i11);
            Intrinsics.delta(view, "view");
            alpha(view);
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i4, int i5) {
        int i10 = i4 + i5;
        for (int i11 = i4; i11 < i10; i11++) {
            View view = getChildAt(i11);
            Intrinsics.delta(view, "view");
            alpha(view);
        }
        super.removeViewsInLayout(i4, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.silver = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@Nullable View.OnApplyWindowInsetsListener listener) {
        this.red = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.echo(view, "view");
        if (view.getParent() == this) {
            this.purple.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        Intrinsics.echo(context, "context");
        this.alpha = new ArrayList();
        this.purple = new ArrayList();
        this.silver = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N1.a.bravo, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, L fm) {
        super(context, attrs);
        View view;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        Intrinsics.echo(fm, "fm");
        this.alpha = new ArrayList();
        this.purple = new ArrayList();
        this.silver = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, N1.a.bravo, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        ai black = fm.black(id2);
        if (classAttribute != null && black == null) {
            if (id2 == -1) {
                throw new IllegalStateException(ao.ad.gray("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            A emerald = fm.emerald();
            context.getClassLoader();
            ai alpha = emerald.alpha(classAttribute);
            Intrinsics.delta(alpha, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            alpha.mFragmentId = id2;
            alpha.mContainerId = id2;
            alpha.mTag = string;
            alpha.mFragmentManager = fm;
            alpha.mHost = fm.xray;
            alpha.onInflate(context, attrs, (Bundle) null);
            C0606a c0606a = new C0606a(fm);
            c0606a.papa = true;
            alpha.mContainer = this;
            alpha.mInDynamicContainer = true;
            c0606a.delta(getId(), alpha, string, 1);
            if (!c0606a.golf) {
                c0606a.hotel = false;
                c0606a.romeo.amber(c0606a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm.charlie.delta().iterator();
        while (it.hasNext()) {
            S s3 = (S) it.next();
            ai aiVar = s3.charlie;
            if (aiVar.mContainerId == getId() && (view = aiVar.mView) != null && view.getParent() == null) {
                aiVar.mContainer = this;
                s3.bravo();
                s3.kilo();
            }
        }
    }
}
