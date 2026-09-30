package p3;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Function1 {
    public final /* synthetic */ androidx.compose.material3.internal.t alpha;
    public final /* synthetic */ z purple;
    public final /* synthetic */ LocationRequest red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ long teal;

    public /* synthetic */ af(androidx.compose.material3.internal.t tVar, z zVar, LocationRequest locationRequest, long j5, long j6) {
        this.alpha = tVar;
        this.purple = zVar;
        this.red = locationRequest;
        this.silver = j5;
        this.teal = j6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Context) this.alpha.alpha);
        Intrinsics.delta(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.purple.invoke(fusedLocationProviderClient, this.red, Long.valueOf(this.silver), Long.valueOf(this.teal));
        return Unit.INSTANCE;
    }
}
