package zendesk.classic.messaging.ui;

import Kd.a;
import androidx.appcompat.app.i;
import dagger.internal.b;
import zendesk.classic.messaging.MediaInMemoryDataSource;
import zendesk.classic.messaging.MessagingViewModel;
import zendesk.classic.messaging.TypingEventDispatcher;

/* loaded from: classes.dex */
public final class MessagingComposer_Factory implements b {
    private final a appCompatActivityProvider;
    private final a inputBoxConsumerProvider;
    private final a mediaInMemoryDataSourceProvider;
    private final a messagingViewModelProvider;
    private final a typingEventDispatcherProvider;

    public MessagingComposer_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.appCompatActivityProvider = aVar;
        this.messagingViewModelProvider = aVar2;
        this.mediaInMemoryDataSourceProvider = aVar3;
        this.inputBoxConsumerProvider = aVar4;
        this.typingEventDispatcherProvider = aVar5;
    }

    public static MessagingComposer_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new MessagingComposer_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static MessagingComposer newInstance(i iVar, MessagingViewModel messagingViewModel, MediaInMemoryDataSource mediaInMemoryDataSource, InputBoxConsumer inputBoxConsumer, TypingEventDispatcher typingEventDispatcher) {
        return new MessagingComposer(iVar, messagingViewModel, mediaInMemoryDataSource, inputBoxConsumer, typingEventDispatcher);
    }

    @Override // Kd.a
    public MessagingComposer get() {
        return newInstance((i) this.appCompatActivityProvider.get(), (MessagingViewModel) this.messagingViewModelProvider.get(), (MediaInMemoryDataSource) this.mediaInMemoryDataSourceProvider.get(), (InputBoxConsumer) this.inputBoxConsumerProvider.get(), (TypingEventDispatcher) this.typingEventDispatcherProvider.get());
    }
}
