package com.app.network.network.models.captian;

import av.q;
import com.app.network.network.models.Language;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/app/network/network/models/captian/Assets;", "Lcom/app/network/network/models/Language;", "externalId", "", "returnLocationName", "returnLocationLatitude", "", "returnLocationLongitude", "cost", "imageUrl", "instructions", "", "Lcom/app/network/network/models/captian/Instruction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Ljava/util/List;)V", "getExternalId", "()Ljava/lang/String;", "getReturnLocationName", "getReturnLocationLatitude", "()D", "getReturnLocationLongitude", "getCost", "getImageUrl", "getInstructions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Assets extends Language {
    private final double cost;

    @NotNull
    private final String externalId;

    @Nullable
    private final String imageUrl;

    @NotNull
    private final List<Instruction> instructions;
    private final double returnLocationLatitude;
    private final double returnLocationLongitude;

    @NotNull
    private final String returnLocationName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Assets(@NotNull String externalId, @NotNull String returnLocationName, double d4, double d9, double d10, @Nullable String str, @NotNull List<Instruction> instructions) {
        super(null, 1, null);
        Intrinsics.echo(externalId, "externalId");
        Intrinsics.echo(returnLocationName, "returnLocationName");
        Intrinsics.echo(instructions, "instructions");
        this.externalId = externalId;
        this.returnLocationName = returnLocationName;
        this.returnLocationLatitude = d4;
        this.returnLocationLongitude = d9;
        this.cost = d10;
        this.imageUrl = str;
        this.instructions = instructions;
    }

    public static /* synthetic */ Assets copy$default(Assets assets, String str, String str2, double d4, double d9, double d10, String str3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = assets.externalId;
        }
        if ((i4 & 2) != 0) {
            str2 = assets.returnLocationName;
        }
        if ((i4 & 4) != 0) {
            d4 = assets.returnLocationLatitude;
        }
        if ((i4 & 8) != 0) {
            d9 = assets.returnLocationLongitude;
        }
        if ((i4 & 16) != 0) {
            d10 = assets.cost;
        }
        if ((i4 & 32) != 0) {
            str3 = assets.imageUrl;
        }
        if ((i4 & 64) != 0) {
            list = assets.instructions;
        }
        double d11 = d10;
        double d12 = d9;
        double d13 = d4;
        return assets.copy(str, str2, d13, d12, d11, str3, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getReturnLocationName() {
        return this.returnLocationName;
    }

    /* renamed from: component3, reason: from getter */
    public final double getReturnLocationLatitude() {
        return this.returnLocationLatitude;
    }

    /* renamed from: component4, reason: from getter */
    public final double getReturnLocationLongitude() {
        return this.returnLocationLongitude;
    }

    /* renamed from: component5, reason: from getter */
    public final double getCost() {
        return this.cost;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final List<Instruction> component7() {
        return this.instructions;
    }

    @NotNull
    public final Assets copy(@NotNull String externalId, @NotNull String returnLocationName, double returnLocationLatitude, double returnLocationLongitude, double cost, @Nullable String imageUrl, @NotNull List<Instruction> instructions) {
        Intrinsics.echo(externalId, "externalId");
        Intrinsics.echo(returnLocationName, "returnLocationName");
        Intrinsics.echo(instructions, "instructions");
        return new Assets(externalId, returnLocationName, returnLocationLatitude, returnLocationLongitude, cost, imageUrl, instructions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Assets)) {
            return false;
        }
        Assets assets = (Assets) other;
        return Intrinsics.areEqual(this.externalId, assets.externalId) && Intrinsics.areEqual(this.returnLocationName, assets.returnLocationName) && Double.compare(this.returnLocationLatitude, assets.returnLocationLatitude) == 0 && Double.compare(this.returnLocationLongitude, assets.returnLocationLongitude) == 0 && Double.compare(this.cost, assets.cost) == 0 && Intrinsics.areEqual(this.imageUrl, assets.imageUrl) && Intrinsics.areEqual(this.instructions, assets.instructions);
    }

    public final double getCost() {
        return this.cost;
    }

    @NotNull
    public final String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final List<Instruction> getInstructions() {
        return this.instructions;
    }

    public final double getReturnLocationLatitude() {
        return this.returnLocationLatitude;
    }

    public final double getReturnLocationLongitude() {
        return this.returnLocationLongitude;
    }

    @NotNull
    public final String getReturnLocationName() {
        return this.returnLocationName;
    }

    public int hashCode() {
        int hashCode;
        int sierra = AbstractC2327c.sierra(this.externalId.hashCode() * 31, 31, this.returnLocationName);
        long doubleToLongBits = Double.doubleToLongBits(this.returnLocationLatitude);
        int i4 = (sierra + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.returnLocationLongitude);
        int i5 = (i4 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        long doubleToLongBits3 = Double.doubleToLongBits(this.cost);
        int i10 = (i5 + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31;
        String str = this.imageUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.instructions.hashCode() + ((i10 + hashCode) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.externalId;
        String str2 = this.returnLocationName;
        double d4 = this.returnLocationLatitude;
        double d9 = this.returnLocationLongitude;
        double d10 = this.cost;
        String str3 = this.imageUrl;
        List<Instruction> list = this.instructions;
        StringBuilder india = q.india("Assets(externalId=", str, ", returnLocationName=", str2, ", returnLocationLatitude=");
        india.append(d4);
        india.append(", returnLocationLongitude=");
        india.append(d9);
        india.append(", cost=");
        india.append(d10);
        india.append(", imageUrl=");
        india.append(str3);
        india.append(", instructions=");
        india.append(list);
        india.append(")");
        return india.toString();
    }
}
