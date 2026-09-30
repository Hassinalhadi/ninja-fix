package zendesk.classic.messaging;

import Kd.a;
import android.content.res.Resources;
import dagger.internal.b;
import java.util.List;

/* loaded from: classes.dex */
public final class MessagingModel_Factory implements b {
    private final a conversationLogProvider;
    private final a enginesProvider;
    private final a messagingConfigurationProvider;
    private final a resourcesProvider;

    public MessagingModel_Factory(a aVar, a aVar2, a aVar3, a aVar4) {
        this.resourcesProvider = aVar;
        this.enginesProvider = aVar2;
        this.messagingConfigurationProvider = aVar3;
        this.conversationLogProvider = aVar4;
    }

    public static MessagingModel_Factory create(a aVar, a aVar2, a aVar3, a aVar4) {
        return new MessagingModel_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static MessagingModel newInstance(Resources resources, List<Engine> list, MessagingConfiguration messagingConfiguration, Object obj) {
        return new MessagingModel(resources, list, messagingConfiguration, (MessagingConversationLog) obj);
    }

    @Override // Kd.a
    public MessagingModel get() {
        return newInstance((Resources) this.resourcesProvider.get(), (List) this.enginesProvider.get(), (MessagingConfiguration) this.messagingConfigurationProvider.get(), this.conversationLogProvider.get());
    }
}
