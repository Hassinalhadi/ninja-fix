package com.app.network.network.models.breaks;

import Q0.c;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/app/network/network/models/breaks/BreakOption;", "", "name", "", "minutes", "", "isSelected", "", "<init>", "(Ljava/lang/String;IZ)V", "getName", "()Ljava/lang/String;", "getMinutes", "()I", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BreakOption {
    private boolean isSelected;
    private final int minutes;

    @NotNull
    private final String name;

    public BreakOption(@NotNull String name, int i4, boolean z2) {
        Intrinsics.echo(name, "name");
        this.name = name;
        this.minutes = i4;
        this.isSelected = z2;
    }

    public static /* synthetic */ BreakOption copy$default(BreakOption breakOption, String str, int i4, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = breakOption.name;
        }
        if ((i5 & 2) != 0) {
            i4 = breakOption.minutes;
        }
        if ((i5 & 4) != 0) {
            z2 = breakOption.isSelected;
        }
        return breakOption.copy(str, i4, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final BreakOption copy(@NotNull String name, int minutes, boolean isSelected) {
        Intrinsics.echo(name, "name");
        return new BreakOption(name, minutes, isSelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakOption)) {
            return false;
        }
        BreakOption breakOption = (BreakOption) other;
        return Intrinsics.areEqual(this.name, breakOption.name) && this.minutes == breakOption.minutes && this.isSelected == breakOption.isSelected;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.minutes) * 31) + (this.isSelected ? 1231 : 1237);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z2) {
        this.isSelected = z2;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        int i4 = this.minutes;
        return c.romeo(P0.green("BreakOption(name=", str, ", minutes=", ", isSelected=", i4), this.isSelected, ")");
    }

    public /* synthetic */ BreakOption(String str, int i4, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i4, (i5 & 4) != 0 ? false : z2);
    }
}
