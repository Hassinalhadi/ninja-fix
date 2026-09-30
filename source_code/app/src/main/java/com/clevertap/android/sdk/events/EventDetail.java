package com.clevertap.android.sdk.events;

/* loaded from: classes3.dex */
public class EventDetail {
    private final int count;
    private final int firstTime;
    private final int lastTime;
    private final String name;

    public EventDetail(int i4, int i5, int i10, String str) {
        this.count = i4;
        this.firstTime = i5;
        this.lastTime = i10;
        this.name = str;
    }

    public int getCount() {
        return this.count;
    }

    public int getFirstTime() {
        return this.firstTime;
    }

    public int getLastTime() {
        return this.lastTime;
    }

    public String getName() {
        return this.name;
    }
}
