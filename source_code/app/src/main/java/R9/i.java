package R9;

import Xd.p;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements p {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ s silver;

    public /* synthetic */ i(long j5, int i4, String str, s sVar) {
        this.alpha = j5;
        this.purple = i4;
        this.red = str;
        this.silver = sVar;
    }

    @Override // Xd.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long currentTimeMillis = System.currentTimeMillis() - this.alpha;
        Log.i("LocationFlow", "FRESH_LOC_RESULT action=PRE_COMPLETE taskId=" + this.purple + " taskType=" + this.red + " attempt=" + this.silver.alpha + " sent=" + booleanValue + " reason=" + ((String) obj2) + " lastLocationAgeMs=" + ((Long) obj3) + " stompState=" + ((String) obj4) + " topicPresent=" + ((Boolean) obj5) + " freshFix=" + ((Boolean) obj6) + " elapsed=" + currentTimeMillis + "ms");
        return Unit.INSTANCE;
    }
}
