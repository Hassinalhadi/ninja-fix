package com.clevertap.android.sdk.inapp.customtemplates;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppListener;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000bJ\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0016J\"\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext$ContextDismissListener;", "templates", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "logger", "Lcom/clevertap/android/sdk/Logger;", "<init>", "(Ljava/util/Collection;Lcom/clevertap/android/sdk/Logger;)V", "customTemplates", "", "", "activeContexts", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateContext;", "isTemplateRegistered", "", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "getAllRegisteredTemplates", "", "getTemplate", "getActiveContextForTemplate", "presentTemplate", "", "notification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/InAppListener;", "resourceProvider", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "closeTemplate", "onDismissContext", "context", "createContextFromInApp", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TemplatesManager implements CustomTemplateContext.ContextDismissListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<TemplateProducer> templateProducers = new ArrayList();

    @NotNull
    private final Map<String, CustomTemplateContext> activeContexts;

    @NotNull
    private final Map<String, CustomTemplate> customTemplates;

    @NotNull
    private final Logger logger;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0006\u0010\u0011\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager$Companion;", "", "<init>", "()V", "templateProducers", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateProducer;", "register", "", "templateProducer", "createInstance", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "ctInstanceConfig", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "systemTemplates", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "clearRegisteredProducers", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearRegisteredProducers() {
            TemplatesManager.templateProducers.clear();
        }

        @NotNull
        public final TemplatesManager createInstance(@NotNull CleverTapInstanceConfig ctInstanceConfig, @NotNull Set<CustomTemplate> systemTemplates) {
            Intrinsics.echo(ctInstanceConfig, "ctInstanceConfig");
            Intrinsics.echo(systemTemplates, "systemTemplates");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = TemplatesManager.templateProducers.iterator();
            while (it.hasNext()) {
                for (CustomTemplate customTemplate : ((TemplateProducer) it.next()).defineTemplates(ctInstanceConfig)) {
                    if (!customTemplate.getIsSystemDefined()) {
                        if (!systemTemplates.contains(customTemplate)) {
                            if (!linkedHashSet.contains(customTemplate)) {
                                linkedHashSet.add(customTemplate);
                            } else {
                                throw new CustomTemplateException("CustomTemplate with a name \"" + customTemplate.getName() + "\" is already registered.", null, 2, null);
                            }
                        } else {
                            throw new CustomTemplateException("CustomTemplate with a name \"" + customTemplate.getName() + "\" is a system template.", null, 2, null);
                        }
                    } else {
                        throw new CustomTemplateException("Cannot define system template with a name \"" + customTemplate.getName() + "\".", null, 2, null);
                    }
                }
            }
            linkedHashSet.addAll(systemTemplates);
            Logger logger = ctInstanceConfig.getLogger();
            Intrinsics.delta(logger, "getLogger(...)");
            return new TemplatesManager(linkedHashSet, logger);
        }

        public final void register(@NotNull TemplateProducer templateProducer) {
            Intrinsics.echo(templateProducer, "templateProducer");
            TemplatesManager.templateProducers.add(templateProducer);
        }

        private Companion() {
        }
    }

    public TemplatesManager(@NotNull Collection<CustomTemplate> templates, @NotNull Logger logger) {
        int collectionSizeOrDefault;
        Intrinsics.echo(templates, "templates");
        Intrinsics.echo(logger, "logger");
        this.logger = logger;
        Collection<CustomTemplate> collection = templates;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec < 16 ? 16 : quebec);
        for (Object obj : collection) {
            linkedHashMap.put(((CustomTemplate) obj).getName(), obj);
        }
        this.customTemplates = linkedHashMap;
        this.activeContexts = new LinkedHashMap();
    }

    private final CustomTemplateContext createContextFromInApp(CTInAppNotification notification, InAppListener inAppListener, FileResourceProvider resourceProvider) {
        String str;
        CustomTemplateInAppData customTemplateData = notification.getCustomTemplateData();
        if (customTemplateData != null) {
            str = customTemplateData.getTemplateName();
        } else {
            str = null;
        }
        if (str == null) {
            this.logger.debug("CustomTemplates", "Cannot create TemplateContext from notification without template name");
            return null;
        }
        CustomTemplate customTemplate = this.customTemplates.get(str);
        if (customTemplate == null) {
            this.logger.debug("CustomTemplates", "Cannot create TemplateContext for non-registered template: ".concat(str));
            return null;
        }
        return CustomTemplateContext.INSTANCE.createContext$clevertap_core_release(customTemplate, notification, inAppListener, resourceProvider, this, this.logger);
    }

    @NotNull
    public static final TemplatesManager createInstance(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull Set<CustomTemplate> set) {
        return INSTANCE.createInstance(cleverTapInstanceConfig, set);
    }

    public static final void register(@NotNull TemplateProducer templateProducer) {
        INSTANCE.register(templateProducer);
    }

    public final void closeTemplate(@NotNull CTInAppNotification notification) {
        String str;
        Intrinsics.echo(notification, "notification");
        CustomTemplateInAppData customTemplateData = notification.getCustomTemplateData();
        if (customTemplateData != null) {
            str = customTemplateData.getTemplateName();
        } else {
            str = null;
        }
        if (str == null) {
            this.logger.debug("CustomTemplates", "Cannot close custom template from notification without template name");
            return;
        }
        CustomTemplateContext customTemplateContext = this.activeContexts.get(str);
        if (customTemplateContext == null) {
            this.logger.debug("CustomTemplates", "Cannot close custom template without active context");
            return;
        }
        CustomTemplate customTemplate = this.customTemplates.get(str);
        if (customTemplate == null) {
            this.logger.info("CustomTemplates", "Cannot find template with name ".concat(str));
            return;
        }
        CustomTemplatePresenter<?> presenter = customTemplate.getPresenter();
        if ((presenter instanceof TemplatePresenter) && (customTemplateContext instanceof CustomTemplateContext.TemplateContext)) {
            ((TemplatePresenter) presenter).onClose((CustomTemplateContext.TemplateContext) customTemplateContext);
        }
    }

    @Nullable
    public final CustomTemplateContext getActiveContextForTemplate(@NotNull String templateName) {
        Intrinsics.echo(templateName, "templateName");
        return this.activeContexts.get(templateName);
    }

    @NotNull
    public final List<CustomTemplate> getAllRegisteredTemplates() {
        Collection<CustomTemplate> values = this.customTemplates.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((CustomTemplate) obj).getIsSystemDefined()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final CustomTemplate getTemplate(@NotNull String templateName) {
        Intrinsics.echo(templateName, "templateName");
        return this.customTemplates.get(templateName);
    }

    public final boolean isTemplateRegistered(@NotNull String templateName) {
        Intrinsics.echo(templateName, "templateName");
        return this.customTemplates.containsKey(templateName);
    }

    @Override // com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext.ContextDismissListener
    public void onDismissContext(@NotNull CustomTemplateContext context) {
        Intrinsics.echo(context, "context");
        this.activeContexts.remove(context.getTemplateName());
    }

    public final void presentTemplate(@NotNull CTInAppNotification notification, @NotNull InAppListener inAppListener, @NotNull FileResourceProvider resourceProvider) {
        Intrinsics.echo(notification, "notification");
        Intrinsics.echo(inAppListener, "inAppListener");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        CustomTemplateContext createContextFromInApp = createContextFromInApp(notification, inAppListener, resourceProvider);
        if (createContextFromInApp != null) {
            CustomTemplate customTemplate = this.customTemplates.get(createContextFromInApp.getTemplateName());
            if (customTemplate == null) {
                this.logger.info("CustomTemplates", "Cannot find template with name " + createContextFromInApp.getTemplateName());
                return;
            }
            CustomTemplatePresenter<?> presenter = customTemplate.getPresenter();
            if (presenter instanceof TemplatePresenter) {
                if (createContextFromInApp instanceof CustomTemplateContext.TemplateContext) {
                    this.activeContexts.put(customTemplate.getName(), createContextFromInApp);
                    ((TemplatePresenter) presenter).onPresent(createContextFromInApp);
                    return;
                }
                return;
            }
            if ((presenter instanceof FunctionPresenter) && (createContextFromInApp instanceof CustomTemplateContext.FunctionContext)) {
                this.activeContexts.put(customTemplate.getName(), createContextFromInApp);
                ((FunctionPresenter) presenter).onPresent(createContextFromInApp);
            }
        }
    }
}
