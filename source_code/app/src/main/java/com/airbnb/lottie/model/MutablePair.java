package com.airbnb.lottie.model;

import androidx.appcompat.widget.P0;
import r1.C2483b;

/* loaded from: classes3.dex */
public class MutablePair<T> {
    T first;
    T second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2483b)) {
            return false;
        }
        C2483b c2483b = (C2483b) obj;
        if (!objectsEqual(c2483b.alpha, this.first) || !objectsEqual(c2483b.bravo, this.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t5 = this.first;
        int i4 = 0;
        if (t5 == null) {
            hashCode = 0;
        } else {
            hashCode = t5.hashCode();
        }
        T t10 = this.second;
        if (t10 != null) {
            i4 = t10.hashCode();
        }
        return hashCode ^ i4;
    }

    public void set(T t5, T t10) {
        this.first = t5;
        this.second = t10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.first);
        sb2.append(" ");
        return P0.emerald(sb2, this.second, "}");
    }
}
