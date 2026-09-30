package com.airbnb.lottie.model;

import androidx.appcompat.widget.P0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class KeyPath {
    public static final KeyPath COMPOSITION = new KeyPath("COMPOSITION");
    private final List<String> keys;
    private KeyPathElement resolvedElement;

    public KeyPath(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }

    private boolean endsWithGlobstar() {
        return this.keys.get(r0.size() - 1).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            KeyPath keyPath = (KeyPath) obj;
            if (!this.keys.equals(keyPath.keys)) {
                return false;
            }
            KeyPathElement keyPathElement = this.resolvedElement;
            KeyPathElement keyPathElement2 = keyPath.resolvedElement;
            if (keyPathElement != null) {
                return keyPathElement.equals(keyPathElement2);
            }
            if (keyPathElement2 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean fullyResolvesTo(String str, int i4) {
        boolean z2;
        boolean z10;
        if (i4 >= this.keys.size()) {
            return false;
        }
        if (i4 == this.keys.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = this.keys.get(i4);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((!z2 && (i4 != this.keys.size() - 2 || !endsWithGlobstar())) || !z10) {
                return false;
            }
            return true;
        }
        if (!z2 && this.keys.get(i4 + 1).equals(str)) {
            if (i4 != this.keys.size() - 2 && (i4 != this.keys.size() - 3 || !endsWithGlobstar())) {
                return false;
            }
            return true;
        }
        if (z2) {
            return true;
        }
        int i5 = i4 + 1;
        if (i5 < this.keys.size() - 1) {
            return false;
        }
        return this.keys.get(i5).equals(str);
    }

    public KeyPathElement getResolvedElement() {
        return this.resolvedElement;
    }

    public int hashCode() {
        int i4;
        int hashCode = this.keys.hashCode() * 31;
        KeyPathElement keyPathElement = this.resolvedElement;
        if (keyPathElement != null) {
            i4 = keyPathElement.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public int incrementDepthBy(String str, int i4) {
        if (isContainer(str)) {
            return 0;
        }
        if (!this.keys.get(i4).equals("**")) {
            return 1;
        }
        if (i4 == this.keys.size() - 1 || !this.keys.get(i4 + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public String keysToString() {
        return this.keys.toString();
    }

    public boolean matches(String str, int i4) {
        if (isContainer(str)) {
            return true;
        }
        if (i4 >= this.keys.size()) {
            return false;
        }
        if (this.keys.get(i4).equals(str) || this.keys.get(i4).equals("**") || this.keys.get(i4).equals("*")) {
            return true;
        }
        return false;
    }

    public boolean propagateToChildren(String str, int i4) {
        if ("__container".equals(str) || i4 < this.keys.size() - 1 || this.keys.get(i4).equals("**")) {
            return true;
        }
        return false;
    }

    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.resolvedElement = keyPathElement;
        return keyPath;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.keys);
        sb2.append(",resolved=");
        if (this.resolvedElement != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return P0.gray(sb2, z2, '}');
    }

    private KeyPath(KeyPath keyPath) {
        this.keys = new ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }
}
