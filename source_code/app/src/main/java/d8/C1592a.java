package d8;

import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.google.firebase.encoders.EncodingException;
import e8.C1638f;
import java.util.Map;

/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1592a implements InterfaceC0733c {
    public final /* synthetic */ int alpha;

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
                interfaceC0734d.alpha(C1638f.golf, entry.getKey());
                interfaceC0734d.alpha(C1638f.hotel, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
