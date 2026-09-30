package s6;

import com.google.android.gms.location.LocationRequest;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class O4 {
    public static final /* synthetic */ int alpha = 0;

    public static LocationRequest alpha(long j5, long j6) {
        Pair bravo = bravo(j5, j6);
        long longValue = ((Number) bravo.first).longValue();
        long longValue2 = ((Number) bravo.second).longValue();
        com.google.android.gms.location.g gVar = new com.google.android.gms.location.g(longValue);
        com.google.android.gms.location.n.alpha(100);
        gVar.alpha = 100;
        gVar.delta(longValue2);
        gVar.bravo(2);
        gVar.hotel = true;
        return gVar.alpha();
    }

    public static Pair bravo(long j5, long j6) {
        long echo = J4.echo(j5, 1000L, 120000L);
        return new Pair(Long.valueOf(echo), Long.valueOf(J4.echo(j6, 1000L, echo)));
    }
}
