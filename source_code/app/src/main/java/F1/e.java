package F1;

import androidx.datastore.preferences.protobuf.AbstractC0595b;
import androidx.datastore.preferences.protobuf.C0599f;
import androidx.datastore.preferences.protobuf.an;
import androidx.datastore.preferences.protobuf.ao;
import androidx.datastore.preferences.protobuf.aq;
import androidx.datastore.preferences.protobuf.ar;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class e extends s {
    private static final e DEFAULT_INSTANCE;
    private static volatile an PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private t strings_ = aq.silver;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        s.india(e.class, eVar);
    }

    public static void lima(e eVar, Iterable iterable) {
        int i4;
        t tVar = eVar.strings_;
        if (!((AbstractC0595b) tVar).alpha) {
            aq aqVar = (aq) tVar;
            int i5 = aqVar.red;
            if (i5 == 0) {
                i4 = 10;
            } else {
                i4 = i5 * 2;
            }
            eVar.strings_ = aqVar.delta(i4);
        }
        RandomAccess randomAccess = eVar.strings_;
        Charset charset = u.alpha;
        iterable.getClass();
        if (iterable instanceof w) {
            List charlie = ((w) iterable).charlie();
            if (randomAccess == null) {
                ((aq) randomAccess).getClass();
                Iterator it = charlie.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (!(next instanceof C0599f)) {
                        if (next instanceof byte[]) {
                            byte[] bArr = (byte[]) next;
                            C0599f.delta(bArr, 0, bArr.length);
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            throw new ClassCastException();
        }
        if (iterable instanceof ao) {
            ((AbstractC0595b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((aq) randomAccess).red);
        }
        aq aqVar2 = (aq) randomAccess;
        int i10 = aqVar2.red;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (aqVar2.red - i10) + " is null.";
                for (int i11 = aqVar2.red - 1; i11 >= i10; i11--) {
                    aqVar2.remove(i11);
                }
                throw new NullPointerException(str);
            }
            aqVar2.add(obj);
        }
    }

    public static e mike() {
        return DEFAULT_INSTANCE;
    }

    public static d oscar() {
        return (d) ((q) DEFAULT_INSTANCE.bravo(5));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, androidx.datastore.preferences.protobuf.an] */
    @Override // androidx.datastore.preferences.protobuf.s
    public final Object bravo(int i4) {
        an anVar;
        switch (av.q.mike(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ar(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                an anVar2 = PARSER;
                if (anVar2 == null) {
                    synchronized (e.class) {
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

    public final t november() {
        return this.strings_;
    }
}
