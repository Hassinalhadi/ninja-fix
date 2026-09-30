package com.clevertap.android.sdk.network.api;

import Aa.d;
import L.b;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.TemplateArgument;
import com.clevertap.android.sdk.utils.JsonUtilsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import v5.C3172a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u0004"}, d2 = {"toJSON", "Lorg/json/JSONObject;", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefineTemplatesRequestBodyKt {
    public static final JSONObject toJSON(Collection<CustomTemplate> collection) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_TYPE, "templatePayload");
        JsonUtilsKt.putObject(jSONObject, "definitions", new b(4, collection));
        return jSONObject;
    }

    public static final Unit toJSON$lambda$6$lambda$5(Collection templates, JSONObject putObject) {
        Intrinsics.echo(templates, "$templates");
        Intrinsics.echo(putObject, "$this$putObject");
        Iterator it = templates.iterator();
        while (it.hasNext()) {
            CustomTemplate customTemplate = (CustomTemplate) it.next();
            JsonUtilsKt.putObject(putObject, customTemplate.getName(), new C3172a(customTemplate, 1));
        }
        return Unit.INSTANCE;
    }

    public static final Unit toJSON$lambda$6$lambda$5$lambda$4(CustomTemplate template, JSONObject putObject) {
        Intrinsics.echo(template, "$template");
        Intrinsics.echo(putObject, "$this$putObject");
        putObject.put(Constants.KEY_TYPE, template.getType().toString());
        JsonUtilsKt.putObject(putObject, "vars", new C3172a(template, 0));
        return Unit.INSTANCE;
    }

    public static final Unit toJSON$lambda$6$lambda$5$lambda$4$lambda$3(CustomTemplate template, JSONObject putObject) {
        Intrinsics.echo(template, "$template");
        Intrinsics.echo(putObject, "$this$putObject");
        int i4 = 0;
        for (Object obj : template.getArgs$clevertap_core_release()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TemplateArgument templateArgument = (TemplateArgument) obj;
            JsonUtilsKt.putObject(putObject, templateArgument.getName(), new d(templateArgument, i4, 7));
            i4 = i5;
        }
        return Unit.INSTANCE;
    }

    public static final Unit toJSON$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(TemplateArgument arg, int i4, JSONObject putObject) {
        Intrinsics.echo(arg, "$arg");
        Intrinsics.echo(putObject, "$this$putObject");
        Object defaultValue = arg.getDefaultValue();
        if (defaultValue != null) {
            putObject.put("defaultValue", defaultValue);
        }
        putObject.put(Constants.KEY_TYPE, arg.getType().getStringName());
        putObject.put("order", i4);
        return Unit.INSTANCE;
    }
}
