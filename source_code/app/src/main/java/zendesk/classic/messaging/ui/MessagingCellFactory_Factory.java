package zendesk.classic.messaging.ui;

import Kd.a;
import dagger.internal.b;
import zendesk.classic.messaging.EventFactory;
import zendesk.classic.messaging.EventListener;
import zendesk.classic.messaging.components.DateProvider;

/* loaded from: classes.dex */
public final class MessagingCellFactory_Factory implements b {
    private final a avatarStateFactoryProvider;
    private final a avatarStateRendererProvider;
    private final a cellPropsFactoryProvider;
    private final a dateProvider;
    private final a eventFactoryProvider;
    private final a eventListenerProvider;
    private final a multilineResponseOptionsEnabledProvider;

    public MessagingCellFactory_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        this.cellPropsFactoryProvider = aVar;
        this.dateProvider = aVar2;
        this.eventListenerProvider = aVar3;
        this.eventFactoryProvider = aVar4;
        this.avatarStateRendererProvider = aVar5;
        this.avatarStateFactoryProvider = aVar6;
        this.multilineResponseOptionsEnabledProvider = aVar7;
    }

    public static MessagingCellFactory_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        return new MessagingCellFactory_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static MessagingCellFactory newInstance(MessagingCellPropsFactory messagingCellPropsFactory, DateProvider dateProvider, EventListener eventListener, EventFactory eventFactory, Object obj, Object obj2, boolean z2) {
        return new MessagingCellFactory(messagingCellPropsFactory, dateProvider, eventListener, eventFactory, (AvatarStateRenderer) obj, (AvatarStateFactory) obj2, z2);
    }

    @Override // Kd.a
    public MessagingCellFactory get() {
        return newInstance((MessagingCellPropsFactory) this.cellPropsFactoryProvider.get(), (DateProvider) this.dateProvider.get(), (EventListener) this.eventListenerProvider.get(), (EventFactory) this.eventFactoryProvider.get(), this.avatarStateRendererProvider.get(), this.avatarStateFactoryProvider.get(), ((Boolean) this.multilineResponseOptionsEnabledProvider.get()).booleanValue());
    }
}
