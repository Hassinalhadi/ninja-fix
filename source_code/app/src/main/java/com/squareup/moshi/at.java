package com.squareup.moshi;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public abstract class at {
    public static final aq alpha = new Object();
    public static final ao bravo = new ao(1);
    public static final ao charlie = new ao(2);
    public static final ao delta = new ao(3);
    public static final ao echo = new ao(4);
    public static final ao foxtrot = new ao(5);
    public static final ao golf = new ao(6);
    public static final ao hotel = new ao(7);
    public static final ao india = new ao(8);
    public static final ao juliet = new ao(0);

    public static int alpha(JsonReader jsonReader, String str, int i4, int i5) {
        int nextInt = jsonReader.nextInt();
        if (nextInt >= i4 && nextInt <= i5) {
            return nextInt;
        }
        String path = jsonReader.getPath();
        StringBuilder green = P0.green("Expected ", str, " but was ", " at path ", nextInt);
        green.append(path);
        throw new JsonDataException(green.toString());
    }
}
