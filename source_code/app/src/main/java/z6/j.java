package z6;

import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;
import com.google.maps.android.heatmaps.HeatmapTileProvider;
import m6.AbstractBinderC2100a;
import q6.m;
import q6.w;

/* loaded from: classes2.dex */
public final class j extends AbstractBinderC2100a implements m {
    public static final /* synthetic */ int india = 0;
    public final /* synthetic */ HeatmapTileProvider hotel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HeatmapTileProvider heatmapTileProvider) {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate", 4);
        this.hotel = heatmapTileProvider;
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean jade(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        w.bravo(parcel);
        Tile tile = this.hotel.getTile(readInt, readInt2, readInt3);
        parcel2.writeNoException();
        if (tile == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        tile.writeToParcel(parcel2, 1);
        return true;
    }
}
