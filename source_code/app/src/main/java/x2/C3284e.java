package x2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import b7.C0726h;
import com.google.android.gms.measurement.internal.C1469t;
import java.util.HashMap;
import t6.AbstractC2987e3;

/* renamed from: x2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3284e extends z {

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f14068y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z, reason: collision with root package name */
    public static final C0726h f14069z = new C0726h(PointF.class, "topLeft", 7);
    public static final C0726h A = new C0726h(PointF.class, "bottomRight", 8);
    public static final C0726h B = new C0726h(PointF.class, "bottomRight", 9);
    public static final C0726h C = new C0726h(PointF.class, "topLeft", 10);

    /* renamed from: D, reason: collision with root package name */
    public static final C0726h f14067D = new C0726h(PointF.class, "position", 11);

    public static void indigo(ai aiVar) {
        View view = aiVar.bravo;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = aiVar.alpha;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", aiVar.bravo.getParent());
    }

    @Override // x2.z
    public final void delta(ai aiVar) {
        indigo(aiVar);
    }

    @Override // x2.z
    public final void golf(ai aiVar) {
        indigo(aiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x2.z
    public final Animator kilo(ViewGroup viewGroup, ai aiVar, ai aiVar2) {
        int i4;
        C3284e c3284e;
        ObjectAnimator alpha;
        if (aiVar != null && aiVar2 != null) {
            HashMap hashMap = aiVar.alpha;
            HashMap hashMap2 = aiVar2.alpha;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i5 = rect.left;
                int i10 = rect2.left;
                int i11 = rect.top;
                int i12 = rect2.top;
                int i13 = rect.right;
                int i14 = rect2.right;
                int i15 = rect.bottom;
                int i16 = rect2.bottom;
                int i17 = i13 - i5;
                int i18 = i15 - i11;
                int i19 = i14 - i10;
                int i20 = i16 - i12;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i17 != 0 && i18 != 0) || (i19 != 0 && i20 != 0)) {
                    if (i5 == i10 && i11 == i12) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    if (i13 != i14 || i15 != i16) {
                        i4++;
                    }
                } else {
                    i4 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i4++;
                }
                if (i4 > 0) {
                    View view = aiVar2.bravo;
                    al.alpha(view, i5, i11, i13, i15);
                    if (i4 == 2) {
                        if (i17 == i19 && i18 == i20) {
                            c3284e = this;
                            c3284e.f14091q.getClass();
                            alpha = AbstractC3292m.alpha(view, f14067D, C1469t.bravo(i5, i11, i10, i12));
                        } else {
                            c3284e = this;
                            C3283d c3283d = new C3283d(view);
                            c3284e.f14091q.getClass();
                            ObjectAnimator alpha2 = AbstractC3292m.alpha(c3283d, f14069z, C1469t.bravo(i5, i11, i10, i12));
                            c3284e.f14091q.getClass();
                            ObjectAnimator alpha3 = AbstractC3292m.alpha(c3283d, A, C1469t.bravo(i13, i15, i14, i16));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(alpha2, alpha3);
                            animatorSet.addListener(new C3281b(c3283d));
                            alpha = animatorSet;
                        }
                    } else {
                        c3284e = this;
                        if (i5 == i10 && i11 == i12) {
                            c3284e.f14091q.getClass();
                            alpha = AbstractC3292m.alpha(view, B, C1469t.bravo(i13, i15, i14, i16));
                        } else {
                            c3284e.f14091q.getClass();
                            alpha = AbstractC3292m.alpha(view, C, C1469t.bravo(i5, i11, i10, i12));
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        AbstractC2987e3.bravo(viewGroup4, true);
                        c3284e.papa().alpha(new C3282c(viewGroup4));
                    }
                    return alpha;
                }
            }
        }
        return null;
    }

    @Override // x2.z
    public final String[] romeo() {
        return f14068y;
    }

    @Override // x2.z
    public final boolean uniform() {
        return true;
    }
}
