package E8;

import A2.p;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.abt.AbtException;
import com.google.firebase.messaging.o;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import s6.V4;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements G6.g, G6.c, G6.e {
    public final /* synthetic */ b alpha;

    public /* synthetic */ a(b bVar) {
        this.alpha = bVar;
    }

    @Override // G6.c
    public Object ivory(Task task) {
        boolean z2;
        b bVar = this.alpha;
        bVar.getClass();
        if (task.juliet()) {
            F8.e eVar = bVar.delta;
            synchronized (eVar) {
                eVar.charlie = V4.echo(null);
            }
            eVar.bravo.alpha();
            F8.g gVar = (F8.g) task.hotel();
            if (gVar != null) {
                JSONArray jSONArray = gVar.delta;
                C7.b bVar2 = bVar.bravo;
                if (bVar2 != null) {
                    try {
                        bVar2.charlie(b.hotel(jSONArray));
                    } catch (AbtException e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e4) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e4);
                    }
                }
                o oVar = bVar.kilo;
                try {
                    I8.d tango = ((w.o) oVar.bravo).tango(gVar);
                    Iterator it = ((Set) oVar.delta).iterator();
                    while (it.hasNext()) {
                        ((Executor) oVar.charlie).execute(new G8.a((L7.b) it.next(), tango, 0));
                    }
                } catch (FirebaseRemoteConfigException e5) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e5);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // G6.e
    public void onComplete(Task task) {
        Intrinsics.echo(task, "task");
        if (task.juliet()) {
            this.alpha.alpha();
        }
    }

    @Override // G6.g
    public Task then(Object obj) {
        b bVar = this.alpha;
        Task bravo = bVar.delta.bravo();
        Task bravo2 = bVar.echo.bravo();
        return V4.golf(bravo, bravo2).foxtrot(bVar.charlie, new p(bVar, bravo, bravo2, 2));
    }
}
