package zendesk.classic.messaging;

import Kd.a;
import android.content.Context;
import android.content.res.Resources;
import com.squareup.picasso.Picasso;
import dagger.internal.InstanceFactory;
import dagger.internal.d;
import java.util.List;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingComponent;
import zendesk.core.MediaFileResolver;
import zendesk.core.MediaFileResolver_Factory;

/* loaded from: classes.dex */
public final class DaggerMessagingComponent {

    /* loaded from: classes.dex */
    public static final class Builder implements MessagingComponent.Builder {
        private Context appContext;
        private List<Engine> engines;
        private MessagingConfiguration messagingConfiguration;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        @Override // zendesk.classic.messaging.MessagingComponent.Builder
        public Builder appContext(Context context) {
            context.getClass();
            this.appContext = context;
            return this;
        }

        @Override // zendesk.classic.messaging.MessagingComponent.Builder
        public MessagingComponent build() {
            AbstractC2763s0.bravo(Context.class, this.appContext);
            AbstractC2763s0.bravo(List.class, this.engines);
            AbstractC2763s0.bravo(MessagingConfiguration.class, this.messagingConfiguration);
            return new MessagingComponentImpl(this.appContext, this.engines, this.messagingConfiguration, 0);
        }

        @Override // zendesk.classic.messaging.MessagingComponent.Builder
        public Builder engines(List<Engine> list) {
            list.getClass();
            this.engines = list;
            return this;
        }

        @Override // zendesk.classic.messaging.MessagingComponent.Builder
        public Builder messagingConfiguration(MessagingConfiguration messagingConfiguration) {
            messagingConfiguration.getClass();
            this.messagingConfiguration = messagingConfiguration;
            return this;
        }

        private Builder() {
        }

        @Override // zendesk.classic.messaging.MessagingComponent.Builder
        public /* bridge */ /* synthetic */ MessagingComponent.Builder engines(List list) {
            return engines((List<Engine>) list);
        }
    }

    /* loaded from: classes.dex */
    public static final class MessagingComponentImpl implements MessagingComponent {
        private final Context appContext;
        private a appContextProvider;
        private a enginesProvider;
        private a mediaInMemoryDataSourceProvider;
        private final MessagingComponentImpl messagingComponentImpl;
        private final MessagingConfiguration messagingConfiguration;
        private a messagingConfigurationProvider;
        private a messagingConversationLogProvider;
        private a messagingEventSerializerProvider;
        private a messagingModelProvider;
        private a messagingViewModelProvider;
        private a picassoProvider;
        private a resourcesProvider;
        private a timestampFactoryProvider;

        public /* synthetic */ MessagingComponentImpl(Context context, List list, MessagingConfiguration messagingConfiguration, int i4) {
            this(context, list, messagingConfiguration);
        }

        private void initialize(Context context, List<Engine> list, MessagingConfiguration messagingConfiguration) {
            InstanceFactory alpha = InstanceFactory.alpha(context);
            this.appContextProvider = alpha;
            this.picassoProvider = dagger.internal.a.alpha(MessagingModule_PicassoFactory.create(alpha));
            this.resourcesProvider = dagger.internal.a.alpha(MessagingModule_ResourcesFactory.create(this.appContextProvider));
            this.enginesProvider = InstanceFactory.alpha(list);
            this.messagingConfigurationProvider = InstanceFactory.alpha(messagingConfiguration);
            TimestampFactory_Factory create = TimestampFactory_Factory.create(this.appContextProvider);
            this.timestampFactoryProvider = create;
            d alpha2 = dagger.internal.a.alpha(MessagingEventSerializer_Factory.create(this.appContextProvider, create));
            this.messagingEventSerializerProvider = alpha2;
            d alpha3 = dagger.internal.a.alpha(MessagingConversationLog_Factory.create(alpha2));
            this.messagingConversationLogProvider = alpha3;
            d alpha4 = dagger.internal.a.alpha(MessagingModel_Factory.create(this.resourcesProvider, this.enginesProvider, this.messagingConfigurationProvider, alpha3));
            this.messagingModelProvider = alpha4;
            this.messagingViewModelProvider = dagger.internal.a.alpha(MessagingViewModel_Factory.create(alpha4));
            this.mediaInMemoryDataSourceProvider = dagger.internal.a.alpha(MediaInMemoryDataSource_Factory.create());
        }

        @Override // zendesk.classic.messaging.MessagingComponent
        public MediaFileResolver mediaFileResolver() {
            return MediaFileResolver_Factory.newInstance(this.appContext);
        }

        @Override // zendesk.classic.messaging.MessagingComponent
        public MediaInMemoryDataSource mediaInMemoryDataSource() {
            return (MediaInMemoryDataSource) this.mediaInMemoryDataSourceProvider.get();
        }

        @Override // zendesk.classic.messaging.MessagingComponent
        public MessagingConfiguration messagingConfiguration() {
            return this.messagingConfiguration;
        }

        @Override // zendesk.classic.messaging.MessagingComponent
        public MessagingViewModel messagingViewModel() {
            return (MessagingViewModel) this.messagingViewModelProvider.get();
        }

        @Override // zendesk.classic.messaging.MessagingComponent
        public Picasso picasso() {
            return (Picasso) this.picassoProvider.get();
        }

        @Override // zendesk.classic.messaging.MessagingComponent
        public Resources resources() {
            return (Resources) this.resourcesProvider.get();
        }

        private MessagingComponentImpl(Context context, List<Engine> list, MessagingConfiguration messagingConfiguration) {
            this.messagingComponentImpl = this;
            this.messagingConfiguration = messagingConfiguration;
            this.appContext = context;
            initialize(context, list, messagingConfiguration);
        }
    }

    private DaggerMessagingComponent() {
    }

    public static MessagingComponent.Builder builder() {
        return new Builder(0);
    }
}
