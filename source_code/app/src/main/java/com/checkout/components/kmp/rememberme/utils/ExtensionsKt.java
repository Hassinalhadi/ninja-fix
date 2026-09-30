package com.checkout.components.kmp.rememberme.utils;

import D0.af;
import D0.d;
import D0.g;
import H0.k;
import H0.r;
import H0.s;
import H0.v;
import K0.b;
import O0.a;
import O0.l;
import O0.p;
import Q0.q;
import Wf.ad;
import a0.ao;
import a0.ar;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeEnvironment;
import com.checkout.components.kmp.rememberme.shared.model.customization.BorderRadius;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontStyle;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontWeight;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u0016*\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010!\u001a\u0013\u0010#\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b#\u0010!\u001a\u0013\u0010$\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010!\u001a\u0013\u0010%\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b%\u0010!\u001a\u0013\u0010&\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b&\u0010!\u001a\u0013\u0010'\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b'\u0010!\u001a\u0013\u0010(\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b(\u0010!\u001a\u0013\u0010)\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b)\u0010!\u001a\u0013\u0010*\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b*\u0010!\u001a\u0013\u0010+\u001a\u00020\u001c*\u00020\u001fH\u0000¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010-\u001a\u00020\u001c*\u00020\u001fH\u0000¢\u0006\u0004\b-\u0010,\u001a\u001b\u00101\u001a\u00020\u0001*\u00020.2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b1\u00102\u001a#\u00108\u001a\u000205*\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\tH\u0000¢\u0006\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "", "toCagBaseUrl", "(Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;)Ljava/lang/String;", "toConsumerApiBaseUrl", "", "isEmail", "(Ljava/lang/String;)Z", "", "La0/t;", "toComposeColor", "(J)J", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontStyle;", "LH0/r;", "toComposeFontStyle", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontStyle;)I", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontWeight;", "LH0/v;", "toComposeFontWeight", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontWeight;)LH0/v;", "", "fontSize", "LQ0/p;", "toComposeLineHeight", "(Ljava/lang/Integer;I)J", "toLetterSpacing", "(Ljava/lang/Integer;)J", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;", "Lm/f;", "toShape", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;)Lm/f;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "disabledColor", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;)J", "errorColor", "inverseColor", "actionColor", "primaryColor", "secondaryColor", "formBorderColor", "borderColor", "formBackgroundColor", "backgroundColor", "formShape", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;)Lm/f;", "buttonShape", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "LWf/ad;", "resId", "buildTextForEmbolden", "(Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;LWf/ad;Landroidx/compose/runtime/m;I)Ljava/lang/String;", "boldText", "boldTextColor", "LD0/g;", "emboldenPartialText-mxwnekA", "(Ljava/lang/String;Ljava/lang/String;J)LD0/g;", "emboldenPartialText", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionsKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[RememberMeEnvironment.values().length];
            try {
                iArr[RememberMeEnvironment.SANDBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RememberMeEnvironment.PROD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FontStyle.values().length];
            try {
                iArr2[FontStyle.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FontStyle.Italic.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FontWeight.values().length];
            try {
                iArr3[FontWeight.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[FontWeight.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FontWeight.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FontWeight.SemiBold.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FontWeight.Bold.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[FontWeight.ExtraBold.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final long actionColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getAction());
    }

    public static final long backgroundColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getBackground());
    }

    public static final long borderColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getBorder());
    }

    @NotNull
    public static final String buildTextForEmbolden(@NotNull ResourceProvider resourceProvider, @NotNull ad resId, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(resourceProvider, "<this>");
        Intrinsics.echo(resId, "resId");
        return resourceProvider.getString(resId, Constants.EMBOLDEN_PLACEHOLDER, interfaceC0581m, ((i4 << 6) & 896) | ((i4 >> 3) & 14) | 48);
    }

    @NotNull
    public static final C2093f buttonShape(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toShape(designTokens.getBorderButtonRadius());
    }

    public static final long disabledColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getDisabled());
    }

    @NotNull
    /* renamed from: emboldenPartialText-mxwnekA, reason: not valid java name */
    public static final g m118emboldenPartialTextmxwnekA(@NotNull String emboldenPartialText, @NotNull String boldText, long j5) {
        Intrinsics.echo(emboldenPartialText, "$this$emboldenPartialText");
        Intrinsics.echo(boldText, "boldText");
        d dVar = new d();
        List maroon = StringsKt.maroon(emboldenPartialText, new String[]{Constants.EMBOLDEN_PLACEHOLDER}, 6);
        dVar.bravo((String) maroon.get(0));
        if (StringsKt.beige(emboldenPartialText, Constants.EMBOLDEN_PLACEHOLDER, false)) {
            int echo = dVar.echo(new af(j5, 0L, v.f1409c, (r) null, (s) null, (k) null, (String) null, 0L, (a) null, (p) null, (b) null, 0L, (l) null, (ar) null, 65530));
            try {
                dVar.bravo(boldText);
            } finally {
                dVar.delta(echo);
            }
        }
        if (maroon.size() > 1) {
            dVar.bravo((String) maroon.get(1));
        }
        return dVar.foxtrot();
    }

    public static final long errorColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getError());
    }

    public static final long formBackgroundColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getFormBackground());
    }

    public static final long formBorderColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getFormBorder());
    }

    @NotNull
    public static final C2093f formShape(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toShape(designTokens.getBorderFormRadius());
    }

    public static final long inverseColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getInverse());
    }

    public static final boolean isEmail(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        return new Regex(Constants.EMAIL_REGEX).echo(str);
    }

    public static final long primaryColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getPrimary());
    }

    public static final long secondaryColor(@NotNull DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        return toComposeColor(designTokens.getColorTokens().getSecondary());
    }

    @NotNull
    public static final String toCagBaseUrl(@NotNull RememberMeEnvironment rememberMeEnvironment) {
        Intrinsics.echo(rememberMeEnvironment, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[rememberMeEnvironment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return Configurations.CAG_BASE_URL_PROD;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Configurations.CAG_BASE_URL_SBOX;
    }

    private static final long toComposeColor(long j5) {
        return ao.delta(j5);
    }

    public static final int toComposeFontStyle(@NotNull FontStyle fontStyle) {
        Intrinsics.echo(fontStyle, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$1[fontStyle.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    @NotNull
    public static final v toComposeFontWeight(@NotNull FontWeight fontWeight) {
        Intrinsics.echo(fontWeight, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[fontWeight.ordinal()]) {
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

    public static final long toComposeLineHeight(@Nullable Integer num, int i4) {
        if (num == null) {
            q[] qVarArr = Q0.p.bravo;
            return Q0.p.charlie;
        }
        if (num.intValue() < i4) {
            return AbstractC2636d7.delta(i4, 4294967296L);
        }
        return AbstractC2636d7.delta(num.intValue(), 4294967296L);
    }

    @NotNull
    public static final String toConsumerApiBaseUrl(@NotNull RememberMeEnvironment rememberMeEnvironment) {
        Intrinsics.echo(rememberMeEnvironment, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[rememberMeEnvironment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return Configurations.CONSUMER_API_BASE_URL_PROD;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Configurations.CONSUMER_API_BASE_URL_SBOX;
    }

    public static final long toLetterSpacing(@Nullable Integer num) {
        if (num == null) {
            q[] qVarArr = Q0.p.bravo;
            return Q0.p.charlie;
        }
        return AbstractC2636d7.delta(num.intValue(), 4294967296L);
    }

    private static final C2093f toShape(BorderRadius borderRadius) {
        return AbstractC2094g.charlie(borderRadius.getTopStart(), borderRadius.getTopEnd(), borderRadius.getBottomEnd(), borderRadius.getBottomStart());
    }
}
