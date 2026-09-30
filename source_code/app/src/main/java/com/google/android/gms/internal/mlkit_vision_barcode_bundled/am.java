package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class am extends AbstractC1423q {
    private static final Map zzb = new ConcurrentHashMap();
    protected Q zzc;
    private int zzd;

    public am() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = Q.foxtrot;
    }

    public static am echo(Class cls) {
        Map map = zzb;
        am amVar = (am) map.get(cls);
        if (amVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                amVar = (am) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (amVar == null) {
            am amVar2 = (am) ((am) W.foxtrot(cls)).mike(6, null);
            if (amVar2 != null) {
                map.put(cls, amVar2);
                return amVar2;
            }
            throw new IllegalStateException();
        }
        return amVar;
    }

    public static Object foxtrot(Method method, B b2, Object... objArr) {
        try {
            return method.invoke(b2, objArr);
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

    public static void hotel(Class cls, am amVar) {
        amVar.golf();
        zzb.put(cls, amVar);
    }

    public static final boolean juliet(am amVar, boolean z2) {
        am amVar2 = null;
        byte byteValue = ((Byte) amVar.mike(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean charlie = H.charlie.alpha(amVar.getClass()).charlie(amVar);
        if (z2) {
            if (true == charlie) {
                amVar2 = amVar;
            }
            amVar.mike(2, amVar2);
        }
        return charlie;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C
    public final boolean alpha() {
        return juliet(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1423q
    public final int bravo(M m4) {
        if (kilo()) {
            int golf = m4.golf(this);
            if (golf >= 0) {
                return golf;
            }
            throw new IllegalStateException(ao.ad.zulu(golf, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & LottieConstants.IterateForever;
        if (i4 == Integer.MAX_VALUE) {
            int golf2 = m4.golf(this);
            if (golf2 >= 0) {
                this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | golf2;
                return golf2;
            }
            throw new IllegalStateException(ao.ad.zulu(golf2, "serialized size must be non-negative, was "));
        }
        return i4;
    }

    public final int charlie() {
        if (kilo()) {
            int golf = H.charlie.alpha(getClass()).golf(this);
            if (golf >= 0) {
                return golf;
            }
            throw new IllegalStateException(ao.ad.zulu(golf, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & LottieConstants.IterateForever;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int golf2 = H.charlie.alpha(getClass()).golf(this);
        if (golf2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | golf2;
            return golf2;
        }
        throw new IllegalStateException(ao.ad.zulu(golf2, "serialized size must be non-negative, was "));
    }

    public final ai delta() {
        return (ai) mike(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return H.charlie.alpha(getClass()).hotel(this, (am) obj);
    }

    public final void golf() {
        this.zzd &= LottieConstants.IterateForever;
    }

    public final int hashCode() {
        if (!kilo()) {
            int i4 = this.zza;
            if (i4 == 0) {
                int foxtrot = H.charlie.alpha(getClass()).foxtrot(this);
                this.zza = foxtrot;
                return foxtrot;
            }
            return i4;
        }
        return H.charlie.alpha(getClass()).foxtrot(this);
    }

    public final void india() {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | LottieConstants.IterateForever;
    }

    public final boolean kilo() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final void lima(aa aaVar) {
        M alpha = H.charlie.alpha(getClass());
        ax axVar = aaVar.alpha;
        if (axVar == null) {
            axVar = new ax(aaVar);
        }
        alpha.india(this, axVar);
    }

    public abstract Object mike(int i4, am amVar);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = D.alpha;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        D.charlie(this, sb2, 0);
        return sb2.toString();
    }
}
