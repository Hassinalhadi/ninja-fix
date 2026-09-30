package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class T {
    public final ArrayList alpha = new ArrayList();
    public final HashMap bravo = new HashMap();
    public final HashMap charlie = new HashMap();
    public FragmentManagerViewModel delta;

    public final void alpha(ai aiVar) {
        if (!this.alpha.contains(aiVar)) {
            synchronized (this.alpha) {
                this.alpha.add(aiVar);
            }
            aiVar.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + aiVar);
    }

    public final ai bravo(String str) {
        S s3 = (S) this.bravo.get(str);
        if (s3 != null) {
            return s3.charlie;
        }
        return null;
    }

    public final ai charlie(String str) {
        ai findFragmentByWho;
        for (S s3 : this.bravo.values()) {
            if (s3 != null && (findFragmentByWho = s3.charlie.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList delta() {
        ArrayList arrayList = new ArrayList();
        for (S s3 : this.bravo.values()) {
            if (s3 != null) {
                arrayList.add(s3);
            }
        }
        return arrayList;
    }

    public final ArrayList echo() {
        ArrayList arrayList = new ArrayList();
        for (S s3 : this.bravo.values()) {
            if (s3 != null) {
                arrayList.add(s3.charlie);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List foxtrot() {
        ArrayList arrayList;
        if (this.alpha.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.alpha) {
            arrayList = new ArrayList(this.alpha);
        }
        return arrayList;
    }

    public final void golf(S s3) {
        ai aiVar = s3.charlie;
        String str = aiVar.mWho;
        HashMap hashMap = this.bravo;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(aiVar.mWho, s3);
        if (aiVar.mRetainInstanceChangedWhileDetached) {
            if (aiVar.mRetainInstance) {
                this.delta.alpha(aiVar);
            } else {
                this.delta.echo(aiVar);
            }
            aiVar.mRetainInstanceChangedWhileDetached = false;
        }
        if (L.gray(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + aiVar);
        }
    }

    public final void hotel(S s3) {
        ai aiVar = s3.charlie;
        if (aiVar.mRetainInstance) {
            this.delta.echo(aiVar);
        }
        HashMap hashMap = this.bravo;
        if (hashMap.get(aiVar.mWho) == s3 && ((S) hashMap.put(aiVar.mWho, null)) != null && L.gray(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + aiVar);
        }
    }

    public final Bundle india(Bundle bundle, String str) {
        HashMap hashMap = this.charlie;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
