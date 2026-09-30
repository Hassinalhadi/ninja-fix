package Y1;

import android.content.SharedPreferences;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.ax;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {
    public boolean alpha;
    public boolean bravo;
    public boolean charlie;
    public Object delta;
    public Object echo;

    public j(ax axVar, String str, boolean z2) {
        this.echo = axVar;
        V5.x.echo(str);
        this.delta = str;
        this.alpha = z2;
    }

    public k alpha() {
        aq aqVar;
        aq aqVar2 = (aq) this.delta;
        if (aqVar2 == null) {
            Object obj = this.echo;
            if (obj instanceof Integer) {
                aqVar = aq.bravo;
            } else if (obj instanceof int[]) {
                aqVar = aq.delta;
            } else if (obj instanceof Long) {
                aqVar = aq.foxtrot;
            } else if (obj instanceof long[]) {
                aqVar = aq.golf;
            } else if (obj instanceof Float) {
                aqVar = aq.india;
            } else if (obj instanceof float[]) {
                aqVar = aq.juliet;
            } else if (obj instanceof Boolean) {
                aqVar = aq.lima;
            } else if (obj instanceof boolean[]) {
                aqVar = aq.mike;
            } else if (!(obj instanceof String) && obj != null) {
                aqVar = null;
            } else {
                aqVar = aq.oscar;
            }
            if (aqVar == null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    aqVar2 = aq.papa;
                } else {
                    Intrinsics.checkNotNull(obj);
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            Intrinsics.charlie(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            aqVar = new am(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            Intrinsics.charlie(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            aqVar = new ao(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        aqVar = new an(obj.getClass());
                    } else if (obj instanceof Enum) {
                        aqVar = new al(obj.getClass());
                    } else if (obj instanceof Serializable) {
                        aqVar = new ap(obj.getClass());
                    } else {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                }
            }
            aqVar2 = aqVar;
        }
        return new k(aqVar2, this.alpha, this.echo, this.bravo, this.charlie);
    }

    public void bravo(boolean z2) {
        SharedPreferences.Editor edit = ((ax) this.echo).b0().edit();
        edit.putBoolean((String) this.delta, z2);
        edit.apply();
        this.charlie = z2;
    }

    public boolean charlie() {
        if (!this.bravo) {
            this.bravo = true;
            this.charlie = ((ax) this.echo).b0().getBoolean((String) this.delta, this.alpha);
        }
        return this.charlie;
    }
}
