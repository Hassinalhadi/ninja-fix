package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1392x1 extends AbstractC1340k1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected Z1 zzc;
    private int zzd;

    public AbstractC1392x1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = Z1.foxtrot;
    }

    public static AbstractC1392x1 golf(Class cls) {
        Map map = zzb;
        AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) map.get(cls);
        if (abstractC1392x1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1392x1 = (AbstractC1392x1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC1392x1 == null) {
            AbstractC1392x1 abstractC1392x12 = (AbstractC1392x1) ((AbstractC1392x1) AbstractC1311e2.foxtrot(cls)).mike(6);
            if (abstractC1392x12 != null) {
                map.put(cls, abstractC1392x12);
                return abstractC1392x12;
            }
            throw new IllegalStateException();
        }
        return abstractC1392x1;
    }

    public static Object hotel(Method method, O1 o12, Object... objArr) {
        try {
            return method.invoke(o12, objArr);
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

    public static void juliet(Class cls, AbstractC1392x1 abstractC1392x1) {
        abstractC1392x1.india();
        zzb.put(cls, abstractC1392x1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1340k1
    public final int alpha(X1 x12) {
        if (lima()) {
            int foxtrot = x12.foxtrot(this);
            if (foxtrot >= 0) {
                return foxtrot;
            }
            throw new IllegalStateException(ao.ad.zulu(foxtrot, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & LottieConstants.IterateForever;
        if (i4 == Integer.MAX_VALUE) {
            int foxtrot2 = x12.foxtrot(this);
            if (foxtrot2 >= 0) {
                this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | foxtrot2;
                return foxtrot2;
            }
            throw new IllegalStateException(ao.ad.zulu(foxtrot2, "serialized size must be non-negative, was "));
        }
        return i4;
    }

    public final int delta() {
        if (lima()) {
            int foxtrot = U1.charlie.alpha(getClass()).foxtrot(this);
            if (foxtrot >= 0) {
                return foxtrot;
            }
            throw new IllegalStateException(ao.ad.zulu(foxtrot, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & LottieConstants.IterateForever;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int foxtrot2 = U1.charlie.alpha(getClass()).foxtrot(this);
        if (foxtrot2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | foxtrot2;
            return foxtrot2;
        }
        throw new IllegalStateException(ao.ad.zulu(foxtrot2, "serialized size must be non-negative, was "));
    }

    public final AbstractC1388w1 echo() {
        return (AbstractC1388w1) mike(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return U1.charlie.alpha(getClass()).hotel(this, (AbstractC1392x1) obj);
    }

    public final AbstractC1388w1 foxtrot() {
        AbstractC1388w1 abstractC1388w1 = (AbstractC1388w1) mike(5);
        abstractC1388w1.charlie(this);
        return abstractC1388w1;
    }

    public final int hashCode() {
        if (!lima()) {
            int i4 = this.zza;
            if (i4 == 0) {
                int golf = U1.charlie.alpha(getClass()).golf(this);
                this.zza = golf;
                return golf;
            }
            return i4;
        }
        return U1.charlie.alpha(getClass()).golf(this);
    }

    public final void india() {
        this.zzd &= LottieConstants.IterateForever;
    }

    public final void kilo() {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | LottieConstants.IterateForever;
    }

    public final boolean lima() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public abstract Object mike(int i4);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = P1.alpha;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        P1.charlie(this, sb2, 0);
        return sb2.toString();
    }
}
