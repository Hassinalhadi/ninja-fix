package com.clevertap.android.sdk.inapp.customtemplates;

import Q0.c;
import Yd.a;
import Yd.e;
import android.content.Context;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppActionType;
import com.clevertap.android.sdk.inapp.InAppListener;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 N2\u00020\u0001:\u0004NOPQB;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010$\u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020\u0015J\u0015\u0010&\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0002\u00100J\u0015\u00101\u001a\u0004\u0018\u0001022\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0002\u00103J\u0015\u00104\u001a\u0004\u0018\u0001052\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0002\u00106J\u0015\u00107\u001a\u0004\u0018\u0001082\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0002\u00109J\u001c\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00192\u0006\u0010%\u001a\u00020\u0015J\u0010\u0010;\u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020\u0015J\b\u0010<\u001a\u00020=H\u0016J\u0006\u0010>\u001a\u00020=J,\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00192\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\b\u0010C\u001a\u0004\u0018\u00010DH\u0002J\u001c\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0002J \u0010G\u001a\u0004\u0018\u0001HH\"\u0006\b\u0000\u0010H\u0018\u00012\u0006\u0010%\u001a\u00020\u0015H\u0082\b¢\u0006\u0002\u0010IJ\b\u0010J\u001a\u00020\u0015H\u0016J\u0012\u0010K\u001a\u00020\u00152\b\u0010L\u001a\u0004\u0018\u00010MH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00070\u00070\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002RS¨\u0006T"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext;", "", "template", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "notification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/InAppListener;", "resourceProvider", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "dismissListener", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;", "logger", "Lcom/clevertap/android/sdk/Logger;", "<init>", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/InAppListener;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;Lcom/clevertap/android/sdk/Logger;)V", "getNotification$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "getLogger", "()Lcom/clevertap/android/sdk/Logger;", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "", "getTemplateName", "()Ljava/lang/String;", "argumentValues", "", "getArgumentValues", "()Ljava/util/Map;", "inAppListenerRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getInAppListenerRef$clevertap_core_release", "()Ljava/lang/ref/WeakReference;", "isAction", "", "isVisual", "getString", "name", "getBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getByte", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "getShort", "", "(Ljava/lang/String;)Ljava/lang/Short;", "getInt", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "getLong", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getFloat", "", "(Ljava/lang/String;)Ljava/lang/Float;", "getDouble", "", "(Ljava/lang/String;)Ljava/lang/Double;", "getMap", "getFile", "setPresented", "", "setDismissed", "mergeArguments", "defaults", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgument;", "overrides", "Lorg/json/JSONObject;", "getOverrideValue", "argument", "getValue", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "toString", "getActionName", Constants.KEY_ACTION, "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Factory", "TemplateContext", "FunctionContext", "ContextDismissListener", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$FunctionContext;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$TemplateContext;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CustomTemplateContext {

    @NotNull
    private static final String ARGS_KEY_ACTIONS = "actions";

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, Object> argumentValues;

    @Nullable
    private ContextDismissListener dismissListener;

    @NotNull
    private final WeakReference<InAppListener> inAppListenerRef;
    private final boolean isAction;
    private final boolean isVisual;

    @NotNull
    private final Logger logger;

    @NotNull
    private final CTInAppNotification notification;

    @NotNull
    private final FileResourceProvider resourceProvider;

    @NotNull
    private final String templateName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;", "", "onDismissContext", "", "context", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface ContextDismissListener {
        void onDismissContext(@NotNull CustomTemplateContext context);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$Factory;", "", "<init>", "()V", "ARGS_KEY_ACTIONS", "", "createContext", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext;", "template", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "notification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/InAppListener;", "resourceProvider", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "dismissListener", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;", "logger", "Lcom/clevertap/android/sdk/Logger;", "createContext$clevertap_core_release", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext$Factory, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext$Factory$WhenMappings */
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomTemplateContext createContext$clevertap_core_release(@NotNull CustomTemplate template, @NotNull CTInAppNotification notification, @NotNull InAppListener inAppListener, @NotNull FileResourceProvider resourceProvider, @Nullable ContextDismissListener dismissListener, @NotNull Logger logger) {
            Intrinsics.echo(template, "template");
            Intrinsics.echo(notification, "notification");
            Intrinsics.echo(inAppListener, "inAppListener");
            Intrinsics.echo(resourceProvider, "resourceProvider");
            Intrinsics.echo(logger, "logger");
            int i4 = WhenMappings.$EnumSwitchMapping$0[template.getType().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return new FunctionContext(template, notification, inAppListener, resourceProvider, dismissListener, logger);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new TemplateContext(template, notification, inAppListener, resourceProvider, dismissListener, logger);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$FunctionContext;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext;", "template", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "notification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/InAppListener;", "resourceProvider", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "dismissListener", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;", "logger", "Lcom/clevertap/android/sdk/Logger;", "<init>", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/InAppListener;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;Lcom/clevertap/android/sdk/Logger;)V", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FunctionContext extends CustomTemplateContext {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FunctionContext(@NotNull CustomTemplate template, @NotNull CTInAppNotification notification, @NotNull InAppListener inAppListener, @NotNull FileResourceProvider resourceProvider, @Nullable ContextDismissListener contextDismissListener, @NotNull Logger logger) {
            super(template, notification, inAppListener, resourceProvider, contextDismissListener, logger, null);
            Intrinsics.echo(template, "template");
            Intrinsics.echo(notification, "notification");
            Intrinsics.echo(inAppListener, "inAppListener");
            Intrinsics.echo(resourceProvider, "resourceProvider");
            Intrinsics.echo(logger, "logger");
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¨\u0006\u0016"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$TemplateContext;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext;", "template", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "notification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/InAppListener;", "resourceProvider", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "dismissListener", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;", "logger", "Lcom/clevertap/android/sdk/Logger;", "<init>", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/InAppListener;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;Lcom/clevertap/android/sdk/Logger;)V", "triggerActionArgument", "", "actionArgumentName", "", "activityContext", "Landroid/content/Context;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TemplateContext extends CustomTemplateContext {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TemplateContext(@NotNull CustomTemplate template, @NotNull CTInAppNotification notification, @NotNull InAppListener inAppListener, @NotNull FileResourceProvider resourceProvider, @Nullable ContextDismissListener contextDismissListener, @NotNull Logger logger) {
            super(template, notification, inAppListener, resourceProvider, contextDismissListener, logger, null);
            Intrinsics.echo(template, "template");
            Intrinsics.echo(notification, "notification");
            Intrinsics.echo(inAppListener, "inAppListener");
            Intrinsics.echo(resourceProvider, "resourceProvider");
            Intrinsics.echo(logger, "logger");
        }

        public static /* synthetic */ void triggerActionArgument$default(TemplateContext templateContext, String str, Context context, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                context = null;
            }
            templateContext.triggerActionArgument(str, context);
        }

        public final void triggerActionArgument(@NotNull String actionArgumentName, @Nullable Context activityContext) {
            String str;
            String templateName;
            Intrinsics.echo(actionArgumentName, "actionArgumentName");
            Object obj = getArgumentValues().get(actionArgumentName);
            if (!(obj instanceof CTInAppAction)) {
                Logger logger = getLogger();
                StringBuilder victor = c.victor("No argument of type action with name ", actionArgumentName, " exists for template ");
                victor.append(getTemplateName());
                logger.info("CustomTemplates", victor.toString());
                return;
            }
            InAppListener inAppListener = getInAppListenerRef$clevertap_core_release().get();
            if (inAppListener != null) {
                CTInAppNotification notification = getNotification();
                CTInAppAction cTInAppAction = (CTInAppAction) obj;
                CustomTemplateInAppData customTemplateInAppData = cTInAppAction.getCustomTemplateInAppData();
                if (customTemplateInAppData != null && (templateName = customTemplateInAppData.getTemplateName()) != null) {
                    str = templateName;
                } else {
                    str = actionArgumentName;
                }
                inAppListener.inAppNotificationActionTriggered(notification, cTInAppAction, str, null, activityContext);
                return;
            }
            getLogger().debug("CustomTemplates", "Cannot trigger action");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TemplateArgumentType.values().length];
            try {
                iArr[TemplateArgumentType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TemplateArgumentType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TemplateArgumentType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TemplateArgumentType.FILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TemplateArgumentType.ACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CustomTemplateContext(CustomTemplate customTemplate, CTInAppNotification cTInAppNotification, InAppListener inAppListener, FileResourceProvider fileResourceProvider, ContextDismissListener contextDismissListener, Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(customTemplate, cTInAppNotification, inAppListener, fileResourceProvider, contextDismissListener, logger);
    }

    private final String getActionName(CTInAppAction action) {
        InAppActionType type;
        CustomTemplateInAppData customTemplateInAppData;
        String templateName;
        if (action != null && (customTemplateInAppData = action.getCustomTemplateInAppData()) != null && (templateName = customTemplateInAppData.getTemplateName()) != null) {
            return templateName;
        }
        if (action != null && (type = action.getType()) != null) {
            return type.getStringValue();
        }
        return "";
    }

    private final Object getOverrideValue(TemplateArgument argument, JSONObject overrides) {
        JSONObject jSONObject;
        if (overrides != null && overrides.has(argument.getName())) {
            try {
                int i4 = WhenMappings.$EnumSwitchMapping$0[argument.getType().ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
                                    JSONObject optJSONObject = overrides.optJSONObject(argument.getName());
                                    if (optJSONObject != null) {
                                        jSONObject = optJSONObject.optJSONObject("actions");
                                    } else {
                                        jSONObject = null;
                                    }
                                    return companion.createFromJson(jSONObject);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            return overrides.getString(argument.getName());
                        }
                        Object defaultValue = argument.getDefaultValue();
                        if (defaultValue instanceof Byte) {
                            return Byte.valueOf((byte) overrides.getInt(argument.getName()));
                        }
                        if (defaultValue instanceof Short) {
                            return Short.valueOf((short) overrides.getInt(argument.getName()));
                        }
                        if (defaultValue instanceof Integer) {
                            return Integer.valueOf(overrides.getInt(argument.getName()));
                        }
                        if (defaultValue instanceof Long) {
                            return Long.valueOf(overrides.getLong(argument.getName()));
                        }
                        if (defaultValue instanceof Float) {
                            return Float.valueOf((float) overrides.getDouble(argument.getName()));
                        }
                        return Double.valueOf(overrides.getDouble(argument.getName()));
                    }
                    return Boolean.valueOf(overrides.getBoolean(argument.getName()));
                }
                return overrides.getString(argument.getName());
            } catch (JSONException unused) {
                this.logger.debug("CustomTemplates", "Received argument with invalid type. Expected type: " + argument.getType() + " for argument: " + argument.getName());
            }
        }
        return null;
    }

    private final /* synthetic */ <T> T getValue(String name) {
        this.argumentValues.get(name);
        Intrinsics.juliet();
        throw null;
    }

    private final Map<String, Object> mergeArguments(List<TemplateArgument> defaults, JSONObject overrides) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TemplateArgument templateArgument : defaults) {
            Object overrideValue = getOverrideValue(templateArgument, overrides);
            if (overrideValue == null) {
                overrideValue = templateArgument.getDefaultValue();
            }
            if (overrideValue != null) {
                linkedHashMap.put(templateArgument.getName(), overrideValue);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> getArgumentValues() {
        return this.argumentValues;
    }

    @Nullable
    public final Boolean getBoolean(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return (Boolean) obj;
    }

    @Nullable
    public final Byte getByte(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Byte)) {
            obj = null;
        }
        return (Byte) obj;
    }

    @Nullable
    public final Double getDouble(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Double)) {
            obj = null;
        }
        return (Double) obj;
    }

    @Nullable
    public final String getFile(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        return this.resourceProvider.cachedFilePath(str);
    }

    @Nullable
    public final Float getFloat(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Float)) {
            obj = null;
        }
        return (Float) obj;
    }

    @NotNull
    public final WeakReference<InAppListener> getInAppListenerRef$clevertap_core_release() {
        return this.inAppListenerRef;
    }

    @Nullable
    public final Integer getInt(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        return (Integer) obj;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @Nullable
    public final Long getLong(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Long)) {
            obj = null;
        }
        return (Long) obj;
    }

    @Nullable
    public final Map<String, Object> getMap(@NotNull String name) {
        Map map;
        Intrinsics.echo(name, "name");
        String concat = name.concat(".");
        Map<String, Object> map2 = this.argumentValues;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            if (r.quebec(entry.getKey(), concat, false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        Map linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            List<String> maroon = StringsKt.maroon(StringsKt.lime(str, concat), new String[]{"."}, 6);
            if (value instanceof CTInAppAction) {
                value = getActionName((CTInAppAction) value);
            }
            Map map3 = linkedHashMap2;
            int i4 = 0;
            for (String str2 : maroon) {
                int i5 = i4 + 1;
                if (i4 == CollectionsKt.ivory(maroon)) {
                    map3.put(str2, value);
                } else {
                    Object obj = map3.get(str2);
                    if ((obj instanceof Map) && (!(obj instanceof a) || (obj instanceof e))) {
                        map = (Map) obj;
                    } else {
                        map = null;
                    }
                    if (map == null) {
                        map = new LinkedHashMap();
                        map3.put(str2, map);
                    }
                    map3 = map;
                }
                i4 = i5;
            }
        }
        return linkedHashMap2;
    }

    @NotNull
    /* renamed from: getNotification$clevertap_core_release, reason: from getter */
    public final CTInAppNotification getNotification() {
        return this.notification;
    }

    @Nullable
    public final Short getShort(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Short)) {
            obj = null;
        }
        return (Short) obj;
    }

    @Nullable
    public final String getString(@NotNull String name) {
        Intrinsics.echo(name, "name");
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof String)) {
            obj = null;
        }
        return (String) obj;
    }

    @NotNull
    public final String getTemplateName() {
        return this.templateName;
    }

    public final void setDismissed() {
        ContextDismissListener contextDismissListener = this.dismissListener;
        if (contextDismissListener != null) {
            contextDismissListener.onDismissContext(this);
        }
        this.dismissListener = null;
        if (this.isAction && !this.isVisual) {
            return;
        }
        InAppListener inAppListener = this.inAppListenerRef.get();
        if (inAppListener != null) {
            inAppListener.inAppNotificationDidDismiss(this.notification, null);
        } else {
            this.logger.debug("CustomTemplates", "Cannot set template as dismissed");
        }
        this.inAppListenerRef.clear();
    }

    public void setPresented() {
        if (this.isAction) {
            return;
        }
        InAppListener inAppListener = this.inAppListenerRef.get();
        if (inAppListener != null) {
            inAppListener.inAppNotificationDidShow(this.notification, null);
        } else {
            this.logger.debug("CustomTemplates", "Cannot set template as presented");
        }
    }

    @NotNull
    public String toString() {
        String obj;
        CTInAppAction cTInAppAction;
        StringBuilder sb2 = new StringBuilder("CustomTemplateContext {\ntemplateName = ");
        sb2.append(this.templateName);
        sb2.append(",\nargs = {\n");
        Map<String, Object> map = this.argumentValues;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            StringBuilder sb3 = new StringBuilder("\t");
            sb3.append(entry.getKey());
            sb3.append(" = ");
            if (entry.getValue() instanceof CTInAppAction) {
                StringBuilder sb4 = new StringBuilder("Action {");
                Object value = entry.getValue();
                if (value instanceof CTInAppAction) {
                    cTInAppAction = (CTInAppAction) value;
                } else {
                    cTInAppAction = null;
                }
                obj = P0.fuchsia(sb4, getActionName(cTInAppAction), '}');
            } else {
                obj = entry.getValue().toString();
            }
            sb3.append(obj);
            arrayList.add(sb3.toString());
        }
        return P0.gold(sb2, CollectionsKt.maroon(arrayList, ",\n", null, null, null, 62), "\n}}");
    }

    private CustomTemplateContext(CustomTemplate customTemplate, CTInAppNotification cTInAppNotification, InAppListener inAppListener, FileResourceProvider fileResourceProvider, ContextDismissListener contextDismissListener, Logger logger) {
        this.notification = cTInAppNotification;
        this.resourceProvider = fileResourceProvider;
        this.dismissListener = contextDismissListener;
        this.logger = logger;
        this.templateName = customTemplate.getName();
        List<TemplateArgument> args$clevertap_core_release = customTemplate.getArgs$clevertap_core_release();
        CustomTemplateInAppData customTemplateData = cTInAppNotification.getCustomTemplateData();
        this.argumentValues = mergeArguments(args$clevertap_core_release, customTemplateData != null ? customTemplateData.getArguments$clevertap_core_release() : null);
        this.inAppListenerRef = new WeakReference<>(inAppListener);
        CustomTemplateInAppData customTemplateData2 = cTInAppNotification.getCustomTemplateData();
        this.isAction = customTemplateData2 != null ? customTemplateData2.getIsAction() : false;
        this.isVisual = customTemplate.getIsVisual();
    }
}
