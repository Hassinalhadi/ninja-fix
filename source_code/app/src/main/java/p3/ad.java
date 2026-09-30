package p3;

import android.location.Location;
import com.app.feature.location.api.StompStateHolder;
import java.util.ArrayList;
import k4.C2007a;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import n.Y;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ag purple;
    public final /* synthetic */ B2.ad red;

    public /* synthetic */ ad(B2.ad adVar, ag agVar, int i4) {
        this.alpha = i4;
        this.red = adVar;
        this.purple = agVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                Location location = this.purple.alpha;
                long time = location.getTime();
                B2.ad adVar = this.red;
                CollectionsKt.d((ArrayList) adVar.foxtrot, new com.clevertap.android.sdk.inapp.evaluation.a(time, 4));
                ((InterfaceC3142e) adVar.charlie).alpha("LocationFlow", "[PENDING_RETRY] Pending location rejected by validation, removed from queue: lat=" + location.getLatitude() + ", lng=" + location.getLongitude());
                return Unit.INSTANCE;
            case 1:
                ag agVar = this.purple;
                int i4 = agVar.echo + 1;
                agVar.echo = i4;
                B2.ad adVar2 = this.red;
                InterfaceC3142e interfaceC3142e = (InterfaceC3142e) adVar2.charlie;
                Location location2 = agVar.alpha;
                interfaceC3142e.alpha("LocationFlow", "[PENDING_RETRY] Retrying location push attempt=" + i4 + "/3 lat=" + location2.getLatitude() + ", lng=" + location2.getLongitude() + ", time=" + location2.getTime());
                ad adVar3 = new ad(adVar2, agVar, 2);
                C2007a c2007a = new C2007a(9, adVar2, agVar);
                if (((StompStateHolder) adVar2.bravo).getState() == ah.purple) {
                    g3.w wVar = (g3.w) ((C2275g) adVar2.alpha).invoke();
                    if (wVar == null) {
                        c2007a.invoke(new Exception("locationSend is null"));
                    } else {
                        wVar.alpha(agVar.bravo, agVar.charlie, new kotlin.collections.n(14, adVar3), new Y(5, c2007a));
                    }
                }
                return Unit.INSTANCE;
            default:
                Location location3 = this.purple.alpha;
                long time2 = location3.getTime();
                B2.ad adVar4 = this.red;
                CollectionsKt.d((ArrayList) adVar4.foxtrot, new com.clevertap.android.sdk.inapp.evaluation.a(time2, 4));
                ((InterfaceC3142e) adVar4.charlie).alpha("LocationFlow", "[PUSH_SUCCESS] Location pushed successfully | source=PENDING_RETRY lat=" + location3.getLatitude() + ", lng=" + location3.getLongitude() + ", accuracy=" + location3.getAccuracy() + "m, time=" + location3.getTime());
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ad(ag agVar, B2.ad adVar) {
        this.alpha = 1;
        this.purple = agVar;
        this.red = adVar;
    }
}
