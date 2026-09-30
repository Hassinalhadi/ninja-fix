package F8;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import s6.V4;

/* loaded from: classes2.dex */
public final class b implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ c red;

    public b(c cVar, int i4, long j5) {
        this.red = cVar;
        this.alpha = i4;
        this.purple = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.red;
        int i4 = this.alpha;
        final long j5 = this.purple;
        synchronized (cVar) {
            final int i5 = i4 - 1;
            final G6.q delta = ((j) cVar.delta).delta(3 - i5);
            final Task bravo = ((e) cVar.echo).bravo();
            V4.golf(delta, bravo).foxtrot((ScheduledExecutorService) cVar.golf, new G6.c() { // from class: F8.a
                @Override // G6.c
                public final Object ivory(Task task) {
                    Boolean valueOf;
                    JSONObject jSONObject;
                    c cVar2 = c.this;
                    G6.q qVar = delta;
                    Task task2 = bravo;
                    long j6 = j5;
                    int i10 = i5;
                    cVar2.getClass();
                    if (!qVar.juliet()) {
                        return V4.delta(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", qVar.golf()));
                    }
                    if (!task2.juliet()) {
                        return V4.delta(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.golf()));
                    }
                    i iVar = (i) qVar.hotel();
                    g gVar = (g) task2.hotel();
                    g gVar2 = iVar.bravo;
                    boolean z2 = false;
                    if (gVar2 != null) {
                        if (gVar2.foxtrot >= j6) {
                            z2 = true;
                        }
                        valueOf = Boolean.valueOf(z2);
                    } else {
                        if (iVar.alpha == 1) {
                            z2 = true;
                        }
                        valueOf = Boolean.valueOf(z2);
                    }
                    if (!valueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        cVar2.alpha(i10, j6);
                        return V4.echo(null);
                    }
                    if (iVar.bravo == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return V4.echo(null);
                    }
                    if (gVar == null) {
                        gVar = g.charlie().alpha();
                    }
                    g gVar3 = iVar.bravo;
                    g alpha = g.alpha(new JSONObject(gVar3.alpha.toString()));
                    HashMap bravo2 = gVar.bravo();
                    HashMap bravo3 = gVar3.bravo();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = gVar.bravo;
                    Iterator<String> keys = jSONObject2.keys();
                    while (true) {
                        boolean hasNext = keys.hasNext();
                        jSONObject = alpha.bravo;
                        if (!hasNext) {
                            break;
                        }
                        String next = keys.next();
                        JSONObject jSONObject3 = gVar3.bravo;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else {
                            JSONObject jSONObject4 = gVar.echo;
                            boolean has = jSONObject4.has(next);
                            JSONObject jSONObject5 = gVar3.echo;
                            if ((has && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (bravo2.containsKey(next) != bravo3.containsKey(next)) {
                                hashSet.add(next);
                            } else if (bravo2.containsKey(next) && bravo3.containsKey(next) && !((Map) bravo2.get(next)).equals(bravo3.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        }
                    }
                    Iterator<String> keys2 = jSONObject.keys();
                    while (keys2.hasNext()) {
                        hashSet.add(keys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return V4.echo(null);
                    }
                    synchronized (cVar2) {
                        Iterator it = ((LinkedHashSet) cVar2.bravo).iterator();
                        while (it.hasNext()) {
                            ((l) it.next()).getClass();
                        }
                    }
                    return V4.echo(null);
                }
            });
        }
    }
}
