package io.reactivex.schedulers;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Timed<T> {
    final long time;
    final TimeUnit unit;
    final T value;

    public Timed(@NonNull T t5, long j5, @NonNull TimeUnit timeUnit) {
        this.value = t5;
        this.time = j5;
        this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            if (ObjectHelper.equals(this.value, timed.value) && this.time == timed.time && ObjectHelper.equals(this.unit, timed.unit)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i4;
        T t5 = this.value;
        if (t5 != null) {
            i4 = t5.hashCode();
        } else {
            i4 = 0;
        }
        long j5 = this.time;
        return this.unit.hashCode() + (((i4 * 31) + ((int) (j5 ^ (j5 >>> 31)))) * 31);
    }

    public long time() {
        return this.time;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Timed[time=");
        sb2.append(this.time);
        sb2.append(", unit=");
        sb2.append(this.unit);
        sb2.append(", value=");
        return P0.emerald(sb2, this.value, Constants.AES_SUFFIX);
    }

    @NonNull
    public TimeUnit unit() {
        return this.unit;
    }

    @NonNull
    public T value() {
        return this.value;
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, this.unit);
    }
}
