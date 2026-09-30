package t7;

import A2.aj;
import com.google.crypto.tink.shaded.protobuf.AbstractC1483a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.ao;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;
import s7.InterfaceC2834a;
import s7.j;
import z7.aq;

/* loaded from: classes2.dex */
public final class g implements InterfaceC2834a {
    public static final byte[] charlie = new byte[0];
    public final aq alpha;
    public final b bravo;

    public g(aq aqVar, b bVar) {
        this.alpha = aqVar;
        this.bravo = bVar;
    }

    @Override // s7.InterfaceC2834a
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        ao aoVar;
        aq aqVar = this.alpha;
        Logger logger = j.alpha;
        synchronized (j.class) {
            try {
                aj ajVar = j.bravo(aqVar.romeo()).alpha;
                Class cls = (Class) ajVar.delta;
                if (!((Map) ajVar.charlie).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + ajVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (((Boolean) j.delta.get(aqVar.romeo())).booleanValue()) {
                    AbstractC1490h sierra = aqVar.sierra();
                    try {
                        G3.a india = ajVar.india();
                        ao P4 = india.P(sierra);
                        india.T(P4);
                        aoVar = (ao) india.I(P4);
                    } catch (InvalidProtocolBufferException e) {
                        throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) ajVar.india().alpha).getName()), e);
                    }
                } else {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + aqVar.romeo());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bravo = ((AbstractC1483a) aoVar).bravo();
        byte[] alpha = this.bravo.alpha(bravo, charlie);
        byte[] alpha2 = ((InterfaceC2834a) j.charlie(this.alpha.romeo(), AbstractC1490h.delta(bravo, 0, bravo.length), InterfaceC2834a.class)).alpha(bArr, bArr2);
        return ByteBuffer.allocate(alpha.length + 4 + alpha2.length).putInt(alpha.length).put(alpha).put(alpha2).array();
    }

    @Override // s7.InterfaceC2834a
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i4 = wrap.getInt();
            if (i4 > 0 && i4 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i4];
                wrap.get(bArr3, 0, i4);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] bravo = this.bravo.bravo(bArr3, charlie);
                String romeo = this.alpha.romeo();
                Logger logger = j.alpha;
                C1489g c1489g = AbstractC1490h.purple;
                return ((InterfaceC2834a) j.charlie(romeo, AbstractC1490h.delta(bravo, 0, bravo.length), InterfaceC2834a.class)).bravo(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e5) {
            e = e5;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
