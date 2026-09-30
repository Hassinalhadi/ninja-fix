package av;

import android.os.Build;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.b0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class aq {
    public static final C0505c alpha = new C0505c("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final HashMap bravo;
    public static final HashMap charlie;

    static {
        HashMap hashMap = new HashMap();
        bravo = hashMap;
        HashMap hashMap2 = new HashMap();
        charlie = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            b0 b0Var = b0.purple;
            hashSet.add(b0Var);
            b0 b0Var2 = b0.white;
            hashSet.add(b0Var2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(b0Var);
            hashSet2.add(b0Var2);
            hashSet2.add(b0.red);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            b0 b0Var3 = b0.alpha;
            hashSet3.add(b0Var3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            b0 b0Var4 = b0.silver;
            hashSet4.add(b0Var4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(b0Var);
            hashSet5.add(b0Var3);
            hashSet5.add(b0Var4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(b0Var);
            hashSet6.add(b0Var4);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [au.a, av.ah] */
    public static au.a alpha(au.a aVar, long j5) {
        aVar.getClass();
        C0505c c0505c = alpha;
        if (P0.alpha(aVar, c0505c) && ((Long) P0.victor(aVar, c0505c)).longValue() == j5) {
            return null;
        }
        androidx.camera.core.impl.aw delta = androidx.camera.core.impl.aw.delta(aVar);
        delta.hotel(c0505c, Long.valueOf(j5));
        return new ah(6, delta);
    }

    public static boolean bravo(b0 b0Var, long j5, List list) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (b0Var == b0.teal) {
                HashMap hashMap = charlie;
                if (hashMap.containsKey(Long.valueOf(j5))) {
                    Set set = (Set) hashMap.get(Long.valueOf(j5));
                    if (list.size() == set.size()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!set.contains((b0) it.next())) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            HashMap hashMap2 = bravo;
            if (hashMap2.containsKey(Long.valueOf(j5)) && ((Set) hashMap2.get(Long.valueOf(j5))).contains(b0Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean charlie(H h4, b0 b0Var) {
        if (!((Boolean) h4.plum(Z.amber, Boolean.FALSE)).booleanValue()) {
            C0505c c0505c = androidx.camera.core.impl.am.purple;
            if (h4.echo(c0505c)) {
                int intValue = ((Integer) h4.quebec(c0505c)).intValue();
                if (b0Var.ordinal() == 0 && intValue == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
