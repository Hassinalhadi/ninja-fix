package Xc;

import V5.x;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;
import com.app.network.network.models.HeatMapLocation;
import com.app.network.network.models.Shift;
import com.app.network.network.models.Zone;
import com.app.network.network.response.DataResponse;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.heatmaps.HeatmapTileProvider;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.zones.ZonesFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q6.w;
import r3.C2492a;
import t6.T3;
import x6.k;
import z6.j;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ZonesFragment purple;
    public final /* synthetic */ k red;

    public /* synthetic */ c(ZonesFragment zonesFragment, k kVar, int i4) {
        this.alpha = i4;
        this.purple = zonesFragment;
        this.red = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.os.Parcelable, com.google.android.gms.maps.model.TileOverlayOptions, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<Shift> emptyList;
        String str;
        List<HeatMapLocation> list;
        int collectionSizeOrDefault;
        k kVar = this.red;
        ZonesFragment zonesFragment = this.purple;
        C2492a c2492a = (C2492a) obj;
        switch (this.alpha) {
            case 0:
                int i4 = c2492a.alpha;
                if (i4 != 0) {
                    if (i4 == 1) {
                        DataResponse dataResponse = (DataResponse) c2492a.charlie;
                        if (dataResponse == null || (emptyList = dataResponse.getItems()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        for (Shift shift : emptyList) {
                            if (shift.getZone() != null) {
                                Zone zone = shift.getZone();
                                Intrinsics.checkNotNull(zone);
                                zonesFragment.quebec(zone, kVar);
                                String areaType = shift.getAreaType();
                                Intrinsics.checkNotNull(areaType);
                                Zone zone2 = shift.getZone();
                                Intrinsics.checkNotNull(zone2);
                                Long id2 = zone2.getId();
                                Intrinsics.checkNotNull(id2);
                                zonesFragment.sierra(kVar, areaType, id2.longValue());
                            } else if (shift.getBranch() != null) {
                                Shift.Branch branch = shift.getBranch();
                                if (branch == null || (str = branch.getName()) == null) {
                                    str = "";
                                }
                                Shift.Branch branch2 = shift.getBranch();
                                Intrinsics.checkNotNull(branch2);
                                String latitude = branch2.getLatitude();
                                Intrinsics.checkNotNull(latitude);
                                double parseDouble = Double.parseDouble(latitude);
                                Shift.Branch branch3 = shift.getBranch();
                                Intrinsics.checkNotNull(branch3);
                                String longitude = branch3.getLongitude();
                                Intrinsics.checkNotNull(longitude);
                                LatLng latLng = new LatLng(parseDouble, Double.parseDouble(longitude));
                                zonesFragment.getClass();
                                MarkerOptions markerOptions = new MarkerOptions();
                                markerOptions.alpha = latLng;
                                markerOptions.purple = str;
                                markerOptions.silver = T3.bravo(330.0f);
                                kVar.alpha(markerOptions);
                                String areaType2 = shift.getAreaType();
                                Intrinsics.checkNotNull(areaType2);
                                Shift.Branch branch4 = shift.getBranch();
                                Intrinsics.checkNotNull(branch4);
                                Long id3 = branch4.getId();
                                Intrinsics.checkNotNull(id3);
                                zonesFragment.sierra(kVar, areaType2, id3.longValue());
                            }
                        }
                    }
                } else {
                    Toast.makeText(zonesFragment.getContext(), R.string.failed_to_load, 1).show();
                }
                return Unit.INSTANCE;
            default:
                int i5 = c2492a.alpha;
                if (i5 != 0) {
                    if (i5 == 1 && (list = (List) c2492a.charlie) != null) {
                        zonesFragment.getClass();
                        if (!list.isEmpty()) {
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            for (HeatMapLocation heatMapLocation : list) {
                                arrayList.add(new LatLng(heatMapLocation.getLatitude(), heatMapLocation.getLongitude()));
                            }
                            HeatmapTileProvider build = new HeatmapTileProvider.Builder().data(arrayList).build();
                            ?? obj2 = new Object();
                            obj2.purple = true;
                            obj2.silver = true;
                            obj2.teal = 0.0f;
                            x.india(build, "tileProvider must not be null.");
                            obj2.alpha = new j(build);
                            try {
                                y6.g gVar = kVar.alpha;
                                Parcel ivory = gVar.ivory();
                                w.charlie(ivory, obj2);
                                Parcel delta = gVar.delta(ivory, 13);
                                IBinder readStrongBinder = delta.readStrongBinder();
                                int i10 = q6.j.hotel;
                                if (readStrongBinder != null) {
                                    boolean z2 = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate") instanceof q6.k;
                                }
                                delta.recycle();
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        } else {
                            Log.d("drawHeatMap", "No locations available to draw the heatmap.");
                        }
                    }
                } else {
                    Toast.makeText(zonesFragment.getContext(), R.string.failed_to_load, 1).show();
                }
                return Unit.INSTANCE;
        }
    }
}
