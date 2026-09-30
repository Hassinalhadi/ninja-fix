package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.variables.JsonUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerValue;", "", "value", "listValue", "", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "getValue", "()Ljava/lang/Object;", "stringValue", "", "stringValueCleaned", "listValueWithCleanedStringIfPresent", "numberValue", "", "isList", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriggerValue {

    @Nullable
    private List<? extends Object> listValue;

    @Nullable
    private List<? extends Object> listValueWithCleanedStringIfPresent;

    @Nullable
    private Number numberValue;

    @Nullable
    private String stringValue;

    @Nullable
    private String stringValueCleaned;

    @Nullable
    private final Object value;

    /* JADX WARN: Multi-variable type inference failed */
    public TriggerValue() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public final boolean isList() {
        if (this.listValue != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public final List<?> listValue() {
        return this.listValue;
    }

    @Nullable
    public final List<?> listValueWithCleanedStringIfPresent() {
        return this.listValueWithCleanedStringIfPresent;
    }

    @Nullable
    /* renamed from: numberValue, reason: from getter */
    public final Number getNumberValue() {
        return this.numberValue;
    }

    @Nullable
    /* renamed from: stringValue, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    @Nullable
    /* renamed from: stringValueCleaned, reason: from getter */
    public final String getStringValueCleaned() {
        return this.stringValueCleaned;
    }

    public TriggerValue(@Nullable Object obj, @Nullable List<? extends Object> list) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        this.value = obj;
        this.listValue = list;
        if (obj instanceof String) {
            String str = (String) obj;
            this.stringValue = str;
            String lowerCase = StringsKt.b(str).toString().toLowerCase(Locale.ROOT);
            Intrinsics.delta(lowerCase, "toLowerCase(...)");
            this.stringValueCleaned = lowerCase;
            return;
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            this.stringValue = String.valueOf(bool.booleanValue());
            String lowerCase2 = StringsKt.b(String.valueOf(bool.booleanValue())).toString().toLowerCase(Locale.ROOT);
            Intrinsics.delta(lowerCase2, "toLowerCase(...)");
            this.stringValueCleaned = lowerCase2;
            return;
        }
        if (obj instanceof Number) {
            this.numberValue = (Number) obj;
            return;
        }
        if (obj instanceof List) {
            this.listValue = (List) obj;
            Iterable iterable = (Iterable) obj;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (Object obj2 : iterable) {
                if (obj2 instanceof String) {
                    obj2 = StringsKt.b((String) obj2).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.delta(obj2, "toLowerCase(...)");
                }
                arrayList2.add(obj2);
            }
            this.listValueWithCleanedStringIfPresent = arrayList2;
            return;
        }
        if (obj instanceof JSONArray) {
            List<? extends Object> listFromJson = JsonUtil.listFromJson((JSONArray) obj);
            this.listValue = listFromJson;
            if (listFromJson != null) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listFromJson, 10);
                arrayList = new ArrayList(collectionSizeOrDefault);
                for (Object obj3 : listFromJson) {
                    if (obj3 instanceof String) {
                        obj3 = StringsKt.b((String) obj3).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.delta(obj3, "toLowerCase(...)");
                    }
                    arrayList.add(obj3);
                }
            } else {
                arrayList = null;
            }
            this.listValueWithCleanedStringIfPresent = arrayList;
        }
    }

    public /* synthetic */ TriggerValue(Object obj, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : obj, (i4 & 2) != 0 ? null : list);
    }
}
