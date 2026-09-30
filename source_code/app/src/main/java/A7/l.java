package A7;

import ao.ad;
import com.google.android.gms.internal.measurement.T0;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class l {
    public static final Logger charlie = Logger.getLogger(l.class.getName());
    public static final ArrayList delta;
    public static final l echo;
    public static final l foxtrot;
    public final m alpha;
    public final ArrayList bravo = delta;

    static {
        if (T0.alpha()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < 2; i4++) {
                String str = strArr[i4];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    charlie.info(ad.gray("Provider ", str, " not available"));
                }
            }
            delta = arrayList;
        } else {
            delta = new ArrayList();
        }
        echo = new l(new U8.a(1));
        foxtrot = new l(new W8.a(1));
    }

    public l(m mVar) {
        this.alpha = mVar;
    }

    public final Object alpha(String str) {
        Iterator it = this.bravo.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            m mVar = this.alpha;
            if (hasNext) {
                try {
                    return mVar.alpha(str, (Provider) it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            } else {
                return mVar.alpha(str, null);
            }
        }
    }
}
