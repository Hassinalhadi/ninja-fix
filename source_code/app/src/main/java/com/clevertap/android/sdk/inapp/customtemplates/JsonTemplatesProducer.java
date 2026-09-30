package com.clevertap.android.sdk.inapp.customtemplates;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateType;
import com.clevertap.android.sdk.inapp.customtemplates.TemplateArgumentType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/JsonTemplatesProducer;", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateProducer;", "jsonTemplatesDefinition", "", "templatesPresenter", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatePresenter;", "functionsPresenter", "Lcom/clevertap/android/sdk/inapp/customtemplates/FunctionPresenter;", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatePresenter;Lcom/clevertap/android/sdk/inapp/customtemplates/FunctionPresenter;)V", "defineTemplates", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "ctConfig", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "createTemplateFromJson", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "json", "Lorg/json/JSONObject;", "addJsonArgumentsToBuilder", "", "builder", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$TemplateBuilder;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$FunctionBuilder;", "jsonArgToMap", "", "", "argumentTypeFromStringOrThrow", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "argumentTypeString", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class JsonTemplatesProducer implements TemplateProducer {

    @Nullable
    private final FunctionPresenter functionsPresenter;

    @NotNull
    private final String jsonTemplatesDefinition;

    @Nullable
    private final TemplatePresenter templatesPresenter;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomTemplateType.values().length];
            try {
                iArr[CustomTemplateType.TEMPLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomTemplateType.FUNCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TemplateArgumentType.values().length];
            try {
                iArr2[TemplateArgumentType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TemplateArgumentType.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TemplateArgumentType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TemplateArgumentType.FILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TemplateArgumentType.ACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public JsonTemplatesProducer(@NotNull String jsonTemplatesDefinition, @Nullable TemplatePresenter templatePresenter, @Nullable FunctionPresenter functionPresenter) {
        Intrinsics.echo(jsonTemplatesDefinition, "jsonTemplatesDefinition");
        this.jsonTemplatesDefinition = jsonTemplatesDefinition;
        this.templatesPresenter = templatePresenter;
        this.functionsPresenter = functionPresenter;
    }

    private final void addJsonArgumentsToBuilder(CustomTemplate.TemplateBuilder builder, JSONObject json) {
        Iterator<String> keys = json.keys();
        Intrinsics.delta(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject = json.getJSONObject(next);
            String string = jSONObject.getString(Constants.KEY_TYPE);
            if (Intrinsics.areEqual(string, "object")) {
                Intrinsics.checkNotNull(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject("value");
                Intrinsics.delta(jSONObject2, "getJSONObject(...)");
                builder.mapArgument(next, jsonArgToMap(jSONObject2));
            } else {
                TemplateArgumentType.Companion companion = TemplateArgumentType.INSTANCE;
                Intrinsics.checkNotNull(string);
                TemplateArgumentType fromString = companion.fromString(string);
                if (fromString != null) {
                    int i4 = WhenMappings.$EnumSwitchMapping$1[fromString.ordinal()];
                    if (i4 == 1) {
                        boolean z2 = jSONObject.getBoolean("value");
                        Intrinsics.checkNotNull(next);
                        builder.booleanArgument(next, z2);
                    } else if (i4 == 2) {
                        double d4 = jSONObject.getDouble("value");
                        Intrinsics.checkNotNull(next);
                        builder.doubleArgument(next, d4);
                    } else if (i4 == 3) {
                        String string2 = jSONObject.getString("value");
                        Intrinsics.checkNotNull(next);
                        Intrinsics.checkNotNull(string2);
                        builder.stringArgument(next, string2);
                    } else if (i4 != 4) {
                        if (i4 == 5) {
                            if (!jSONObject.has("value")) {
                                Intrinsics.checkNotNull(next);
                                builder.actionArgument(next);
                            } else {
                                throw new CustomTemplateException(AbstractC2327c.victor('\"', "Action arguments should not specify a value. Remove value from argument: \"", next), null, 2, null);
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!jSONObject.has("value")) {
                        Intrinsics.checkNotNull(next);
                        builder.fileArgument(next);
                    } else {
                        throw new CustomTemplateException(AbstractC2327c.victor('\"', "File arguments should not specify a value. Remove value from argument: \"", next), null, 2, null);
                    }
                } else {
                    throw new CustomTemplateException(AbstractC2327c.victor('\"', "Unsupported argument type: \"", string), null, 2, null);
                }
            }
        }
    }

    private final TemplateArgumentType argumentTypeFromStringOrThrow(String argumentTypeString) {
        TemplateArgumentType fromString = TemplateArgumentType.INSTANCE.fromString(argumentTypeString);
        if (fromString != null) {
            return fromString;
        }
        throw new CustomTemplateException(AbstractC2327c.victor('\"', "Unsupported argument type: \"", argumentTypeString), null, 2, null);
    }

    private final CustomTemplate createTemplateFromJson(String templateName, JSONObject json) {
        String string = json.getString(Constants.KEY_TYPE);
        CustomTemplateType.Companion companion = CustomTemplateType.INSTANCE;
        Intrinsics.checkNotNull(string);
        CustomTemplateType fromString = companion.fromString(string);
        if (fromString != null) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    if (this.functionsPresenter != null) {
                        CustomTemplate.FunctionBuilder functionBuilder = new CustomTemplate.FunctionBuilder(json.getBoolean("isVisual"));
                        functionBuilder.name(templateName);
                        functionBuilder.presenter(this.functionsPresenter);
                        JSONObject jSONObject = json.getJSONObject("arguments");
                        Intrinsics.delta(jSONObject, "getJSONObject(...)");
                        addJsonArgumentsToBuilder(functionBuilder, jSONObject);
                        return functionBuilder.build();
                    }
                    throw new CustomTemplateException("JSON definition contains a function definition and a function presenter is required", null, 2, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (this.templatesPresenter != null) {
                CustomTemplate.TemplateBuilder templateBuilder = new CustomTemplate.TemplateBuilder();
                templateBuilder.name(templateName);
                templateBuilder.presenter(this.templatesPresenter);
                JSONObject jSONObject2 = json.getJSONObject("arguments");
                Intrinsics.delta(jSONObject2, "getJSONObject(...)");
                addJsonArgumentsToBuilder(templateBuilder, jSONObject2);
                return templateBuilder.build();
            }
            throw new CustomTemplateException("JSON definition contains a template definition and a templates presenter is required", null, 2, null);
        }
        throw new CustomTemplateException(AbstractC2327c.victor('\"', "Invalid template type: \"", string), null, 2, null);
    }

    private final Map<String, Object> jsonArgToMap(JSONObject json) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = json.keys();
        Intrinsics.delta(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject = json.getJSONObject(next);
            String string = jSONObject.getString(Constants.KEY_TYPE);
            if (Intrinsics.areEqual(string, "object")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("value");
                Intrinsics.delta(jSONObject2, "getJSONObject(...)");
                linkedHashMap.put(next, jsonArgToMap(jSONObject2));
            } else {
                Intrinsics.checkNotNull(string);
                int i4 = WhenMappings.$EnumSwitchMapping$1[argumentTypeFromStringOrThrow(string).ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4 && i4 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new CustomTemplateException("Nesting of file and action arguments within objects is not supported. To define nested file and actions use '.' notation in the argument name.", null, 2, null);
                        }
                        linkedHashMap.put(next, jSONObject.getString("value"));
                    } else {
                        linkedHashMap.put(next, Double.valueOf(jSONObject.getDouble("value")));
                    }
                } else {
                    linkedHashMap.put(next, Boolean.valueOf(jSONObject.getBoolean("value")));
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.clevertap.android.sdk.inapp.customtemplates.TemplateProducer
    @NotNull
    public Set<CustomTemplate> defineTemplates(@NotNull CleverTapInstanceConfig ctConfig) {
        Intrinsics.echo(ctConfig, "ctConfig");
        try {
            JSONObject jSONObject = new JSONObject(this.jsonTemplatesDefinition);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.delta(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkNotNull(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                Intrinsics.delta(jSONObject2, "getJSONObject(...)");
                linkedHashSet.add(createTemplateFromJson(next, jSONObject2));
            }
            return linkedHashSet;
        } catch (JSONException e) {
            throw new CustomTemplateException("Invalid JSON format for templates' definitions", e);
        }
    }

    private final void addJsonArgumentsToBuilder(CustomTemplate.FunctionBuilder builder, JSONObject json) {
        Iterator<String> keys = json.keys();
        Intrinsics.delta(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject = json.getJSONObject(next);
            String string = jSONObject.getString(Constants.KEY_TYPE);
            if (Intrinsics.areEqual(string, "object")) {
                Intrinsics.checkNotNull(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject("value");
                Intrinsics.delta(jSONObject2, "getJSONObject(...)");
                builder.mapArgument(next, jsonArgToMap(jSONObject2));
            } else {
                Intrinsics.checkNotNull(string);
                int i4 = WhenMappings.$EnumSwitchMapping$1[argumentTypeFromStringOrThrow(string).ordinal()];
                if (i4 == 1) {
                    boolean z2 = jSONObject.getBoolean("value");
                    Intrinsics.checkNotNull(next);
                    builder.booleanArgument(next, z2);
                } else if (i4 == 2) {
                    double d4 = jSONObject.getDouble("value");
                    Intrinsics.checkNotNull(next);
                    builder.doubleArgument(next, d4);
                } else if (i4 == 3) {
                    String string2 = jSONObject.getString("value");
                    Intrinsics.checkNotNull(next);
                    Intrinsics.checkNotNull(string2);
                    builder.stringArgument(next, string2);
                } else {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            throw new CustomTemplateException(AbstractC2327c.victor('\"', "Function templates cannot have action arguments. Remove argument: \"", next), null, 2, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!jSONObject.has("value")) {
                        Intrinsics.checkNotNull(next);
                        builder.fileArgument(next);
                    } else {
                        throw new CustomTemplateException(AbstractC2327c.victor('\"', "File arguments should not specify a value. Remove value from argument: \"", next), null, 2, null);
                    }
                }
            }
        }
    }
}
