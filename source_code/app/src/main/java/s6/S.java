package s6;

import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class S implements InterfaceC0733c {
    public final /* synthetic */ int alpha;

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
                interfaceC0734d.alpha(T.golf, entry.getKey());
                interfaceC0734d.alpha(T.hotel, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
