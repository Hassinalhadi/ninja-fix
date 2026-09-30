package t6;

import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.google.firebase.encoders.EncodingException;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: t6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2983e implements InterfaceC0733c {
    public static final /* synthetic */ C2983e bravo = new C2983e(0);
    public static final /* synthetic */ C2983e charlie = new C2983e(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2983e(int i4) {
        this.alpha = i4;
    }

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
                Charset charset = C2988f.foxtrot;
                interfaceC0734d.alpha(C2988f.golf, entry.getKey());
                interfaceC0734d.alpha(C2988f.hotel, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
