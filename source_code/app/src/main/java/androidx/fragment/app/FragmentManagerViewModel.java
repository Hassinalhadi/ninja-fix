package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FragmentManagerViewModel extends androidx.lifecycle.Y {
    public static final N golf = new Object();
    public final boolean delta;
    public final HashMap alpha = new HashMap();
    public final HashMap bravo = new HashMap();
    public final HashMap charlie = new HashMap();
    public boolean echo = false;
    public boolean foxtrot = false;

    public FragmentManagerViewModel(boolean z2) {
        this.delta = z2;
    }

    public final void alpha(ai aiVar) {
        if (this.foxtrot) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap hashMap = this.alpha;
        if (!hashMap.containsKey(aiVar.mWho)) {
            hashMap.put(aiVar.mWho, aiVar);
            if (L.gray(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + aiVar);
            }
        }
    }

    public final void bravo(ai aiVar, boolean z2) {
        if (L.gray(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + aiVar);
        }
        delta(aiVar.mWho, z2);
    }

    public final void charlie(String str, boolean z2) {
        if (L.gray(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        delta(str, z2);
    }

    public final void delta(String str, boolean z2) {
        HashMap hashMap = this.bravo;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) hashMap.get(str);
        if (fragmentManagerViewModel != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.bravo.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.charlie((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.charlie;
        androidx.lifecycle.c0 c0Var = (androidx.lifecycle.c0) hashMap2.get(str);
        if (c0Var != null) {
            c0Var.alpha();
            hashMap2.remove(str);
        }
    }

    public final void echo(ai aiVar) {
        if (this.foxtrot) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.alpha.remove(aiVar.mWho) != null && L.gray(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + aiVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FragmentManagerViewModel.class == obj.getClass()) {
            FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
            if (this.alpha.equals(fragmentManagerViewModel.alpha) && this.bravo.equals(fragmentManagerViewModel.bravo) && this.charlie.equals(fragmentManagerViewModel.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        if (L.gray(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.echo = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.alpha.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.bravo.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.charlie.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
