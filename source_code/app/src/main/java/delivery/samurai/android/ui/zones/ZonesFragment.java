package delivery.samurai.android.ui.zones;

import B9.ab;
import Dc.t;
import Lb.C;
import Qb.l;
import Xa.f;
import Xc.a;
import Xc.c;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ai;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.Zone;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.mlkit.vision.barcode.common.Barcode;
import dagger.hilt.android.AndroidEntryPoint;
import de.AbstractC1618a;
import de.AbstractC1621d;
import delivery.samurai.android.R;
import g1.AbstractC1735d;
import h6.InterfaceC1813c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import q6.w;
import r3.C2492a;
import s1.C2576i;
import s6.AbstractC2770s7;
import t6.AbstractC2997g3;
import t6.S3;
import t6.T3;
import x6.k;
import x6.m;
import y6.d;
import y6.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/zones/ZonesFragment;", "Ld3/n;", "Lx6/m;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ZonesFragment extends a implements m {
    public LastSentLocationStore e;

    /* renamed from: f, reason: collision with root package name */
    public final ab f12555f;

    /* renamed from: g, reason: collision with root package name */
    public Aa.m f12556g;

    public ZonesFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new C(28, new C(27, this)));
        this.f12555f = new ab(u.alpha.bravo(ZonesViewModel.class), new l(alpha, 18), new f(1, this, alpha), new l(alpha, 19));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // x6.m
    public final void charlie(k kVar) {
        String str;
        Object obj;
        String str2;
        int i4 = 0;
        if (isAdded()) {
            if (AbstractC1735d.alpha(requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                try {
                    g gVar = kVar.alpha;
                    Parcel ivory = gVar.ivory();
                    int i5 = w.alpha;
                    ivory.writeInt(1);
                    gVar.lavender(ivory, 22);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            C2576i echo = kVar.echo();
            echo.getClass();
            try {
                d dVar = (d) echo.alpha;
                Parcel ivory2 = dVar.ivory();
                int i10 = w.alpha;
                ivory2.writeInt(0);
                dVar.lavender(ivory2, 3);
                kVar.foxtrot(AbstractC2997g3.bravo(romeo(), 11.0f));
                Bundle arguments = getArguments();
                Object obj2 = null;
                if (arguments != null) {
                    str = arguments.getString("zone");
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        com.google.gson.l lVar = new com.google.gson.l();
                        Bundle arguments2 = getArguments();
                        if (arguments2 != null) {
                            str2 = arguments2.getString("zone");
                        } else {
                            str2 = null;
                        }
                        obj = Result.m206constructorimpl((Zone) lVar.delta(Zone.class, str2));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        obj = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    if (!(obj instanceof kotlin.k)) {
                        obj2 = obj;
                    }
                    Zone zone = (Zone) obj2;
                    if (zone != null) {
                        quebec(zone, kVar);
                        Long id2 = zone.getId();
                        if (id2 != null) {
                            sierra(kVar, "ZONE", id2.longValue());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ZonesViewModel zonesViewModel = (ZonesViewModel) this.f12555f.getValue();
                ?? auVar = new au(new C2492a(2, "loading"));
                BaseViewModel.launchApi$default(zonesViewModel, null, new Xc.g(zonesViewModel, auVar, null), 1, null);
                auVar.observe(this, new t(13, new c(this, kVar, i4)));
            } catch (RemoteException e4) {
                throw new RuntimeRemoteException(e4);
            }
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_zones, viewGroup, false);
        int i4 = R.id.tvCurrentArea;
        if (((TextView) S3.bravo(R.id.tvCurrentArea, inflate)) != null) {
            i4 = R.id.tvCurrentAreaValue;
            TextView textView = (TextView) S3.bravo(R.id.tvCurrentAreaValue, inflate);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.f12556g = new Aa.m(constraintLayout, textView, 4);
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        SupportMapFragment supportMapFragment;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ai black = getChildFragmentManager().black(R.id.zonesMap);
        if (black instanceof SupportMapFragment) {
            supportMapFragment = (SupportMapFragment) black;
        } else {
            supportMapFragment = null;
        }
        if (supportMapFragment != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                x6.u uVar = supportMapFragment.alpha;
                InterfaceC1813c interfaceC1813c = uVar.alpha;
                if (interfaceC1813c != null) {
                    ((x6.t) interfaceC1813c).juliet(this);
                    return;
                } else {
                    uVar.hotel.add(this);
                    return;
                }
            }
            throw new IllegalStateException("getMapAsync must be called on the main thread.");
        }
    }

    @Override // d3.n
    public final void oscar() {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void quebec(Zone zone, k kVar) {
        List<List<List<List<Double>>>> list;
        int i4;
        LatLng latLng;
        int collectionSizeOrDefault;
        PolygonOptions polygonOptions = new PolygonOptions();
        Zone.Geometry geom = zone.getGeom();
        if (geom != null) {
            list = geom.getCoordinates();
        } else {
            list = null;
        }
        if (list != null) {
            Iterator<List<List<List<Double>>>> it = list.iterator();
            while (true) {
                i4 = 0;
                if (!it.hasNext()) {
                    break;
                }
                for (List<List<Double>> list2 : it.next()) {
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List list3 = (List) it2.next();
                        arrayList.add(new LatLng(((Number) list3.get(1)).doubleValue(), ((Number) list3.get(0)).doubleValue()));
                        it = it;
                    }
                    Iterator<List<List<List<Double>>>> it3 = it;
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        polygonOptions.alpha.add((LatLng) it4.next());
                    }
                    it = it3;
                }
            }
            AbstractC1618a abstractC1618a = AbstractC1621d.alpha;
            AbstractC1618a abstractC1618a2 = AbstractC1621d.alpha;
            int nextInt = abstractC1618a2.foxtrot().nextInt(Barcode.FORMAT_QR_CODE);
            int nextInt2 = abstractC1618a2.foxtrot().nextInt(Barcode.FORMAT_QR_CODE);
            int nextInt3 = abstractC1618a2.foxtrot().nextInt(Barcode.FORMAT_QR_CODE);
            polygonOptions.silver = Color.rgb(nextInt, nextInt2, nextInt3);
            polygonOptions.red = 5.0f;
            polygonOptions.teal = Color.argb(100, nextInt, nextInt2, nextInt3);
            kVar.bravo(polygonOptions);
            String localizedName = zone.getLocalizedName();
            if (localizedName == null) {
                localizedName = "";
            }
            List<List<List<Double>>> list4 = list.get(0);
            if (list4 != null && !list4.isEmpty()) {
                ArrayList indigo = CollectionsKt.indigo(CollectionsKt.indigo(list4));
                if (indigo.size() % 2 == 0) {
                    int alpha = AbstractC2770s7.alpha(0, indigo.size() - 1, 2);
                    double d4 = 0.0d;
                    double d9 = 0.0d;
                    if (alpha >= 0) {
                        while (true) {
                            d4 = ((Number) indigo.get(i4 + 1)).doubleValue() + d4;
                            d9 = ((Number) indigo.get(i4)).doubleValue() + d9;
                            if (i4 == alpha) {
                                break;
                            } else {
                                i4 += 2;
                            }
                        }
                    }
                    latLng = new LatLng(d4 / (indigo.size() / 2), d9 / (indigo.size() / 2));
                    if (latLng != null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        markerOptions.alpha = latLng;
                        markerOptions.purple = localizedName;
                        markerOptions.silver = T3.bravo(330.0f);
                        kVar.alpha(markerOptions);
                    }
                    if (!zone.isLocationInside(romeo())) {
                        Aa.m mVar = this.f12556g;
                        if (mVar != null) {
                            ((TextView) mVar.purple).setText(zone.getLocalizedName());
                            Aa.m mVar2 = this.f12556g;
                            if (mVar2 != null) {
                                ((TextView) mVar2.purple).setTextColor(Color.rgb(nextInt, nextInt2, nextInt3));
                                return;
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        }
                        Intrinsics.lima("binding");
                        throw null;
                    }
                    return;
                }
            }
            latLng = null;
            if (latLng != null) {
            }
            if (!zone.isLocationInside(romeo())) {
            }
        }
    }

    public final LatLng romeo() {
        double d4;
        LastSentLocationStore lastSentLocationStore = this.e;
        if (lastSentLocationStore != null) {
            Location location = lastSentLocationStore.get();
            double d9 = 0.0d;
            if (location != null) {
                d4 = location.getLatitude();
            } else {
                d4 = 0.0d;
            }
            if (location != null) {
                d9 = location.getLongitude();
            }
            return new LatLng(d4, d9);
        }
        Intrinsics.lima("lastSentLocationStore");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void sierra(k kVar, String areaType, long j5) {
        ZonesViewModel zonesViewModel = (ZonesViewModel) this.f12555f.getValue();
        Intrinsics.echo(areaType, "areaType");
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(zonesViewModel, null, new Xc.f(zonesViewModel, areaType, j5, auVar, null), 1, null);
        auVar.observe(this, new t(13, new c(this, kVar, 1)));
    }
}
