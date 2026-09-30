package p3;

import com.google.android.gms.location.FusedLocationProviderClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.i implements Xd.l {
    public final /* synthetic */ ab alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ FusedLocationProviderClient red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ Ref.ObjectRef teal;
    public final /* synthetic */ Function1 white;
    public final /* synthetic */ String yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ab abVar, long j5, FusedLocationProviderClient fusedLocationProviderClient, String str, Ref.ObjectRef objectRef, Function1 function1, String str2) {
        super(2, kotlin.jvm.internal.j.class, "tryForceSendAttempt", "requestSendCurrentLocationIfNeeded$tryForceSendAttempt(Lcom/app/feature/location/monitoring/LocationMonitoringController;JLcom/google/android/gms/location/FusedLocationProviderClient;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function1;Ljava/lang/String;IZ)V", 0);
        this.alpha = abVar;
        this.purple = j5;
        this.red = fusedLocationProviderClient;
        this.silver = str;
        this.teal = objectRef;
        this.white = function1;
        this.yellow = str2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ab.juliet(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, intValue, booleanValue);
        return Unit.INSTANCE;
    }
}
