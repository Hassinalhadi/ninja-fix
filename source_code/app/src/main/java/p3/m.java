package p3;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ FusedLocationProviderClient purple;
    public final /* synthetic */ LocationCallback red;

    public /* synthetic */ m(FusedLocationProviderClient fusedLocationProviderClient, LocationCallback locationCallback, int i4) {
        this.alpha = i4;
        this.purple = fusedLocationProviderClient;
        this.red = locationCallback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.removeLocationUpdates(this.red);
                return Unit.INSTANCE;
            case 1:
                this.purple.removeLocationUpdates(this.red);
                return Unit.INSTANCE;
            default:
                this.purple.removeLocationUpdates(this.red);
                return Unit.INSTANCE;
        }
    }
}
