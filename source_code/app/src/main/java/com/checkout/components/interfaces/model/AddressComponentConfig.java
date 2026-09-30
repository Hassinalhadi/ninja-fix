package com.checkout.components.interfaces.model;

import Q0.c;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u000e\u0010\u001a¨\u00064"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "Lcom/checkout/components/interfaces/model/ComponentConfig;", "Lcom/checkout/components/interfaces/model/ComponentName$Address;", "name", "Ljava/util/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "", "isStandalone", "<init>", "(Lcom/checkout/components/interfaces/model/ComponentName$Address;Ljava/util/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Z)V", "component1", "()Lcom/checkout/components/interfaces/model/ComponentName$Address;", "component2", "()Ljava/util/Locale;", "component3", "()Ljava/util/Map;", "component4", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "component5", "()Z", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/ComponentName$Address;Ljava/util/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Z)Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/ComponentName$Address;", "getName", "b", "Ljava/util/Locale;", "getLocale", "c", "Ljava/util/Map;", "getTranslation", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", "e", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddressComponentConfig implements ComponentConfig {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ComponentName.Address name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map translation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DesignTokens appearance;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isStandalone;

    public AddressComponentConfig(@NotNull ComponentName.Address name, @NotNull Locale locale, @Nullable Map<ComponentTranslationKey, String> map, @Nullable DesignTokens designTokens, boolean z2) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(locale, "locale");
        this.name = name;
        this.locale = locale;
        this.translation = map;
        this.appearance = designTokens;
        this.isStandalone = z2;
    }

    public static /* synthetic */ AddressComponentConfig copy$default(AddressComponentConfig addressComponentConfig, ComponentName.Address address, Locale locale, Map map, DesignTokens designTokens, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            address = addressComponentConfig.name;
        }
        if ((i4 & 2) != 0) {
            locale = addressComponentConfig.locale;
        }
        if ((i4 & 4) != 0) {
            map = addressComponentConfig.translation;
        }
        if ((i4 & 8) != 0) {
            designTokens = addressComponentConfig.appearance;
        }
        if ((i4 & 16) != 0) {
            z2 = addressComponentConfig.isStandalone;
        }
        boolean z10 = z2;
        Map map2 = map;
        return addressComponentConfig.copy(address, locale, map2, designTokens, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ComponentName.Address getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @Nullable
    public final Map<ComponentTranslationKey, String> component3() {
        return this.translation;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final DesignTokens getAppearance() {
        return this.appearance;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsStandalone() {
        return this.isStandalone;
    }

    @NotNull
    public final AddressComponentConfig copy(@NotNull ComponentName.Address name, @NotNull Locale locale, @Nullable Map<ComponentTranslationKey, String> translation, @Nullable DesignTokens appearance, boolean isStandalone) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(locale, "locale");
        return new AddressComponentConfig(name, locale, translation, appearance, isStandalone);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressComponentConfig)) {
            return false;
        }
        AddressComponentConfig addressComponentConfig = (AddressComponentConfig) other;
        return Intrinsics.areEqual(this.name, addressComponentConfig.name) && Intrinsics.areEqual(this.locale, addressComponentConfig.locale) && Intrinsics.areEqual(this.translation, addressComponentConfig.translation) && Intrinsics.areEqual(this.appearance, addressComponentConfig.appearance) && this.isStandalone == addressComponentConfig.isStandalone;
    }

    @Nullable
    public final DesignTokens getAppearance() {
        return this.appearance;
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final ComponentName.Address getName() {
        return this.name;
    }

    @Nullable
    public final Map<ComponentTranslationKey, String> getTranslation() {
        return this.translation;
    }

    public final int hashCode() {
        int hashCode = (this.locale.hashCode() + (this.name.hashCode() * 31)) * 31;
        Map map = this.translation;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        DesignTokens designTokens = this.appearance;
        return (this.isStandalone ? 1231 : 1237) + ((hashCode2 + (designTokens != null ? designTokens.hashCode() : 0)) * 31);
    }

    public final boolean isStandalone() {
        return this.isStandalone;
    }

    @NotNull
    public final String toString() {
        ComponentName.Address address = this.name;
        Locale locale = this.locale;
        Map map = this.translation;
        DesignTokens designTokens = this.appearance;
        boolean z2 = this.isStandalone;
        StringBuilder sb2 = new StringBuilder("AddressComponentConfig(name=");
        sb2.append(address);
        sb2.append(", locale=");
        sb2.append(locale);
        sb2.append(", translation=");
        sb2.append(map);
        sb2.append(", appearance=");
        sb2.append(designTokens);
        sb2.append(", isStandalone=");
        return c.romeo(sb2, z2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AddressComponentConfig(ComponentName.Address address, Locale locale, Map map, DesignTokens designTokens, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(address, locale, map, r6, r7);
        boolean z10;
        DesignTokens designTokens2;
        map = (i4 & 4) != 0 ? null : map;
        if ((i4 & 8) != 0) {
            z10 = z2;
            designTokens2 = null;
        } else {
            z10 = z2;
            designTokens2 = designTokens;
        }
    }
}
