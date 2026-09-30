package s6;

import b8.InterfaceC0733c;
import c8.InterfaceC0830a;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class U implements InterfaceC0830a {
    public static final S silver = new S(1);
    public final HashMap alpha;
    public final HashMap purple;
    public final S red;

    public U(HashMap hashMap, HashMap hashMap2, S s3) {
        this.alpha = hashMap;
        this.purple = hashMap2;
        this.red = s3;
    }

    @Override // c8.InterfaceC0830a
    public /* bridge */ /* synthetic */ InterfaceC0830a alpha(Class cls, InterfaceC0733c interfaceC0733c) {
        this.alpha.put(cls, interfaceC0733c);
        this.purple.remove(cls);
        return this;
    }

    public byte[] bravo(B5 b52) {
        T t5;
        InterfaceC0733c interfaceC0733c;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap hashMap = this.alpha;
            t5 = new T(byteArrayOutputStream, hashMap, this.purple, this.red);
            interfaceC0733c = (InterfaceC0733c) hashMap.get(B5.class);
        } catch (IOException unused) {
        }
        if (interfaceC0733c != null) {
            interfaceC0733c.alpha(b52, t5);
            return byteArrayOutputStream.toByteArray();
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(B5.class)));
    }

    public U() {
        this.alpha = new HashMap();
        this.purple = new HashMap();
        this.red = silver;
    }
}
