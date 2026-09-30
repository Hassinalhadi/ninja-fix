package com.clevertap.android.sdk.inapp.evaluation;

import android.location.Location;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import fe.C1714f;
import fe.C1715g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import pf.AbstractC2360j;
import pf.C2355e;
import pf.C2361k;
import s6.J4;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001d\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0002\b\u0015J%\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001cJ%\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020 H\u0001¢\u0006\u0002\b!J\u001d\u0010\"\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0002\b#J%\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0007H\u0001¢\u0006\u0002\b&J\u001d\u0010'\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0002\b*J\u001e\u0010+\u001a\u00020\u00072\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "", "localDataStore", "Lcom/clevertap/android/sdk/LocalDataStore;", "<init>", "(Lcom/clevertap/android/sdk/LocalDataStore;)V", "matchEvent", "", Constants.INAPP_WHEN_TRIGGERS, "", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerAdapter;", com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, "Lcom/clevertap/android/sdk/inapp/evaluation/EventAdapter;", "match", "trigger", "match$clevertap_core_release", "matchFirstTimeOnly", "matchPropertyConditions", "triggerAdapter", "matchChargedItemConditions", "matchGeoRadius", "matchGeoRadius$clevertap_core_release", "evaluate", "op", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "expected", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerValue;", "actual", "evaluate$clevertap_core_release", "evaluateDistance", Constants.KEY_RADIUS, "", "Landroid/location/Location;", "evaluateDistance$clevertap_core_release", "expectedValueEqualsActual", "expectedValueEqualsActual$clevertap_core_release", "expectedValueLessThanGreaterThanActual", "isLessThan", "expectedValueLessThanGreaterThanActual$clevertap_core_release", "actualContainsExpected", "actualContainsExpected$clevertap_core_release", "actualIsInRangeOfExpected", "actualIsInRangeOfExpected$clevertap_core_release", "checkGivenElementEqualsAnyElementInList", "list", "elementToCheckForEquality", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriggersMatcher {

    @NotNull
    private final LocalDataStore localDataStore;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TriggerOperator.values().length];
            try {
                iArr[TriggerOperator.Set.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerOperator.LessThan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriggerOperator.GreaterThan.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TriggerOperator.Equals.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TriggerOperator.NotEquals.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TriggerOperator.Between.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TriggerOperator.Contains.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TriggerOperator.NotContains.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TriggerOperator.NotSet.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TriggersMatcher(@NotNull LocalDataStore localDataStore) {
        Intrinsics.echo(localDataStore, "localDataStore");
        this.localDataStore = localDataStore;
    }

    private final boolean checkGivenElementEqualsAnyElementInList(List<?> list, Object elementToCheckForEquality) {
        if (elementToCheckForEquality instanceof String) {
            C2355e c2355e = new C2355e(AbstractC2360j.golf(CollectionsKt.beige(list), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof String);
                }
            }));
            while (true) {
                if (c2355e.hasNext()) {
                    String str = (String) c2355e.next();
                    String lowerCase = StringsKt.b((String) elementToCheckForEquality).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.delta(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(str, lowerCase)) {
                        break;
                    }
                } else {
                    C2355e c2355e2 = new C2355e(AbstractC2360j.golf(CollectionsKt.beige(list), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Object obj) {
                            return Boolean.valueOf(obj instanceof Number);
                        }
                    }));
                    while (c2355e2.hasNext()) {
                        double doubleValue = ((Number) c2355e2.next()).doubleValue();
                        String lowerCase2 = StringsKt.b((String) elementToCheckForEquality).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.delta(lowerCase2, "toLowerCase(...)");
                        Double romeo = r.romeo(lowerCase2);
                        if (romeo == null || doubleValue != romeo.doubleValue()) {
                        }
                    }
                    return false;
                }
            }
        } else {
            if (elementToCheckForEquality instanceof Number) {
                double doubleValue2 = ((Number) elementToCheckForEquality).doubleValue();
                C2355e c2355e3 = new C2355e(AbstractC2360j.golf(CollectionsKt.beige(list), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(obj instanceof Number);
                    }
                }));
                while (c2355e3.hasNext()) {
                    if (((Number) c2355e3.next()).doubleValue() == doubleValue2) {
                    }
                }
                C2355e c2355e4 = new C2355e(AbstractC2360j.golf(CollectionsKt.beige(list), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(obj instanceof String);
                    }
                }));
                while (c2355e4.hasNext()) {
                    String lowerCase3 = StringsKt.b((String) c2355e4.next()).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.delta(lowerCase3, "toLowerCase(...)");
                    Double romeo2 = r.romeo(lowerCase3);
                    if (romeo2 != null && romeo2.doubleValue() == doubleValue2) {
                        return true;
                    }
                }
                return false;
            }
            if (elementToCheckForEquality instanceof Boolean) {
                C2355e c2355e5 = new C2355e(AbstractC2360j.golf(CollectionsKt.beige(list), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(obj instanceof String);
                    }
                }));
                while (c2355e5.hasNext()) {
                    if (Intrinsics.areEqual((String) c2355e5.next(), String.valueOf(((Boolean) elementToCheckForEquality).booleanValue()))) {
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    private final boolean matchChargedItemConditions(TriggerAdapter trigger, EventAdapter event) {
        C1715g hotel = J4.hotel(0, trigger.getItemsCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = hotel.iterator();
        while (((C1714f) it).red) {
            TriggerCondition itemAtIndex = trigger.itemAtIndex(((x) it).alpha());
            if (itemAtIndex != null) {
                arrayList.add(itemAtIndex);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TriggerCondition triggerCondition = (TriggerCondition) it2.next();
                List<TriggerValue> itemValue = event.getItemValue(triggerCondition.getPropertyName());
                if (itemValue == null || !itemValue.isEmpty()) {
                    Iterator<T> it3 = itemValue.iterator();
                    while (it3.hasNext()) {
                        if (evaluate$clevertap_core_release(triggerCondition.getOp(), triggerCondition.getValue(), (TriggerValue) it3.next())) {
                            break;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean matchFirstTimeOnly(TriggerAdapter trigger) {
        if (!trigger.getFirstTimeOnly()) {
            return true;
        }
        String profileAttrName = trigger.getProfileAttrName();
        if (profileAttrName == null) {
            profileAttrName = trigger.getEventName();
        }
        return this.localDataStore.isUserEventLogFirstTime(profileAttrName);
    }

    private final boolean matchPropertyConditions(TriggerAdapter triggerAdapter, EventAdapter event) {
        C1715g hotel = J4.hotel(0, triggerAdapter.getPropertyCount());
        ArrayList<TriggerCondition> arrayList = new ArrayList();
        Iterator it = hotel.iterator();
        while (it.hasNext()) {
            TriggerCondition propertyAtIndex = triggerAdapter.propertyAtIndex(((x) it).alpha());
            if (propertyAtIndex != null) {
                arrayList.add(propertyAtIndex);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (TriggerCondition triggerCondition : arrayList) {
            if (!evaluate$clevertap_core_release(triggerCondition.getOp(), triggerCondition.getValue(), event.getPropertyValue(triggerCondition.getPropertyName()))) {
                return false;
            }
        }
        return true;
    }

    public final boolean actualContainsExpected$clevertap_core_release(@NotNull TriggerValue expected, @NotNull TriggerValue actual) {
        Intrinsics.echo(expected, "expected");
        Intrinsics.echo(actual, "actual");
        if (actual.getStringValue() != null && expected.getStringValue() != null) {
            String stringValueCleaned = actual.getStringValueCleaned();
            Intrinsics.checkNotNull(stringValueCleaned);
            String stringValueCleaned2 = expected.getStringValueCleaned();
            Intrinsics.checkNotNull(stringValueCleaned2);
            return StringsKt.beige(stringValueCleaned, stringValueCleaned2, false);
        }
        if (expected.isList() && actual.getStringValue() != null) {
            List<?> listValueWithCleanedStringIfPresent = expected.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent);
            C2355e c2355e = new C2355e(AbstractC2360j.golf(AbstractC2360j.hotel(CollectionsKt.beige(listValueWithCleanedStringIfPresent), new C2361k(1)), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$actualContainsExpected$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof String);
                }
            }));
            while (c2355e.hasNext()) {
                String str = (String) c2355e.next();
                String stringValueCleaned3 = actual.getStringValueCleaned();
                Intrinsics.checkNotNull(stringValueCleaned3);
                if (StringsKt.beige(stringValueCleaned3, str, false)) {
                    return true;
                }
            }
        } else if (expected.isList() && actual.isList()) {
            List<?> listValueWithCleanedStringIfPresent2 = actual.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listValueWithCleanedStringIfPresent2) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            Set D10 = CollectionsKt.D(arrayList);
            List<?> listValueWithCleanedStringIfPresent3 = expected.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent3);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listValueWithCleanedStringIfPresent3) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (D10.contains((String) it.next())) {
                        return true;
                    }
                }
            }
        } else if (actual.isList() && expected.getStringValue() != null) {
            List<?> listValueWithCleanedStringIfPresent4 = actual.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent4);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listValueWithCleanedStringIfPresent4) {
                if (obj3 instanceof String) {
                    arrayList3.add(obj3);
                }
            }
            return CollectionsKt.bronze(CollectionsKt.D(arrayList3), expected.getStringValueCleaned());
        }
        return false;
    }

    public final boolean actualIsInRangeOfExpected$clevertap_core_release(@NotNull TriggerValue expected, @NotNull TriggerValue actual) {
        List r4;
        int collectionSizeOrDefault;
        double doubleValue;
        Double d4;
        Intrinsics.echo(expected, "expected");
        Intrinsics.echo(actual, "actual");
        List<?> listValue = expected.listValue();
        if (listValue != null) {
            Double d9 = null;
            if (listValue.size() < 2) {
                listValue = null;
            }
            if (listValue != null && (r4 = CollectionsKt.r(listValue, 2)) != null) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Object obj : r4) {
                    if (obj instanceof String) {
                        d4 = r.romeo((String) obj);
                    } else if (obj instanceof Number) {
                        d4 = Double.valueOf(((Number) obj).doubleValue());
                    } else {
                        d4 = null;
                    }
                    arrayList.add(d4);
                }
                if (!arrayList.contains(null)) {
                    Number numberValue = actual.getNumberValue();
                    if (numberValue != null) {
                        doubleValue = numberValue.doubleValue();
                    } else {
                        String stringValue = actual.getStringValue();
                        if (stringValue != null) {
                            d9 = r.romeo(stringValue);
                        }
                        if (d9 != null) {
                            doubleValue = d9.doubleValue();
                        }
                    }
                    Object obj2 = arrayList.get(0);
                    Intrinsics.checkNotNull(obj2);
                    double doubleValue2 = ((Number) obj2).doubleValue();
                    Object obj3 = arrayList.get(1);
                    Intrinsics.checkNotNull(obj3);
                    if (doubleValue <= ((Number) obj3).doubleValue() && doubleValue2 <= doubleValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean evaluate$clevertap_core_release(@NotNull TriggerOperator op, @NotNull TriggerValue expected, @NotNull TriggerValue actual) {
        Intrinsics.echo(op, "op");
        Intrinsics.echo(expected, "expected");
        Intrinsics.echo(actual, "actual");
        if (actual.getValue() != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[op.ordinal()]) {
                case 1:
                    return true;
                case 2:
                    return expectedValueLessThanGreaterThanActual$clevertap_core_release(expected, actual, true);
                case 3:
                    return expectedValueLessThanGreaterThanActual$clevertap_core_release(expected, actual, false);
                case 4:
                    return expectedValueEqualsActual$clevertap_core_release(expected, actual);
                case 5:
                    if (expectedValueEqualsActual$clevertap_core_release(expected, actual)) {
                        return false;
                    }
                    return true;
                case 6:
                    return actualIsInRangeOfExpected$clevertap_core_release(expected, actual);
                case 7:
                    return actualContainsExpected$clevertap_core_release(expected, actual);
                case 8:
                    if (actualContainsExpected$clevertap_core_release(expected, actual)) {
                        return false;
                    }
                    return true;
                case 9:
                    return false;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (op != TriggerOperator.NotSet) {
            return false;
        }
        return true;
    }

    public final boolean evaluateDistance$clevertap_core_release(double radius, @NotNull Location expected, @NotNull Location actual) {
        Intrinsics.echo(expected, "expected");
        Intrinsics.echo(actual, "actual");
        if (Utils.haversineDistance(expected, actual) <= radius) {
            return true;
        }
        return false;
    }

    public final boolean expectedValueEqualsActual$clevertap_core_release(@NotNull TriggerValue expected, @NotNull TriggerValue actual) {
        Double romeo;
        Double d4;
        double doubleValue;
        Intrinsics.echo(expected, "expected");
        Intrinsics.echo(actual, "actual");
        if (expected.isList() && actual.isList()) {
            List<?> listValueWithCleanedStringIfPresent = expected.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent);
            HashSet x4 = CollectionsKt.x(listValueWithCleanedStringIfPresent);
            List<?> listValueWithCleanedStringIfPresent2 = actual.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent2);
            return Intrinsics.areEqual(x4, CollectionsKt.x(listValueWithCleanedStringIfPresent2));
        }
        if (actual.isList()) {
            List<?> listValueWithCleanedStringIfPresent3 = actual.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent3);
            return checkGivenElementEqualsAnyElementInList(listValueWithCleanedStringIfPresent3, expected.getValue());
        }
        if (expected.isList()) {
            List<?> listValueWithCleanedStringIfPresent4 = expected.listValueWithCleanedStringIfPresent();
            Intrinsics.checkNotNull(listValueWithCleanedStringIfPresent4);
            return checkGivenElementEqualsAnyElementInList(listValueWithCleanedStringIfPresent4, actual.getValue());
        }
        if (expected.getNumberValue() != null) {
            Number numberValue = actual.getNumberValue();
            if (numberValue != null) {
                doubleValue = numberValue.doubleValue();
            } else {
                String stringValueCleaned = actual.getStringValueCleaned();
                if (stringValueCleaned != null) {
                    d4 = r.romeo(stringValueCleaned);
                } else {
                    d4 = null;
                }
                if (d4 != null) {
                    doubleValue = d4.doubleValue();
                } else {
                    return false;
                }
            }
            Number numberValue2 = expected.getNumberValue();
            Intrinsics.checkNotNull(numberValue2);
            if (numberValue2.doubleValue() == doubleValue) {
                return true;
            }
            return false;
        }
        if (actual.getNumberValue() != null) {
            String stringValueCleaned2 = expected.getStringValueCleaned();
            if (stringValueCleaned2 != null && (romeo = r.romeo(stringValueCleaned2)) != null) {
                double doubleValue2 = romeo.doubleValue();
                Number numberValue3 = actual.getNumberValue();
                Intrinsics.checkNotNull(numberValue3);
                if (numberValue3.doubleValue() == doubleValue2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (actual.getStringValue() != null) {
            return Intrinsics.areEqual(expected.getStringValueCleaned(), actual.getStringValueCleaned());
        }
        return false;
    }

    public final boolean expectedValueLessThanGreaterThanActual$clevertap_core_release(@NotNull TriggerValue expected, @NotNull TriggerValue actual, boolean isLessThan) {
        Double d4;
        double doubleValue;
        double doubleValue2;
        Object green;
        Double d9;
        Intrinsics.echo(expected, "expected");
        Intrinsics.echo(actual, "actual");
        Number numberValue = actual.getNumberValue();
        Double d10 = null;
        if (numberValue != null) {
            doubleValue = numberValue.doubleValue();
        } else {
            String stringValue = actual.getStringValue();
            if (stringValue != null) {
                d4 = r.romeo(stringValue);
            } else {
                d4 = null;
            }
            if (d4 != null) {
                doubleValue = d4.doubleValue();
            }
            return false;
        }
        List<?> listValue = expected.listValue();
        if (listValue != null && (green = CollectionsKt.green(listValue)) != null) {
            if (green instanceof String) {
                d9 = r.romeo((String) green);
            } else if (green instanceof Number) {
                d9 = Double.valueOf(((Number) green).doubleValue());
            } else {
                d9 = null;
            }
            if (d9 != null) {
                double doubleValue3 = d9.doubleValue();
                if (isLessThan) {
                    if (doubleValue >= doubleValue3) {
                        return false;
                    }
                    return true;
                }
                if (doubleValue <= doubleValue3) {
                    return false;
                }
                return true;
            }
        }
        Number numberValue2 = expected.getNumberValue();
        if (numberValue2 != null) {
            doubleValue2 = numberValue2.doubleValue();
        } else {
            String stringValue2 = expected.getStringValue();
            if (stringValue2 != null) {
                d10 = r.romeo(stringValue2);
            }
            if (d10 != null) {
                doubleValue2 = d10.doubleValue();
            }
            return false;
        }
        if (isLessThan) {
            if (doubleValue >= doubleValue2) {
                return false;
            }
            return true;
        }
        if (doubleValue <= doubleValue2) {
            return false;
        }
        return true;
    }

    public final boolean match$clevertap_core_release(@NotNull TriggerAdapter trigger, @NotNull EventAdapter event) {
        Intrinsics.echo(trigger, "trigger");
        Intrinsics.echo(event, "event");
        if ((!Utils.areNamesNormalizedEqual(event.getEventName(), trigger.getEventName()) && (event.getProfileAttrName() == null || !Utils.areNamesNormalizedEqual(event.getProfileAttrName(), trigger.getProfileAttrName()))) || !matchPropertyConditions(trigger, event) || !matchFirstTimeOnly(trigger)) {
            return false;
        }
        if (event.isChargedEvent() && !matchChargedItemConditions(trigger, event)) {
            return false;
        }
        if (trigger.getGeoRadiusCount() > 0 && !matchGeoRadius$clevertap_core_release(event, trigger)) {
            return false;
        }
        return true;
    }

    public final boolean matchEvent(@NotNull List<TriggerAdapter> whenTriggers, @NotNull EventAdapter event) {
        Intrinsics.echo(whenTriggers, "whenTriggers");
        Intrinsics.echo(event, "event");
        if (whenTriggers.isEmpty()) {
            return false;
        }
        Iterator<T> it = whenTriggers.iterator();
        while (it.hasNext()) {
            if (match$clevertap_core_release((TriggerAdapter) it.next(), event)) {
                return true;
            }
        }
        return false;
    }

    public final boolean matchGeoRadius$clevertap_core_release(@NotNull EventAdapter event, @NotNull TriggerAdapter trigger) {
        Intrinsics.echo(event, "event");
        Intrinsics.echo(trigger, "trigger");
        if (event.getUserLocation() != null && CTXtensions.isValid(event.getUserLocation())) {
            int geoRadiusCount = trigger.getGeoRadiusCount();
            for (int i4 = 0; i4 < geoRadiusCount; i4++) {
                TriggerGeoRadius geoRadiusAtIndex = trigger.geoRadiusAtIndex(i4);
                Location location = new Location("");
                Intrinsics.checkNotNull(geoRadiusAtIndex);
                location.setLatitude(geoRadiusAtIndex.getLatitude());
                location.setLongitude(geoRadiusAtIndex.getLongitude());
                try {
                } catch (Exception e) {
                    Logger.d("Error matching GeoRadius triggers for event named " + event.getEventName() + ". Reason: " + e.getLocalizedMessage());
                }
                if (evaluateDistance$clevertap_core_release(geoRadiusAtIndex.getRadius(), location, event.getUserLocation())) {
                    return true;
                }
            }
        }
        return false;
    }
}
