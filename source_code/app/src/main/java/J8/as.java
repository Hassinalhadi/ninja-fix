package J8;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import j8.InterfaceC1947d;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class as implements ap {
    public static final double foxtrot = Math.random();
    public static final /* synthetic */ int golf = 0;
    public final B7.g alpha;
    public final InterfaceC1947d bravo;
    public final N8.j charlie;
    public final l delta;
    public final Nd.h echo;

    public as(B7.g firebaseApp, InterfaceC1947d firebaseInstallations, N8.j sessionSettings, l eventGDTLogger, Nd.h backgroundDispatcher) {
        Intrinsics.echo(firebaseApp, "firebaseApp");
        Intrinsics.echo(firebaseInstallations, "firebaseInstallations");
        Intrinsics.echo(sessionSettings, "sessionSettings");
        Intrinsics.echo(eventGDTLogger, "eventGDTLogger");
        Intrinsics.echo(backgroundDispatcher, "backgroundDispatcher");
        this.alpha = firebaseApp;
        this.bravo = firebaseInstallations;
        this.charlie = sessionSettings;
        this.delta = eventGDTLogger;
        this.echo = backgroundDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(as asVar, Pd.c cVar) {
        ar arVar;
        int i4;
        boolean z2;
        Boolean bravo;
        if (cVar instanceof ar) {
            arVar = (ar) cVar;
            int i5 = arVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                arVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = arVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = arVar.silver;
                z2 = true;
                if (i4 == 0) {
                    if (i4 == 1) {
                        asVar = arVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    arVar.alpha = asVar;
                    arVar.silver = 1;
                    if (asVar.charlie.bravo(arVar) == aVar) {
                        return aVar;
                    }
                }
                N8.j jVar = asVar.charlie;
                bravo = jVar.alpha.bravo();
                if (bravo == null) {
                    z2 = bravo.booleanValue();
                } else {
                    Boolean bravo2 = jVar.bravo.bravo();
                    if (bravo2 != null) {
                        z2 = bravo2.booleanValue();
                    }
                }
                if (z2) {
                    Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
                    return Boolean.FALSE;
                }
                if (foxtrot <= asVar.charlie.alpha()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        arVar = new ar(asVar, cVar);
        Object obj2 = arVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = arVar.silver;
        z2 = true;
        if (i4 == 0) {
        }
        N8.j jVar2 = asVar.charlie;
        bravo = jVar2.alpha.bravo();
        if (bravo == null) {
        }
        if (z2) {
        }
    }
}
