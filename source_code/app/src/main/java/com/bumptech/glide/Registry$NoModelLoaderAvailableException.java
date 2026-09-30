package com.bumptech.glide;

import J3.r;
import java.util.List;

/* loaded from: classes3.dex */
public class Registry$NoModelLoaderAvailableException extends Registry$MissingComponentException {
    public Registry$NoModelLoaderAvailableException(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public <M> Registry$NoModelLoaderAvailableException(M m4, List<r> list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m4);
    }

    public Registry$NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }
}
