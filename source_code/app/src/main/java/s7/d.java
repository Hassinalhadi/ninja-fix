package s7;

import av.q;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import w7.C3238a;

/* loaded from: classes2.dex */
public abstract class d {
    public static final CopyOnWriteArrayList alpha = new CopyOnWriteArrayList();

    public static C3238a alpha(String str) {
        boolean startsWith;
        Iterator it = alpha.iterator();
        while (it.hasNext()) {
            C3238a c3238a = (C3238a) it.next();
            synchronized (c3238a) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return c3238a;
            }
        }
        throw new GeneralSecurityException(q.echo("No KMS client does support: ", str));
    }
}
