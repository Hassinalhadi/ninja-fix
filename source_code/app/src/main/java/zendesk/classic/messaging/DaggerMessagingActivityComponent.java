package zendesk.classic.messaging;

import Kd.a;
import android.content.res.Resources;
import androidx.appcompat.app.i;
import com.squareup.picasso.Picasso;
import dagger.internal.InstanceFactory;
import dagger.internal.d;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingActivityComponent;
import zendesk.classic.messaging.ui.AvatarStateFactory_Factory;
import zendesk.classic.messaging.ui.AvatarStateRenderer_Factory;
import zendesk.classic.messaging.ui.InputBoxConsumer_Factory;
import zendesk.classic.messaging.ui.MessagingCellFactory;
import zendesk.classic.messaging.ui.MessagingCellFactory_Factory;
import zendesk.classic.messaging.ui.MessagingCellPropsFactory_Factory;
import zendesk.classic.messaging.ui.MessagingComposer;
import zendesk.classic.messaging.ui.MessagingComposer_Factory;
import zendesk.commonui.PermissionsHandler;
import zendesk.core.MediaFileResolver;

/* loaded from: classes.dex */
final class DaggerMessagingActivityComponent {

    /* loaded from: classes.dex */
    public static final class Builder implements MessagingActivityComponent.Builder {
        private i activity;
        private MessagingComponent messagingComponent;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        @Override // zendesk.classic.messaging.MessagingActivityComponent.Builder
        public Builder activity(i iVar) {
            iVar.getClass();
            this.activity = iVar;
            return this;
        }

        @Override // zendesk.classic.messaging.MessagingActivityComponent.Builder
        public MessagingActivityComponent build() {
            AbstractC2763s0.bravo(i.class, this.activity);
            AbstractC2763s0.bravo(MessagingComponent.class, this.messagingComponent);
            return new MessagingActivityComponentImpl(this.messagingComponent, this.activity, 0);
        }

