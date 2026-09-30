package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class x extends AbstractC1483a {
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected D unknownFields;

    public x() {
        this.memoizedHashCode = 0;
        this.unknownFields = D.foxtrot;
        this.memoizedSerializedSize = -1;
    }

    public static x echo(Class cls) {
        x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (xVar == null) {
            x xVar2 = (x) ((x) M.alpha(cls)).delta(6);
            if (xVar2 != null) {
                defaultInstanceMap.put(cls, xVar2);
                return xVar2;
            }
            throw new IllegalStateException();
        }
        return xVar;
    }

    public static Object golf(Method method, ao aoVar, Object... objArr) {
        try {
            return method.invoke(aoVar, objArr);
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

    public static x india(x xVar, AbstractC1490h abstractC1490h, p pVar) {
        C1489g c1489g = (C1489g) abstractC1490h;
        int lima = c1489g.lima();
        int size = c1489g.size();
        C1491i c1491i = new C1491i(c1489g.silver, lima, size, true);
        try {
            c1491i.echo(size);
            x xVar2 = (x) xVar.delta(4);
            try {
                aw awVar = aw.charlie;
                awVar.getClass();
                A alpha = awVar.alpha(xVar2.getClass());
                C1493k c1493k = c1491i.charlie;
                if (c1493k == null) {
                    c1493k = new C1493k(c1491i);
                }
                alpha.hotel(xVar2, c1493k, pVar);
                alpha.alpha(xVar2);
                try {
                    if (c1491i.india == 0) {
                        if (xVar2.hotel()) {
                            return xVar2;
                        }
                        throw new UninitializedMessageException(xVar2).asInvalidProtocolBufferException().setUnfinishedMessage(xVar2);
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(xVar2);
                }
            } catch (IOException e4) {
                if (e4.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e4.getCause());
                }
                throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(xVar2);
            } catch (RuntimeException e5) {
                if (e5.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e5.getCause());
                }
                throw e5;
            }
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [C5.b, java.lang.Object] */
    public static x juliet(x xVar, byte[] bArr, p pVar) {
        int length = bArr.length;
        x xVar2 = (x) xVar.delta(4);
        try {
            aw awVar = aw.charlie;
            awVar.getClass();
            A alpha = awVar.alpha(xVar2.getClass());
            ?? obj = new Object();
            pVar.getClass();
            alpha.delta(xVar2, bArr, 0, length, obj);
            alpha.alpha(xVar2);
            if (xVar2.memoizedHashCode == 0) {
                if (xVar2.hotel()) {
                    return xVar2;
                }
                throw new UninitializedMessageException(xVar2).asInvalidProtocolBufferException().setUnfinishedMessage(xVar2);
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(xVar2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(xVar2);
        }
    }

    public static void kilo(Class cls, x xVar) {
        defaultInstanceMap.put(cls, xVar);
    }

    public final v charlie() {
        return (v) delta(5);
    }

    public abstract Object delta(int i4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((x) delta(6)).getClass().isInstance(obj)) {
            return false;
        }
        aw awVar = aw.charlie;
        awVar.getClass();
        return awVar.alpha(getClass()).echo(this, (x) obj);
    }

    public final int foxtrot() {
        if (this.memoizedSerializedSize == -1) {
            aw awVar = aw.charlie;
            awVar.getClass();
            this.memoizedSerializedSize = awVar.alpha(getClass()).india(this);
        }
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i4 = this.memoizedHashCode;
        if (i4 != 0) {
            return i4;
        }
        aw awVar = aw.charlie;
        awVar.getClass();
        int golf = awVar.alpha(getClass()).golf(this);
        this.memoizedHashCode = golf;
        return golf;
    }

    public final boolean hotel() {
        byte byteValue = ((Byte) delta(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        aw awVar = aw.charlie;
        awVar.getClass();
        boolean bravo = awVar.alpha(getClass()).bravo(this);
        delta(2);
        return bravo;
    }

    public final void lima(C1494l c1494l) {
        aw awVar = aw.charlie;
        awVar.getClass();
        A alpha = awVar.alpha(getClass());
        C1495m c1495m = c1494l.alpha;
        if (c1495m == null) {
            c1495m = new C1495m(c1494l);
        }
        alpha.foxtrot(this, c1495m);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        ap.yankee(this, sb2, 0);
        return sb2.toString();
    }
}
