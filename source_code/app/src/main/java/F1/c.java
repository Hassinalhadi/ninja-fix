package F1;

import androidx.datastore.preferences.protobuf.C0600g;
import androidx.datastore.preferences.protobuf.C0601h;
import androidx.datastore.preferences.protobuf.C0604k;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.ad;
import androidx.datastore.preferences.protobuf.an;
import androidx.datastore.preferences.protobuf.ap;
import androidx.datastore.preferences.protobuf.ar;
import androidx.datastore.preferences.protobuf.as;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c extends s {
    private static final c DEFAULT_INSTANCE;
    private static volatile an PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private ad preferences_ = ad.purple;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        s.india(c.class, cVar);
    }

    public static ad lima(c cVar) {
        ad adVar = cVar.preferences_;
        if (!adVar.alpha) {
            cVar.preferences_ = adVar.bravo();
        }
        return cVar.preferences_;
    }

    public static a november() {
        return (a) ((q) DEFAULT_INSTANCE.bravo(5));
    }

    public static c oscar(InputStream inputStream) {
        c cVar = DEFAULT_INSTANCE;
        C0600g c0600g = new C0600g(inputStream);
        C0604k alpha = C0604k.alpha();
        s hotel = cVar.hotel();
        try {
            ap apVar = ap.charlie;
            apVar.getClass();
            as alpha2 = apVar.alpha(hotel.getClass());
            C0601h c0601h = (C0601h) c0600g.purple;
            if (c0601h == null) {
                c0601h = new C0601h(c0600g);
            }
            alpha2.india(hotel, c0601h, alpha);
            alpha2.alpha(hotel);
            if (s.echo(hotel, true)) {
                return (c) hotel;
            }
            throw new UninitializedMessageException(hotel).asInvalidProtocolBufferException().setUnfinishedMessage(hotel);
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(hotel);
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(hotel);
        } catch (IOException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw new InvalidProtocolBufferException(e5).setUnfinishedMessage(hotel);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw e10;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, androidx.datastore.preferences.protobuf.an] */
    @Override // androidx.datastore.preferences.protobuf.s
    public final Object bravo(int i4) {
        an anVar;
        switch (av.q.mike(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ar(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.alpha});
            case 3:
                return new c();
            case 4:
                return new q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                an anVar2 = PARSER;
                if (anVar2 == null) {
                    synchronized (c.class) {
                        try {
                            an anVar3 = PARSER;
                            anVar = anVar3;
                            if (anVar3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                anVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return anVar;
                }
                return anVar2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map mike() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
