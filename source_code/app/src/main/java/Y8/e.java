package Y8;

import B9.ab;
import ao.ad;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e implements OnFailureListener, I7.e {
    public static final /* synthetic */ e alpha = new Object();
    public static final /* synthetic */ e purple = new Object();

    @Override // I7.e
    public Object create(I7.c cVar) {
        Set maroon = ((ab) cVar).maroon(d.class);
        Object obj = new Object();
        new HashMap();
        new HashMap();
        Iterator it = maroon.iterator();
        if (!it.hasNext()) {
            return obj;
        }
        throw ad.yankee(it);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        c.zzc(exc);
    }
}
