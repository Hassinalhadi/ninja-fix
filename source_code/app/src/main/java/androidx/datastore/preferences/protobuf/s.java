package androidx.datastore.preferences.protobuf;

import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class s extends AbstractC0594a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, s> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected ax unknownFields;

    public s() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ax.foxtrot;
    }

    public static s charlie(Class cls) {
        s sVar = defaultInstanceMap.get(cls);
        if (sVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (sVar == null) {
            s sVar2 = (s) ((s) D.delta(cls)).bravo(6);
            if (sVar2 != null) {
                defaultInstanceMap.put(cls, sVar2);
                return sVar2;
            }
            throw new IllegalStateException();
        }
        return sVar;
    }

    public static Object delta(Method method, ah ahVar, Object... objArr) {
        try {
            return method.invoke(ahVar, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean echo(s sVar, boolean z2) {
        byte byteValue = ((Byte) sVar.bravo(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        ap apVar = ap.charlie;
        apVar.getClass();
        boolean bravo = apVar.alpha(sVar.getClass()).bravo(sVar);
        if (z2) {
            sVar.bravo(2);
        }
        return bravo;
    }

    public static void india(Class cls, s sVar) {
        sVar.golf();
        defaultInstanceMap.put(cls, sVar);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0594a
    public final int alpha(as asVar) {
        int foxtrot;
        int foxtrot2;
        if (foxtrot()) {
            if (asVar == null) {
                ap apVar = ap.charlie;
                apVar.getClass();
                foxtrot2 = apVar.alpha(getClass()).foxtrot(this);
            } else {
                foxtrot2 = asVar.foxtrot(this);
            }
            if (foxtrot2 >= 0) {
                return foxtrot2;
            }
            throw new IllegalStateException(ao.ad.zulu(foxtrot2, "serialized size must be non-negative, was "));
        }
        int i4 = this.memoizedSerializedSize;
        if ((i4 & LottieConstants.IterateForever) != Integer.MAX_VALUE) {
            return i4 & LottieConstants.IterateForever;
        }
        if (asVar == null) {
            ap apVar2 = ap.charlie;
            apVar2.getClass();
            foxtrot = apVar2.alpha(getClass()).foxtrot(this);
        } else {
            foxtrot = asVar.foxtrot(this);
        }
        juliet(foxtrot);
        return foxtrot;
    }

    public abstract Object bravo(int i4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ap apVar = ap.charlie;
        apVar.getClass();
        return apVar.alpha(getClass()).hotel(this, (s) obj);
    }

    public final boolean foxtrot() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void golf() {
        this.memoizedSerializedSize &= LottieConstants.IterateForever;
    }

    public final int hashCode() {
        if (foxtrot()) {
            ap apVar = ap.charlie;
            apVar.getClass();
            return apVar.alpha(getClass()).golf(this);
        }
        if (this.memoizedHashCode == 0) {
            ap apVar2 = ap.charlie;
            apVar2.getClass();
            this.memoizedHashCode = apVar2.alpha(getClass()).golf(this);
        }
        return this.memoizedHashCode;
    }

    public final s hotel() {
        return (s) bravo(4);
    }

    public final void juliet(int i4) {
        if (i4 >= 0) {
            this.memoizedSerializedSize = (i4 & LottieConstants.IterateForever) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(ao.ad.zulu(i4, "serialized size must be non-negative, was "));
    }

    public final void kilo(C0602i c0602i) {
        ap apVar = ap.charlie;
        apVar.getClass();
        as alpha = apVar.alpha(getClass());
        aa aaVar = c0602i.alpha;
        if (aaVar == null) {
            aaVar = new aa(c0602i);
        }
        alpha.echo(this, aaVar);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ai.alpha;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        ai.charlie(this, sb2, 0);
        return sb2.toString();
    }
}
