package com.google.gson;

/* loaded from: classes2.dex */
public final class s extends q {
    public final com.google.gson.internal.m alpha = new com.google.gson.internal.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof s) || !((s) obj).alpha.equals(this.alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final q hotel(String str) {
        return (q) this.alpha.get(str);
    }
}
