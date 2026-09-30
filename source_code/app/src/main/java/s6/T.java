package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import b8.InterfaceC0735e;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.encoders.EncodingException;
import e8.C1634b;
import e8.C1640h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class T implements InterfaceC0734d {
    public static final Charset foxtrot = Charset.forName("UTF-8");
    public static final C0732b golf = new C0732b(Constants.KEY_KEY, A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b hotel = new C0732b("value", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final S india = new S(0);
    public OutputStream alpha;
    public final HashMap bravo;
    public final HashMap charlie;
    public final S delta;
    public final C1640h echo = new C1640h(this, 1);

    public T(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, S s3) {
        this.alpha = byteArrayOutputStream;
        this.bravo = hashMap;
        this.charlie = hashMap2;
        this.delta = s3;
    }

    public static int india(C0732b c0732b) {
        Q q4 = (Q) c0732b.bravo(Q.class);
        if (q4 != null) {
            return ((N) q4).alpha;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d alpha(C0732b c0732b, Object obj) {
        charlie(c0732b, obj, true);
        return this;
    }

    public final void bravo(C0732b c0732b, double d4, boolean z2) {
        if (z2 && d4 == 0.0d) {
            return;
        }
        kilo((india(c0732b) << 3) | 1);
        this.alpha.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d4).array());
    }

    public final void charlie(C0732b c0732b, Object obj, boolean z2) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z2 || charSequence.length() != 0) {
                    kilo((india(c0732b) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(foxtrot);
                    kilo(bytes.length);
                    this.alpha.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    charlie(c0732b, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    juliet(india, c0732b, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                bravo(c0732b, ((Double) obj).doubleValue(), z2);
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z2 || floatValue != 0.0f) {
                    kilo((india(c0732b) << 3) | 5);
                    this.alpha.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z2 || longValue != 0) {
                    Q q4 = (Q) c0732b.bravo(Q.class);
                    if (q4 != null) {
                        kilo(((N) q4).alpha << 3);
                        lima(longValue);
                        return;
                    }
                    throw new EncodingException("Field has no @Protobuf config");
                }
                return;
            }
            if (obj instanceof Boolean) {
                hotel(c0732b, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z2 && bArr.length == 0) {
                    return;
                }
                kilo((india(c0732b) << 3) | 2);
                kilo(bArr.length);
                this.alpha.write(bArr);
                return;
            }
            InterfaceC0733c interfaceC0733c = (InterfaceC0733c) this.bravo.get(obj.getClass());
            if (interfaceC0733c != null) {
                juliet(interfaceC0733c, c0732b, obj, z2);
                return;
            }
            InterfaceC0735e interfaceC0735e = (InterfaceC0735e) this.charlie.get(obj.getClass());
            if (interfaceC0735e != null) {
                C1640h c1640h = this.echo;
                c1640h.bravo = false;
                c1640h.delta = c0732b;
                c1640h.charlie = z2;
                interfaceC0735e.alpha(obj, c1640h);
                return;
            }
            if (obj instanceof O) {
                hotel(c0732b, ((O) obj).zza(), true);
            } else if (obj instanceof Enum) {
                hotel(c0732b, ((Enum) obj).ordinal(), true);
            } else {
                juliet(this.delta, c0732b, obj, z2);
            }
        }
    }

    @Override // b8.InterfaceC0734d
    public final /* synthetic */ InterfaceC0734d delta(C0732b c0732b, boolean z2) {
        hotel(c0732b, z2 ? 1 : 0, true);
        return this;
    }

    @Override // b8.InterfaceC0734d
    public final /* synthetic */ InterfaceC0734d echo(C0732b c0732b, int i4) {
        hotel(c0732b, i4, true);
        return this;
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d foxtrot(C0732b c0732b, long j5) {
        if (j5 != 0) {
            Q q4 = (Q) c0732b.bravo(Q.class);
            if (q4 != null) {
                kilo(((N) q4).alpha << 3);
                lima(j5);
                return this;
            }
            throw new EncodingException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d golf(C0732b c0732b, double d4) {
        bravo(c0732b, d4, true);
        return this;
    }

    public final void hotel(C0732b c0732b, int i4, boolean z2) {
        if (z2 && i4 == 0) {
            return;
        }
        Q q4 = (Q) c0732b.bravo(Q.class);
        if (q4 != null) {
            kilo(((N) q4).alpha << 3);
            kilo(i4);
            return;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void juliet(InterfaceC0733c interfaceC0733c, C0732b c0732b, Object obj, boolean z2) {
        C1634b c1634b = new C1634b(1);
        c1634b.purple = 0L;
        try {
            OutputStream outputStream = this.alpha;
            this.alpha = c1634b;
            try {
                interfaceC0733c.alpha(obj, this);
                this.alpha = outputStream;
                long j5 = c1634b.purple;
                c1634b.close();
                if (z2 && j5 == 0) {
                    return;
                }
                kilo((india(c0732b) << 3) | 2);
                lima(j5);
                interfaceC0733c.alpha(obj, this);
            } catch (Throwable th) {
                this.alpha = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1634b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void kilo(int i4) {
        while (true) {
            int i5 = i4 & 127;
            if ((i4 & (-128)) != 0) {
                this.alpha.write(i5 | 128);
                i4 >>>= 7;
            } else {
                this.alpha.write(i5);
                return;
            }
        }
    }

    public final void lima(long j5) {
        while (true) {
            int i4 = ((int) j5) & 127;
            if (((-128) & j5) != 0) {
                this.alpha.write(i4 | 128);
                j5 >>>= 7;
            } else {
                this.alpha.write(i4);
                return;
            }
        }
    }
}
