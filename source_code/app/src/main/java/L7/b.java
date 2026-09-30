package L7;

import A8.g;
import I8.d;
import I8.e;
import P7.f;
import Q7.n;
import android.util.Log;
import com.google.android.material.internal.s;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public final class b {
    public final U7.c alpha;

    public b(U7.c cVar) {
        this.alpha = cVar;
    }

    public final void alpha(d dVar) {
        int collectionSizeOrDefault;
        U7.c cVar = this.alpha;
        HashSet hashSet = dVar.alpha;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(hashSet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            I8.c cVar2 = (I8.c) ((e) it.next());
            String str = cVar2.bravo;
            String str2 = cVar2.delta;
            String str3 = cVar2.echo;
            String str4 = cVar2.charlie;
            long j5 = cVar2.foxtrot;
            s sVar = n.alpha;
            if (str3.length() > 256) {
                str3 = str3.substring(0, Barcode.FORMAT_QR_CODE);
            }
            arrayList.add(new Q7.b(str, j5, str2, str3, str4));
        }
        synchronized (((Fe.c) cVar.white)) {
            try {
                if (((Fe.c) cVar.white).papa(arrayList)) {
                    ((f) cVar.red).bravo.alpha(new g(16, cVar, ((Fe.c) cVar.white).hotel()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
