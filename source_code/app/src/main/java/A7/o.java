package A7;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class o extends ThreadLocal {
    public final /* synthetic */ S5.k alpha;

    public o(S5.k kVar) {
        this.alpha = kVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        S5.k kVar = this.alpha;
        try {
            Mac mac = (Mac) l.foxtrot.alpha((String) kVar.red);
            mac.init((SecretKeySpec) kVar.silver);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
