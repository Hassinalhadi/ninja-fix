package com.checkout.components.ui.utils.extensions;

import H0.v;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "LH0/v;", "toComposeFontWeight", "(Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;)LH0/v;", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontWeightExtensionsKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontWeight.values().length];
            try {
                iArr[FontWeight.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontWeight.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FontWeight.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FontWeight.SemiBold.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FontWeight.Bold.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FontWeight.ExtraBold.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final v toComposeFontWeight(@NotNull FontWeight fontWeight) {
        Intrinsics.echo(fontWeight, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()]) {
            case 1:
                v vVar = v.purple;
                return v.white;
            case 2:
                v vVar2 = v.purple;
                return v.yellow;
            case 3:
                v vVar3 = v.purple;
                return v.f1407a;
            case 4:
                v vVar4 = v.purple;
                return v.f1408b;
            case 5:
                v vVar5 = v.purple;
                return v.f1409c;
            case 6:
                v vVar6 = v.purple;
                return v.f1410d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
