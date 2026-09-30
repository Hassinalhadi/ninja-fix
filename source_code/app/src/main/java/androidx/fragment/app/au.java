package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* loaded from: classes3.dex */
public final class au implements LayoutInflater.Factory2 {
    public final L alpha;

    public au(L l10) {
        this.alpha = l10;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        S golf;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        L l10 = this.alpha;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, l10);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N1.a.alpha);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z2 = ai.class.isAssignableFrom(A.bravo(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z2 = false;
                }
                if (z2) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    ai black = resourceId != -1 ? l10.black(resourceId) : null;
                    if (black == null && string != null) {
                        black = l10.blue(string);
                    }
                    if (black == null && id2 != -1) {
                        black = l10.black(id2);
                    }
                    if (black == null) {
                        A emerald = l10.emerald();
                        context.getClassLoader();
                        black = emerald.alpha(attributeValue);
                        black.mFromLayout = true;
                        black.mFragmentId = resourceId != 0 ? resourceId : id2;
                        black.mContainerId = id2;
                        black.mTag = string;
                        black.mInLayout = true;
                        black.mFragmentManager = l10;
                        as asVar = l10.xray;
                        black.mHost = asVar;
                        black.onInflate((Context) asVar.purple, attributeSet, black.mSavedFragmentState);
                        golf = l10.alpha(black);
                        if (L.gray(2)) {
                            Log.v("FragmentManager", "Fragment " + black + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!black.mInLayout) {
                        black.mInLayout = true;
                        black.mFragmentManager = l10;
                        as asVar2 = l10.xray;
                        black.mHost = asVar2;
                        black.onInflate((Context) asVar2.purple, attributeSet, black.mSavedFragmentState);
                        golf = l10.golf(black);
                        if (L.gray(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + black + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    O1.b bVar = O1.c.alpha;
                    O1.c.bravo(new FragmentTagUsageViolation(black, viewGroup));
                    O1.c.alpha(black).getClass();
                    black.mContainer = viewGroup;
                    golf.kilo();
                    golf.juliet();
                    View view2 = black.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (black.mView.getTag() == null) {
                            black.mView.setTag(string);
                        }
                        black.mView.addOnAttachStateChangeListener(new at(this, golf));
                        return black.mView;
                    }
                    throw new IllegalStateException(ao.ad.gray("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
