package com.checkout.components.ui.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/ui/model/Shape;", "", "<init>", "(Ljava/lang/String;I)V", "Rectangle", "Circle", "RoundCorner", "CutCorner", "None", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Shape {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Shape[] $VALUES;
    public static final Shape Rectangle = new Shape("Rectangle", 0);
    public static final Shape Circle = new Shape("Circle", 1);
    public static final Shape RoundCorner = new Shape("RoundCorner", 2);
    public static final Shape CutCorner = new Shape("CutCorner", 3);
    public static final Shape None = new Shape("None", 4);

    private static final /* synthetic */ Shape[] $values() {
        return new Shape[]{Rectangle, Circle, RoundCorner, CutCorner, None};
    }

    static {
        Shape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private Shape(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static Shape valueOf(String str) {
        return (Shape) Enum.valueOf(Shape.class, str);
    }

    public static Shape[] values() {
        return (Shape[]) $VALUES.clone();
    }
}
