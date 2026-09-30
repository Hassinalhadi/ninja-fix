package com.google.common.collect;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
class Ordering$IncomparableValueException extends ClassCastException {
    private static final long serialVersionUID = 0;
    final Object value;

    public Ordering$IncomparableValueException(Object obj) {
        super(P0.bronze(obj, "Cannot compare value: "));
        this.value = obj;
    }
}
