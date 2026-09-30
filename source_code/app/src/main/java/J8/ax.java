package J8;

import android.util.Log;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ax extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(String str, Nd.c cVar) {
        super(2, cVar);
        this.purple = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ax(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ax) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            K8.c cVar = K8.c.alpha;
            this.alpha = 1;
            obj = cVar.bravo(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Collection<O7.i> values = ((Map) obj).values();
        String str = this.purple;
        for (O7.i iVar : values) {
            K8.e eVar = new K8.e(str);
            iVar.getClass();
            String str2 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            O7.h hVar = iVar.bravo;
            synchronized (hVar) {
                if (!Objects.equals(hVar.charlie, str)) {
                    O7.h.alpha(hVar.alpha, hVar.bravo, str);
                    hVar.charlie = str;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + K8.d.alpha + " of new session " + str);
        }
        return Unit.INSTANCE;
    }
}
