package com.airbnb.lottie.utils;

/* loaded from: classes3.dex */
public class MeanCalculator {

    /* renamed from: n, reason: collision with root package name */
    private int f3497n;
    private float sum;

    public void add(float f5) {
        float f10 = this.sum + f5;
        this.sum = f10;
        int i4 = this.f3497n + 1;
        this.f3497n = i4;
        if (i4 == Integer.MAX_VALUE) {
            this.sum = f10 / 2.0f;
            this.f3497n = i4 / 2;
        }
    }

    public float getMean() {
        int i4 = this.f3497n;
        if (i4 == 0) {
            return 0.0f;
        }
        return this.sum / i4;
    }
}
