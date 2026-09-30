package com.incognia;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.y;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH\u0086\u0002J\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\rH\u0086\u0002J\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000eH\u0086\u0002J\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/incognia/EventProperties;", "", "()V", "properties", "", "", "remove", "", Constants.KEY_KEY, "set", "value", "", "", "", "", "toMap", "", "toString", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventProperties {
    private final Map<String, Object> properties = new LinkedHashMap();

    public final void remove(String key) {
        this.properties.remove(key);
    }

    public final void set(String key, int value) {
        this.properties.put(key, Integer.valueOf(value));
    }

    public final Map<String, Object> toMap() {
        return y.zulu(this.properties);
    }

    public String toString() {
        return this.properties.toString();
    }

    public final void set(String key, long value) {
        this.properties.put(key, Long.valueOf(value));
    }

    public final void set(String key, double value) {
        this.properties.put(key, Double.valueOf(value));
    }

    public final void set(String key, boolean value) {
        this.properties.put(key, Boolean.valueOf(value));
    }

    public final void set(String key, String value) {
        this.properties.put(key, value);
    }
}
