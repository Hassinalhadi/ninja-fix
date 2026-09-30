package com.app.network.network.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/app/network/network/models/MissingAttributes;", "", "<init>", "()V", "groups", "", "Lcom/app/network/network/models/AttributeGroup;", "getGroups", "()Ljava/util/List;", "setGroups", "(Ljava/util/List;)V", "forceGroups", "recommendedGroups", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MissingAttributes {

    @Nullable
    private List<AttributeGroup> groups;

    @NotNull
    public final List<AttributeGroup> forceGroups() {
        List<AttributeGroup> list = this.groups;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((AttributeGroup) obj).getActionType(), AttributeActionType.FORCE)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    @Nullable
    public final List<AttributeGroup> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<AttributeGroup> recommendedGroups() {
        List<AttributeGroup> list = this.groups;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((AttributeGroup) obj).getActionType(), AttributeActionType.RECOMMENDED)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public final void setGroups(@Nullable List<AttributeGroup> list) {
        this.groups = list;
    }
}
