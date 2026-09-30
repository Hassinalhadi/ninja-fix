package i2;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o1.C2189b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J6;
import vf.C3207k;
import vf.ad;

/* loaded from: classes3.dex */
public abstract class e {
    public final MeasurementManager alpha;

    public e(MeasurementManager mMeasurementManager) {
        Intrinsics.echo(mMeasurementManager, "mMeasurementManager");
        this.alpha = mMeasurementManager;
    }

    public static Object bravo(e eVar, AbstractC1886a abstractC1886a, Nd.c<? super Unit> cVar) {
        new C3207k(1, J6.delta(cVar)).tango();
        MeasurementManager measurementManager = eVar.alpha;
        throw null;
    }

    public static Object delta(e eVar, Nd.c<? super Integer> cVar) {
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        eVar.alpha.getMeasurementApiStatus(new ap.a(1), new C2189b(c3207k));
        Object sierra = c3207k.sierra();
        Od.a aVar = Od.a.alpha;
        return sierra;
    }

    public static Object golf(e eVar, Uri uri, InputEvent inputEvent, Nd.c<? super Unit> cVar) {
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        eVar.alpha.registerSource(uri, inputEvent, new ap.a(1), new C2189b(c3207k));
        Object sierra = c3207k.sierra();
        if (sierra == Od.a.alpha) {
            return sierra;
        }
        return Unit.INSTANCE;
    }

    public static Object hotel(e eVar, f fVar, Nd.c<? super Unit> cVar) {
        Object mike = ad.mike(new d(eVar, null), cVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }

    public static Object juliet(e eVar, Uri uri, Nd.c<? super Unit> cVar) {
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        eVar.alpha.registerTrigger(uri, new ap.a(1), new C2189b(c3207k));
        Object sierra = c3207k.sierra();
        if (sierra == Od.a.alpha) {
            return sierra;
        }
        return Unit.INSTANCE;
    }

    public static Object lima(e eVar, g gVar, Nd.c<? super Unit> cVar) {
        new C3207k(1, J6.delta(cVar)).tango();
        MeasurementManager measurementManager = eVar.alpha;
        throw null;
    }

    public static Object november(e eVar, h hVar, Nd.c<? super Unit> cVar) {
        new C3207k(1, J6.delta(cVar)).tango();
        MeasurementManager measurementManager = eVar.alpha;
        throw null;
    }

    @Nullable
    public Object alpha(@NotNull AbstractC1886a abstractC1886a, @NotNull Nd.c<? super Unit> cVar) {
        return bravo(this, abstractC1886a, cVar);
    }

    @Nullable
    public Object charlie(@NotNull Nd.c<? super Integer> cVar) {
        return delta(this, cVar);
    }

    @Nullable
    public Object echo(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Nd.c<? super Unit> cVar) {
        return golf(this, uri, inputEvent, cVar);
    }

    @Nullable
    public Object foxtrot(@NotNull f fVar, @NotNull Nd.c<? super Unit> cVar) {
        return hotel(this, fVar, cVar);
    }

    @Nullable
    public Object india(@NotNull Uri uri, @NotNull Nd.c<? super Unit> cVar) {
        return juliet(this, uri, cVar);
    }

    @Nullable
    public Object kilo(@NotNull g gVar, @NotNull Nd.c<? super Unit> cVar) {
        return lima(this, gVar, cVar);
    }

    @Nullable
    public Object mike(@NotNull h hVar, @NotNull Nd.c<? super Unit> cVar) {
        return november(this, hVar, cVar);
    }
}
