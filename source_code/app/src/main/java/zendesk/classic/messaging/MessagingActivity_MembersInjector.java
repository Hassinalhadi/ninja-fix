package zendesk.classic.messaging;

import Kd.a;
import com.squareup.picasso.Picasso;
import v9.InterfaceC3179a;
import zendesk.classic.messaging.ui.MessagingCellFactory;
import zendesk.classic.messaging.ui.MessagingComposer;
import zendesk.commonui.PermissionsHandler;
import zendesk.core.MediaFileResolver;

/* loaded from: classes.dex */
public final class MessagingActivity_MembersInjector implements InterfaceC3179a {
    private final a eventFactoryProvider;
    private final a mediaFileResolverProvider;
    private final a mediaHolderProvider;
    private final a messagingCellFactoryProvider;
    private final a messagingComposerProvider;
    private final a messagingDialogProvider;
    private final a permissionsHandlerProvider;
    private final a picassoProvider;
    private final a viewModelProvider;

    public MessagingActivity_MembersInjector(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9) {
        this.viewModelProvider = aVar;
        this.messagingCellFactoryProvider = aVar2;
        this.picassoProvider = aVar3;
        this.eventFactoryProvider = aVar4;
        this.messagingComposerProvider = aVar5;
        this.messagingDialogProvider = aVar6;
        this.mediaHolderProvider = aVar7;
        this.mediaFileResolverProvider = aVar8;
        this.permissionsHandlerProvider = aVar9;
    }

    public static InterfaceC3179a create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9) {
        return new MessagingActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static void injectEventFactory(MessagingActivity messagingActivity, EventFactory eventFactory) {
        messagingActivity.eventFactory = eventFactory;
    }

    public static void injectMediaFileResolver(MessagingActivity messagingActivity, MediaFileResolver mediaFileResolver) {
        messagingActivity.mediaFileResolver = mediaFileResolver;
    }

    public static void injectMediaHolder(MessagingActivity messagingActivity, MediaInMemoryDataSource mediaInMemoryDataSource) {
        messagingActivity.mediaHolder = mediaInMemoryDataSource;
    }

    public static void injectMessagingCellFactory(MessagingActivity messagingActivity, MessagingCellFactory messagingCellFactory) {
        messagingActivity.messagingCellFactory = messagingCellFactory;
    }

    public static void injectMessagingComposer(MessagingActivity messagingActivity, MessagingComposer messagingComposer) {
        messagingActivity.messagingComposer = messagingComposer;
    }

    public static void injectMessagingDialog(MessagingActivity messagingActivity, Object obj) {
        messagingActivity.messagingDialog = (MessagingDialog) obj;
    }

    public static void injectPermissionsHandler(MessagingActivity messagingActivity, PermissionsHandler permissionsHandler) {
        messagingActivity.permissionsHandler = permissionsHandler;
    }

    public static void injectPicasso(MessagingActivity messagingActivity, Picasso picasso) {
        messagingActivity.picasso = picasso;
    }

    public static void injectViewModel(MessagingActivity messagingActivity, MessagingViewModel messagingViewModel) {
        messagingActivity.viewModel = messagingViewModel;
    }

    public void injectMembers(MessagingActivity messagingActivity) {
        injectViewModel(messagingActivity, (MessagingViewModel) this.viewModelProvider.get());
        injectMessagingCellFactory(messagingActivity, (MessagingCellFactory) this.messagingCellFactoryProvider.get());
        injectPicasso(messagingActivity, (Picasso) this.picassoProvider.get());
        injectEventFactory(messagingActivity, (EventFactory) this.eventFactoryProvider.get());
        injectMessagingComposer(messagingActivity, (MessagingComposer) this.messagingComposerProvider.get());
        injectMessagingDialog(messagingActivity, this.messagingDialogProvider.get());
        injectMediaHolder(messagingActivity, (MediaInMemoryDataSource) this.mediaHolderProvider.get());
        injectMediaFileResolver(messagingActivity, (MediaFileResolver) this.mediaFileResolverProvider.get());
        injectPermissionsHandler(messagingActivity, (PermissionsHandler) this.permissionsHandlerProvider.get());
    }
}
