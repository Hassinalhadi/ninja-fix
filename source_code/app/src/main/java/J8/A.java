package J8;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class A extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ J2.n purple;
    public final /* synthetic */ ArrayList red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(J2.n nVar, ArrayList arrayList, Nd.c cVar) {
        super(2, cVar);
        this.purple = nVar;
        this.red = arrayList;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new A(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
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
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((O7.i) it.next()).alpha.bravo()) {
                        ArrayList arrayList = this.red;
                        J2.n nVar = this.purple;
                        for (Message message : CollectionsKt.p(CollectionsKt.emerald(CollectionsKt.white(J2.n.charlie(nVar, arrayList, 2), J2.n.charlie(nVar, arrayList, 1))), new Object())) {
                            if (((Messenger) nVar.purple) != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = (Messenger) nVar.purple;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
                                    nVar.papa(message);
                                }
                            } else {
                                nVar.papa(message);
                            }
                        }
                    }
                }
            }
            Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
        }
        return Unit.INSTANCE;
    }
}
