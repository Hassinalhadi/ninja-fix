package com.app.network.network.models.captian;

import androidx.appcompat.widget.P0;
import com.app.network.network.models.Language;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/app/network/network/models/captian/Instruction;", "Lcom/app/network/network/models/Language;", Constants.KEY_CONTENT, "", "assetId", "", "rank", "languageCode", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getAssetId", "()I", "getRank", "getLanguageCode", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Instruction extends Language {
    private final int assetId;

    @NotNull
    private final String content;

    @NotNull
    private final String languageCode;
    private final int rank;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Instruction(@NotNull String content, int i4, int i5, @NotNull String languageCode) {
        super(null, 1, null);
        Intrinsics.echo(content, "content");
        Intrinsics.echo(languageCode, "languageCode");
        this.content = content;
        this.assetId = i4;
        this.rank = i5;
        this.languageCode = languageCode;
    }

    public static /* synthetic */ Instruction copy$default(Instruction instruction, String str, int i4, int i5, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = instruction.content;
        }
        if ((i10 & 2) != 0) {
            i4 = instruction.assetId;
        }
        if ((i10 & 4) != 0) {
            i5 = instruction.rank;
        }
        if ((i10 & 8) != 0) {
            str2 = instruction.languageCode;
        }
        return instruction.copy(str, i4, i5, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAssetId() {
        return this.assetId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @NotNull
    public final Instruction copy(@NotNull String content, int assetId, int rank, @NotNull String languageCode) {
        Intrinsics.echo(content, "content");
        Intrinsics.echo(languageCode, "languageCode");
        return new Instruction(content, assetId, rank, languageCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instruction)) {
            return false;
        }
        Instruction instruction = (Instruction) other;
        return Intrinsics.areEqual(this.content, instruction.content) && this.assetId == instruction.assetId && this.rank == instruction.rank && Intrinsics.areEqual(this.languageCode, instruction.languageCode);
    }

    public final int getAssetId() {
        return this.assetId;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final int getRank() {
        return this.rank;
    }

    public int hashCode() {
        return this.languageCode.hashCode() + (((((this.content.hashCode() * 31) + this.assetId) * 31) + this.rank) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.content;
        int i4 = this.assetId;
        int i5 = this.rank;
        String str2 = this.languageCode;
        StringBuilder green = P0.green("Instruction(content=", str, ", assetId=", ", rank=", i4);
        green.append(i5);
        green.append(", languageCode=");
        green.append(str2);
        green.append(")");
        return green.toString();
    }
}
