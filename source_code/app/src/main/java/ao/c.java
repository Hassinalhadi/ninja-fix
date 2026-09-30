package ao;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0476q0;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        Activity activity;
        boolean z13;
        boolean z14;
        boolean z15;
        int i4;
        switch (this.alpha) {
            case 0:
                f fVar = (f) this.purple;
                if (fVar.alpha()) {
                    ArrayList arrayList = fVar.f3184a;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).alpha.f2899r) {
                        View view = fVar.f3190h;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).alpha.golf();
                            }
                            return;
                        }
                        fVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ac acVar = (ac) this.purple;
                if (acVar.alpha()) {
                    C0476q0 c0476q0 = acVar.f3170a;
                    if (!c0476q0.f2899r) {
                        View view2 = acVar.f3174f;
                        if (view2 != null && view2.isShown()) {
                            c0476q0.golf();
                            return;
                        } else {
                            acVar.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                NavigationView navigationView = (NavigationView) this.purple;
                int[] iArr = navigationView.e;
                navigationView.getLocationOnScreen(iArr);
                boolean z16 = true;
                if (iArr[1] == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.google.android.material.internal.q qVar = navigationView.f8088b;
                if (qVar.f8079q != z2) {
                    qVar.f8079q = z2;
                    if (qVar.purple.getChildCount() <= 0 && qVar.f8079q) {
                        i4 = qVar.f8081s;
                    } else {
                        i4 = 0;
                    }
                    NavigationMenuView navigationMenuView = qVar.alpha;
                    navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
                }
                if (z2 && navigationView.f8093h) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                navigationView.setDrawTopInsetForeground(z10);
                if (navigationView.getLayoutDirection() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i5 = iArr[0];
                if ((i5 == 0 || navigationView.getWidth() + i5 == 0) && (!z11 ? navigationView.f8095j : navigationView.f8096k)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                navigationView.setDrawLeftInsetForeground(z12);
                Context context = navigationView.getContext();
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        activity = null;
                    }
                }
                if (activity != null) {
                    Rect echo = com.google.android.material.internal.z.echo(activity);
                    if (echo.height() - navigationView.getHeight() == iArr[1]) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z13 && z14 && navigationView.f8094i) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    navigationView.setDrawBottomInsetForeground(z15);
                    if ((echo.width() != iArr[0] && echo.width() - navigationView.getWidth() != iArr[0]) || (!z11 ? !navigationView.f8096k : !navigationView.f8095j)) {
                        z16 = false;
                    }
                    navigationView.setDrawRightInsetForeground(z16);
                    return;
                }
                return;
        }
    }
}
