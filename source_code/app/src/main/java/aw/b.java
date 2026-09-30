package aw;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public abstract class b {
    public static final HashMap alpha;
    public static final HashMap bravo;

    static {
        androidx.camera.core.t tVar;
        HashMap hashMap = new HashMap();
        alpha = hashMap;
        HashMap hashMap2 = new HashMap();
        bravo = hashMap2;
        androidx.camera.core.t tVar2 = androidx.camera.core.t.delta;
        hashMap.put(1L, tVar2);
        hashMap2.put(tVar2, Collections.singletonList(1L));
        hashMap.put(2L, androidx.camera.core.t.echo);
        hashMap2.put((androidx.camera.core.t) hashMap.get(2L), Collections.singletonList(2L));
        androidx.camera.core.t tVar3 = androidx.camera.core.t.foxtrot;
        hashMap.put(4L, tVar3);
        hashMap2.put(tVar3, Collections.singletonList(4L));
        androidx.camera.core.t tVar4 = androidx.camera.core.t.golf;
        hashMap.put(8L, tVar4);
        hashMap2.put(tVar4, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            tVar = androidx.camera.core.t.hotel;
            if (!hasNext) {
                break;
            } else {
                alpha.put((Long) it.next(), tVar);
            }
        }
        bravo.put(tVar, asList);
        List asList2 = Arrays.asList(Long.valueOf(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            androidx.camera.core.t tVar5 = androidx.camera.core.t.india;
            if (hasNext2) {
                alpha.put((Long) it2.next(), tVar5);
            } else {
                bravo.put(tVar5, asList2);
                return;
            }
        }
    }

    public static Long alpha(androidx.camera.core.t tVar, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) bravo.get(tVar);
        if (list != null) {
            supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
            for (Long l10 : list) {
                if (supportedProfiles.contains(l10)) {
                    return l10;
                }
            }
            return null;
        }
        return null;
    }
}
