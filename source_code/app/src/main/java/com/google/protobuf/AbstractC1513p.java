package com.google.protobuf;

import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1513p extends AbstractC1498a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1513p> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C unknownFields;

    public AbstractC1513p() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C.foxtrot;
    }

    public static AbstractC1513p kilo(Class cls) {
        AbstractC1513p abstractC1513p = defaultInstanceMap.get(cls);
        if (abstractC1513p == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1513p = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC1513p == null) {
            AbstractC1513p abstractC1513p2 = (AbstractC1513p) ((AbstractC1513p) L.bravo(cls)).juliet(6);
            if (abstractC1513p2 != null) {
                defaultInstanceMap.put(cls, abstractC1513p2);
                return abstractC1513p2;
            }
            throw new IllegalStateException();
        }
        return abstractC1513p;
    }

    public static Object lima(Method method, aj ajVar, Object... objArr) {
        try {
            return method.invoke(ajVar, objArr);
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

    public static InterfaceC1516t oscar(InterfaceC1516t interfaceC1516t) {
        int i4;
        int size = interfaceC1516t.size();
        if (size == 0) {
            i4 = 10;
        } else {
            i4 = size * 2;
        }
        return interfaceC1516t.golf(i4);
    }

    public static void papa(Class cls, AbstractC1513p abstractC1513p) {
        abstractC1513p.november();
        defaultInstanceMap.put(cls, abstractC1513p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ar arVar = ar.charlie;
        arVar.getClass();
        return arVar.alpha(getClass()).hotel(this, (AbstractC1513p) obj);
    }

    public final int hashCode() {
        if (mike()) {
            ar arVar = ar.charlie;
            arVar.getClass();
            return arVar.alpha(getClass()).foxtrot(this);
        }
        if (this.memoizedHashCode == 0) {
            ar arVar2 = ar.charlie;
            arVar2.getClass();
            this.memoizedHashCode = arVar2.alpha(getClass()).foxtrot(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC1498a
    public final int hotel(au auVar) {
        int golf;
        int golf2;
        if (mike()) {
            if (auVar == null) {
                ar arVar = ar.charlie;
                arVar.getClass();
                golf2 = arVar.alpha(getClass()).golf(this);
            } else {
                golf2 = auVar.golf(this);
            }
            if (golf2 >= 0) {
                return golf2;
            }
            throw new IllegalStateException(ao.ad.zulu(golf2, "serialized size must be non-negative, was "));
        }
        int i4 = this.memoizedSerializedSize;
        if ((i4 & LottieConstants.IterateForever) != Integer.MAX_VALUE) {
            return i4 & LottieConstants.IterateForever;
        }
        if (auVar == null) {
            ar arVar2 = ar.charlie;
            arVar2.getClass();
            golf = arVar2.alpha(getClass()).golf(this);
        } else {
            golf = auVar.golf(this);
        }
        quebec(golf);
        return golf;
    }

    public final AbstractC1511n india() {
        return (AbstractC1511n) juliet(5);
    }

    public abstract Object juliet(int i4);

    public final boolean mike() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void november() {
        this.memoizedSerializedSize &= LottieConstants.IterateForever;
    }

    public final void quebec(int i4) {
        if (i4 >= 0) {
            this.memoizedSerializedSize = (i4 & LottieConstants.IterateForever) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(ao.ad.zulu(i4, "serialized size must be non-negative, was "));
    }

    public final void romeo(C1503f c1503f) {
        ar arVar = ar.charlie;
        arVar.getClass();
        au alpha = arVar.alpha(getClass());
        ac acVar = c1503f.charlie;
        if (acVar == null) {
            acVar = new ac(c1503f);
        }
        alpha.echo(this, acVar);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ak.alpha;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        ak.charlie(this, sb2, 0);
        return sb2.toString();
    }
}
