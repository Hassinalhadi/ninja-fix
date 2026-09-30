package ga;

import android.os.Looper;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.feature.location.api.StompStateHolder;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.incognia.internal.Lsv;
import com.incognia.internal.PIe;
import com.incognia.internal.YWS;
import com.incognia.internal.zZG;
import delivery.samurai.android.ui.about.TrophiesListFragment;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n.Y;
import p3.C2275g;
import t0.C2946x;
import u3.InterfaceC3142e;
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;
import x9.AbstractC3307a;
import x9.AbstractC3309c;
import y1.C3391d;

/* loaded from: classes2.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ as(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LocationCallback locationCallback;
        FusedLocationProviderClient fusedLocationProviderClient;
        Object next;
        long longValue;
        Object obj;
        Object obj2;
        int i4 = 2;
        int i5 = 3;
        FrameLayout frameLayout = null;
        int i10 = 0;
        Object obj3 = this.purple;
        switch (this.alpha) {
            case 0:
                TrophiesListFragment trophiesListFragment = (TrophiesListFragment) obj3;
                w.o oVar = trophiesListFragment.f12112c;
                if (oVar != null) {
                    RecyclerView recyclerView = (RecyclerView) oVar.purple;
                    if (recyclerView.getAdapter() != null) {
                        if (recyclerView.getLayoutManager() != null) {
                            new S5.k(recyclerView, trophiesListFragment.f12116h, 1, false, new F8.q(recyclerView.getLayoutManager()));
                            return;
                        }
                        throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                    }
                    throw new IllegalStateException("Adapter needs to be set!");
                }
                Intrinsics.lima("binding");
                throw null;
            case 1:
                T5.o oVar2 = (T5.o) obj3;
                oVar2.bravo = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) oVar2.echo;
                C3391d c3391d = sideSheetBehavior.f8105b;
                if (c3391d != null && c3391d.golf()) {
                    oVar2.charlie(oVar2.charlie);
                    return;
                } else {
                    if (sideSheetBehavior.f8104a == 2) {
                        sideSheetBehavior.foxtrot(oVar2.charlie);
                        return;
                    }
                    return;
                }
            case 2:
                Lsv.W((PIe) obj3);
                return;
            case 3:
                Lsv.W((YWS) obj3);
                return;
            case 4:
                Lsv.b((List) obj3);
                return;
            case 5:
                zZG.b((zZG) obj3);
                return;
            case 6:
                int i11 = AreaListingActivityV2.f12135U;
                ((TabLayout) ((AreaListingActivityV2) obj3).green().purple).setVisibility(0);
                return;
            case 7:
                p3.ab abVar = (p3.ab) obj3;
                abVar.kilo = null;
                InterfaceC3142e interfaceC3142e = abVar.alpha.charlie;
                if (!abVar.hotel && C1477x.charlie() == abVar && (locationCallback = abVar.azure) != null && (fusedLocationProviderClient = abVar.amber) != null) {
                    LocationRequest locationRequest = abVar.beige;
                    if (locationRequest == null) {
                        locationRequest = abVar.charlie();
                    }
                    try {
                        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper());
                        abVar.hotel = true;
                        abVar.india = new p3.m(fusedLocationProviderClient, locationCallback, i4);
                        abVar.zulu = System.currentTimeMillis();
                        abVar.foxtrot(null);
                        interfaceC3142e.alpha("LocationFlow", "[PROVIDER_ENABLED] Re-registered location updates after provider enabled");
                        return;
                    } catch (Exception e) {
                        interfaceC3142e.alpha("LocationFlow", "[PROVIDER_ENABLED] Re-register failed: " + e.getMessage());
                        return;
                    }
                }
                return;
            case 8:
                B2.ad adVar = (B2.ad) obj3;
                if (((StompStateHolder) adVar.bravo).getState() == p3.ah.purple) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = (ArrayList) adVar.foxtrot;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        p3.ag agVar = (p3.ag) next2;
                        if (agVar.echo < 3 && currentTimeMillis - agVar.delta < 60000) {
                            arrayList2.add(next2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long time = ((p3.ag) next).alpha.getTime();
                            do {
                                Object next3 = it2.next();
                                long time2 = ((p3.ag) next3).alpha.getTime();
                                if (time < time2) {
                                    next = next3;
                                    time = time2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    p3.ag agVar2 = (p3.ag) next;
                    if (agVar2 == null) {
                        arrayList.clear();
                    } else {
                        CollectionsKt.d(arrayList, new Y(6, agVar2));
                        for (p3.ag agVar3 : kotlin.collections.ab.juliet(agVar2)) {
                            ((Cb.d) adVar.golf).invoke(agVar3.alpha, new p3.ad(adVar, agVar3, i10), new p3.ad(agVar3, adVar));
                        }
                        if (CollectionsKt.d(arrayList, new com.clevertap.android.sdk.inapp.evaluation.a(System.currentTimeMillis(), i5))) {
                            ((InterfaceC3142e) adVar.charlie).alpha("LocationFlow", "Cleaned up stale pending locations");
                        }
                    }
                }
                adVar.hotel = null;
                return;
            case 9:
                p3.ai aiVar = (p3.ai) obj3;
                if (!((Boolean) aiVar.india.invoke()).booleanValue()) {
                    as asVar = aiVar.november;
                    Intrinsics.checkNotNull(asVar);
                    aiVar.alpha(asVar);
                    return;
                }
                if (!((Boolean) aiVar.echo.invoke()).booleanValue()) {
                    as asVar2 = aiVar.november;
                    Intrinsics.checkNotNull(asVar2);
                    aiVar.alpha(asVar2);
                    return;
                }
                if (((Boolean) aiVar.foxtrot.invoke()).booleanValue()) {
                    as asVar3 = aiVar.november;
                    Intrinsics.checkNotNull(asVar3);
                    aiVar.alpha(asVar3);
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                C2275g c2275g = aiVar.hotel;
                long longValue2 = currentTimeMillis2 - ((Number) c2275g.invoke()).longValue();
                if (((Number) c2275g.invoke()).longValue() != 0 && longValue2 >= 90000) {
                    C2275g c2275g2 = aiVar.golf;
                    if (((Number) c2275g2.invoke()).longValue() == 0) {
                        longValue = Long.MAX_VALUE;
                    } else {
                        longValue = currentTimeMillis2 - ((Number) c2275g2.invoke()).longValue();
                    }
                    if (longValue < ((Number) aiVar.charlie.invoke()).longValue()) {
                        as asVar4 = aiVar.november;
                        Intrinsics.checkNotNull(asVar4);
                        aiVar.alpha(asVar4);
                        return;
                    }
                    String str = "LOCATION_SERVICE_NO_FIX timeSinceLastLocationMs=" + longValue + " attempt=" + aiVar.oscar;
                    InterfaceC3142e interfaceC3142e2 = aiVar.bravo;
                    interfaceC3142e2.alpha("LocationFlow", str);
                    interfaceC3142e2.alpha("LocationFlow", "[STUCK_DETECTED] No location for " + longValue + "ms | attempt=" + aiVar.oscar);
                    if (aiVar.juliet.getState() == p3.ah.purple) {
                        aiVar.kilo.invoke();
                    }
                    aiVar.lima.invoke();
                    aiVar.oscar++;
                    int intValue = ((Number) aiVar.delta.invoke()).intValue();
                    if (aiVar.oscar >= intValue) {
                        interfaceC3142e2.alpha("LocationFlow", "[STUCK_BROADCAST] Sending LOCATION_STUCK after " + intValue + " attempts");
                        aiVar.mike.invoke();
                        aiVar.oscar = 0;
                    }
                    as asVar5 = aiVar.november;
                    Intrinsics.checkNotNull(asVar5);
                    aiVar.alpha(asVar5);
                    return;
                }
                as asVar6 = aiVar.november;
                Intrinsics.checkNotNull(asVar6);
                aiVar.alpha(asVar6);
                return;
            case 10:
                C2946x c2946x = (C2946x) obj3;
                c2946x.f13913t0 = false;
                MotionEvent motionEvent = c2946x.f13897l0;
                Intrinsics.checkNotNull(motionEvent);
                if (motionEvent.getActionMasked() == 10) {
                    c2946x.blue(motionEvent);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
            case 11:
                je.ab abVar2 = (je.ab) obj3;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    abVar2.invoke();
                    return;
                } finally {
                }
            case 12:
                t0.ad adVar2 = (t0.ad) obj3;
                Trace.beginSection("measureAndLayout");
                try {
                    adVar2.delta.romeo(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        adVar2.november();
                        Trace.endSection();
                        adVar2.gold = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 13:
                ((MaterialTapTargetPrompt) obj3).lambda$new$0();
                return;
            case 14:
                View view = ((AbstractC3307a) obj3).getView();
                if (view != null) {
                    obj = view.getParent();
                } else {
                    obj = null;
                }
                if (obj instanceof FrameLayout) {
                    frameLayout = (FrameLayout) obj;
                }
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                    return;
                }
                return;
            default:
                View view2 = ((AbstractC3309c) obj3).getView();
                if (view2 != null) {
                    obj2 = view2.getParent();
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof FrameLayout) {
                    frameLayout = (FrameLayout) obj2;
                }
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                    return;
                }
                return;
        }
    }
}