        @Override // zendesk.classic.messaging.MessagingActivityComponent.Builder
        public Builder messagingComponent(MessagingComponent messagingComponent) {
            messagingComponent.getClass();
            this.messagingComponent = messagingComponent;
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class MessagingActivityComponentImpl implements MessagingActivityComponent {
        private a activityProvider;
        private a avatarStateRendererProvider;
        private a dateProvider;
        private a eventFactoryProvider;
        private a executorServiceProvider;
        private a handlerProvider;
        private a inputBoxConsumerProvider;
        private a mediaFileResolverProvider;
        private a mediaInMemoryDataSourceProvider;
        private a mediaResolverCallbackProvider;
        private final MessagingActivityComponentImpl messagingActivityComponentImpl;
        private a messagingCellFactoryProvider;
        private a messagingCellPropsFactoryProvider;
        private final MessagingComponent messagingComponent;
        private a messagingComponentProvider;
        private a messagingComposerProvider;
        private a messagingDialogProvider;
        private a messagingViewModelProvider;
        private a multilineResponseOptionsEnabledProvider;
        private a permissionsHandlerProvider;
        private a picassoProvider;
        private a provideExecutorProvider;
        private a resourcesProvider;
        private a typingEventDispatcherProvider;
        private a uriTaskResolverProvider;

        /* loaded from: classes.dex */
        public static final class MediaFileResolverProvider implements a {
            private final MessagingComponent messagingComponent;

            public MediaFileResolverProvider(MessagingComponent messagingComponent) {
                this.messagingComponent = messagingComponent;
            }

            @Override // Kd.a
            public MediaFileResolver get() {
                MediaFileResolver mediaFileResolver = this.messagingComponent.mediaFileResolver();
                AbstractC2763s0.charlie(mediaFileResolver);
                return mediaFileResolver;
            }
        }

        /* loaded from: classes.dex */
        public static final class MediaInMemoryDataSourceProvider implements a {
            private final MessagingComponent messagingComponent;

            public MediaInMemoryDataSourceProvider(MessagingComponent messagingComponent) {
                this.messagingComponent = messagingComponent;
            }

            @Override // Kd.a
            public MediaInMemoryDataSource get() {
                MediaInMemoryDataSource mediaInMemoryDataSource = this.messagingComponent.mediaInMemoryDataSource();
                AbstractC2763s0.charlie(mediaInMemoryDataSource);
                return mediaInMemoryDataSource;
            }
        }

        /* loaded from: classes.dex */
        public static final class MessagingViewModelProvider implements a {
            private final MessagingComponent messagingComponent;

            public MessagingViewModelProvider(MessagingComponent messagingComponent) {
                this.messagingComponent = messagingComponent;
            }

            @Override // Kd.a
            public MessagingViewModel get() {
                MessagingViewModel messagingViewModel = this.messagingComponent.messagingViewModel();
                AbstractC2763s0.charlie(messagingViewModel);
                return messagingViewModel;
            }
        }

        /* loaded from: classes.dex */
        public static final class PicassoProvider implements a {
            private final MessagingComponent messagingComponent;

            public PicassoProvider(MessagingComponent messagingComponent) {
                this.messagingComponent = messagingComponent;
            }

            @Override // Kd.a
            public Picasso get() {
                Picasso picasso = this.messagingComponent.picasso();
                AbstractC2763s0.charlie(picasso);
                return picasso;
            }
        }

        /* loaded from: classes.dex */
        public static final class ResourcesProvider implements a {
            private final MessagingComponent messagingComponent;

            public ResourcesProvider(MessagingComponent messagingComponent) {
                this.messagingComponent = messagingComponent;
            }

            @Override // Kd.a
            public Resources get() {
                Resources resources = this.messagingComponent.resources();
                AbstractC2763s0.charlie(resources);
                return resources;
            }
        }

        public /* synthetic */ MessagingActivityComponentImpl(MessagingComponent messagingComponent, i iVar, int i4) {
            this(messagingComponent, iVar);
        }

        private void initialize(MessagingComponent messagingComponent, i iVar) {
            ResourcesProvider resourcesProvider = new ResourcesProvider(messagingComponent);
            this.resourcesProvider = resourcesProvider;
            this.messagingCellPropsFactoryProvider = dagger.internal.a.alpha(MessagingCellPropsFactory_Factory.create(resourcesProvider));
            this.dateProvider = dagger.internal.a.alpha(MessagingActivityModule_DateProviderFactory.create());
            this.messagingViewModelProvider = new MessagingViewModelProvider(messagingComponent);
            this.eventFactoryProvider = dagger.internal.a.alpha(EventFactory_Factory.create(this.dateProvider));
            PicassoProvider picassoProvider = new PicassoProvider(messagingComponent);
            this.picassoProvider = picassoProvider;
            this.avatarStateRendererProvider = dagger.internal.a.alpha(AvatarStateRenderer_Factory.create(picassoProvider));
            InstanceFactory alpha = InstanceFactory.alpha(messagingComponent);
            this.messagingComponentProvider = alpha;
            this.multilineResponseOptionsEnabledProvider = dagger.internal.a.alpha(MessagingActivityModule_MultilineResponseOptionsEnabledFactory.create(alpha));
            this.messagingCellFactoryProvider = dagger.internal.a.alpha(MessagingCellFactory_Factory.create(this.messagingCellPropsFactoryProvider, this.dateProvider, this.messagingViewModelProvider, this.eventFactoryProvider, this.avatarStateRendererProvider, AvatarStateFactory_Factory.create(), this.multilineResponseOptionsEnabledProvider));
            this.activityProvider = InstanceFactory.alpha(iVar);
            this.mediaInMemoryDataSourceProvider = new MediaInMemoryDataSourceProvider(messagingComponent);
            this.mediaFileResolverProvider = new MediaFileResolverProvider(messagingComponent);
            d alpha2 = dagger.internal.a.alpha(MessagingActivityModule_ProvideExecutorFactory.create());
            this.provideExecutorProvider = alpha2;
            d alpha3 = dagger.internal.a.alpha(MessagingActivityModule_ExecutorServiceFactory.create(alpha2));
            this.executorServiceProvider = alpha3;
            this.uriTaskResolverProvider = dagger.internal.a.alpha(MessagingActivityModule_UriTaskResolverFactory.create(this.mediaFileResolverProvider, alpha3));
            MediaResolverCallback_Factory create = MediaResolverCallback_Factory.create(this.messagingViewModelProvider, this.eventFactoryProvider);
            this.mediaResolverCallbackProvider = create;
            this.inputBoxConsumerProvider = dagger.internal.a.alpha(InputBoxConsumer_Factory.create(this.messagingViewModelProvider, this.eventFactoryProvider, this.mediaInMemoryDataSourceProvider, this.uriTaskResolverProvider, create));
            d alpha4 = dagger.internal.a.alpha(MessagingActivityModule_HandlerFactory.create());
            this.handlerProvider = alpha4;
            d alpha5 = dagger.internal.a.alpha(TypingEventDispatcher_Factory.create(this.messagingViewModelProvider, alpha4, this.eventFactoryProvider));
            this.typingEventDispatcherProvider = alpha5;
            this.messagingComposerProvider = dagger.internal.a.alpha(MessagingComposer_Factory.create(this.activityProvider, this.messagingViewModelProvider, this.mediaInMemoryDataSourceProvider, this.inputBoxConsumerProvider, alpha5));
            this.messagingDialogProvider = dagger.internal.a.alpha(MessagingDialog_Factory.create(this.activityProvider, this.messagingViewModelProvider, this.dateProvider));
            this.permissionsHandlerProvider = dagger.internal.a.alpha(MessagingActivityModule_PermissionsHandlerFactory.create(this.activityProvider));
        }

        private MessagingActivity injectMessagingActivity(MessagingActivity messagingActivity) {
            MessagingViewModel messagingViewModel = this.messagingComponent.messagingViewModel();
            AbstractC2763s0.charlie(messagingViewModel);
            MessagingActivity_MembersInjector.injectViewModel(messagingActivity, messagingViewModel);
            MessagingActivity_MembersInjector.injectMessagingCellFactory(messagingActivity, (MessagingCellFactory) this.messagingCellFactoryProvider.get());
            Picasso picasso = this.messagingComponent.picasso();
            AbstractC2763s0.charlie(picasso);
            MessagingActivity_MembersInjector.injectPicasso(messagingActivity, picasso);
            MessagingActivity_MembersInjector.injectEventFactory(messagingActivity, (EventFactory) this.eventFactoryProvider.get());
            MessagingActivity_MembersInjector.injectMessagingComposer(messagingActivity, (MessagingComposer) this.messagingComposerProvider.get());
            MessagingActivity_MembersInjector.injectMessagingDialog(messagingActivity, this.messagingDialogProvider.get());
            MediaInMemoryDataSource mediaInMemoryDataSource = this.messagingComponent.mediaInMemoryDataSource();
            AbstractC2763s0.charlie(mediaInMemoryDataSource);
            MessagingActivity_MembersInjector.injectMediaHolder(messagingActivity, mediaInMemoryDataSource);
            MediaFileResolver mediaFileResolver = this.messagingComponent.mediaFileResolver();
            AbstractC2763s0.charlie(mediaFileResolver);
            MessagingActivity_MembersInjector.injectMediaFileResolver(messagingActivity, mediaFileResolver);
            MessagingActivity_MembersInjector.injectPermissionsHandler(messagingActivity, (PermissionsHandler) this.permissionsHandlerProvider.get());
            return messagingActivity;
        }

        @Override // zendesk.classic.messaging.MessagingActivityComponent
        public void inject(MessagingActivity messagingActivity) {
            injectMessagingActivity(messagingActivity);
        }

        private MessagingActivityComponentImpl(MessagingComponent messagingComponent, i iVar) {
            this.messagingActivityComponentImpl = this;
            this.messagingComponent = messagingComponent;
            initialize(messagingComponent, iVar);
        }
    }

    private DaggerMessagingActivityComponent() {
    }

    public static MessagingActivityComponent.Builder builder() {
        return new Builder(0);
    }
}
