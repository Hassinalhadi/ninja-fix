package zendesk.support.guide;

import Kd.a;
import v9.InterfaceC3179a;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;

/* loaded from: classes.dex */
public final class HelpCenterActivity_MembersInjector implements InterfaceC3179a {
    private final a actionHandlerRegistryProvider;
    private final a configurationHelperProvider;
    private final a helpCenterProvider;
    private final a networkInfoProvider;
    private final a settingsProvider;

    public HelpCenterActivity_MembersInjector(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.helpCenterProvider = aVar;
        this.settingsProvider = aVar2;
        this.networkInfoProvider = aVar3;
        this.actionHandlerRegistryProvider = aVar4;
        this.configurationHelperProvider = aVar5;
    }

    public static InterfaceC3179a create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new HelpCenterActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectActionHandlerRegistry(HelpCenterActivity helpCenterActivity, ActionHandlerRegistry actionHandlerRegistry) {
        helpCenterActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectConfigurationHelper(HelpCenterActivity helpCenterActivity, ConfigurationHelper configurationHelper) {
        helpCenterActivity.configurationHelper = configurationHelper;
    }

    public static void injectHelpCenterProvider(HelpCenterActivity helpCenterActivity, HelpCenterProvider helpCenterProvider) {
        helpCenterActivity.helpCenterProvider = helpCenterProvider;
    }

    public static void injectNetworkInfoProvider(HelpCenterActivity helpCenterActivity, NetworkInfoProvider networkInfoProvider) {
        helpCenterActivity.networkInfoProvider = networkInfoProvider;
    }

    public static void injectSettingsProvider(HelpCenterActivity helpCenterActivity, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        helpCenterActivity.settingsProvider = helpCenterSettingsProvider;
    }

    public void injectMembers(HelpCenterActivity helpCenterActivity) {
        injectHelpCenterProvider(helpCenterActivity, (HelpCenterProvider) this.helpCenterProvider.get());
        injectSettingsProvider(helpCenterActivity, (HelpCenterSettingsProvider) this.settingsProvider.get());
        injectNetworkInfoProvider(helpCenterActivity, (NetworkInfoProvider) this.networkInfoProvider.get());
        injectActionHandlerRegistry(helpCenterActivity, (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get());
        injectConfigurationHelper(helpCenterActivity, (ConfigurationHelper) this.configurationHelperProvider.get());
    }
}
