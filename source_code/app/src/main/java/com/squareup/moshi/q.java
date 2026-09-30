package com.squareup.moshi;

/* loaded from: classes2.dex */
public abstract class q extends JsonAdapter {
    public static final o bravo = new Object();
    public final JsonAdapter alpha;

    public q(JsonAdapter jsonAdapter) {
        this.alpha = jsonAdapter;
    }

    public final String toString() {
        return this.alpha + ".collection()";
    }
}
