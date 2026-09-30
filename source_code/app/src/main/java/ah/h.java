package ah;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.aa;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.aj;
import androidx.lifecycle.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import pf.C2351a;
import s6.R6;

/* loaded from: classes3.dex */
public abstract class h {
    public final LinkedHashMap alpha = new LinkedHashMap();
    public final LinkedHashMap bravo = new LinkedHashMap();
    public final LinkedHashMap charlie = new LinkedHashMap();
    public final ArrayList delta = new ArrayList();
    public final transient LinkedHashMap echo = new LinkedHashMap();
    public final LinkedHashMap foxtrot = new LinkedHashMap();
    public final Bundle golf = new Bundle();

    public final boolean alpha(int i4, int i5, Intent intent) {
        a aVar;
        String str = (String) this.alpha.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.echo.get(str);
        if (dVar != null) {
            aVar = dVar.alpha;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            ArrayList arrayList = this.delta;
            if (arrayList.contains(str)) {
                dVar.alpha.charlie(dVar.bravo.charlie(intent, i5));
                arrayList.remove(str);
                return true;
            }
        }
        this.foxtrot.remove(str);
        this.golf.putParcelable(str, new ActivityResult(intent, i5));
        return true;
    }

    public abstract void bravo(int i4, ai.b bVar, Object obj);

    public final g charlie(String key, ai.b bVar, a aVar) {
        Intrinsics.echo(key, "key");
        echo(key);
        this.echo.put(key, new d(bVar, aVar));
        LinkedHashMap linkedHashMap = this.foxtrot;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            aVar.charlie(obj);
        }
        Bundle bundle = this.golf;
        ActivityResult activityResult = (ActivityResult) R6.bravo(bundle, key, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(key);
            aVar.charlie(bVar.charlie(activityResult.purple, activityResult.alpha));
        }
        return new g(this, key, bVar, 1);
    }

    public final g delta(final String key, al lifecycleOwner, final ai.b contract, final a callback) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(lifecycleOwner, "lifecycleOwner");
        Intrinsics.echo(contract, "contract");
        Intrinsics.echo(callback, "callback");
        ac lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.bravo().compareTo(ab.silver) < 0) {
            echo(key);
            LinkedHashMap linkedHashMap = this.charlie;
            e eVar = (e) linkedHashMap.get(key);
            if (eVar == null) {
                eVar = new e(lifecycle);
            }
            aj ajVar = new aj() { // from class: ah.c
                @Override // androidx.lifecycle.aj
                public final void onStateChanged(al alVar, aa aaVar) {
                    aa aaVar2 = aa.ON_START;
                    h hVar = h.this;
                    String str = key;
                    if (aaVar2 == aaVar) {
                        LinkedHashMap linkedHashMap2 = hVar.echo;
                        a aVar = callback;
                        ai.b bVar = contract;
                        linkedHashMap2.put(str, new d(bVar, aVar));
                        LinkedHashMap linkedHashMap3 = hVar.foxtrot;
                        if (linkedHashMap3.containsKey(str)) {
                            Object obj = linkedHashMap3.get(str);
                            linkedHashMap3.remove(str);
                            aVar.charlie(obj);
                        }
                        Bundle bundle = hVar.golf;
                        ActivityResult activityResult = (ActivityResult) R6.bravo(bundle, str, ActivityResult.class);
                        if (activityResult != null) {
                            bundle.remove(str);
                            aVar.charlie(bVar.charlie(activityResult.purple, activityResult.alpha));
                            return;
                        }
                        return;
                    }
                    if (aa.ON_STOP == aaVar) {
                        hVar.echo.remove(str);
                    } else if (aa.ON_DESTROY == aaVar) {
                        hVar.foxtrot(str);
                    }
                }
            };
            eVar.alpha.alpha(ajVar);
            eVar.bravo.add(ajVar);
            linkedHashMap.put(key, eVar);
            return new g(this, key, contract, 0);
        }
        throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.bravo() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final void echo(String str) {
        LinkedHashMap linkedHashMap = this.bravo;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = ((C2351a) AbstractC2360j.mike(f.alpha)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.alpha;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void foxtrot(String key) {
        Integer num;
        Intrinsics.echo(key, "key");
        if (!this.delta.contains(key) && (num = (Integer) this.bravo.remove(key)) != null) {
            this.alpha.remove(num);
        }
        this.echo.remove(key);
        LinkedHashMap linkedHashMap = this.foxtrot;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder victor = Q0.c.victor("Dropping pending result for request ", key, ": ");
            victor.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", victor.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.golf;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) R6.bravo(bundle, key, ActivityResult.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.charlie;
        e eVar = (e) linkedHashMap2.get(key);
        if (eVar != null) {
            ArrayList arrayList = eVar.bravo;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.alpha.charlie((aj) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
