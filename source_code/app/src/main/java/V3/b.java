package V3;

import U3.h;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int alpha = 0;
    public final WeakReference purple;

    public b(c cVar) {
        this.purple = new WeakReference(cVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i4;
        int i5;
        switch (this.alpha) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                c cVar = (c) this.purple.get();
                if (cVar != null) {
                    ArrayList arrayList = cVar.bravo;
                    if (!arrayList.isEmpty()) {
                        View view = cVar.alpha;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i10 = 0;
                        if (layoutParams != null) {
                            i4 = layoutParams.width;
                        } else {
                            i4 = 0;
                        }
                        int alpha = cVar.alpha(view.getWidth(), i4, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            i10 = layoutParams2.height;
                        }
                        int alpha2 = cVar.alpha(view.getHeight(), i10, paddingBottom);
                        if (alpha > 0 || alpha == Integer.MIN_VALUE) {
                            if (alpha2 > 0 || alpha2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((h) ((d) it.next())).kilo(alpha, alpha2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(cVar.charlie);
                                }
                                cVar.charlie = null;
                                arrayList.clear();
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                f fVar = (f) this.purple.get();
                if (fVar != null) {
                    ArrayList arrayList2 = fVar.bravo;
                    if (!arrayList2.isEmpty()) {
                        ImageView imageView = fVar.alpha;
                        int paddingRight2 = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                        int i11 = 0;
                        if (layoutParams3 != null) {
                            i5 = layoutParams3.width;
                        } else {
                            i5 = 0;
                        }
                        int alpha3 = fVar.alpha(imageView.getWidth(), i5, paddingRight2);
                        int paddingBottom2 = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                        if (layoutParams4 != null) {
                            i11 = layoutParams4.height;
                        }
                        int alpha4 = fVar.alpha(imageView.getHeight(), i11, paddingBottom2);
                        if (alpha3 > 0 || alpha3 == Integer.MIN_VALUE) {
                            if (alpha4 > 0 || alpha4 == Integer.MIN_VALUE) {
                                Iterator it2 = new ArrayList(arrayList2).iterator();
                                while (it2.hasNext()) {
                                    ((h) ((d) it2.next())).kilo(alpha3, alpha4);
                                }
                                ViewTreeObserver viewTreeObserver2 = imageView.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(fVar.charlie);
                                }
                                fVar.charlie = null;
                                arrayList2.clear();
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }

    public b(f fVar) {
        this.purple = new WeakReference(fVar);
    }
}
