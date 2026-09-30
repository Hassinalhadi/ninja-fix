package T;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l extends Lambda implements Xd.l {
    public static final l alpha = new Lambda(2);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        q qVar = (q) obj2;
        if (str.length() == 0) {
            return qVar.toString();
        }
        return str + ", " + qVar;
    }
}
