package Jb;

import android.view.View;
import android.widget.TextView;
import androidx.camera.core.impl.AbstractC0512j;
import com.google.android.material.sidesheet.SideSheetBehavior;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import f1.AbstractC1683c;
import i1.AbstractC1881b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ at(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf;
        int i4 = 0;
        switch (this.alpha) {
            case 0:
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.red;
                if (homeActivityV2.f12281T != null && !homeActivityV2.isFinishing() && !homeActivityV2.isDestroyed()) {
                    TextView textView = (TextView) ((J2.t) homeActivityV2.jade().purple).purple;
                    textView.setTextSize(0, 10 * textView.getResources().getDisplayMetrics().density);
                    int i5 = this.purple;
                    if (i5 > 99) {
                        valueOf = "99+";
                    } else {
                        valueOf = String.valueOf(i5);
                    }
                    textView.setText(valueOf);
                    if (i5 == 0) {
                        i4 = 8;
                    }
                    textView.setVisibility(i4);
                    return;
                }
                return;
            case 1:
                int i10 = LocationInfoActivity.Q;
                LocationInfoActivity locationInfoActivity = (LocationInfoActivity) this.red;
                if (!L9.d.tango(locationInfoActivity) && locationInfoActivity.f12239K == Ua.j.purple) {
                    locationInfoActivity.navy(this.purple, !AbstractC1683c.foxtrot(locationInfoActivity, "android.permission.ACCESS_BACKGROUND_LOCATION"), L9.d.november(locationInfoActivity));
                    return;
                }
                return;
            case 2:
                ((AbstractC0512j) this.red).alpha(this.purple);
                return;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.red;
                int i11 = this.purple;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    av.aw awVar = (av.aw) it.next();
                    if (i11 == 5) {
                        synchronized (awVar.papa) {
                            try {
                                if (awVar.november() && awVar.quebec != null) {
                                    awVar.lima("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it2 = awVar.quebec.iterator();
                                    while (it2.hasNext()) {
                                        ((androidx.camera.core.impl.ah) it2.next()).alpha();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        awVar.getClass();
                    }
                }
                return;
            case 4:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.red;
                View view = (View) sideSheetBehavior.f8111i.get();
                if (view != null) {
                    sideSheetBehavior.hotel(view, this.purple, false);
                    return;
                }
                return;
            case 5:
                ((AbstractC1881b) this.red).india(this.purple);
                return;
            default:
                ((IntConsumer) this.red).accept(this.purple);
                return;
        }
    }
}
