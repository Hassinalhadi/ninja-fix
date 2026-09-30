package com.clevertap.android.sdk.inapp.customtemplates;

import androidx.appcompat.widget.P0;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.C2361k;
import s6.AbstractC2769s6;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u001f !BE\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006\""}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "", "name", "", "presenter", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplatePresenter;", "isVisual", "", "args", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgument;", Constants.KEY_TYPE, "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "isSystemDefined", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplatePresenter;ZLjava/util/List;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;Z)V", "getName", "()Ljava/lang/String;", "getPresenter", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplatePresenter;", "()Z", "getArgs$clevertap_core_release", "()Ljava/util/List;", "getType$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "isSystemDefined$clevertap_core_release", "equals", "other", "hashCode", "", "toString", "FunctionBuilder", "TemplateBuilder", "Builder", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomTemplate {

    @NotNull
    private final List<TemplateArgument> args;
    private final boolean isSystemDefined;
    private final boolean isVisual;

    @NotNull
    private final String name;

    @NotNull
    private final CustomTemplatePresenter<?> presenter;

    @NotNull
    private final CustomTemplateType type;

    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00002\u00020\u0004B\u0019\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0014¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\b¢\u0006\u0002\u0010#J\u001b\u0010$\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u00020%¢\u0006\u0002\u0010&J\u001b\u0010'\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u00020(¢\u0006\u0002\u0010)J\u001b\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u00020+¢\u0006\u0002\u0010,J\u001b\u0010-\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u00020.¢\u0006\u0002\u0010/J\u001b\u00100\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u000201¢\u0006\u0002\u00102J\u001b\u00103\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010 \u001a\u000204¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0014¢\u0006\u0002\u0010\u001eJ'\u00107\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00142\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000409¢\u0006\u0002\u0010:J\u0013\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020=J'\u0010>\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020@2\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\bAJ\u0010\u0010B\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0DH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00028\u0001X¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001c\u0082\u0001\u0002EF¨\u0006G"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "P", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplatePresenter;", "T", "", Constants.KEY_TYPE, "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "isVisual", "", "<init>", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;Z)V", "thisRef", "getThisRef", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "isSystemDefined", "isSystemDefined$clevertap_core_release", "()Z", "setSystemDefined$clevertap_core_release", "(Z)V", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "", "argsNames", "", "parentArgsNames", "args", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgument;", "presenter", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplatePresenter;", "name", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "stringArgument", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "booleanArgument", "(Ljava/lang/String;Z)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "byteArgument", "", "(Ljava/lang/String;B)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "shortArgument", "", "(Ljava/lang/String;S)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "intArgument", "", "(Ljava/lang/String;I)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "longArgument", "", "(Ljava/lang/String;J)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "floatArgument", "", "(Ljava/lang/String;F)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "doubleArgument", "", "(Ljava/lang/String;D)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "fileArgument", "mapArgument", "value", "", "(Ljava/lang/String;Ljava/util/Map;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplatePresenter;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "build", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "addArgument", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "addArgument$clevertap_core_release", "trackParentNames", "getOrderedArgs", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$FunctionBuilder;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$TemplateBuilder;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Builder<P extends CustomTemplatePresenter<?>, T extends Builder<P, T>> {

        @NotNull
        private final List<TemplateArgument> args;

        @NotNull
        private final Set<String> argsNames;
        private boolean isSystemDefined;
        private final boolean isVisual;

        @NotNull
        private final Set<String> parentArgsNames;

        @Nullable
        private P presenter;

        @Nullable
        private String templateName;

        @NotNull
        private final CustomTemplateType type;

        public /* synthetic */ Builder(CustomTemplateType customTemplateType, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(customTemplateType, z2);
        }

        private final List<TemplateArgument> getOrderedArgs() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (TemplateArgument templateArgument : this.args) {
                String str = (String) CollectionsKt.gold(StringsKt.maroon(templateArgument.getName(), new String[]{"."}, 2));
                if (linkedHashMap.containsKey(str)) {
                    List list = (List) linkedHashMap.get(str);
                    if (list != null) {
                        list.add(templateArgument);
                    }
                } else {
                    linkedHashMap.put(str, CollectionsKt.white(templateArgument));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, CollectionsKt.p(CollectionsKt.z((Iterable) ((Map.Entry) it.next()).getValue()), new Comparator() { // from class: com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate$Builder$getOrderedArgs$lambda$1$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t10) {
                        return AbstractC2769s6.bravo(((TemplateArgument) t5).getName(), ((TemplateArgument) t10).getName());
                    }
                }));
            }
            return arrayList;
        }

        private final void trackParentNames(String name) {
            int emerald = StringsKt.emerald(name, '.', 0, 4);
            while (emerald != -1) {
                String substring = name.substring(0, emerald);
                Intrinsics.delta(substring, "substring(...)");
                if (!this.argsNames.contains(substring)) {
                    this.parentArgsNames.add(substring);
                    emerald = StringsKt.emerald(name, '.', emerald + 1, 4);
                } else {
                    throw new CustomTemplateException(ad.gray("Argument with name \"", name, "\" is already defined"), null, 2, null);
                }
            }
            if (!this.parentArgsNames.contains(name)) {
            } else {
                throw new CustomTemplateException(ad.gray("Argument with name \"", name, "\" is already defined"), null, 2, null);
            }
        }

        public final void addArgument$clevertap_core_release(@NotNull String name, @NotNull TemplateArgumentType r72, @Nullable Object defaultValue) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(r72, "type");
            if (!StringsKt.gray(name)) {
                if (!r.quebec(name, ".", false) && !r.golf(name, ".", false) && !StringsKt.beige(name, "..", false)) {
                    if (!this.argsNames.contains(name)) {
                        trackParentNames(name);
                        this.args.add(new TemplateArgument(name, r72, defaultValue));
                        this.argsNames.add(name);
                        return;
                    }
                    throw new CustomTemplateException(ad.gray("Argument with name \"", name, "\" is already defined"), null, 2, null);
                }
                throw new CustomTemplateException("Argument name must not begin or end with a \".\" nor have consecutive \".\"", null, 2, null);
            }
            throw new CustomTemplateException("Argument name must not be blank", null, 2, null);
        }

        @NotNull
        public final T booleanArgument(@NotNull String name, boolean defaultValue) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.BOOLEAN, Boolean.valueOf(defaultValue));
            return getThisRef();
        }

        @NotNull
        public final CustomTemplate build() {
            P p4 = this.presenter;
            if (p4 != null) {
                String str = this.templateName;
                if (str != null) {
                    return new CustomTemplate(str, p4, this.isVisual, getOrderedArgs(), this.type, this.isSystemDefined, null);
                }
                throw new CustomTemplateException("CustomTemplate must have a name", null, 2, null);
            }
            throw new CustomTemplateException("CustomTemplate must have a presenter", null, 2, null);
        }

        @NotNull
        public final T byteArgument(@NotNull String name, byte defaultValue) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.NUMBER, Byte.valueOf(defaultValue));
            return getThisRef();
        }

        @NotNull
        public final T doubleArgument(@NotNull String name, double defaultValue) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.NUMBER, Double.valueOf(defaultValue));
            return getThisRef();
        }

        @NotNull
        public final T fileArgument(@NotNull String name) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.FILE, null);
            return getThisRef();
        }

        @NotNull
        public final T floatArgument(@NotNull String name, float defaultValue) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.NUMBER, Float.valueOf(defaultValue));
            return getThisRef();
        }

        @NotNull
        public abstract T getThisRef();

        @NotNull
        public final T intArgument(@NotNull String name, int defaultValue) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.NUMBER, Integer.valueOf(defaultValue));
            return getThisRef();
        }

        /* renamed from: isSystemDefined$clevertap_core_release, reason: from getter */
        public final boolean getIsSystemDefined() {
            return this.isSystemDefined;
        }

        @NotNull
        public final T longArgument(@NotNull String name, long defaultValue) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.NUMBER, Long.valueOf(defaultValue));
            return getThisRef();
        }

        @NotNull
        public final T mapArgument(@NotNull String name, @NotNull Map<String, ? extends Object> value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            if (!value.isEmpty()) {
                for (Map.Entry<String, ? extends Object> entry : value.entrySet()) {
                    Object value2 = entry.getValue();
                    String str = name + '.' + entry.getKey();
                    if (value2 instanceof Byte) {
                        byteArgument(str, ((Number) value2).byteValue());
                    } else if (value2 instanceof Short) {
                        shortArgument(str, ((Number) value2).shortValue());
                    } else if (value2 instanceof Integer) {
                        intArgument(str, ((Number) value2).intValue());
                    } else if (value2 instanceof Long) {
                        longArgument(str, ((Number) value2).longValue());
                    } else if (value2 instanceof Float) {
                        floatArgument(str, ((Number) value2).floatValue());
                    } else if (value2 instanceof Double) {
                        doubleArgument(str, ((Number) value2).doubleValue());
                    } else if (value2 instanceof Boolean) {
                        booleanArgument(str, ((Boolean) value2).booleanValue());
                    } else if (value2 instanceof String) {
                        stringArgument(str, (String) value2);
                    } else if (value2 instanceof Map) {
                        Intrinsics.charlie(value2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        mapArgument(str, (Map) value2);
                    } else {
                        throw new CustomTemplateException("Unsupported value type " + value2.getClass() + " for argument " + str, null, 2, null);
                    }
                }
                return getThisRef();
            }
            throw new CustomTemplateException("Map argument must not be empty", null, 2, null);
        }

        @NotNull
        public final T name(@NotNull String name) {
            Intrinsics.echo(name, "name");
            if (this.templateName == null) {
                if (!StringsKt.gray(name)) {
                    this.templateName = name;
                    return getThisRef();
                }
                throw new CustomTemplateException("CustomTemplate must have a non-blank name", null, 2, null);
            }
            throw new CustomTemplateException(P0.fuchsia(new StringBuilder("CustomTemplate name is already set as \""), this.templateName, '\"'), null, 2, null);
        }

        @NotNull
        public final T presenter(@NotNull P presenter) {
            Intrinsics.echo(presenter, "presenter");
            this.presenter = presenter;
            return getThisRef();
        }

        public final void setSystemDefined$clevertap_core_release(boolean z2) {
            this.isSystemDefined = z2;
        }

        @NotNull
        public final T shortArgument(@NotNull String name, short defaultValue) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.NUMBER, Short.valueOf(defaultValue));
            return getThisRef();
        }

        @NotNull
        public final T stringArgument(@NotNull String name, @NotNull String defaultValue) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(defaultValue, "defaultValue");
            addArgument$clevertap_core_release(name, TemplateArgumentType.STRING, defaultValue);
            return getThisRef();
        }

        private Builder(CustomTemplateType customTemplateType, boolean z2) {
            this.type = customTemplateType;
            this.isVisual = z2;
            this.argsNames = new LinkedHashSet();
            this.parentArgsNames = new LinkedHashSet();
            this.args = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0000X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$FunctionBuilder;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "Lcom/clevertap/android/sdk/inapp/customtemplates/FunctionPresenter;", "isVisual", "", "<init>", "(Z)V", "thisRef", "getThisRef", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$FunctionBuilder;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FunctionBuilder extends Builder<FunctionPresenter, FunctionBuilder> {

        @NotNull
        private final FunctionBuilder thisRef;

        public FunctionBuilder(boolean z2) {
            super(CustomTemplateType.FUNCTION, z2, null);
            this.thisRef = this;
        }

        @Override // com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate.Builder
        @NotNull
        public FunctionBuilder getThisRef() {
            return this.thisRef;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u0000X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$TemplateBuilder;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$Builder;", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatePresenter;", "<init>", "()V", "thisRef", "getThisRef", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$TemplateBuilder;", "actionArgument", "name", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TemplateBuilder extends Builder<TemplatePresenter, TemplateBuilder> {

        @NotNull
        private final TemplateBuilder thisRef;

        public TemplateBuilder() {
            super(CustomTemplateType.TEMPLATE, true, null);
            this.thisRef = this;
        }

        @NotNull
        public final TemplateBuilder actionArgument(@NotNull String name) {
            Intrinsics.echo(name, "name");
            addArgument$clevertap_core_release(name, TemplateArgumentType.ACTION, null);
            return this;
        }

        @Override // com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate.Builder
        @NotNull
        public TemplateBuilder getThisRef() {
            return this.thisRef;
        }
    }

    public /* synthetic */ CustomTemplate(String str, CustomTemplatePresenter customTemplatePresenter, boolean z2, List list, CustomTemplateType customTemplateType, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customTemplatePresenter, z2, list, customTemplateType, z10);
    }

    public static /* synthetic */ CharSequence alpha(TemplateArgument templateArgument) {
        return toString$lambda$0(templateArgument);
    }

    public static final CharSequence toString$lambda$0(TemplateArgument it) {
        Intrinsics.echo(it, "it");
        StringBuilder sb2 = new StringBuilder("\t");
        sb2.append(it.getName());
        sb2.append(" = ");
        Object defaultValue = it.getDefaultValue();
        if (defaultValue == null) {
            defaultValue = it.getType();
        }
        sb2.append(defaultValue);
        return sb2.toString();
    }

    public boolean equals(@Nullable Object other) {
        Class<?> cls;
        if (this == other) {
            return true;
        }
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(CustomTemplate.class, cls)) {
            return false;
        }
        Intrinsics.charlie(other, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate");
        return Intrinsics.areEqual(this.name, ((CustomTemplate) other).name);
    }

    @NotNull
    public final List<TemplateArgument> getArgs$clevertap_core_release() {
        return this.args;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final CustomTemplatePresenter<?> getPresenter() {
        return this.presenter;
    }

    @NotNull
    /* renamed from: getType$clevertap_core_release, reason: from getter */
    public final CustomTemplateType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    /* renamed from: isSystemDefined$clevertap_core_release, reason: from getter */
    public final boolean getIsSystemDefined() {
        return this.isSystemDefined;
    }

    /* renamed from: isVisual, reason: from getter */
    public final boolean getIsVisual() {
        return this.isVisual;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustomTemplate {\nname = ");
        sb2.append(this.name);
        sb2.append(",\nisVisual = ");
        sb2.append(this.isVisual);
        sb2.append(",\ntype = ");
        sb2.append(this.type);
        sb2.append(",\nargs = {\n");
        return P0.gold(sb2, CollectionsKt.maroon(this.args, ",\n", null, null, new C2361k(2), 30), "\n}}");
    }

    private CustomTemplate(String str, CustomTemplatePresenter<?> customTemplatePresenter, boolean z2, List<TemplateArgument> list, CustomTemplateType customTemplateType, boolean z10) {
        this.name = str;
        this.presenter = customTemplatePresenter;
        this.isVisual = z2;
        this.args = list;
        this.type = customTemplateType;
        this.isSystemDefined = z10;
    }

    public /* synthetic */ CustomTemplate(String str, CustomTemplatePresenter customTemplatePresenter, boolean z2, List list, CustomTemplateType customTemplateType, boolean z10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customTemplatePresenter, z2, list, customTemplateType, (i4 & 32) != 0 ? false : z10);
    }
}
